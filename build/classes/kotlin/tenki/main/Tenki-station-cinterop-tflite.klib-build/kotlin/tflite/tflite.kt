@file:kotlinx.cinterop.InteropStubs
@file:Suppress("UNUSED_VARIABLE", "UNUSED_EXPRESSION")
package tflite

import kotlin.native.SymbolName
import kotlinx.cinterop.internal.*
import kotlinx.cinterop.*
import platform.posix.int16_tVar
import platform.posix.int32_t
import platform.posix.int32_tVar
import platform.posix.int64_t
import platform.posix.int64_tVar
import platform.posix.int8_tVar
import platform.posix.size_t
import platform.posix.size_tVar
import platform.posix.uint16_t
import platform.posix.uint16_tVar
import platform.posix.uint8_tVar

// NOTE THIS FILE IS AUTO-GENERATED

@CStruct("struct { unsigned int p0; void* p1; void* p2; void* p3; void* p4; void* p5; void* p6; void* p7; void* p8; int p9; void* p10; void* p11; char p12; void* p13; }")
class TfLiteContext(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(56, 4)
    
    var tensors_size: size_t
        get() = memberAt<size_tVar>(0).value
        set(value) { memberAt<size_tVar>(0).value = value }
    
    var GetExecutionPlan: CPointer<CFunction<(CPointer<TfLiteContext>?, CPointer<CPointerVar<TfLiteIntArray>>?) -> TfLiteStatus>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<TfLiteContext>?, CPointer<CPointerVar<TfLiteIntArray>>?) -> TfLiteStatus>>>(4).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<TfLiteContext>?, CPointer<CPointerVar<TfLiteIntArray>>?) -> TfLiteStatus>>>(4).value = value }
    
    var tensors: CPointer<TfLiteTensor>?
        get() = memberAt<CPointerVar<TfLiteTensor>>(8).value
        set(value) { memberAt<CPointerVar<TfLiteTensor>>(8).value = value }
    
    var impl_: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(12).value
        set(value) { memberAt<COpaquePointerVar>(12).value = value }
    
    var ResizeTensor: CPointer<CFunction<(CPointer<TfLiteContext>?, CPointer<TfLiteTensor>?, CPointer<TfLiteIntArray>?) -> TfLiteStatus>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<TfLiteContext>?, CPointer<TfLiteTensor>?, CPointer<TfLiteIntArray>?) -> TfLiteStatus>>>(16).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<TfLiteContext>?, CPointer<TfLiteTensor>?, CPointer<TfLiteIntArray>?) -> TfLiteStatus>>>(16).value = value }
    
    var ReportError: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(20).value
        set(value) { memberAt<COpaquePointerVar>(20).value = value }
    
    var AddTensors: CPointer<CFunction<(CPointer<TfLiteContext>?, Int, CPointer<IntVar>?) -> TfLiteStatus>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<TfLiteContext>?, Int, CPointer<IntVar>?) -> TfLiteStatus>>>(24).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<TfLiteContext>?, Int, CPointer<IntVar>?) -> TfLiteStatus>>>(24).value = value }
    
    var GetNodeAndRegistration: CPointer<CFunction<(CPointer<TfLiteContext>?, Int, CPointer<CPointerVar<TfLiteNode>>?, CPointer<CPointerVar<TfLiteRegistration>>?) -> TfLiteStatus>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<TfLiteContext>?, Int, CPointer<CPointerVar<TfLiteNode>>?, CPointer<CPointerVar<TfLiteRegistration>>?) -> TfLiteStatus>>>(28).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<TfLiteContext>?, Int, CPointer<CPointerVar<TfLiteNode>>?, CPointer<CPointerVar<TfLiteRegistration>>?) -> TfLiteStatus>>>(28).value = value }
    
    var ReplaceNodeSubsetsWithDelegateKernels: CPointer<CFunction<(CPointer<TfLiteContext>?, CValue<TfLiteRegistration>, CPointer<TfLiteIntArray>?, CPointer<TfLiteDelegate>?) -> TfLiteStatus>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<TfLiteContext>?, CValue<TfLiteRegistration>, CPointer<TfLiteIntArray>?, CPointer<TfLiteDelegate>?) -> TfLiteStatus>>>(32).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<TfLiteContext>?, CValue<TfLiteRegistration>, CPointer<TfLiteIntArray>?, CPointer<TfLiteDelegate>?) -> TfLiteStatus>>>(32).value = value }
    
    var recommended_num_threads: Int
        get() = memberAt<IntVar>(36).value
        set(value) { memberAt<IntVar>(36).value = value }
    
    var GetExternalContext: CPointer<CFunction<(CPointer<TfLiteContext>?, TfLiteExternalContextType) -> CPointer<TfLiteExternalContext>?>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<TfLiteContext>?, TfLiteExternalContextType) -> CPointer<TfLiteExternalContext>?>>>(40).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<TfLiteContext>?, TfLiteExternalContextType) -> CPointer<TfLiteExternalContext>?>>>(40).value = value }
    
    var SetExternalContext: CPointer<CFunction<(CPointer<TfLiteContext>?, TfLiteExternalContextType, CPointer<TfLiteExternalContext>?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<TfLiteContext>?, TfLiteExternalContextType, CPointer<TfLiteExternalContext>?) -> Unit>>>(44).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<TfLiteContext>?, TfLiteExternalContextType, CPointer<TfLiteExternalContext>?) -> Unit>>>(44).value = value }
    
    var allow_fp32_relax_to_fp16: Boolean
        get() = memberAt<BooleanVar>(48).value
        set(value) { memberAt<BooleanVar>(48).value = value }
    
    var profiler: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(52).value
        set(value) { memberAt<COpaquePointerVar>(52).value = value }
}

class TfLiteIntArray(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(4, 4)
}

