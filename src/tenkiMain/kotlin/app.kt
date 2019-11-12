package tenki.station

import kotlinx.cinterop.*
import pca9685.PCA9685_initPWM
import pca9685.PCA9685_openI2C
import pca9685.PCA9685_setPWMVals
import pca9685._PCA9685_CHANS
import pigpio.*

@ExperimentalUnsignedTypes
fun main() {
    initGPIO()
    initPWMDriver()
    setupButton()
    blinkLed()
}

fun initGPIO() {
    println("GPIO initialisation started...")
    if (gpioInitialise() < 0) {
        println("GPIO Error initialising!")
    } else {
        println("GPIO initialised!")
    }
}

@ExperimentalUnsignedTypes
fun initPWMDriver() {
    println("PWM initialisation started...")

    val fileDescriptor = PCA9685_openI2C(
        ADAPTER_NUMBER_DEFAULT.toUByte(),
        I2C_SERVO_ADDRESS.toUByte()
    )

    val initStatus = PCA9685_initPWM(
        fileDescriptor,
        I2C_SERVO_ADDRESS.toUByte(),
        PWM_FREQUENCY.toUInt()
    )

    if (initStatus != 0) {
        println("PWM Error initialising!")
    } else {
        println("PWM initialised!")
        setPWMValues(fileDescriptor)
    }
}

@ExperimentalUnsignedTypes
fun setPWMValues(fileDescriptor: Int) {
    // https://jonnyzzz.com/blog/2019/01/14/kn-intptr/
    // Runs given block providing allocation of memory which will be automatically disposed at the end of this scope.
    memScoped {
        val onValues = allocArray<UIntVar>(_PCA9685_CHANS)
        val offValues = allocArray<UIntVar>(_PCA9685_CHANS)

        for (i in 0 until _PCA9685_CHANS - 1) {
            onValues[i] = SERVO_ON_ANGLE.toUInt()
        }
        for (i in 0 until _PCA9685_CHANS - 1) {
            offValues[i] = SERVO_OFF_ANGLE.toUInt()
        }

        PCA9685_setPWMVals(fileDescriptor, I2C_SERVO_ADDRESS.toUByte(), onValues, offValues)

        // calibrate servomotors
        var calibrationCount = 3
        while (calibrationCount > 0) {
            PCA9685_setPWMVals(fileDescriptor, I2C_SERVO_ADDRESS.toUByte(), offValues, onValues)
            gpioSleep(PI_TIME_RELATIVE, 1, 0)
            PCA9685_setPWMVals(fileDescriptor, I2C_SERVO_ADDRESS.toUByte(), onValues, offValues)
            calibrationCount--
        }
    }
}

@ExperimentalUnsignedTypes
val onButtonPressed = staticCFunction<Int, Int, UInt, Unit> { gpio, level, tick ->
    when (level) {
        0 -> {
            println("Button Pressed down, level 0")
            // TODO perform action here will lead to signal terminated?
        }
        1 -> println("Button Released, level 1")
        2 -> println("Button GPIO timeout, no level change")
    }
}


@ExperimentalUnsignedTypes
private fun setupButton() {
    val buttonPort = GPIO_BUTTON.toUInt()
    initPortWithMode(buttonPort, PI_INPUT)

    gpioSetAlertFunc(buttonPort, onButtonPressed)
}

@ExperimentalUnsignedTypes
fun blinkLed() {
    val ledPort = GPIO_LED.toUInt()
    initPortWithMode(ledPort, PI_OUTPUT)

    println("Start blinking LED")
    var blinkCount = 3
    while (blinkCount > 0) {
        gpioWrite(ledPort, PI_LOW)
        gpioSleep(PI_TIME_RELATIVE, 0, 500000)
        gpioWrite(ledPort, PI_HIGH)
        gpioSleep(PI_TIME_RELATIVE, 0, 500000)
        blinkCount--
    }
}

@ExperimentalUnsignedTypes
fun initPortWithMode(port: UInt, mode: Int) {
    if (gpioSetMode(port, mode.toUInt()) < 0) {
        println("Could not set mode for GPIO$port")
        return
    }
}

