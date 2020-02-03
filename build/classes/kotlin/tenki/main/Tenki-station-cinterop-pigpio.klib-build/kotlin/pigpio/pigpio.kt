@file:kotlinx.cinterop.InteropStubs
@file:Suppress("UNUSED_VARIABLE", "UNUSED_EXPRESSION")
package pigpio

import kotlin.native.SymbolName
import kotlinx.cinterop.internal.*
import kotlinx.cinterop.*
import platform.posix.int32_t
import platform.posix.pthread_tVar
import platform.posix.size_t
import platform.posix.size_tVar
import platform.posix.uint16_t
import platform.posix.uint16_tVar
import platform.posix.uint32_t
import platform.posix.uint32_tVar
import platform.posix.uint64_t
import platform.posix.uint8_tVar

// NOTE THIS FILE IS AUTO-GENERATED

@CStruct("struct { unsigned short p0; unsigned short p1; }")
class gpioHeader_t(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(4, 2)
    
    var func: uint16_t
        get() = memberAt<uint16_tVar>(0).value
        set(value) { memberAt<uint16_tVar>(0).value = value }
    
    var size: uint16_t
        get() = memberAt<uint16_tVar>(2).value
        set(value) { memberAt<uint16_tVar>(2).value = value }
}

@CStruct("struct { unsigned int p0; void* p1; unsigned int p2; }")
class gpioExtent_t(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(12, 4)
    
    var size: size_t
        get() = memberAt<size_tVar>(0).value
        set(value) { memberAt<size_tVar>(0).value = value }
    
    var ptr: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(4).value
        set(value) { memberAt<COpaquePointerVar>(4).value = value }
    
    var data: uint32_t
        get() = memberAt<uint32_tVar>(8).value
        set(value) { memberAt<uint32_tVar>(8).value = value }
}

@CStruct("struct { unsigned int p0; unsigned int p1; }")
class gpioSample_t(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 4)
    
    var tick: uint32_t
        get() = memberAt<uint32_tVar>(0).value
        set(value) { memberAt<uint32_tVar>(0).value = value }
    
    var level: uint32_t
        get() = memberAt<uint32_tVar>(4).value
        set(value) { memberAt<uint32_tVar>(4).value = value }
}

@CStruct("struct { unsigned short p0; unsigned short p1; unsigned int p2; unsigned int p3; }")
class gpioReport_t(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(12, 4)
    
    var seqno: uint16_t
        get() = memberAt<uint16_tVar>(0).value
        set(value) { memberAt<uint16_tVar>(0).value = value }
    
    var flags: uint16_t
        get() = memberAt<uint16_tVar>(2).value
        set(value) { memberAt<uint16_tVar>(2).value = value }
    
    var tick: uint32_t
        get() = memberAt<uint32_tVar>(4).value
        set(value) { memberAt<uint32_tVar>(4).value = value }
    
    var level: uint32_t
        get() = memberAt<uint32_tVar>(8).value
        set(value) { memberAt<uint32_tVar>(8).value = value }
}

@CStruct("struct { unsigned int p0; unsigned int p1; unsigned int p2; }")
class gpioPulse_t(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(12, 4)
    
    var gpioOn: uint32_t
        get() = memberAt<uint32_tVar>(0).value
        set(value) { memberAt<uint32_tVar>(0).value = value }
    
    var gpioOff: uint32_t
        get() = memberAt<uint32_tVar>(4).value
        set(value) { memberAt<uint32_tVar>(4).value = value }
    
    var usDelay: uint32_t
        get() = memberAt<uint32_tVar>(8).value
        set(value) { memberAt<uint32_tVar>(8).value = value }
}

@CStruct("struct { unsigned int p0; unsigned int p1; unsigned int p2; unsigned int p3; }")
class rawWave_t(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 4)
    
    var gpioOn: uint32_t
        get() = memberAt<uint32_tVar>(0).value
        set(value) { memberAt<uint32_tVar>(0).value = value }
    
    var gpioOff: uint32_t
        get() = memberAt<uint32_tVar>(4).value
        set(value) { memberAt<uint32_tVar>(4).value = value }
    
    var usDelay: uint32_t
        get() = memberAt<uint32_tVar>(8).value
        set(value) { memberAt<uint32_tVar>(8).value = value }
    
    var flags: uint32_t
        get() = memberAt<uint32_tVar>(12).value
        set(value) { memberAt<uint32_tVar>(12).value = value }
}

@CStruct("struct { unsigned short p0; unsigned short p1; unsigned short p2; unsigned short p3; unsigned short p4; unsigned short p5; unsigned short p6; unsigned short p7; }")
class rawWaveInfo_t(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 2)
    
    var botCB: uint16_t
        get() = memberAt<uint16_tVar>(0).value
        set(value) { memberAt<uint16_tVar>(0).value = value }
    
    var topCB: uint16_t
        get() = memberAt<uint16_tVar>(2).value
        set(value) { memberAt<uint16_tVar>(2).value = value }
    
    var botOOL: uint16_t
        get() = memberAt<uint16_tVar>(4).value
        set(value) { memberAt<uint16_tVar>(4).value = value }
    
    var topOOL: uint16_t
        get() = memberAt<uint16_tVar>(6).value
        set(value) { memberAt<uint16_tVar>(6).value = value }
    
    var deleted: uint16_t
        get() = memberAt<uint16_tVar>(8).value
        set(value) { memberAt<uint16_tVar>(8).value = value }
    
    var numCB: uint16_t
        get() = memberAt<uint16_tVar>(10).value
        set(value) { memberAt<uint16_tVar>(10).value = value }
    
    var numBOOL: uint16_t
        get() = memberAt<uint16_tVar>(12).value
        set(value) { memberAt<uint16_tVar>(12).value = value }
    
    var numTOOL: uint16_t
        get() = memberAt<uint16_tVar>(14).value
        set(value) { memberAt<uint16_tVar>(14).value = value }
}

@CStruct("struct { int p0; int p1; int p2; int p3; int p4; int p5; int p6; int p7; }")
class rawSPI_t(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(32, 4)
    
    var clk: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var mosi: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
    var miso: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
    var ss_pol: Int
        get() = memberAt<IntVar>(12).value
        set(value) { memberAt<IntVar>(12).value = value }
    
    var ss_us: Int
        get() = memberAt<IntVar>(16).value
        set(value) { memberAt<IntVar>(16).value = value }
    
    var clk_pol: Int
        get() = memberAt<IntVar>(20).value
        set(value) { memberAt<IntVar>(20).value = value }
    
    var clk_pha: Int
        get() = memberAt<IntVar>(24).value
        set(value) { memberAt<IntVar>(24).value = value }
    
    var clk_us: Int
        get() = memberAt<IntVar>(28).value
        set(value) { memberAt<IntVar>(28).value = value }
}

@CStruct("struct { unsigned int p0; unsigned int p1; unsigned int p2; unsigned int p3; unsigned int p4; unsigned int p5; unsigned int p6[2]; }")
class rawCbs_t(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(32, 4)
    
    var info: uint32_t
        get() = memberAt<uint32_tVar>(0).value
        set(value) { memberAt<uint32_tVar>(0).value = value }
    
    var src: uint32_t
        get() = memberAt<uint32_tVar>(4).value
        set(value) { memberAt<uint32_tVar>(4).value = value }
    
    var dst: uint32_t
        get() = memberAt<uint32_tVar>(8).value
        set(value) { memberAt<uint32_tVar>(8).value = value }
    
    var length: uint32_t
        get() = memberAt<uint32_tVar>(12).value
        set(value) { memberAt<uint32_tVar>(12).value = value }
    
    var stride: uint32_t
        get() = memberAt<uint32_tVar>(16).value
        set(value) { memberAt<uint32_tVar>(16).value = value }
    
    var next: uint32_t
        get() = memberAt<uint32_tVar>(20).value
        set(value) { memberAt<uint32_tVar>(20).value = value }
    
    val pad: CArrayPointer<uint32_tVar>
        get() = arrayMemberAt(24)
}

@CStruct("struct { unsigned short p0; unsigned short p1; unsigned short p2; void* p3; }")
class pi_i2c_msg_t(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(12, 4)
    
    var addr: uint16_t
        get() = memberAt<uint16_tVar>(0).value
        set(value) { memberAt<uint16_tVar>(0).value = value }
    
    var flags: uint16_t
        get() = memberAt<uint16_tVar>(2).value
        set(value) { memberAt<uint16_tVar>(2).value = value }
    
    var len: uint16_t
        get() = memberAt<uint16_tVar>(4).value
        set(value) { memberAt<uint16_tVar>(4).value = value }
    
    var buf: CPointer<uint8_tVar>?
        get() = memberAt<CPointerVar<uint8_tVar>>(8).value
        set(value) { memberAt<CPointerVar<uint8_tVar>>(8).value = value }
}