@CStruct("struct { unsigned int p0; union { void* p0; void* p1; void* p2; void* p3; void* p4; void* p5; void* p6; void* p7; void* p8; void* p9; void* p10; } p1; void* p2; struct { float p0; int p1; } p3; unsigned int p4; unsigned int p5; void* p6; void* p7; void* p8; int p9; char p10; char p11; struct { unsigned int p0; void* p1; } p12; }")
class TfLiteTensor(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(56, 4)
    
    var type: TfLiteType
        get() = memberAt<TfLiteTypeVar>(0).value
        set(value) { memberAt<TfLiteTypeVar>(0).value = value }
    
    val data: TfLitePtrUnion
        get() = memberAt(4)
    
    var dims: CPointer<TfLiteIntArray>?
        get() = memberAt<CPointerVar<TfLiteIntArray>>(8).value
        set(value) { memberAt<CPointerVar<TfLiteIntArray>>(8).value = value }
    
    val params: TfLiteQuantizationParams
        get() = memberAt(12)
    
    var allocation_type: TfLiteAllocationType
        get() = memberAt<TfLiteAllocationTypeVar>(20).value
        set(value) { memberAt<TfLiteAllocationTypeVar>(20).value = value }
    
    var bytes: size_t
        get() = memberAt<size_tVar>(24).value
        set(value) { memberAt<size_tVar>(24).value = value }
    
    var allocation: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(28).value
        set(value) { memberAt<COpaquePointerVar>(28).value = value }
    
    var name: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(32).value
        set(value) { memberAt<CPointerVar<ByteVar>>(32).value = value }
    
    var delegate: CPointer<TfLiteDelegate>?
        get() = memberAt<CPointerVar<TfLiteDelegate>>(36).value
        set(value) { memberAt<CPointerVar<TfLiteDelegate>>(36).value = value }
    
    var buffer_handle: TfLiteBufferHandle
        get() = memberAt<TfLiteBufferHandleVar>(40).value
        set(value) { memberAt<TfLiteBufferHandleVar>(40).value = value }
    
    var data_is_stale: Boolean
        get() = memberAt<BooleanVar>(44).value
        set(value) { memberAt<BooleanVar>(44).value = value }
    
    var is_variable: Boolean
        get() = memberAt<BooleanVar>(45).value
        set(value) { memberAt<BooleanVar>(45).value = value }
    
    val quantization: TfLiteQuantization
        get() = memberAt(48)
}

@CStruct("union { void* p0; void* p1; void* p2; void* p3; void* p4; void* p5; void* p6; void* p7; void* p8; void* p9; void* p10; }")
class TfLitePtrUnion(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(4, 4)
    
    var i32: CPointer<int32_tVar>?
        get() = memberAt<CPointerVar<int32_tVar>>(0).value
        set(value) { memberAt<CPointerVar<int32_tVar>>(0).value = value }
    
    var i64: CPointer<int64_tVar>?
        get() = memberAt<CPointerVar<int64_tVar>>(0).value
        set(value) { memberAt<CPointerVar<int64_tVar>>(0).value = value }
    
    var f: CPointer<FloatVar>?
        get() = memberAt<CPointerVar<FloatVar>>(0).value
        set(value) { memberAt<CPointerVar<FloatVar>>(0).value = value }
    
    var f16: CPointer<TfLiteFloat16>?
        get() = memberAt<CPointerVar<TfLiteFloat16>>(0).value
        set(value) { memberAt<CPointerVar<TfLiteFloat16>>(0).value = value }
    
    var raw: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(0).value
        set(value) { memberAt<CPointerVar<ByteVar>>(0).value = value }
    
    var raw_const: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(0).value
        set(value) { memberAt<CPointerVar<ByteVar>>(0).value = value }
    
    var uint8: CPointer<uint8_tVar>?
        get() = memberAt<CPointerVar<uint8_tVar>>(0).value
        set(value) { memberAt<CPointerVar<uint8_tVar>>(0).value = value }
    
    var b: CPointer<BooleanVar>?
        get() = memberAt<CPointerVar<BooleanVar>>(0).value
        set(value) { memberAt<CPointerVar<BooleanVar>>(0).value = value }
    
    var i16: CPointer<int16_tVar>?
        get() = memberAt<CPointerVar<int16_tVar>>(0).value
        set(value) { memberAt<CPointerVar<int16_tVar>>(0).value = value }
    
    var c64: CPointer<TfLiteComplex64>?
        get() = memberAt<CPointerVar<TfLiteComplex64>>(0).value
        set(value) { memberAt<CPointerVar<TfLiteComplex64>>(0).value = value }
    
    var int8: CPointer<int8_tVar>?
        get() = memberAt<CPointerVar<int8_tVar>>(0).value
        set(value) { memberAt<CPointerVar<int8_tVar>>(0).value = value }
}

@CStruct("struct { unsigned short p0; }")
class TfLiteFloat16(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(2, 2)
    
    var data: uint16_t
        get() = memberAt<uint16_tVar>(0).value
        set(value) { memberAt<uint16_tVar>(0).value = value }
}

@CStruct("struct { float p0; float p1; }")
class TfLiteComplex64(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 4)
    
    var re: Float
        get() = memberAt<FloatVar>(0).value
        set(value) { memberAt<FloatVar>(0).value = value }
    
    var im: Float
        get() = memberAt<FloatVar>(4).value
        set(value) { memberAt<FloatVar>(4).value = value }
}

@CStruct("struct { float p0; int p1; }")
class TfLiteQuantizationParams(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 4)
    
    var scale: Float
        get() = memberAt<FloatVar>(0).value
        set(value) { memberAt<FloatVar>(0).value = value }
    
    var zero_point: int32_t
        get() = memberAt<int32_tVar>(4).value
        set(value) { memberAt<int32_tVar>(4).value = value }
}

@CStruct("struct { void* p0; void* p1; void* p2; void* p3; void* p4; long long p5; }")
class _TfLiteDelegate(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(32, 8)
    
    var data_: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(0).value
        set(value) { memberAt<COpaquePointerVar>(0).value = value }
    
    var Prepare: CPointer<CFunction<(CPointer<TfLiteContext>?, CPointer<TfLiteDelegate>?) -> TfLiteStatus>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<TfLiteContext>?, CPointer<TfLiteDelegate>?) -> TfLiteStatus>>>(4).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<TfLiteContext>?, CPointer<TfLiteDelegate>?) -> TfLiteStatus>>>(4).value = value }
    
    var CopyFromBufferHandle: CPointer<CFunction<(CPointer<TfLiteContext>?, CPointer<TfLiteDelegate>?, TfLiteBufferHandle, CPointer<TfLiteTensor>?) -> TfLiteStatus>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<TfLiteContext>?, CPointer<TfLiteDelegate>?, TfLiteBufferHandle, CPointer<TfLiteTensor>?) -> TfLiteStatus>>>(8).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<TfLiteContext>?, CPointer<TfLiteDelegate>?, TfLiteBufferHandle, CPointer<TfLiteTensor>?) -> TfLiteStatus>>>(8).value = value }
    
    var CopyToBufferHandle: CPointer<CFunction<(CPointer<TfLiteContext>?, CPointer<TfLiteDelegate>?, TfLiteBufferHandle, CPointer<TfLiteTensor>?) -> TfLiteStatus>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<TfLiteContext>?, CPointer<TfLiteDelegate>?, TfLiteBufferHandle, CPointer<TfLiteTensor>?) -> TfLiteStatus>>>(12).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<TfLiteContext>?, CPointer<TfLiteDelegate>?, TfLiteBufferHandle, CPointer<TfLiteTensor>?) -> TfLiteStatus>>>(12).value = value }
    
    var FreeBufferHandle: CPointer<CFunction<(CPointer<TfLiteContext>?, CPointer<TfLiteDelegate>?, CPointer<TfLiteBufferHandleVar>?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<TfLiteContext>?, CPointer<TfLiteDelegate>?, CPointer<TfLiteBufferHandleVar>?) -> Unit>>>(16).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<TfLiteContext>?, CPointer<TfLiteDelegate>?, CPointer<TfLiteBufferHandleVar>?) -> Unit>>>(16).value = value }
    
    var flags: int64_t
        get() = memberAt<int64_tVar>(24).value
        set(value) { memberAt<int64_tVar>(24).value = value }
}

