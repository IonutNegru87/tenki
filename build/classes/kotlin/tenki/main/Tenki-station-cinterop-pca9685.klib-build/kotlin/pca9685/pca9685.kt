@file:kotlinx.cinterop.InteropStubs
@file:Suppress("UNUSED_VARIABLE", "UNUSED_EXPRESSION")
package pca9685

import kotlin.native.SymbolName
import kotlinx.cinterop.internal.*
import kotlinx.cinterop.*

// NOTE THIS FILE IS AUTO-GENERATED

fun PCA9685_openI2C(adpt: UByte, addr: UByte): Int {
    return kniBridge0(adpt, addr)
}

fun PCA9685_initPWM(fd: Int, addr: UByte, freq: UInt): Int {
    return kniBridge1(fd, addr, freq)
}

fun PCA9685_setPWMVals(fd: Int, addr: UByte, onVals: CValuesRef<UIntVar>?, offVals: CValuesRef<UIntVar>?): Int {
    memScoped {
        return kniBridge2(fd, addr, onVals?.getPointer(memScope).rawValue, offVals?.getPointer(memScope).rawValue)
    }
}

fun PCA9685_setPWMVal(fd: Int, addr: UByte, reg: UByte, on: UInt, off: UInt): Int {
    return kniBridge3(fd, addr, reg, on, off)
}

fun PCA9685_setAllPWM(fd: Int, addr: UByte, on: UInt, off: UInt): Int {
    return kniBridge4(fd, addr, on, off)
}

fun PCA9685_getRegVals(fd: Int, addr: UByte, mode1val: CValuesRef<UByteVar>?, mode2val: CValuesRef<UByteVar>?): Int {
    memScoped {
        return kniBridge5(fd, addr, mode1val?.getPointer(memScope).rawValue, mode2val?.getPointer(memScope).rawValue)
    }
}

fun PCA9685_getPWMVals(fd: Int, addr: UByte, onVals: CValuesRef<UIntVar>?, offVals: CValuesRef<UIntVar>?): Int {
    memScoped {
        return kniBridge6(fd, addr, onVals?.getPointer(memScope).rawValue, offVals?.getPointer(memScope).rawValue)
    }
}

fun PCA9685_getPWMVal(fd: Int, addr: UByte, reg: UByte, on: CValuesRef<UIntVar>?, off: CValuesRef<UIntVar>?): Int {
    memScoped {
        return kniBridge7(fd, addr, reg, on?.getPointer(memScope).rawValue, off?.getPointer(memScope).rawValue)
    }
}

fun PCA9685_dumpAllRegs(fd: Int, addr: UByte): Int {
    return kniBridge8(fd, addr)
}

fun _PCA9685_setPWMFreq(fd: Int, addr: UByte, freq: UInt): Int {
    return kniBridge9(fd, addr, freq)
}

fun _PCA9685_dumpLoRegs(buf: CValuesRef<UByteVar>?): Int {
    memScoped {
        return kniBridge10(buf?.getPointer(memScope).rawValue)
    }
}

fun _PCA9685_dumpHiRegs(buf: CValuesRef<UByteVar>?): Int {
    memScoped {
        return kniBridge11(buf?.getPointer(memScope).rawValue)
    }
}

fun _PCA9685_readI2CReg(fd: Int, addr: UByte, startReg: UByte, len: Int, readBuf: CValuesRef<UByteVar>?): Int {
    memScoped {
        return kniBridge12(fd, addr, startReg, len, readBuf?.getPointer(memScope).rawValue)
    }
}

fun _PCA9685_writeI2CReg(fd: Int, addr: UByte, startReg: UByte, len: Int, writeBuf: CValuesRef<UByteVar>?): Int {
    memScoped {
        return kniBridge13(fd, addr, startReg, len, writeBuf?.getPointer(memScope).rawValue)
    }
}

fun _PCA9685_writeI2CRaw(fd: Int, addr: UByte, len: Int, writeBuf: CValuesRef<UByteVar>?): Int {
    memScoped {
        return kniBridge14(fd, addr, len, writeBuf?.getPointer(memScope).rawValue)
    }
}

