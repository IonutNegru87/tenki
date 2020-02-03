@file:kotlinx.cinterop.InteropStubs
@file:Suppress("UNUSED_VARIABLE", "UNUSED_EXPRESSION")
package pca9685

import kotlin.native.SymbolName
import kotlinx.cinterop.internal.*
import kotlinx.cinterop.*

// NOTE THIS FILE IS AUTO-GENERATED

@CCall("knifunptr_pca96850_PCA9685_openI2C")
external fun PCA9685_openI2C(adpt: UByte, addr: UByte): Int

@CCall("knifunptr_pca96851_PCA9685_initPWM")
external fun PCA9685_initPWM(fd: Int, addr: UByte, freq: UInt): Int

@CCall("knifunptr_pca96852_PCA9685_setPWMVals")
external fun PCA9685_setPWMVals(fd: Int, addr: UByte, onVals: CValuesRef<UIntVar>?, offVals: CValuesRef<UIntVar>?): Int

@CCall("knifunptr_pca96853_PCA9685_setPWMVal")
external fun PCA9685_setPWMVal(fd: Int, addr: UByte, reg: UByte, on: UInt, off: UInt): Int

@CCall("knifunptr_pca96854_PCA9685_setAllPWM")
external fun PCA9685_setAllPWM(fd: Int, addr: UByte, on: UInt, off: UInt): Int

@CCall("knifunptr_pca96855_PCA9685_getRegVals")
external fun PCA9685_getRegVals(fd: Int, addr: UByte, mode1val: CValuesRef<UByteVar>?, mode2val: CValuesRef<UByteVar>?): Int

@CCall("knifunptr_pca96856_PCA9685_getPWMVals")
external fun PCA9685_getPWMVals(fd: Int, addr: UByte, onVals: CValuesRef<UIntVar>?, offVals: CValuesRef<UIntVar>?): Int

@CCall("knifunptr_pca96857_PCA9685_getPWMVal")
external fun PCA9685_getPWMVal(fd: Int, addr: UByte, reg: UByte, on: CValuesRef<UIntVar>?, off: CValuesRef<UIntVar>?): Int

@CCall("knifunptr_pca96858_PCA9685_dumpAllRegs")
external fun PCA9685_dumpAllRegs(fd: Int, addr: UByte): Int

@CCall("knifunptr_pca96859__PCA9685_setPWMFreq")
external fun _PCA9685_setPWMFreq(fd: Int, addr: UByte, freq: UInt): Int

@CCall("knifunptr_pca968510__PCA9685_dumpLoRegs")
external fun _PCA9685_dumpLoRegs(buf: CValuesRef<UByteVar>?): Int

@CCall("knifunptr_pca968511__PCA9685_dumpHiRegs")
external fun _PCA9685_dumpHiRegs(buf: CValuesRef<UByteVar>?): Int

@CCall("knifunptr_pca968512__PCA9685_readI2CReg")
external fun _PCA9685_readI2CReg(fd: Int, addr: UByte, startReg: UByte, len: Int, readBuf: CValuesRef<UByteVar>?): Int

@CCall("knifunptr_pca968513__PCA9685_writeI2CReg")
external fun _PCA9685_writeI2CReg(fd: Int, addr: UByte, startReg: UByte, len: Int, writeBuf: CValuesRef<UByteVar>?): Int

@CCall("knifunptr_pca968514__PCA9685_writeI2CRaw")
external fun _PCA9685_writeI2CRaw(fd: Int, addr: UByte, len: Int, writeBuf: CValuesRef<UByteVar>?): Int

@CCall("knifunptr_pca968515__PCA9685_ioctl")
external fun _PCA9685_ioctl(fd: Int, request: UInt, argp: CValuesRef<ByteVar>?): Int

@CCall("knifunptr_pca968516__PCA9685_open")
external fun _PCA9685_open(@CCall.CString pathname: String?, flags: Int): Int

var _PCA9685_DEBUG: Boolean
    get() = kniBridge0().toBoolean()
    set(value) { kniBridge1(value.toByte()) }

var _PCA9685_TEST: Boolean
    get() = kniBridge2().toBoolean()
    set(value) { kniBridge3(value.toByte()) }

var _PCA9685_MODE1: UByte
    get() = kniBridge4()
    set(value) { kniBridge5(value) }

var _PCA9685_MODE2: UByte
    get() = kniBridge6()
    set(value) { kniBridge7(value) }

const val `true`: Int = 1

const val `false`: Int = 0

const val __bool_true_false_are_defined: Int = 1

const val _PCA9685_CHANS: Int = 16

const val _PCA9685_FIRSTLOREG: Int = 0

const val _PCA9685_LOREGS: Int = 70

const val _PCA9685_FIRSTHIREG: Int = 250

const val _PCA9685_HIREGS: Int = 5

const val _PCA9685_MODE1REG: Int = 0

const val _PCA9685_MODE2REG: Int = 1

const val _PCA9685_BASEPWMREG: Int = 6

const val _PCA9685_ALLLEDREG: Int = 250

const val _PCA9685_PRESCALEREG: Int = 254

const val _PCA9685_ALLCALLBIT: Int = 1

const val _PCA9685_SUB3BIT: Int = 2

const val _PCA9685_SUB2BIT: Int = 4

const val _PCA9685_SUB1BIT: Int = 8

const val _PCA9685_SLEEPBIT: Int = 16

const val _PCA9685_AUTOINCBIT: Int = 32

const val _PCA9685_EXTCLKBIT: Int = 64

const val _PCA9685_RESTARTBIT: Int = 128

const val _PCA9685_OUTNE0BIT: Int = 1

const val _PCA9685_OUTNE1BIT: Int = 2

const val _PCA9685_OUTDRVBIT: Int = 4

const val _PCA9685_OCHBIT: Int = 8

const val _PCA9685_INVRTBIT: Int = 16

const val _PCA9685_RESETVAL: Int = 6

const val _PCA9685_GENCALLADDR: Int = 0

const val _PCA9685_MAXFREQ: Int = 1526

const val _PCA9685_MINFREQ: Int = 24

const val _PCA9685_MINVAL: Int = 0

const val _PCA9685_MAXVAL: Int = 4095
@SymbolName("pca9685_kniBridge0")
private external fun kniBridge0(): Byte
@SymbolName("pca9685_kniBridge1")
private external fun kniBridge1(p0: Byte): Unit
@SymbolName("pca9685_kniBridge2")
private external fun kniBridge2(): Byte
@SymbolName("pca9685_kniBridge3")
private external fun kniBridge3(p0: Byte): Unit
@SymbolName("pca9685_kniBridge4")
private external fun kniBridge4(): UByte
@SymbolName("pca9685_kniBridge5")
private external fun kniBridge5(p0: UByte): Unit
@SymbolName("pca9685_kniBridge6")
private external fun kniBridge6(): UByte
@SymbolName("pca9685_kniBridge7")
private external fun kniBridge7(p0: UByte): Unit