@CStruct("struct { unsigned int p0; void* p1; }")
class TfLiteQuantization(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 4)
    
    var type: TfLiteQuantizationType
        get() = memberAt<TfLiteQuantizationTypeVar>(0).value
        set(value) { memberAt<TfLiteQuantizationTypeVar>(0).value = value }
    
    var params: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(4).value
        set(value) { memberAt<COpaquePointerVar>(4).value = value }
}

@CStruct("struct { void* p0; void* p1; void* p2; void* p3; void* p4; void* p5; int p6; void* p7; }")
class TfLiteNode(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(32, 4)
    
    var inputs: CPointer<TfLiteIntArray>?
        get() = memberAt<CPointerVar<TfLiteIntArray>>(0).value
        set(value) { memberAt<CPointerVar<TfLiteIntArray>>(0).value = value }
    
    var outputs: CPointer<TfLiteIntArray>?
        get() = memberAt<CPointerVar<TfLiteIntArray>>(4).value
        set(value) { memberAt<CPointerVar<TfLiteIntArray>>(4).value = value }
    
    var temporaries: CPointer<TfLiteIntArray>?
        get() = memberAt<CPointerVar<TfLiteIntArray>>(8).value
        set(value) { memberAt<CPointerVar<TfLiteIntArray>>(8).value = value }
    
    var user_data: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(12).value
        set(value) { memberAt<COpaquePointerVar>(12).value = value }
    
    var builtin_data: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(16).value
        set(value) { memberAt<COpaquePointerVar>(16).value = value }
    
    var custom_initial_data: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(20).value
        set(value) { memberAt<COpaquePointerVar>(20).value = value }
    
    var custom_initial_data_size: Int
        get() = memberAt<IntVar>(24).value
        set(value) { memberAt<IntVar>(24).value = value }
    
    var delegate: CPointer<TfLiteDelegate>?
        get() = memberAt<CPointerVar<TfLiteDelegate>>(28).value
        set(value) { memberAt<CPointerVar<TfLiteDelegate>>(28).value = value }
}

@CStruct("struct { void* p0; void* p1; void* p2; void* p3; void* p4; int p5; void* p6; int p7; }")
class _TfLiteRegistration(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(32, 4)
    
    var init: CPointer<CFunction<(CPointer<TfLiteContext>?, CPointer<ByteVar>?, size_t) -> COpaquePointer?>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<TfLiteContext>?, CPointer<ByteVar>?, size_t) -> COpaquePointer?>>>(0).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<TfLiteContext>?, CPointer<ByteVar>?, size_t) -> COpaquePointer?>>>(0).value = value }
    
    var free: CPointer<CFunction<(CPointer<TfLiteContext>?, COpaquePointer?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<TfLiteContext>?, COpaquePointer?) -> Unit>>>(4).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<TfLiteContext>?, COpaquePointer?) -> Unit>>>(4).value = value }
    
    var prepare: CPointer<CFunction<(CPointer<TfLiteContext>?, CPointer<TfLiteNode>?) -> TfLiteStatus>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<TfLiteContext>?, CPointer<TfLiteNode>?) -> TfLiteStatus>>>(8).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<TfLiteContext>?, CPointer<TfLiteNode>?) -> TfLiteStatus>>>(8).value = value }
    
    var invoke: CPointer<CFunction<(CPointer<TfLiteContext>?, CPointer<TfLiteNode>?) -> TfLiteStatus>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<TfLiteContext>?, CPointer<TfLiteNode>?) -> TfLiteStatus>>>(12).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<TfLiteContext>?, CPointer<TfLiteNode>?) -> TfLiteStatus>>>(12).value = value }
    
    var profiling_string: CPointer<CFunction<(CPointer<TfLiteContext>?, CPointer<TfLiteNode>?) -> CPointer<ByteVar>?>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<TfLiteContext>?, CPointer<TfLiteNode>?) -> CPointer<ByteVar>?>>>(16).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<TfLiteContext>?, CPointer<TfLiteNode>?) -> CPointer<ByteVar>?>>>(16).value = value }
    
    var builtin_code: int32_t
        get() = memberAt<int32_tVar>(20).value
        set(value) { memberAt<int32_tVar>(20).value = value }
    
    var custom_name: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(24).value
        set(value) { memberAt<CPointerVar<ByteVar>>(24).value = value }
    
    var version: Int
        get() = memberAt<IntVar>(28).value
        set(value) { memberAt<IntVar>(28).value = value }
}

@CStruct("struct { unsigned int p0; void* p1; }")
class TfLiteExternalContext(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 4)
    
    var type: TfLiteExternalContextType
        get() = memberAt<TfLiteExternalContextTypeVar>(0).value
        set(value) { memberAt<TfLiteExternalContextTypeVar>(0).value = value }
    
    var Refresh: CPointer<CFunction<(CPointer<TfLiteContext>?) -> TfLiteStatus>>?
        get() = memberAt<CPointerVar<CFunction<(CPointer<TfLiteContext>?) -> TfLiteStatus>>>(4).value
        set(value) { memberAt<CPointerVar<CFunction<(CPointer<TfLiteContext>?) -> TfLiteStatus>>>(4).value = value }
}

class TfLiteFloatArray(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(4, 4)
}

@CStruct("struct { void* p0; void* p1; int p2; }")
class TfLiteAffineQuantization(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(12, 4)
    
    var scale: CPointer<TfLiteFloatArray>?
        get() = memberAt<CPointerVar<TfLiteFloatArray>>(0).value
        set(value) { memberAt<CPointerVar<TfLiteFloatArray>>(0).value = value }
    
    var zero_point: CPointer<TfLiteIntArray>?
        get() = memberAt<CPointerVar<TfLiteIntArray>>(4).value
        set(value) { memberAt<CPointerVar<TfLiteIntArray>>(4).value = value }
    
    var quantized_dimension: int32_t
        get() = memberAt<int32_tVar>(8).value
        set(value) { memberAt<int32_tVar>(8).value = value }
}