@CStruct("struct { unsigned int p0; int p1; char p2[512]; int p3; char p4[512]; }")
class bsc_xfer_t(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(1036, 4)
    
    var control: uint32_t
        get() = memberAt<uint32_tVar>(0).value
        set(value) { memberAt<uint32_tVar>(0).value = value }
    
    var rxCnt: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
    val rxBuf: CArrayPointer<ByteVar>
        get() = arrayMemberAt(8)
    
    var txCnt: Int
        get() = memberAt<IntVar>(520).value
        set(value) { memberAt<IntVar>(520).value = value }
    
    val txBuf: CArrayPointer<ByteVar>
        get() = arrayMemberAt(524)
}

@CCall("knifunptr_pigpio0_gpioInitialise")
external fun gpioInitialise(): Int

@CCall("knifunptr_pigpio1_gpioTerminate")
external fun gpioTerminate(): Unit

@CCall("knifunptr_pigpio2_gpioSetMode")
external fun gpioSetMode(gpio: UInt, mode: UInt): Int

@CCall("knifunptr_pigpio3_gpioGetMode")
external fun gpioGetMode(gpio: UInt): Int

@CCall("knifunptr_pigpio4_gpioSetPullUpDown")
external fun gpioSetPullUpDown(gpio: UInt, pud: UInt): Int

@CCall("knifunptr_pigpio5_gpioRead")
external fun gpioRead(gpio: UInt): Int

@CCall("knifunptr_pigpio6_gpioWrite")
external fun gpioWrite(gpio: UInt, level: UInt): Int

@CCall("knifunptr_pigpio7_gpioPWM")
external fun gpioPWM(user_gpio: UInt, dutycycle: UInt): Int

@CCall("knifunptr_pigpio8_gpioGetPWMdutycycle")
external fun gpioGetPWMdutycycle(user_gpio: UInt): Int

@CCall("knifunptr_pigpio9_gpioSetPWMrange")
external fun gpioSetPWMrange(user_gpio: UInt, range: UInt): Int

@CCall("knifunptr_pigpio10_gpioGetPWMrange")
external fun gpioGetPWMrange(user_gpio: UInt): Int

@CCall("knifunptr_pigpio11_gpioGetPWMrealRange")
external fun gpioGetPWMrealRange(user_gpio: UInt): Int

@CCall("knifunptr_pigpio12_gpioSetPWMfrequency")
external fun gpioSetPWMfrequency(user_gpio: UInt, frequency: UInt): Int

@CCall("knifunptr_pigpio13_gpioGetPWMfrequency")
external fun gpioGetPWMfrequency(user_gpio: UInt): Int

@CCall("knifunptr_pigpio14_gpioServo")
external fun gpioServo(user_gpio: UInt, pulsewidth: UInt): Int

@CCall("knifunptr_pigpio15_gpioGetServoPulsewidth")
external fun gpioGetServoPulsewidth(user_gpio: UInt): Int

@CCall("knifunptr_pigpio16_gpioSetAlertFunc")
external fun gpioSetAlertFunc(user_gpio: UInt, f: gpioAlertFunc_t?): Int

@CCall("knifunptr_pigpio17_gpioSetAlertFuncEx")
external fun gpioSetAlertFuncEx(user_gpio: UInt, f: gpioAlertFuncEx_t?, userdata: CValuesRef<*>?): Int

@CCall("knifunptr_pigpio18_gpioSetISRFunc")
external fun gpioSetISRFunc(gpio: UInt, edge: UInt, timeout: Int, f: gpioISRFunc_t?): Int

@CCall("knifunptr_pigpio19_gpioSetISRFuncEx")
external fun gpioSetISRFuncEx(gpio: UInt, edge: UInt, timeout: Int, f: gpioISRFuncEx_t?, userdata: CValuesRef<*>?): Int

@CCall("knifunptr_pigpio20_gpioNotifyOpen")
external fun gpioNotifyOpen(): Int

@CCall("knifunptr_pigpio21_gpioNotifyOpenWithSize")
external fun gpioNotifyOpenWithSize(bufSize: Int): Int

@CCall("knifunptr_pigpio22_gpioNotifyBegin")
external fun gpioNotifyBegin(handle: UInt, bits: uint32_t): Int

@CCall("knifunptr_pigpio23_gpioNotifyPause")
external fun gpioNotifyPause(handle: UInt): Int

@CCall("knifunptr_pigpio24_gpioNotifyClose")
external fun gpioNotifyClose(handle: UInt): Int

@CCall("knifunptr_pigpio25_gpioWaveClear")
external fun gpioWaveClear(): Int

@CCall("knifunptr_pigpio26_gpioWaveAddNew")
external fun gpioWaveAddNew(): Int

@CCall("knifunptr_pigpio27_gpioWaveAddGeneric")
external fun gpioWaveAddGeneric(numPulses: UInt, pulses: CValuesRef<gpioPulse_t>?): Int

@CCall("knifunptr_pigpio28_gpioWaveAddSerial")
external fun gpioWaveAddSerial(user_gpio: UInt, baud: UInt, data_bits: UInt, stop_bits: UInt, offset: UInt, numBytes: UInt, str: CValuesRef<ByteVar>?): Int

@CCall("knifunptr_pigpio29_gpioWaveCreate")
external fun gpioWaveCreate(): Int

@CCall("knifunptr_pigpio30_gpioWaveDelete")
external fun gpioWaveDelete(wave_id: UInt): Int

@CCall("knifunptr_pigpio31_gpioWaveTxSend")
external fun gpioWaveTxSend(wave_id: UInt, wave_mode: UInt): Int

@CCall("knifunptr_pigpio32_gpioWaveChain")
external fun gpioWaveChain(buf: CValuesRef<ByteVar>?, bufSize: UInt): Int

@CCall("knifunptr_pigpio33_gpioWaveTxAt")
external fun gpioWaveTxAt(): Int

@CCall("knifunptr_pigpio34_gpioWaveTxBusy")
external fun gpioWaveTxBusy(): Int

@CCall("knifunptr_pigpio35_gpioWaveTxStop")
external fun gpioWaveTxStop(): Int

@CCall("knifunptr_pigpio36_gpioWaveGetMicros")
external fun gpioWaveGetMicros(): Int

@CCall("knifunptr_pigpio37_gpioWaveGetHighMicros")
external fun gpioWaveGetHighMicros(): Int

@CCall("knifunptr_pigpio38_gpioWaveGetMaxMicros")
external fun gpioWaveGetMaxMicros(): Int

@CCall("knifunptr_pigpio39_gpioWaveGetPulses")
external fun gpioWaveGetPulses(): Int

@CCall("knifunptr_pigpio40_gpioWaveGetHighPulses")
external fun gpioWaveGetHighPulses(): Int

@CCall("knifunptr_pigpio41_gpioWaveGetMaxPulses")
external fun gpioWaveGetMaxPulses(): Int

@CCall("knifunptr_pigpio42_gpioWaveGetCbs")
external fun gpioWaveGetCbs(): Int

@CCall("knifunptr_pigpio43_gpioWaveGetHighCbs")
external fun gpioWaveGetHighCbs(): Int

@CCall("knifunptr_pigpio44_gpioWaveGetMaxCbs")
external fun gpioWaveGetMaxCbs(): Int

@CCall("knifunptr_pigpio45_gpioSerialReadOpen")
external fun gpioSerialReadOpen(user_gpio: UInt, baud: UInt, data_bits: UInt): Int

@CCall("knifunptr_pigpio46_gpioSerialReadInvert")
external fun gpioSerialReadInvert(user_gpio: UInt, invert: UInt): Int

@CCall("knifunptr_pigpio47_gpioSerialRead")
external fun gpioSerialRead(user_gpio: UInt, buf: CValuesRef<*>?, bufSize: size_t): Int

@CCall("knifunptr_pigpio48_gpioSerialReadClose")
external fun gpioSerialReadClose(user_gpio: UInt): Int

@CCall("knifunptr_pigpio49_i2cOpen")
external fun i2cOpen(i2cBus: UInt, i2cAddr: UInt, i2cFlags: UInt): Int

@CCall("knifunptr_pigpio50_i2cClose")
external fun i2cClose(handle: UInt): Int