fun _PCA9685_ioctl(fd: Int, request: UInt, argp: CValuesRef<ByteVar>?): Int {
    memScoped {
        return kniBridge15(fd, request, argp?.getPointer(memScope).rawValue)
    }
}

fun _PCA9685_open(@CCall.CString pathname: String?, flags: Int): Int {
    memScoped {
        return kniBridge16(pathname?.cstr?.getPointer(memScope).rawValue, flags)
    }
}

var _PCA9685_DEBUG: Boolean
    get() = kniBridge17().toBoolean()
    set(value) { kniBridge18(value.toByte()) }

var _PCA9685_TEST: Boolean
    get() = kniBridge19().toBoolean()
    set(value) { kniBridge20(value.toByte()) }

var _PCA9685_MODE1: UByte
    get() = kniBridge21()
    set(value) { kniBridge22(value) }

var _PCA9685_MODE2: UByte
    get() = kniBridge23()
    set(value) { kniBridge24(value) }

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
private external fun kniBridge0(p0: UByte, p1: UByte): Int
@SymbolName("pca9685_kniBridge1")
private external fun kniBridge1(p0: Int, p1: UByte, p2: UInt): Int
@SymbolName("pca9685_kniBridge2")
private external fun kniBridge2(p0: Int, p1: UByte, p2: NativePtr, p3: NativePtr): Int
@SymbolName("pca9685_kniBridge3")
private external fun kniBridge3(p0: Int, p1: UByte, p2: UByte, p3: UInt, p4: UInt): Int
@SymbolName("pca9685_kniBridge4")
private external fun kniBridge4(p0: Int, p1: UByte, p2: UInt, p3: UInt): Int
@SymbolName("pca9685_kniBridge5")
private external fun kniBridge5(p0: Int, p1: UByte, p2: NativePtr, p3: NativePtr): Int
@SymbolName("pca9685_kniBridge6")
private external fun kniBridge6(p0: Int, p1: UByte, p2: NativePtr, p3: NativePtr): Int
@SymbolName("pca9685_kniBridge7")
private external fun kniBridge7(p0: Int, p1: UByte, p2: UByte, p3: NativePtr, p4: NativePtr): Int
@SymbolName("pca9685_kniBridge8")
private external fun kniBridge8(p0: Int, p1: UByte): Int
@SymbolName("pca9685_kniBridge9")
private external fun kniBridge9(p0: Int, p1: UByte, p2: UInt): Int
@SymbolName("pca9685_kniBridge10")
private external fun kniBridge10(p0: NativePtr): Int
@SymbolName("pca9685_kniBridge11")
private external fun kniBridge11(p0: NativePtr): Int
@SymbolName("pca9685_kniBridge12")
private external fun kniBridge12(p0: Int, p1: UByte, p2: UByte, p3: Int, p4: NativePtr): Int
@SymbolName("pca9685_kniBridge13")
private external fun kniBridge13(p0: Int, p1: UByte, p2: UByte, p3: Int, p4: NativePtr): Int
@SymbolName("pca9685_kniBridge14")
private external fun kniBridge14(p0: Int, p1: UByte, p2: Int, p3: NativePtr): Int
@SymbolName("pca9685_kniBridge15")
private external fun kniBridge15(p0: Int, p1: UInt, p2: NativePtr): Int
@SymbolName("pca9685_kniBridge16")
private external fun kniBridge16(p0: NativePtr, p1: Int): Int
@SymbolName("pca9685_kniBridge17")
private external fun kniBridge17(): Byte
@SymbolName("pca9685_kniBridge18")
private external fun kniBridge18(p0: Byte): Unit
@SymbolName("pca9685_kniBridge19")
private external fun kniBridge19(): Byte
@SymbolName("pca9685_kniBridge20")
private external fun kniBridge20(p0: Byte): Unit
@SymbolName("pca9685_kniBridge21")
private external fun kniBridge21(): UByte
@SymbolName("pca9685_kniBridge22")
private external fun kniBridge22(p0: UByte): Unit
@SymbolName("pca9685_kniBridge23")
private external fun kniBridge23(): UByte
@SymbolName("pca9685_kniBridge24")
private external fun kniBridge24(p0: UByte): Unit