@CStruct("struct { void* p0; void* p1; void* p2; void* p3; }")
class TfLiteDelegateParams(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 4)
    
    var delegate: CPointer<TfLiteDelegate>?
        get() = memberAt<CPointerVar<TfLiteDelegate>>(0).value
        set(value) { memberAt<CPointerVar<TfLiteDelegate>>(0).value = value }
    
    var nodes_to_replace: CPointer<TfLiteIntArray>?
        get() = memberAt<CPointerVar<TfLiteIntArray>>(4).value
        set(value) { memberAt<CPointerVar<TfLiteIntArray>>(4).value = value }
    
    var input_tensors: CPointer<TfLiteIntArray>?
        get() = memberAt<CPointerVar<TfLiteIntArray>>(8).value
        set(value) { memberAt<CPointerVar<TfLiteIntArray>>(8).value = value }
    
    var output_tensors: CPointer<TfLiteIntArray>?
        get() = memberAt<CPointerVar<TfLiteIntArray>>(12).value
        set(value) { memberAt<CPointerVar<TfLiteIntArray>>(12).value = value }
}

@CStruct("struct { char p0; }")
class EmptyStructPlaceholder(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(1, 1)
    
    var dummy: Byte
        get() = memberAt<ByteVar>(0).value
        set(value) { memberAt<ByteVar>(0).value = value }
}

@CStruct("struct { int p0; int p1; int p2; int p3; }")
class TfLitePaddingValues(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 4)
    
    var width: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var height: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
    var width_offset: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
    var height_offset: Int
        get() = memberAt<IntVar>(12).value
        set(value) { memberAt<IntVar>(12).value = value }
}

@CStruct("struct { unsigned int p0; }")
class TfLiteMirrorPaddingParams(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(4, 4)
    
    var mode: TfLiteMirrorPaddingMode
        get() = memberAt<TfLiteMirrorPaddingModeVar>(0).value
        set(value) { memberAt<TfLiteMirrorPaddingModeVar>(0).value = value }
}

@CStruct("struct { unsigned int p0; int p1; int p2; int p3; int p4; unsigned int p5; }")
class TfLiteConvParams(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(24, 4)
    
    var padding: TfLitePadding
        get() = memberAt<TfLitePaddingVar>(0).value
        set(value) { memberAt<TfLitePaddingVar>(0).value = value }
    
    var stride_width: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
    var stride_height: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
    var dilation_width_factor: Int
        get() = memberAt<IntVar>(12).value
        set(value) { memberAt<IntVar>(12).value = value }
    
    var dilation_height_factor: Int
        get() = memberAt<IntVar>(16).value
        set(value) { memberAt<IntVar>(16).value = value }
    
    var activation: TfLiteFusedActivation
        get() = memberAt<TfLiteFusedActivationVar>(20).value
        set(value) { memberAt<TfLiteFusedActivationVar>(20).value = value }
}

@CStruct("struct { unsigned int p0; int p1; int p2; int p3; int p4; unsigned int p5; struct { struct { int p0; int p1; int p2; int p3; } p0; } p6; }")
class TfLitePoolParams(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(40, 4)
    
    var padding: TfLitePadding
        get() = memberAt<TfLitePaddingVar>(0).value
        set(value) { memberAt<TfLitePaddingVar>(0).value = value }
    
    var stride_width: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
    var stride_height: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
    var filter_width: Int
        get() = memberAt<IntVar>(12).value
        set(value) { memberAt<IntVar>(12).value = value }
    
    var filter_height: Int
        get() = memberAt<IntVar>(16).value
        set(value) { memberAt<IntVar>(16).value = value }
    
    var activation: TfLiteFusedActivation
        get() = memberAt<TfLiteFusedActivationVar>(20).value
        set(value) { memberAt<TfLiteFusedActivationVar>(20).value = value }
    
    val computed: anonymousStruct1
        get() = memberAt(24)
}

@CStruct("struct { struct { int p0; int p1; int p2; int p3; } p0; }")
class anonymousStruct1(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 4)
    
    val padding: TfLitePaddingValues
        get() = memberAt(0)
}

@CStruct("struct { unsigned int p0; int p1; int p2; int p3; unsigned int p4; int p5; int p6; }")
class TfLiteDepthwiseConvParams(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(28, 4)
    
    var padding: TfLitePadding
        get() = memberAt<TfLitePaddingVar>(0).value
        set(value) { memberAt<TfLitePaddingVar>(0).value = value }
    
    var stride_width: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
    var stride_height: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
    var depth_multiplier: Int
        get() = memberAt<IntVar>(12).value
        set(value) { memberAt<IntVar>(12).value = value }
    
    var activation: TfLiteFusedActivation
        get() = memberAt<TfLiteFusedActivationVar>(16).value
        set(value) { memberAt<TfLiteFusedActivationVar>(16).value = value }
    
    var dilation_width_factor: Int
        get() = memberAt<IntVar>(20).value
        set(value) { memberAt<IntVar>(20).value = value }
    
    var dilation_height_factor: Int
        get() = memberAt<IntVar>(24).value
        set(value) { memberAt<IntVar>(24).value = value }
}

@CStruct("struct { int p0; unsigned int p1; }")
class TfLiteSVDFParams(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 4)
    
    var rank: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var activation: TfLiteFusedActivation
        get() = memberAt<TfLiteFusedActivationVar>(4).value
        set(value) { memberAt<TfLiteFusedActivationVar>(4).value = value }
}

@CStruct("struct { unsigned int p0; }")
class TfLiteRNNParams(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(4, 4)
    
    var activation: TfLiteFusedActivation
        get() = memberAt<TfLiteFusedActivationVar>(0).value
        set(value) { memberAt<TfLiteFusedActivationVar>(0).value = value }
}

@CStruct("struct { char p0; unsigned int p1; }")
class TfLiteSequenceRNNParams(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 4)
    
    var time_major: Boolean
        get() = memberAt<BooleanVar>(0).value
        set(value) { memberAt<BooleanVar>(0).value = value }
    
    var activation: TfLiteFusedActivation
        get() = memberAt<TfLiteFusedActivationVar>(4).value
        set(value) { memberAt<TfLiteFusedActivationVar>(4).value = value }
}

@CStruct("struct { char p0; unsigned int p1; char p2; }")
class TfLiteBidirectionalSequenceRNNParams(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(12, 4)
    
    var time_major: Boolean
        get() = memberAt<BooleanVar>(0).value
        set(value) { memberAt<BooleanVar>(0).value = value }
    
    var activation: TfLiteFusedActivation
        get() = memberAt<TfLiteFusedActivationVar>(4).value
        set(value) { memberAt<TfLiteFusedActivationVar>(4).value = value }
    
    var merge_outputs: Boolean
        get() = memberAt<BooleanVar>(8).value
        set(value) { memberAt<BooleanVar>(8).value = value }
}