@CCall("knifunptr_pigpio51_i2cWriteQuick")
external fun i2cWriteQuick(handle: UInt, bit: UInt): Int

@CCall("knifunptr_pigpio52_i2cWriteByte")
external fun i2cWriteByte(handle: UInt, bVal: UInt): Int

@CCall("knifunptr_pigpio53_i2cReadByte")
external fun i2cReadByte(handle: UInt): Int

@CCall("knifunptr_pigpio54_i2cWriteByteData")
external fun i2cWriteByteData(handle: UInt, i2cReg: UInt, bVal: UInt): Int

@CCall("knifunptr_pigpio55_i2cWriteWordData")
external fun i2cWriteWordData(handle: UInt, i2cReg: UInt, wVal: UInt): Int

@CCall("knifunptr_pigpio56_i2cReadByteData")
external fun i2cReadByteData(handle: UInt, i2cReg: UInt): Int

@CCall("knifunptr_pigpio57_i2cReadWordData")
external fun i2cReadWordData(handle: UInt, i2cReg: UInt): Int

@CCall("knifunptr_pigpio58_i2cProcessCall")
external fun i2cProcessCall(handle: UInt, i2cReg: UInt, wVal: UInt): Int

@CCall("knifunptr_pigpio59_i2cWriteBlockData")
external fun i2cWriteBlockData(handle: UInt, i2cReg: UInt, buf: CValuesRef<ByteVar>?, count: UInt): Int

@CCall("knifunptr_pigpio60_i2cReadBlockData")
external fun i2cReadBlockData(handle: UInt, i2cReg: UInt, buf: CValuesRef<ByteVar>?): Int

@CCall("knifunptr_pigpio61_i2cBlockProcessCall")
external fun i2cBlockProcessCall(handle: UInt, i2cReg: UInt, buf: CValuesRef<ByteVar>?, count: UInt): Int

@CCall("knifunptr_pigpio62_i2cReadI2CBlockData")
external fun i2cReadI2CBlockData(handle: UInt, i2cReg: UInt, buf: CValuesRef<ByteVar>?, count: UInt): Int

@CCall("knifunptr_pigpio63_i2cWriteI2CBlockData")
external fun i2cWriteI2CBlockData(handle: UInt, i2cReg: UInt, buf: CValuesRef<ByteVar>?, count: UInt): Int

@CCall("knifunptr_pigpio64_i2cReadDevice")
external fun i2cReadDevice(handle: UInt, buf: CValuesRef<ByteVar>?, count: UInt): Int

@CCall("knifunptr_pigpio65_i2cWriteDevice")
external fun i2cWriteDevice(handle: UInt, buf: CValuesRef<ByteVar>?, count: UInt): Int

@CCall("knifunptr_pigpio66_i2cSwitchCombined")
external fun i2cSwitchCombined(setting: Int): Unit

@CCall("knifunptr_pigpio67_i2cSegments")
external fun i2cSegments(handle: UInt, segs: CValuesRef<pi_i2c_msg_t>?, numSegs: UInt): Int

@CCall("knifunptr_pigpio68_i2cZip")
external fun i2cZip(handle: UInt, inBuf: CValuesRef<ByteVar>?, inLen: UInt, outBuf: CValuesRef<ByteVar>?, outLen: UInt): Int

@CCall("knifunptr_pigpio69_bbI2COpen")
external fun bbI2COpen(SDA: UInt, SCL: UInt, baud: UInt): Int

@CCall("knifunptr_pigpio70_bbI2CClose")
external fun bbI2CClose(SDA: UInt): Int

@CCall("knifunptr_pigpio71_bbI2CZip")
external fun bbI2CZip(SDA: UInt, inBuf: CValuesRef<ByteVar>?, inLen: UInt, outBuf: CValuesRef<ByteVar>?, outLen: UInt): Int

@CCall("knifunptr_pigpio72_bscXfer")
external fun bscXfer(bsc_xfer: CValuesRef<bsc_xfer_t>?): Int

@CCall("knifunptr_pigpio73_bbSPIOpen")
external fun bbSPIOpen(CS: UInt, MISO: UInt, MOSI: UInt, SCLK: UInt, baud: UInt, spiFlags: UInt): Int

@CCall("knifunptr_pigpio74_bbSPIClose")
external fun bbSPIClose(CS: UInt): Int

@CCall("knifunptr_pigpio75_bbSPIXfer")
external fun bbSPIXfer(CS: UInt, inBuf: CValuesRef<ByteVar>?, outBuf: CValuesRef<ByteVar>?, count: UInt): Int

@CCall("knifunptr_pigpio76_spiOpen")
external fun spiOpen(spiChan: UInt, baud: UInt, spiFlags: UInt): Int

@CCall("knifunptr_pigpio77_spiClose")
external fun spiClose(handle: UInt): Int

@CCall("knifunptr_pigpio78_spiRead")
external fun spiRead(handle: UInt, buf: CValuesRef<ByteVar>?, count: UInt): Int

@CCall("knifunptr_pigpio79_spiWrite")
external fun spiWrite(handle: UInt, buf: CValuesRef<ByteVar>?, count: UInt): Int

@CCall("knifunptr_pigpio80_spiXfer")
external fun spiXfer(handle: UInt, txBuf: CValuesRef<ByteVar>?, rxBuf: CValuesRef<ByteVar>?, count: UInt): Int

@CCall("knifunptr_pigpio81_serOpen")
external fun serOpen(sertty: CValuesRef<ByteVar>?, baud: UInt, serFlags: UInt): Int

@CCall("knifunptr_pigpio82_serClose")
external fun serClose(handle: UInt): Int

@CCall("knifunptr_pigpio83_serWriteByte")
external fun serWriteByte(handle: UInt, bVal: UInt): Int

@CCall("knifunptr_pigpio84_serReadByte")
external fun serReadByte(handle: UInt): Int

@CCall("knifunptr_pigpio85_serWrite")
external fun serWrite(handle: UInt, buf: CValuesRef<ByteVar>?, count: UInt): Int

@CCall("knifunptr_pigpio86_serRead")
external fun serRead(handle: UInt, buf: CValuesRef<ByteVar>?, count: UInt): Int

@CCall("knifunptr_pigpio87_serDataAvailable")
external fun serDataAvailable(handle: UInt): Int

@CCall("knifunptr_pigpio88_gpioTrigger")
external fun gpioTrigger(user_gpio: UInt, pulseLen: UInt, level: UInt): Int

@CCall("knifunptr_pigpio89_gpioSetWatchdog")
external fun gpioSetWatchdog(user_gpio: UInt, timeout: UInt): Int

@CCall("knifunptr_pigpio90_gpioNoiseFilter")
external fun gpioNoiseFilter(user_gpio: UInt, steady: UInt, active: UInt): Int

@CCall("knifunptr_pigpio91_gpioGlitchFilter")
external fun gpioGlitchFilter(user_gpio: UInt, steady: UInt): Int

@CCall("knifunptr_pigpio92_gpioSetGetSamplesFunc")
external fun gpioSetGetSamplesFunc(f: gpioGetSamplesFunc_t?, bits: uint32_t): Int

@CCall("knifunptr_pigpio93_gpioSetGetSamplesFuncEx")
external fun gpioSetGetSamplesFuncEx(f: gpioGetSamplesFuncEx_t?, bits: uint32_t, userdata: CValuesRef<*>?): Int

@CCall("knifunptr_pigpio94_gpioSetTimerFunc")
external fun gpioSetTimerFunc(timer: UInt, millis: UInt, f: gpioTimerFunc_t?): Int

@CCall("knifunptr_pigpio95_gpioSetTimerFuncEx")
external fun gpioSetTimerFuncEx(timer: UInt, millis: UInt, f: gpioTimerFuncEx_t?, userdata: CValuesRef<*>?): Int


@CCall("knifunptr_pigpio97_gpioStopThread")
external fun gpioStopThread(pth: CValuesRef<pthread_tVar>?): Unit

@CCall("knifunptr_pigpio98_gpioStoreScript")
external fun gpioStoreScript(script: CValuesRef<ByteVar>?): Int

@CCall("knifunptr_pigpio99_gpioRunScript")
external fun gpioRunScript(script_id: UInt, numPar: UInt, param: CValuesRef<uint32_tVar>?): Int

@CCall("knifunptr_pigpio100_gpioUpdateScript")
external fun gpioUpdateScript(script_id: UInt, numPar: UInt, param: CValuesRef<uint32_tVar>?): Int

