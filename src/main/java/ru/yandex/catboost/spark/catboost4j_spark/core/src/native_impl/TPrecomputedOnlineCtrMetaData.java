/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ru.yandex.catboost.spark.catboost4j_spark.core.src.native_impl;

public class TPrecomputedOnlineCtrMetaData {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected TPrecomputedOnlineCtrMetaData(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TPrecomputedOnlineCtrMetaData obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(TPrecomputedOnlineCtrMetaData obj) {
    long ptr = 0;
    if (obj != null) {
      if (!obj.swigCMemOwn)
        throw new RuntimeException("Cannot release ownership as memory is not owned");
      ptr = obj.swigCPtr;
      obj.swigCMemOwn = false;
      obj.delete();
    }
    return ptr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        native_implJNI.delete_TPrecomputedOnlineCtrMetaData(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void Append(TPrecomputedOnlineCtrMetaData add) {
    native_implJNI.TPrecomputedOnlineCtrMetaData_Append(swigCPtr, this, TPrecomputedOnlineCtrMetaData.getCPtr(add), add);
  }

  public String SerializeToJson() throws Exception {
    return native_implJNI.TPrecomputedOnlineCtrMetaData_SerializeToJson(swigCPtr, this);
}

  public static TPrecomputedOnlineCtrMetaData DeserializeFromJson(String serializedJson) throws Exception {
    return new TPrecomputedOnlineCtrMetaData(native_implJNI.TPrecomputedOnlineCtrMetaData_DeserializeFromJson(serializedJson), true);
  }

  public TPrecomputedOnlineCtrMetaData() {
    this(native_implJNI.new_TPrecomputedOnlineCtrMetaData(), true);
  }

}