@CStruct("struct { unsigned int p0; unsigned int p1; char p2; }")
class TfLiteFullyConnectedParams(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(12, 4)
    
    var activation: TfLiteFusedActivation
        get() = memberAt<TfLiteFusedActivationVar>(0).value
        set(value) { memberAt<TfLiteFusedActivationVar>(0).value = value }
    
    var weights_format: TfLiteFullyConnectedWeightsFormat
        get() = memberAt<TfLiteFullyConnectedWeightsFormatVar>(4).value
        set(value) { memberAt<TfLiteFullyConnectedWeightsFormatVar>(4).value = value }
    
    var keep_num_dims: Boolean
        get() = memberAt<BooleanVar>(8).value
        set(value) { memberAt<BooleanVar>(8).value = value }
}

@CStruct("struct { unsigned int p0; }")
class TfLiteLSHProjectionParams(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(4, 4)
    
    var type: TfLiteLSHProjectionType
        get() = memberAt<TfLiteLSHProjectionTypeVar>(0).value
        set(value) { memberAt<TfLiteLSHProjectionTypeVar>(0).value = value }
}

@CStruct("struct { float p0; }")
class TfLiteSoftmaxParams(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(4, 4)
    
    var beta: Float
        get() = memberAt<FloatVar>(0).value
        set(value) { memberAt<FloatVar>(0).value = value }
}

@CStruct("struct { int p0; unsigned int p1; }")
class TfLiteConcatenationParams(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 4)
    
    var axis: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var activation: TfLiteFusedActivation
        get() = memberAt<TfLiteFusedActivationVar>(4).value
        set(value) { memberAt<TfLiteFusedActivationVar>(4).value = value }
}

@CStruct("struct { unsigned int p0; }")
class TfLiteAddParams(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(4, 4)
    
    var activation: TfLiteFusedActivation
        get() = memberAt<TfLiteFusedActivationVar>(0).value
        set(value) { memberAt<TfLiteFusedActivationVar>(0).value = value }
}

@CStruct("struct { struct { char p0; } p0; }")
class TfLiteSpaceToBatchNDParams(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(1, 1)
    
    val placeholder: EmptyStructPlaceholder
        get() = memberAt(0)
}

@CStruct("struct { struct { char p0; } p0; }")
class TfLiteBatchToSpaceNDParams(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(1, 1)
    
    val placeholder: EmptyStructPlaceholder
        get() = memberAt(0)
}

@CStruct("struct { unsigned int p0; }")
class TfLiteMulParams(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(4, 4)
    
    var activation: TfLiteFusedActivation
        get() = memberAt<TfLiteFusedActivationVar>(0).value
        set(value) { memberAt<TfLiteFusedActivationVar>(0).value = value }
}

@CStruct("struct { unsigned int p0; }")
class TfLiteSubParams(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(4, 4)
    
    var activation: TfLiteFusedActivation
        get() = memberAt<TfLiteFusedActivationVar>(0).value
        set(value) { memberAt<TfLiteFusedActivationVar>(0).value = value }
}

@CStruct("struct { unsigned int p0; }")
class TfLiteDivParams(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(4, 4)
    
    var activation: TfLiteFusedActivation
        get() = memberAt<TfLiteFusedActivationVar>(0).value
        set(value) { memberAt<TfLiteFusedActivationVar>(0).value = value }
}

@CStruct("struct { unsigned int p0; }")
class TfLiteL2NormParams(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(4, 4)
    
    var activation: TfLiteFusedActivation
        get() = memberAt<TfLiteFusedActivationVar>(0).value
        set(value) { memberAt<TfLiteFusedActivationVar>(0).value = value }
}

@CStruct("struct { int p0; float p1; float p2; float p3; }")
class TfLiteLocalResponseNormParams(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 4)
    
    var radius: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var bias: Float
        get() = memberAt<FloatVar>(4).value
        set(value) { memberAt<FloatVar>(4).value = value }
    
    var alpha: Float
        get() = memberAt<FloatVar>(8).value
        set(value) { memberAt<FloatVar>(8).value = value }
    
    var beta: Float
        get() = memberAt<FloatVar>(12).value
        set(value) { memberAt<FloatVar>(12).value = value }
}

@CStruct("struct { unsigned int p0; float p1; float p2; unsigned int p3; }")
class TfLiteLSTMParams(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 4)
    
    var activation: TfLiteFusedActivation
        get() = memberAt<TfLiteFusedActivationVar>(0).value
        set(value) { memberAt<TfLiteFusedActivationVar>(0).value = value }
    
    var cell_clip: Float
        get() = memberAt<FloatVar>(4).value
        set(value) { memberAt<FloatVar>(4).value = value }
    
    var proj_clip: Float
        get() = memberAt<FloatVar>(8).value
        set(value) { memberAt<FloatVar>(8).value = value }
    
    var kernel_type: TfLiteLSTMKernelType
        get() = memberAt<TfLiteLSTMKernelTypeVar>(12).value
        set(value) { memberAt<TfLiteLSTMKernelTypeVar>(12).value = value }
}

@CStruct("struct { unsigned int p0; float p1; float p2; char p3; }")
class TfLiteUnidirectionalSequenceLSTMParams(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 4)
    
    var activation: TfLiteFusedActivation
        get() = memberAt<TfLiteFusedActivationVar>(0).value
        set(value) { memberAt<TfLiteFusedActivationVar>(0).value = value }
    
    var cell_clip: Float
        get() = memberAt<FloatVar>(4).value
        set(value) { memberAt<FloatVar>(4).value = value }
    
    var proj_clip: Float
        get() = memberAt<FloatVar>(8).value
        set(value) { memberAt<FloatVar>(8).value = value }
    
    var time_major: Boolean
        get() = memberAt<BooleanVar>(12).value
        set(value) { memberAt<BooleanVar>(12).value = value }
}

@CStruct("struct { unsigned int p0; float p1; float p2; char p3; char p4; }")
class TfLiteBidirectionalSequenceLSTMParams(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 4)
    
    var activation: TfLiteFusedActivation
        get() = memberAt<TfLiteFusedActivationVar>(0).value
        set(value) { memberAt<TfLiteFusedActivationVar>(0).value = value }
    
    var cell_clip: Float
        get() = memberAt<FloatVar>(4).value
        set(value) { memberAt<FloatVar>(4).value = value }
    
    var proj_clip: Float
        get() = memberAt<FloatVar>(8).value
        set(value) { memberAt<FloatVar>(8).value = value }
    
    var merge_outputs: Boolean
        get() = memberAt<BooleanVar>(12).value
        set(value) { memberAt<BooleanVar>(12).value = value }
    
    var time_major: Boolean
        get() = memberAt<BooleanVar>(13).value
        set(value) { memberAt<BooleanVar>(13).value = value }
}