@CCall("knifunptr_pigpio101_gpioScriptStatus")
external fun gpioScriptStatus(script_id: UInt, param: CValuesRef<uint32_tVar>?): Int

@CCall("knifunptr_pigpio102_gpioStopScript")
external fun gpioStopScript(script_id: UInt): Int

@CCall("knifunptr_pigpio103_gpioDeleteScript")
external fun gpioDeleteScript(script_id: UInt): Int

@CCall("knifunptr_pigpio104_gpioSetSignalFunc")
external fun gpioSetSignalFunc(signum: UInt, f: gpioSignalFunc_t?): Int

@CCall("knifunptr_pigpio105_gpioSetSignalFuncEx")
external fun gpioSetSignalFuncEx(signum: UInt, f: gpioSignalFuncEx_t?, userdata: CValuesRef<*>?): Int

@CCall("knifunptr_pigpio106_gpioRead_Bits_0_31")
external fun gpioRead_Bits_0_31(): uint32_t

@CCall("knifunptr_pigpio107_gpioRead_Bits_32_53")
external fun gpioRead_Bits_32_53(): uint32_t

@CCall("knifunptr_pigpio108_gpioWrite_Bits_0_31_Clear")
external fun gpioWrite_Bits_0_31_Clear(bits: uint32_t): Int

@CCall("knifunptr_pigpio109_gpioWrite_Bits_32_53_Clear")
external fun gpioWrite_Bits_32_53_Clear(bits: uint32_t): Int

@CCall("knifunptr_pigpio110_gpioWrite_Bits_0_31_Set")
external fun gpioWrite_Bits_0_31_Set(bits: uint32_t): Int

@CCall("knifunptr_pigpio111_gpioWrite_Bits_32_53_Set")
external fun gpioWrite_Bits_32_53_Set(bits: uint32_t): Int

@CCall("knifunptr_pigpio112_gpioHardwareClock")
external fun gpioHardwareClock(gpio: UInt, clkfreq: UInt): Int

@CCall("knifunptr_pigpio113_gpioHardwarePWM")
external fun gpioHardwarePWM(gpio: UInt, PWMfreq: UInt, PWMduty: UInt): Int

@CCall("knifunptr_pigpio114_gpioTime")
external fun gpioTime(timetype: UInt, seconds: CValuesRef<IntVar>?, micros: CValuesRef<IntVar>?): Int

@CCall("knifunptr_pigpio115_gpioSleep")
external fun gpioSleep(timetype: UInt, seconds: Int, micros: Int): Int

@CCall("knifunptr_pigpio116_gpioDelay")
external fun gpioDelay(micros: uint32_t): uint32_t

@CCall("knifunptr_pigpio117_gpioTick")
external fun gpioTick(): uint32_t

@CCall("knifunptr_pigpio118_gpioHardwareRevision")
external fun gpioHardwareRevision(): UInt

@CCall("knifunptr_pigpio119_gpioVersion")
external fun gpioVersion(): UInt

@CCall("knifunptr_pigpio120_gpioGetPad")
external fun gpioGetPad(pad: UInt): Int

@CCall("knifunptr_pigpio121_gpioSetPad")
external fun gpioSetPad(pad: UInt, padStrength: UInt): Int

@CCall("knifunptr_pigpio122_eventMonitor")
external fun eventMonitor(handle: UInt, bits: uint32_t): Int

@CCall("knifunptr_pigpio123_eventSetFunc")
external fun eventSetFunc(event: UInt, f: eventFunc_t?): Int

@CCall("knifunptr_pigpio124_eventSetFuncEx")
external fun eventSetFuncEx(event: UInt, f: eventFuncEx_t?, userdata: CValuesRef<*>?): Int

@CCall("knifunptr_pigpio125_eventTrigger")
external fun eventTrigger(event: UInt): Int

@CCall("knifunptr_pigpio126_shell")
external fun shell(scriptName: CValuesRef<ByteVar>?, scriptString: CValuesRef<ByteVar>?): Int

@CCall("knifunptr_pigpio127_fileOpen")
external fun fileOpen(file: CValuesRef<ByteVar>?, mode: UInt): Int

@CCall("knifunptr_pigpio128_fileClose")
external fun fileClose(handle: UInt): Int

@CCall("knifunptr_pigpio129_fileWrite")
external fun fileWrite(handle: UInt, buf: CValuesRef<ByteVar>?, count: UInt): Int

@CCall("knifunptr_pigpio130_fileRead")
external fun fileRead(handle: UInt, buf: CValuesRef<ByteVar>?, count: UInt): Int

@CCall("knifunptr_pigpio131_fileSeek")
external fun fileSeek(handle: UInt, seekOffset: int32_t, seekFrom: Int): Int

@CCall("knifunptr_pigpio132_fileList")
external fun fileList(fpat: CValuesRef<ByteVar>?, buf: CValuesRef<ByteVar>?, count: UInt): Int

@CCall("knifunptr_pigpio133_gpioCfgBufferSize")
external fun gpioCfgBufferSize(cfgMillis: UInt): Int

@CCall("knifunptr_pigpio134_gpioCfgClock")
external fun gpioCfgClock(cfgMicros: UInt, cfgPeripheral: UInt, cfgSource: UInt): Int

@CCall("knifunptr_pigpio135_gpioCfgDMAchannel")
external fun gpioCfgDMAchannel(DMAchannel: UInt): Int

@CCall("knifunptr_pigpio136_gpioCfgDMAchannels")
external fun gpioCfgDMAchannels(primaryChannel: UInt, secondaryChannel: UInt): Int

@CCall("knifunptr_pigpio137_gpioCfgPermissions")
external fun gpioCfgPermissions(updateMask: uint64_t): Int

@CCall("knifunptr_pigpio138_gpioCfgSocketPort")
external fun gpioCfgSocketPort(port: UInt): Int

@CCall("knifunptr_pigpio139_gpioCfgInterfaces")
external fun gpioCfgInterfaces(ifFlags: UInt): Int

@CCall("knifunptr_pigpio140_gpioCfgMemAlloc")
external fun gpioCfgMemAlloc(memAllocMode: UInt): Int

@CCall("knifunptr_pigpio141_gpioCfgNetAddr")
external fun gpioCfgNetAddr(numSockAddr: Int, sockAddr: CValuesRef<uint32_tVar>?): Int

@CCall("knifunptr_pigpio142_gpioCfgInternals")
external fun gpioCfgInternals(cfgWhat: UInt, cfgVal: UInt): Int

@CCall("knifunptr_pigpio143_gpioCfgGetInternals")
external fun gpioCfgGetInternals(): uint32_t

@CCall("knifunptr_pigpio144_gpioCfgSetInternals")
external fun gpioCfgSetInternals(cfgVal: uint32_t): Int

@CCall("knifunptr_pigpio145_gpioCustom1")
external fun gpioCustom1(arg1: UInt, arg2: UInt, argx: CValuesRef<ByteVar>?, argc: UInt): Int

@CCall("knifunptr_pigpio146_gpioCustom2")
external fun gpioCustom2(arg1: UInt, argx: CValuesRef<ByteVar>?, argc: UInt, retBuf: CValuesRef<ByteVar>?, retMax: UInt): Int

@CCall("knifunptr_pigpio147_rawWaveAddSPI")
external fun rawWaveAddSPI(spi: CValuesRef<rawSPI_t>?, offset: UInt, spiSS: UInt, buf: CValuesRef<ByteVar>?, spiTxBits: UInt, spiBitFirst: UInt, spiBitLast: UInt, spiBits: UInt): Int

@CCall("knifunptr_pigpio148_rawWaveAddGeneric")
external fun rawWaveAddGeneric(numPulses: UInt, pulses: CValuesRef<rawWave_t>?): Int

@CCall("knifunptr_pigpio149_rawWaveCB")
external fun rawWaveCB(): UInt

@CCall("knifunptr_pigpio150_rawWaveCBAdr")
external fun rawWaveCBAdr(cbNum: Int): CPointer<rawCbs_t>?

@CCall("knifunptr_pigpio151_rawWaveGetOOL")
external fun rawWaveGetOOL(pos: Int): uint32_t

@CCall("knifunptr_pigpio152_rawWaveSetOOL")
external fun rawWaveSetOOL(pos: Int, lVal: uint32_t): Unit

@CCall("knifunptr_pigpio153_rawWaveGetOut")
external fun rawWaveGetOut(pos: Int): uint32_t

@CCall("knifunptr_pigpio154_rawWaveSetOut")
external fun rawWaveSetOut(pos: Int, lVal: uint32_t): Unit