@CStruct("struct { char p0; }")
class TfLiteResizeBilinearParams(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(1, 1)
    
    var align_corners: Boolean
        get() = memberAt<BooleanVar>(0).value
        set(value) { memberAt<BooleanVar>(0).value = value }
}

@CStruct("struct { char p0; }")
class TfLiteResizeNearestNeighborParams(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(1, 1)
    
    var align_corners: Boolean
        get() = memberAt<BooleanVar>(0).value
        set(value) { memberAt<BooleanVar>(0).value = value }
}

@CStruct("struct { struct { char p0; } p0; }")
class TfLitePadParams(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(1, 1)
    
    val placeholder: EmptyStructPlaceholder
        get() = memberAt(0)
}

@CStruct("struct { struct { char p0; } p0; }")
class TfLitePadV2Params(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(1, 1)
    
    val placeholder: EmptyStructPlaceholder
        get() = memberAt(0)
}

@CStruct("struct { int p0[8]; int p1; }")
class TfLiteReshapeParams(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(36, 4)
    
    val shape: CArrayPointer<IntVar>
        get() = arrayMemberAt(0)
    
    var num_dimensions: Int
        get() = memberAt<IntVar>(32).value
        set(value) { memberAt<IntVar>(32).value = value }
}

@CStruct("struct { int p0; int p1; char p2; }")
class TfLiteSkipGramParams(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(12, 4)
    
    var ngram_size: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var max_skip_size: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
    var include_all_ngrams: Boolean
        get() = memberAt<BooleanVar>(8).value
        set(value) { memberAt<BooleanVar>(8).value = value }
}

@CStruct("struct { int p0; }")
class TfLiteSpaceToDepthParams(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(4, 4)
    
    var block_size: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
}

@CStruct("struct { unsigned int p0; unsigned int p1; }")
class TfLiteCastParams(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 4)
    
    var in_data_type: TfLiteType
        get() = memberAt<TfLiteTypeVar>(0).value
        set(value) { memberAt<TfLiteTypeVar>(0).value = value }
    
    var out_data_type: TfLiteType
        get() = memberAt<TfLiteTypeVar>(4).value
        set(value) { memberAt<TfLiteTypeVar>(4).value = value }
}

@CStruct("struct { unsigned int p0; }")
class TfLiteEmbeddingLookupSparseParams(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(4, 4)
    
    var combiner: TfLiteCombinerType
        get() = memberAt<TfLiteCombinerTypeVar>(0).value
        set(value) { memberAt<TfLiteCombinerTypeVar>(0).value = value }
}

@CStruct("struct { int p0; }")
class TfLiteGatherParams(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(4, 4)
    
    var axis: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
}

@CStruct("struct { struct { char p0; } p0; }")
class TfLiteTransposeParams(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(1, 1)
    
    val placeholder: EmptyStructPlaceholder
        get() = memberAt(0)
}

@CStruct("struct { char p0; }")
class TfLiteReducerParams(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(1, 1)
    
    var keep_dims: Boolean
        get() = memberAt<BooleanVar>(0).value
        set(value) { memberAt<BooleanVar>(0).value = value }
}

@CStruct("struct { int p0; }")
class TfLiteSplitParams(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(4, 4)
    
    var num_splits: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
}

@CStruct("struct { int p0; }")
class TfLiteSplitVParams(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(4, 4)
    
    var num_splits: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
}

@CStruct("struct { int p0[8]; int p1; }")
class TfLiteSqueezeParams(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(36, 4)
    
    val squeeze_dims: CArrayPointer<IntVar>
        get() = arrayMemberAt(0)
    
    var num_squeeze_dims: Int
        get() = memberAt<IntVar>(32).value
        set(value) { memberAt<IntVar>(32).value = value }
}

@CStruct("struct { int p0; int p1; int p2; int p3; int p4; }")
class TfLiteStridedSliceParams(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(20, 4)
    
    var begin_mask: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var end_mask: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
    var ellipsis_mask: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
    var new_axis_mask: Int
        get() = memberAt<IntVar>(12).value
        set(value) { memberAt<IntVar>(12).value = value }
    
    var shrink_axis_mask: Int
        get() = memberAt<IntVar>(16).value
        set(value) { memberAt<IntVar>(16).value = value }
}

@CStruct("struct { unsigned int p0; }")
class TfLiteArgMaxParams(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(4, 4)
    
    var output_type: TfLiteType
        get() = memberAt<TfLiteTypeVar>(0).value
        set(value) { memberAt<TfLiteTypeVar>(0).value = value }
}

@CStruct("struct { unsigned int p0; }")
class TfLiteArgMinParams(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(4, 4)
    
    var output_type: TfLiteType
        get() = memberAt<TfLiteTypeVar>(0).value
        set(value) { memberAt<TfLiteTypeVar>(0).value = value }
}

@CStruct("struct { unsigned int p0; int p1; int p2; }")
class TfLiteTransposeConvParams(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(12, 4)
    
    var padding: TfLitePadding
        get() = memberAt<TfLitePaddingVar>(0).value
        set(value) { memberAt<TfLitePaddingVar>(0).value = value }
    
    var stride_width: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
    var stride_height: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
}

@CStruct("struct { char p0; }")
class TfLiteSparseToDenseParams(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(1, 1)
    
    var validate_indices: Boolean
        get() = memberAt<BooleanVar>(0).value
        set(value) { memberAt<BooleanVar>(0).value = value }
}

@CStruct("struct { unsigned int p0; }")
class TfLiteShapeParams(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(4, 4)
    
    var out_type: TfLiteType
        get() = memberAt<TfLiteTypeVar>(0).value
        set(value) { memberAt<TfLiteTypeVar>(0).value = value }
}

@CStruct("struct { struct { char p0; } p0; }")
class TfLiteRankParams(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(1, 1)
    
    val placeholder: EmptyStructPlaceholder
        get() = memberAt(0)
}

@CStruct("struct { float p0; float p1; int p2; char p3; }")
class TfLiteFakeQuantParams(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 4)
    
    var min: Float
        get() = memberAt<FloatVar>(0).value
        set(value) { memberAt<FloatVar>(0).value = value }
    
    var max: Float
        get() = memberAt<FloatVar>(4).value
        set(value) { memberAt<FloatVar>(4).value = value }
    
    var num_bits: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
    var narrow_range: Boolean
        get() = memberAt<BooleanVar>(12).value
        set(value) { memberAt<BooleanVar>(12).value = value }
}

@CStruct("struct { int p0; int p1; }")
class TfLitePackParams(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 4)
    
    var values_count: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var axis: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
}

@CStruct("struct { int p0; }")
class TfLiteOneHotParams(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(4, 4)
    
    var axis: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
}

@CStruct("struct { int p0; int p1; }")
class TfLiteUnpackParams(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 4)
    
    var num: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var axis: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
}

@CStruct("struct { float p0; }")
class TfLiteLeakyReluParams(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(4, 4)
    
    var alpha: Float
        get() = memberAt<FloatVar>(0).value
        set(value) { memberAt<FloatVar>(0).value = value }
}

@CStruct("struct { unsigned int p0; }")
class TfLiteUniqueParams(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(4, 4)
    
    var index_out_type: TfLiteType
        get() = memberAt<TfLiteTypeVar>(0).value
        set(value) { memberAt<TfLiteTypeVar>(0).value = value }
}

@CStruct("struct { int p0; int p1; }")
class TfLiteReverseSequenceParams(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 4)
    
    var seq_dim: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var batch_dim: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
}

@CStruct("struct { struct { char p0; } p0; }")
class TfLiteMatrixDiagParams(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(1, 1)
    
    val placeholder: EmptyStructPlaceholder
        get() = memberAt(0)
}

@CStruct("struct { struct { char p0; } p0; }")
class TfLiteMatrixSetDiagParams(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(1, 1)
    
    val placeholder: EmptyStructPlaceholder
        get() = memberAt(0)
}

fun TfLiteIntArrayGetSizeInBytes(size: Int): Int {
    return kniBridge0(size)
}

fun TfLiteIntArrayCreate(size: Int): CPointer<TfLiteIntArray>? {
    return interpretCPointer<TfLiteIntArray>(kniBridge1(size))
}

fun TfLiteIntArrayEqual(a: CValuesRef<TfLiteIntArray>?, b: CValuesRef<TfLiteIntArray>?): Int {
    memScoped {
        return kniBridge2(a?.getPointer(memScope).rawValue, b?.getPointer(memScope).rawValue)
    }
}

fun TfLiteIntArrayEqualsArray(a: CValuesRef<TfLiteIntArray>?, b_size: Int, b_data: CValuesRef<IntVar>?): Int {
    memScoped {
        return kniBridge3(a?.getPointer(memScope).rawValue, b_size, b_data?.getPointer(memScope).rawValue)
    }
}

fun TfLiteIntArrayCopy(src: CValuesRef<TfLiteIntArray>?): CPointer<TfLiteIntArray>? {
    memScoped {
        return interpretCPointer<TfLiteIntArray>(kniBridge4(src?.getPointer(memScope).rawValue))
    }
}

fun TfLiteIntArrayFree(a: CValuesRef<TfLiteIntArray>?): Unit {
    memScoped {
        return kniBridge5(a?.getPointer(memScope).rawValue)
    }
}

fun TfLiteFloatArrayGetSizeInBytes(size: Int): Int {
    return kniBridge6(size)
}

fun TfLiteFloatArrayCreate(size: Int): CPointer<TfLiteFloatArray>? {
    return interpretCPointer<TfLiteFloatArray>(kniBridge7(size))
}

fun TfLiteFloatArrayFree(a: CValuesRef<TfLiteFloatArray>?): Unit {
    memScoped {
        return kniBridge8(a?.getPointer(memScope).rawValue)
    }
}

fun TfLiteTypeGetName(type: TfLiteType): CPointer<ByteVar>? {
    return interpretCPointer<ByteVar>(kniBridge9(type))
}

fun TfLiteTensorDataFree(t: CValuesRef<TfLiteTensor>?): Unit {
    memScoped {
        return kniBridge10(t?.getPointer(memScope).rawValue)
    }
}

fun TfLiteQuantizationFree(quantization: CValuesRef<TfLiteQuantization>?): Unit {
    memScoped {
        return kniBridge11(quantization?.getPointer(memScope).rawValue)
    }
}

fun TfLiteTensorFree(t: CValuesRef<TfLiteTensor>?): Unit {
    memScoped {
        return kniBridge12(t?.getPointer(memScope).rawValue)
    }
}

fun TfLiteTensorReset(type: TfLiteType, @CCall.CString name: String?, dims: CValuesRef<TfLiteIntArray>?, quantization: CValue<TfLiteQuantizationParams>, buffer: CValuesRef<ByteVar>?, size: size_t, allocation_type: TfLiteAllocationType, allocation: CValuesRef<*>?, is_variable: Boolean, tensor: CValuesRef<TfLiteTensor>?): Unit {
    memScoped {
        return kniBridge13(type, name?.cstr?.getPointer(memScope).rawValue, dims?.getPointer(memScope).rawValue, quantization.getPointer(memScope).rawValue, buffer?.getPointer(memScope).rawValue, size, allocation_type, allocation?.getPointer(memScope).rawValue, is_variable.toByte(), tensor?.getPointer(memScope).rawValue)
    }
}

fun TfLiteTensorRealloc(num_bytes: size_t, tensor: CValuesRef<TfLiteTensor>?): Unit {
    memScoped {
        return kniBridge14(num_bytes, tensor?.getPointer(memScope).rawValue)
    }
}

fun TfLiteDelegateCreate(): CValue<TfLiteDelegate> {
    val kniRetVal = nativeHeap.alloc<TfLiteDelegate>()
    try {
        kniBridge15(kniRetVal.rawPtr)
        return kniRetVal.readValue()
    } finally { nativeHeap.free(kniRetVal) }
}

const val `true`: Int = 1

const val `false`: Int = 0

const val __bool_true_false_are_defined: Int = 1

const val kOptionalTensor: Int = -1

typealias TfLiteDelegate = _TfLiteDelegate

typealias TfLiteBufferHandleVar = IntVarOf<TfLiteBufferHandle>

typealias TfLiteBufferHandle = Int

typealias TfLiteRegistration = _TfLiteRegistration


val kTfLiteOk: TfLiteStatus get() = 0u

val kTfLiteError: TfLiteStatus get() = 1u

typealias TfLiteStatusVar = UIntVarOf<TfLiteStatus>

typealias TfLiteStatus = UInt


val kTfLiteEigenContext: TfLiteExternalContextType get() = 0u

val kTfLiteGemmLowpContext: TfLiteExternalContextType get() = 1u

val kTfLiteEdgeTpuContext: TfLiteExternalContextType get() = 2u

val kTfLiteCpuBackendContext: TfLiteExternalContextType get() = 3u

val kTfLiteMaxExternalContexts: TfLiteExternalContextType get() = 4u

typealias TfLiteExternalContextTypeVar = UIntVarOf<TfLiteExternalContextType>

typealias TfLiteExternalContextType = UInt


val kTfLiteNoType: TfLiteType get() = 0u

val kTfLiteFloat32: TfLiteType get() = 1u

val kTfLiteInt32: TfLiteType get() = 2u

val kTfLiteUInt8: TfLiteType get() = 3u

val kTfLiteInt64: TfLiteType get() = 4u

val kTfLiteString: TfLiteType get() = 5u