@CCall("knifunptr_pigpio155_rawWaveGetIn")
external fun rawWaveGetIn(pos: Int): uint32_t

@CCall("knifunptr_pigpio156_rawWaveSetIn")
external fun rawWaveSetIn(pos: Int, lVal: uint32_t): Unit

@CCall("knifunptr_pigpio157_rawWaveInfo")
external fun rawWaveInfo(wave_id: Int): CValue<rawWaveInfo_t>

@CCall("knifunptr_pigpio158_getBitInBytes")
external fun getBitInBytes(bitPos: Int, buf: CValuesRef<ByteVar>?, numBits: Int): Int

@CCall("knifunptr_pigpio159_putBitInBytes")
external fun putBitInBytes(bitPos: Int, buf: CValuesRef<ByteVar>?, bit: Int): Unit

@CCall("knifunptr_pigpio160_time_time")
external fun time_time(): Double

@CCall("knifunptr_pigpio161_time_sleep")
external fun time_sleep(seconds: Double): Unit

@CCall("knifunptr_pigpio162_rawDumpWave")
external fun rawDumpWave(): Unit

@CCall("knifunptr_pigpio163_rawDumpScript")
external fun rawDumpScript(script_id: UInt): Unit

const val PIGPIO_VERSION: Int = 68

val PI_INPFIFO: String get() = "\u002Fdev\u002Fpigpio"

val PI_OUTFIFO: String get() = "\u002Fdev\u002Fpigout"

val PI_ERRFIFO: String get() = "\u002Fdev\u002Fpigerr"

val PI_ENVPORT: String get() = "PIGPIO_PORT"

val PI_ENVADDR: String get() = "PIGPIO_ADDR"

val PI_LOCKFILE: String get() = "\u002Fvar\u002Frun\u002Fpigpio.pid"

val PI_I2C_COMBINED: String get() = "\u002Fsys\u002Fmodule\u002Fi2c_bcm2708\u002Fparameters\u002Fcombined"

const val WAVE_FLAG_READ: Int = 1

const val WAVE_FLAG_TICK: Int = 2

const val BSC_FIFO_SIZE: Int = 512

const val PI_MIN_GPIO: Int = 0

const val PI_MAX_GPIO: Int = 53

const val PI_MAX_USER_GPIO: Int = 31

const val PI_OFF: Int = 0

const val PI_ON: Int = 1

const val PI_CLEAR: Int = 0

const val PI_SET: Int = 1

const val PI_LOW: Int = 0

const val PI_HIGH: Int = 1

const val PI_TIMEOUT: Int = 2

const val PI_INPUT: Int = 0

const val PI_OUTPUT: Int = 1

const val PI_ALT0: Int = 4

const val PI_ALT1: Int = 5

const val PI_ALT2: Int = 6

const val PI_ALT3: Int = 7

const val PI_ALT4: Int = 3

const val PI_ALT5: Int = 2

const val PI_PUD_OFF: Int = 0

const val PI_PUD_DOWN: Int = 1

const val PI_PUD_UP: Int = 2

const val PI_DEFAULT_DUTYCYCLE_RANGE: Int = 255

const val PI_MIN_DUTYCYCLE_RANGE: Int = 25

const val PI_MAX_DUTYCYCLE_RANGE: Int = 40000

const val PI_SERVO_OFF: Int = 0

const val PI_MIN_SERVO_PULSEWIDTH: Int = 500

const val PI_MAX_SERVO_PULSEWIDTH: Int = 2500

const val PI_HW_PWM_MIN_FREQ: Int = 1

const val PI_HW_PWM_MAX_FREQ: Int = 125000000

const val PI_HW_PWM_RANGE: Int = 1000000

const val PI_HW_CLK_MIN_FREQ: Int = 4689

const val PI_HW_CLK_MAX_FREQ: Int = 250000000

const val PI_NOTIFY_SLOTS: Int = 32

const val PI_NTFY_FLAGS_EVENT: Int = 128

const val PI_NTFY_FLAGS_ALIVE: Int = 64

const val PI_NTFY_FLAGS_WDOG: Int = 32

const val PI_WAVE_BLOCKS: Int = 4

const val PI_WAVE_MAX_PULSES: Int = 12000

const val PI_WAVE_MAX_CHARS: Int = 1200

const val PI_BB_I2C_MIN_BAUD: Int = 50

const val PI_BB_I2C_MAX_BAUD: Int = 500000

const val PI_BB_SPI_MIN_BAUD: Int = 50

const val PI_BB_SPI_MAX_BAUD: Int = 250000

const val PI_BB_SER_MIN_BAUD: Int = 50

const val PI_BB_SER_MAX_BAUD: Int = 250000

const val PI_BB_SER_NORMAL: Int = 0

const val PI_BB_SER_INVERT: Int = 1

const val PI_WAVE_MIN_BAUD: Int = 50

const val PI_WAVE_MAX_BAUD: Int = 1000000

const val PI_SPI_MIN_BAUD: Int = 32000

const val PI_SPI_MAX_BAUD: Int = 125000000

const val PI_MIN_WAVE_DATABITS: Int = 1

const val PI_MAX_WAVE_DATABITS: Int = 32

const val PI_MIN_WAVE_HALFSTOPBITS: Int = 2

const val PI_MAX_WAVE_HALFSTOPBITS: Int = 8

const val PI_WAVE_MAX_MICROS: Int = 1800000000

const val PI_MAX_WAVES: Int = 250

const val PI_MAX_WAVE_CYCLES: Int = 65535

const val PI_MAX_WAVE_DELAY: Int = 65535

const val PI_WAVE_COUNT_PAGES: Int = 10

const val PI_WAVE_MODE_ONE_SHOT: Int = 0

const val PI_WAVE_MODE_REPEAT: Int = 1

const val PI_WAVE_MODE_ONE_SHOT_SYNC: Int = 2

const val PI_WAVE_MODE_REPEAT_SYNC: Int = 3

const val PI_WAVE_NOT_FOUND: Int = 9998

const val PI_NO_TX_WAVE: Int = 9999

const val PI_FILE_SLOTS: Int = 16

const val PI_I2C_SLOTS: Int = 64

const val PI_SPI_SLOTS: Int = 32

const val PI_SER_SLOTS: Int = 16

const val PI_MAX_I2C_ADDR: Int = 127

const val PI_NUM_AUX_SPI_CHANNEL: Int = 3

const val PI_NUM_STD_SPI_CHANNEL: Int = 2

const val PI_MAX_I2C_DEVICE_COUNT: Int = 65536

const val PI_MAX_SPI_DEVICE_COUNT: Int = 65536

const val PI_I2C_RDRW_IOCTL_MAX_MSGS: Int = 42

const val PI_I2C_M_WR: Int = 0

const val PI_I2C_M_RD: Int = 1

const val PI_I2C_M_TEN: Int = 16

const val PI_I2C_M_RECV_LEN: Int = 1024

const val PI_I2C_M_NO_RD_ACK: Int = 2048

const val PI_I2C_M_IGNORE_NAK: Int = 4096

const val PI_I2C_M_REV_DIR_ADDR: Int = 8192

const val PI_I2C_M_NOSTART: Int = 16384

const val PI_I2C_END: Int = 0

const val PI_I2C_ESC: Int = 1

const val PI_I2C_START: Int = 2

const val PI_I2C_COMBINED_ON: Int = 2

const val PI_I2C_STOP: Int = 3

const val PI_I2C_COMBINED_OFF: Int = 3

const val PI_I2C_ADDR: Int = 4

const val PI_I2C_FLAGS: Int = 5

const val PI_I2C_READ: Int = 6

const val PI_I2C_WRITE: Int = 7

const val BSC_DR: Int = 0

const val BSC_RSR: Int = 1

const val BSC_SLV: Int = 2

const val BSC_CR: Int = 3

const val BSC_FR: Int = 4

const val BSC_IFLS: Int = 5

const val BSC_IMSC: Int = 6

const val BSC_RIS: Int = 7

const val BSC_MIS: Int = 8

const val BSC_ICR: Int = 9

const val BSC_DMACR: Int = 10

const val BSC_TDR: Int = 11

const val BSC_GPUSTAT: Int = 12

const val BSC_HCTRL: Int = 13

const val BSC_DEBUG_I2C: Int = 14

const val BSC_DEBUG_SPI: Int = 15

const val BSC_CR_TESTFIFO: Int = 2048

const val BSC_CR_RXE: Int = 512

const val BSC_CR_TXE: Int = 256

const val BSC_CR_BRK: Int = 128

const val BSC_CR_CPOL: Int = 16

const val BSC_CR_CPHA: Int = 8

const val BSC_CR_I2C: Int = 4

const val BSC_CR_SPI: Int = 2

const val BSC_CR_EN: Int = 1

const val BSC_FR_RXBUSY: Int = 32

const val BSC_FR_TXFE: Int = 16

const val BSC_FR_RXFF: Int = 8

const val BSC_FR_TXFF: Int = 4

const val BSC_FR_RXFE: Int = 2

const val BSC_FR_TXBUSY: Int = 1

const val BSC_SDA_MOSI: Int = 18

const val BSC_SCL_SCLK: Int = 19

const val BSC_MISO: Int = 20

const val BSC_CE_N: Int = 21

const val PI_MAX_BUSY_DELAY: Int = 100

const val PI_MIN_WDOG_TIMEOUT: Int = 0

const val PI_MAX_WDOG_TIMEOUT: Int = 60000

const val PI_MIN_TIMER: Int = 0

const val PI_MAX_TIMER: Int = 9

const val PI_MIN_MS: Int = 10

const val PI_MAX_MS: Int = 60000

const val PI_MAX_SCRIPTS: Int = 32

const val PI_MAX_SCRIPT_TAGS: Int = 50

const val PI_MAX_SCRIPT_VARS: Int = 150

const val PI_MAX_SCRIPT_PARAMS: Int = 10

const val PI_SCRIPT_INITING: Int = 0

const val PI_SCRIPT_HALTED: Int = 1

const val PI_SCRIPT_RUNNING: Int = 2

const val PI_SCRIPT_WAITING: Int = 3

const val PI_SCRIPT_FAILED: Int = 4

const val PI_MIN_SIGNUM: Int = 0

const val PI_MAX_SIGNUM: Int = 63

const val PI_TIME_RELATIVE: Int = 0

const val PI_TIME_ABSOLUTE: Int = 1

const val PI_MAX_MICS_DELAY: Int = 1000000

const val PI_MAX_MILS_DELAY: Int = 60000

const val PI_BUF_MILLIS_MIN: Int = 100

const val PI_BUF_MILLIS_MAX: Int = 10000

const val PI_CLOCK_PWM: Int = 0

const val PI_CLOCK_PCM: Int = 1

const val PI_MIN_DMA_CHANNEL: Int = 0

const val PI_MAX_DMA_CHANNEL: Int = 14

const val PI_MIN_SOCKET_PORT: Int = 1024

const val PI_MAX_SOCKET_PORT: Int = 32000

const val PI_DISABLE_FIFO_IF: Int = 1

const val PI_DISABLE_SOCK_IF: Int = 2

const val PI_LOCALHOST_SOCK_IF: Int = 4

const val PI_DISABLE_ALERT: Int = 8

const val PI_MEM_ALLOC_AUTO: Int = 0

const val PI_MEM_ALLOC_PAGEMAP: Int = 1

const val PI_MEM_ALLOC_MAILBOX: Int = 2

const val PI_MAX_STEADY: Int = 300000

const val PI_MAX_ACTIVE: Int = 1000000

const val PI_CFG_DBG_LEVEL: Int = 0

const val PI_CFG_ALERT_FREQ: Int = 4

const val PI_CFG_RT_PRIORITY: Int = 256

const val PI_CFG_STATS: Int = 512

const val PI_CFG_NOSIGHANDLER: Int = 1024

const val PI_CFG_ILLEGAL_VAL: Int = 2048

const val RISING_EDGE: Int = 0

const val FALLING_EDGE: Int = 1

const val EITHER_EDGE: Int = 2

const val PI_MAX_PAD: Int = 2

const val PI_MIN_PAD_STRENGTH: Int = 1

const val PI_MAX_PAD_STRENGTH: Int = 16

const val PI_FILE_NONE: Int = 0

const val PI_FILE_MIN: Int = 1

const val PI_FILE_READ: Int = 1

const val PI_FILE_WRITE: Int = 2

const val PI_FILE_RW: Int = 3

const val PI_FILE_APPEND: Int = 4

const val PI_FILE_CREATE: Int = 8

const val PI_FILE_TRUNC: Int = 16

const val PI_FILE_MAX: Int = 31

const val PI_FROM_START: Int = 0

const val PI_FROM_CURRENT: Int = 1

const val PI_FROM_END: Int = 2

const val MAX_CONNECT_ADDRESSES: Int = 256

const val PI_MAX_EVENT: Int = 31

const val PI_EVENT_BSC: Int = 31

const val PI_CMD_MODES: Int = 0

const val PI_CMD_MODEG: Int = 1

const val PI_CMD_PUD: Int = 2

const val PI_CMD_READ: Int = 3

const val PI_CMD_WRITE: Int = 4

const val PI_CMD_PWM: Int = 5

const val PI_CMD_PRS: Int = 6

const val PI_CMD_PFS: Int = 7

const val PI_CMD_SERVO: Int = 8

const val PI_CMD_WDOG: Int = 9

const val PI_CMD_BR1: Int = 10

const val PI_CMD_BR2: Int = 11

const val PI_CMD_BC1: Int = 12

const val PI_CMD_BC2: Int = 13

const val PI_CMD_BS1: Int = 14

const val PI_CMD_BS2: Int = 15

const val PI_CMD_TICK: Int = 16

const val PI_CMD_HWVER: Int = 17

const val PI_CMD_NO: Int = 18

const val PI_CMD_NB: Int = 19

const val PI_CMD_NP: Int = 20

const val PI_CMD_NC: Int = 21

const val PI_CMD_PRG: Int = 22

const val PI_CMD_PFG: Int = 23

const val PI_CMD_PRRG: Int = 24

const val PI_CMD_HELP: Int = 25

const val PI_CMD_PIGPV: Int = 26

const val PI_CMD_WVCLR: Int = 27

const val PI_CMD_WVAG: Int = 28

const val PI_CMD_WVAS: Int = 29

const val PI_CMD_WVGO: Int = 30

const val PI_CMD_WVGOR: Int = 31

const val PI_CMD_WVBSY: Int = 32

const val PI_CMD_WVHLT: Int = 33

const val PI_CMD_WVSM: Int = 34

const val PI_CMD_WVSP: Int = 35

const val PI_CMD_WVSC: Int = 36

const val PI_CMD_TRIG: Int = 37

const val PI_CMD_PROC: Int = 38

const val PI_CMD_PROCD: Int = 39

const val PI_CMD_PROCR: Int = 40

const val PI_CMD_PROCS: Int = 41

const val PI_CMD_SLRO: Int = 42

const val PI_CMD_SLR: Int = 43

const val PI_CMD_SLRC: Int = 44

const val PI_CMD_PROCP: Int = 45

const val PI_CMD_MICS: Int = 46

const val PI_CMD_MILS: Int = 47

const val PI_CMD_PARSE: Int = 48

const val PI_CMD_WVCRE: Int = 49

const val PI_CMD_WVDEL: Int = 50

const val PI_CMD_WVTX: Int = 51

const val PI_CMD_WVTXR: Int = 52

const val PI_CMD_WVNEW: Int = 53

const val PI_CMD_I2CO: Int = 54

const val PI_CMD_I2CC: Int = 55

const val PI_CMD_I2CRD: Int = 56

const val PI_CMD_I2CWD: Int = 57

const val PI_CMD_I2CWQ: Int = 58

const val PI_CMD_I2CRS: Int = 59

const val PI_CMD_I2CWS: Int = 60

const val PI_CMD_I2CRB: Int = 61

const val PI_CMD_I2CWB: Int = 62

const val PI_CMD_I2CRW: Int = 63

const val PI_CMD_I2CWW: Int = 64

const val PI_CMD_I2CRK: Int = 65

const val PI_CMD_I2CWK: Int = 66

const val PI_CMD_I2CRI: Int = 67

const val PI_CMD_I2CWI: Int = 68

const val PI_CMD_I2CPC: Int = 69

const val PI_CMD_I2CPK: Int = 70

const val PI_CMD_SPIO: Int = 71

const val PI_CMD_SPIC: Int = 72

const val PI_CMD_SPIR: Int = 73

const val PI_CMD_SPIW: Int = 74

const val PI_CMD_SPIX: Int = 75

const val PI_CMD_SERO: Int = 76

const val PI_CMD_SERC: Int = 77

const val PI_CMD_SERRB: Int = 78

const val PI_CMD_SERWB: Int = 79

const val PI_CMD_SERR: Int = 80

const val PI_CMD_SERW: Int = 81

const val PI_CMD_SERDA: Int = 82