val kTfLiteBool: TfLiteType get() = 6u

val kTfLiteInt16: TfLiteType get() = 7u

val kTfLiteComplex64: TfLiteType get() = 8u

val kTfLiteInt8: TfLiteType get() = 9u

val kTfLiteFloat16: TfLiteType get() = 10u

typealias TfLiteTypeVar = UIntVarOf<TfLiteType>

typealias TfLiteType = UInt


val kTfLiteMemNone: TfLiteAllocationType get() = 0u

val kTfLiteMmapRo: TfLiteAllocationType get() = 1u

val kTfLiteArenaRw: TfLiteAllocationType get() = 2u

val kTfLiteArenaRwPersistent: TfLiteAllocationType get() = 3u

val kTfLiteDynamic: TfLiteAllocationType get() = 4u

typealias TfLiteAllocationTypeVar = UIntVarOf<TfLiteAllocationType>

typealias TfLiteAllocationType = UInt


val kTfLiteNoQuantization: TfLiteQuantizationType get() = 0u

val kTfLiteAffineQuantization: TfLiteQuantizationType get() = 1u

typealias TfLiteQuantizationTypeVar = UIntVarOf<TfLiteQuantizationType>

typealias TfLiteQuantizationType = UInt

// enum (anonymous at C:\Projects\Tenki\src\include\tflite/c_api_internal.h:293:1):

val kTfLiteNullBufferHandle: Int get() = -1


val kTfLiteDelegateFlagsNone: TfLiteDelegateFlags get() = 0u

val kTfLiteDelegateFlagsAllowDynamicTensors: TfLiteDelegateFlags get() = 1u

typealias TfLiteDelegateFlagsVar = UIntVarOf<TfLiteDelegateFlags>

typealias TfLiteDelegateFlags = UInt


val kTfLitePaddingUnknown: TfLitePadding get() = 0u

val kTfLitePaddingSame: TfLitePadding get() = 1u

val kTfLitePaddingValid: TfLitePadding get() = 2u

typealias TfLitePaddingVar = UIntVarOf<TfLitePadding>

typealias TfLitePadding = UInt


val kTfLiteMirrorPaddingUnknown: TfLiteMirrorPaddingMode get() = 0u

val kTfLiteMirrorPaddingReflect: TfLiteMirrorPaddingMode get() = 1u

val kTfLiteMirrorPaddingSymmetric: TfLiteMirrorPaddingMode get() = 2u

typealias TfLiteMirrorPaddingModeVar = UIntVarOf<TfLiteMirrorPaddingMode>

typealias TfLiteMirrorPaddingMode = UInt


val kTfLiteActNone: TfLiteFusedActivation get() = 0u

val kTfLiteActRelu: TfLiteFusedActivation get() = 1u

val kTfLiteActRelu1: TfLiteFusedActivation get() = 2u

val kTfLiteActRelu6: TfLiteFusedActivation get() = 3u

val kTfLiteActTanh: TfLiteFusedActivation get() = 4u

val kTfLiteActSignBit: TfLiteFusedActivation get() = 5u

val kTfLiteActSigmoid: TfLiteFusedActivation get() = 6u

typealias TfLiteFusedActivationVar = UIntVarOf<TfLiteFusedActivation>

typealias TfLiteFusedActivation = UInt


val kTfLiteFullyConnectedWeightsFormatDefault: TfLiteFullyConnectedWeightsFormat get() = 0u

val kTfLiteFullyConnectedWeightsFormatShuffled4x16Int8: TfLiteFullyConnectedWeightsFormat get() = 1u

typealias TfLiteFullyConnectedWeightsFormatVar = UIntVarOf<TfLiteFullyConnectedWeightsFormat>

typealias TfLiteFullyConnectedWeightsFormat = UInt


val kTfLiteLshProjectionUnknown: TfLiteLSHProjectionType get() = 0u

val kTfLiteLshProjectionSparse: TfLiteLSHProjectionType get() = 1u

val kTfLiteLshProjectionDense: TfLiteLSHProjectionType get() = 2u

typealias TfLiteLSHProjectionTypeVar = UIntVarOf<TfLiteLSHProjectionType>

typealias TfLiteLSHProjectionType = UInt


val kTfLiteLSTMFullKernel: TfLiteLSTMKernelType get() = 0u

val kTfLiteLSTMBasicKernel: TfLiteLSTMKernelType get() = 1u

typealias TfLiteLSTMKernelTypeVar = UIntVarOf<TfLiteLSTMKernelType>

typealias TfLiteLSTMKernelType = UInt


val kTfLiteCombinerTypeSum: TfLiteCombinerType get() = 0u

val kTfLiteCombinerTypeMean: TfLiteCombinerType get() = 1u

val kTfLiteCombinerTypeSqrtn: TfLiteCombinerType get() = 2u

typealias TfLiteCombinerTypeVar = UIntVarOf<TfLiteCombinerType>

typealias TfLiteCombinerType = UInt
@SymbolName("tflite_kniBridge0")
private external fun kniBridge0(p0: Int): Int
@SymbolName("tflite_kniBridge1")
private external fun kniBridge1(p0: Int): NativePtr
@SymbolName("tflite_kniBridge2")
private external fun kniBridge2(p0: NativePtr, p1: NativePtr): Int
@SymbolName("tflite_kniBridge3")
private external fun kniBridge3(p0: NativePtr, p1: Int, p2: NativePtr): Int
@SymbolName("tflite_kniBridge4")
private external fun kniBridge4(p0: NativePtr): NativePtr
@SymbolName("tflite_kniBridge5")
private external fun kniBridge5(p0: NativePtr): Unit
@SymbolName("tflite_kniBridge6")
private external fun kniBridge6(p0: Int): Int
@SymbolName("tflite_kniBridge7")
private external fun kniBridge7(p0: Int): NativePtr
@SymbolName("tflite_kniBridge8")
private external fun kniBridge8(p0: NativePtr): Unit
@SymbolName("tflite_kniBridge9")
private external fun kniBridge9(p0: UInt): NativePtr
@SymbolName("tflite_kniBridge10")
private external fun kniBridge10(p0: NativePtr): Unit
@SymbolName("tflite_kniBridge11")
private external fun kniBridge11(p0: NativePtr): Unit
@SymbolName("tflite_kniBridge12")
private external fun kniBridge12(p0: NativePtr): Unit
@SymbolName("tflite_kniBridge13")
private external fun kniBridge13(p0: UInt, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: UInt, p6: UInt, p7: NativePtr, p8: Byte, p9: NativePtr): Unit
@SymbolName("tflite_kniBridge14")
private external fun kniBridge14(p0: UInt, p1: NativePtr): Unit
@SymbolName("tflite_kniBridge15")
private external fun kniBridge15(p0: NativePtr): Unit