const val PI_CMD_GDC: Int = 83

const val PI_CMD_GPW: Int = 84

const val PI_CMD_HC: Int = 85

const val PI_CMD_HP: Int = 86

const val PI_CMD_CF1: Int = 87

const val PI_CMD_CF2: Int = 88

const val PI_CMD_BI2CC: Int = 89

const val PI_CMD_BI2CO: Int = 90

const val PI_CMD_BI2CZ: Int = 91

const val PI_CMD_I2CZ: Int = 92

const val PI_CMD_WVCHA: Int = 93

const val PI_CMD_SLRI: Int = 94

const val PI_CMD_CGI: Int = 95

const val PI_CMD_CSI: Int = 96

const val PI_CMD_FG: Int = 97

const val PI_CMD_FN: Int = 98

const val PI_CMD_NOIB: Int = 99

const val PI_CMD_WVTXM: Int = 100

const val PI_CMD_WVTAT: Int = 101

const val PI_CMD_PADS: Int = 102

const val PI_CMD_PADG: Int = 103

const val PI_CMD_FO: Int = 104

const val PI_CMD_FC: Int = 105

const val PI_CMD_FR: Int = 106

const val PI_CMD_FW: Int = 107

const val PI_CMD_FS: Int = 108

const val PI_CMD_FL: Int = 109

const val PI_CMD_SHELL: Int = 110

const val PI_CMD_BSPIC: Int = 111

const val PI_CMD_BSPIO: Int = 112

const val PI_CMD_BSPIX: Int = 113

const val PI_CMD_BSCX: Int = 114

const val PI_CMD_EVM: Int = 115

const val PI_CMD_EVT: Int = 116

const val PI_CMD_PROCU: Int = 117

const val PI_CMD_SCRIPT: Int = 800

const val PI_CMD_ADD: Int = 800

const val PI_CMD_AND: Int = 801

const val PI_CMD_CALL: Int = 802

const val PI_CMD_CMDR: Int = 803

const val PI_CMD_CMDW: Int = 804

const val PI_CMD_CMP: Int = 805

const val PI_CMD_DCR: Int = 806

const val PI_CMD_DCRA: Int = 807

const val PI_CMD_DIV: Int = 808

const val PI_CMD_HALT: Int = 809

const val PI_CMD_INR: Int = 810

const val PI_CMD_INRA: Int = 811

const val PI_CMD_JM: Int = 812

const val PI_CMD_JMP: Int = 813

const val PI_CMD_JNZ: Int = 814

const val PI_CMD_JP: Int = 815

const val PI_CMD_JZ: Int = 816

const val PI_CMD_TAG: Int = 817

const val PI_CMD_LD: Int = 818

const val PI_CMD_LDA: Int = 819

const val PI_CMD_LDAB: Int = 820

const val PI_CMD_MLT: Int = 821

const val PI_CMD_MOD: Int = 822

const val PI_CMD_NOP: Int = 823

const val PI_CMD_OR: Int = 824

const val PI_CMD_POP: Int = 825

const val PI_CMD_POPA: Int = 826

const val PI_CMD_PUSH: Int = 827

const val PI_CMD_PUSHA: Int = 828

const val PI_CMD_RET: Int = 829

const val PI_CMD_RL: Int = 830

const val PI_CMD_RLA: Int = 831

const val PI_CMD_RR: Int = 832

const val PI_CMD_RRA: Int = 833

const val PI_CMD_STA: Int = 834

const val PI_CMD_STAB: Int = 835

const val PI_CMD_SUB: Int = 836

const val PI_CMD_SYS: Int = 837

const val PI_CMD_WAIT: Int = 838

const val PI_CMD_X: Int = 839

const val PI_CMD_XA: Int = 840

const val PI_CMD_XOR: Int = 841

const val PI_CMD_EVTWT: Int = 842

const val PI_INIT_FAILED: Int = -1

const val PI_BAD_USER_GPIO: Int = -2

const val PI_BAD_GPIO: Int = -3

const val PI_BAD_MODE: Int = -4

const val PI_BAD_LEVEL: Int = -5

const val PI_BAD_PUD: Int = -6

const val PI_BAD_PULSEWIDTH: Int = -7

const val PI_BAD_DUTYCYCLE: Int = -8

const val PI_BAD_TIMER: Int = -9

const val PI_BAD_MS: Int = -10

const val PI_BAD_TIMETYPE: Int = -11

const val PI_BAD_SECONDS: Int = -12

const val PI_BAD_MICROS: Int = -13

const val PI_TIMER_FAILED: Int = -14

const val PI_BAD_WDOG_TIMEOUT: Int = -15

const val PI_NO_ALERT_FUNC: Int = -16

const val PI_BAD_CLK_PERIPH: Int = -17

const val PI_BAD_CLK_SOURCE: Int = -18

const val PI_BAD_CLK_MICROS: Int = -19

const val PI_BAD_BUF_MILLIS: Int = -20

const val PI_BAD_DUTYRANGE: Int = -21

const val PI_BAD_DUTY_RANGE: Int = -21

const val PI_BAD_SIGNUM: Int = -22

const val PI_BAD_PATHNAME: Int = -23

const val PI_NO_HANDLE: Int = -24

const val PI_BAD_HANDLE: Int = -25

const val PI_BAD_IF_FLAGS: Int = -26

const val PI_BAD_CHANNEL: Int = -27

const val PI_BAD_PRIM_CHANNEL: Int = -27

const val PI_BAD_SOCKET_PORT: Int = -28

const val PI_BAD_FIFO_COMMAND: Int = -29

const val PI_BAD_SECO_CHANNEL: Int = -30

const val PI_NOT_INITIALISED: Int = -31

const val PI_INITIALISED: Int = -32

const val PI_BAD_WAVE_MODE: Int = -33

const val PI_BAD_CFG_INTERNAL: Int = -34

const val PI_BAD_WAVE_BAUD: Int = -35

const val PI_TOO_MANY_PULSES: Int = -36

const val PI_TOO_MANY_CHARS: Int = -37

const val PI_NOT_SERIAL_GPIO: Int = -38

const val PI_BAD_SERIAL_STRUC: Int = -39

const val PI_BAD_SERIAL_BUF: Int = -40

const val PI_NOT_PERMITTED: Int = -41

const val PI_SOME_PERMITTED: Int = -42

const val PI_BAD_WVSC_COMMND: Int = -43

const val PI_BAD_WVSM_COMMND: Int = -44

const val PI_BAD_WVSP_COMMND: Int = -45

const val PI_BAD_PULSELEN: Int = -46

const val PI_BAD_SCRIPT: Int = -47

const val PI_BAD_SCRIPT_ID: Int = -48

const val PI_BAD_SER_OFFSET: Int = -49

const val PI_GPIO_IN_USE: Int = -50

const val PI_BAD_SERIAL_COUNT: Int = -51

const val PI_BAD_PARAM_NUM: Int = -52

const val PI_DUP_TAG: Int = -53

const val PI_TOO_MANY_TAGS: Int = -54

const val PI_BAD_SCRIPT_CMD: Int = -55

const val PI_BAD_VAR_NUM: Int = -56

const val PI_NO_SCRIPT_ROOM: Int = -57

const val PI_NO_MEMORY: Int = -58

const val PI_SOCK_READ_FAILED: Int = -59

const val PI_SOCK_WRIT_FAILED: Int = -60

const val PI_TOO_MANY_PARAM: Int = -61

const val PI_NOT_HALTED: Int = -62

const val PI_SCRIPT_NOT_READY: Int = -62

const val PI_BAD_TAG: Int = -63

const val PI_BAD_MICS_DELAY: Int = -64

const val PI_BAD_MILS_DELAY: Int = -65

const val PI_BAD_WAVE_ID: Int = -66

const val PI_TOO_MANY_CBS: Int = -67

const val PI_TOO_MANY_OOL: Int = -68

const val PI_EMPTY_WAVEFORM: Int = -69

const val PI_NO_WAVEFORM_ID: Int = -70

const val PI_I2C_OPEN_FAILED: Int = -71

const val PI_SER_OPEN_FAILED: Int = -72

const val PI_SPI_OPEN_FAILED: Int = -73

const val PI_BAD_I2C_BUS: Int = -74

const val PI_BAD_I2C_ADDR: Int = -75

const val PI_BAD_SPI_CHANNEL: Int = -76

const val PI_BAD_FLAGS: Int = -77

const val PI_BAD_SPI_SPEED: Int = -78

const val PI_BAD_SER_DEVICE: Int = -79

const val PI_BAD_SER_SPEED: Int = -80

const val PI_BAD_PARAM: Int = -81

const val PI_I2C_WRITE_FAILED: Int = -82

const val PI_I2C_READ_FAILED: Int = -83

const val PI_BAD_SPI_COUNT: Int = -84

const val PI_SER_WRITE_FAILED: Int = -85

const val PI_SER_READ_FAILED: Int = -86

const val PI_SER_READ_NO_DATA: Int = -87

const val PI_UNKNOWN_COMMAND: Int = -88

const val PI_SPI_XFER_FAILED: Int = -89

const val PI_BAD_POINTER: Int = -90

const val PI_NO_AUX_SPI: Int = -91

const val PI_NOT_PWM_GPIO: Int = -92

const val PI_NOT_SERVO_GPIO: Int = -93

const val PI_NOT_HCLK_GPIO: Int = -94

const val PI_NOT_HPWM_GPIO: Int = -95

const val PI_BAD_HPWM_FREQ: Int = -96

const val PI_BAD_HPWM_DUTY: Int = -97

const val PI_BAD_HCLK_FREQ: Int = -98

const val PI_BAD_HCLK_PASS: Int = -99

const val PI_HPWM_ILLEGAL: Int = -100

const val PI_BAD_DATABITS: Int = -101

const val PI_BAD_STOPBITS: Int = -102

const val PI_MSG_TOOBIG: Int = -103

const val PI_BAD_MALLOC_MODE: Int = -104

const val PI_TOO_MANY_SEGS: Int = -105

const val PI_BAD_I2C_SEG: Int = -106

const val PI_BAD_SMBUS_CMD: Int = -107

const val PI_NOT_I2C_GPIO: Int = -108

const val PI_BAD_I2C_WLEN: Int = -109

const val PI_BAD_I2C_RLEN: Int = -110

const val PI_BAD_I2C_CMD: Int = -111

const val PI_BAD_I2C_BAUD: Int = -112

const val PI_CHAIN_LOOP_CNT: Int = -113

const val PI_BAD_CHAIN_LOOP: Int = -114

const val PI_CHAIN_COUNTER: Int = -115

const val PI_BAD_CHAIN_CMD: Int = -116

const val PI_BAD_CHAIN_DELAY: Int = -117

const val PI_CHAIN_NESTING: Int = -118

const val PI_CHAIN_TOO_BIG: Int = -119

const val PI_DEPRECATED: Int = -120

const val PI_BAD_SER_INVERT: Int = -121

const val PI_BAD_EDGE: Int = -122

const val PI_BAD_ISR_INIT: Int = -123

const val PI_BAD_FOREVER: Int = -124

const val PI_BAD_FILTER: Int = -125

const val PI_BAD_PAD: Int = -126

const val PI_BAD_STRENGTH: Int = -127

const val PI_FIL_OPEN_FAILED: Int = -128

const val PI_BAD_FILE_MODE: Int = -129

const val PI_BAD_FILE_FLAG: Int = -130

const val PI_BAD_FILE_READ: Int = -131

const val PI_BAD_FILE_WRITE: Int = -132

const val PI_FILE_NOT_ROPEN: Int = -133

const val PI_FILE_NOT_WOPEN: Int = -134

const val PI_BAD_FILE_SEEK: Int = -135

const val PI_NO_FILE_MATCH: Int = -136

const val PI_NO_FILE_ACCESS: Int = -137

const val PI_FILE_IS_A_DIR: Int = -138

const val PI_BAD_SHELL_STATUS: Int = -139

const val PI_BAD_SCRIPT_NAME: Int = -140

const val PI_BAD_SPI_BAUD: Int = -141

const val PI_NOT_SPI_GPIO: Int = -142

const val PI_BAD_EVENT_ID: Int = -143

const val PI_CMD_INTERRUPTED: Int = -144

const val PI_PIGIF_ERR_0: Int = -2000

const val PI_PIGIF_ERR_99: Int = -2099

const val PI_CUSTOM_ERR_0: Int = -3000

const val PI_CUSTOM_ERR_999: Int = -3999

const val PI_DEFAULT_BUFFER_MILLIS: Int = 120

const val PI_DEFAULT_CLK_MICROS: Int = 5

const val PI_DEFAULT_CLK_PERIPHERAL: Int = 1

const val PI_DEFAULT_IF_FLAGS: Int = 0

const val PI_DEFAULT_FOREGROUND: Int = 0

const val PI_DEFAULT_DMA_CHANNEL: Int = 14

const val PI_DEFAULT_DMA_PRIMARY_CHANNEL: Int = 14

const val PI_DEFAULT_DMA_SECONDARY_CHANNEL: Int = 6

const val PI_DEFAULT_SOCKET_PORT: Int = 8888

val PI_DEFAULT_SOCKET_PORT_STR: String get() = "8888"

val PI_DEFAULT_SOCKET_ADDR_STR: String get() = "127.0.0.1"

const val PI_DEFAULT_UPDATE_MASK_UNKNOWN: Long = 268435452

const val PI_DEFAULT_UPDATE_MASK_B1: Int = 65523603

const val PI_DEFAULT_UPDATE_MASK_A_B2: UInt = 4224176028u

const val PI_DEFAULT_UPDATE_MASK_APLUS_BPLUS: Long = 141046994436092

const val PI_DEFAULT_UPDATE_MASK_ZERO: Long = 140737756790780

const val PI_DEFAULT_UPDATE_MASK_PI2B: Long = 141046994436092

const val PI_DEFAULT_UPDATE_MASK_PI3B: Long = 268435452

const val PI_DEFAULT_UPDATE_MASK_COMPUTE: Long = 281474976710655

const val PI_DEFAULT_MEM_ALLOC_MODE: Int = 0

const val PI_DEFAULT_CFG_INTERNALS: Int = 0

typealias gpioAlertFunc_tVar = CPointerVarOf<gpioAlertFunc_t>

typealias gpioAlertFunc_t = CPointer<CFunction<(Int, Int, uint32_t) -> Unit>>

typealias gpioAlertFuncEx_tVar = CPointerVarOf<gpioAlertFuncEx_t>

typealias gpioAlertFuncEx_t = CPointer<CFunction<(Int, Int, uint32_t, COpaquePointer?) -> Unit>>

typealias eventFunc_tVar = CPointerVarOf<eventFunc_t>

typealias eventFunc_t = CPointer<CFunction<(Int, uint32_t) -> Unit>>

typealias eventFuncEx_tVar = CPointerVarOf<eventFuncEx_t>

typealias eventFuncEx_t = CPointer<CFunction<(Int, uint32_t, COpaquePointer?) -> Unit>>

typealias gpioISRFunc_tVar = CPointerVarOf<gpioISRFunc_t>

typealias gpioISRFunc_t = CPointer<CFunction<(Int, Int, uint32_t) -> Unit>>

typealias gpioISRFuncEx_tVar = CPointerVarOf<gpioISRFuncEx_t>

typealias gpioISRFuncEx_t = CPointer<CFunction<(Int, Int, uint32_t, COpaquePointer?) -> Unit>>

typealias gpioTimerFunc_tVar = CPointerVarOf<gpioTimerFunc_t>

typealias gpioTimerFunc_t = CPointer<CFunction<() -> Unit>>

typealias gpioTimerFuncEx_tVar = CPointerVarOf<gpioTimerFuncEx_t>

typealias gpioTimerFuncEx_t = CPointer<CFunction<(COpaquePointer?) -> Unit>>

typealias gpioSignalFunc_tVar = CPointerVarOf<gpioSignalFunc_t>

typealias gpioSignalFunc_t = CPointer<CFunction<(Int) -> Unit>>

typealias gpioSignalFuncEx_tVar = CPointerVarOf<gpioSignalFuncEx_t>

typealias gpioSignalFuncEx_t = CPointer<CFunction<(Int, COpaquePointer?) -> Unit>>

typealias gpioGetSamplesFunc_tVar = CPointerVarOf<gpioGetSamplesFunc_t>

typealias gpioGetSamplesFunc_t = CPointer<CFunction<(CPointer<gpioSample_t>?, Int) -> Unit>>

typealias gpioGetSamplesFuncEx_tVar = CPointerVarOf<gpioGetSamplesFuncEx_t>

typealias gpioGetSamplesFuncEx_t = CPointer<CFunction<(CPointer<gpioSample_t>?, Int, COpaquePointer?) -> Unit>>

typealias gpioThreadFunc_t = CFunction<(COpaquePointer?) -> COpaquePointer?>
