/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ru.yandex.catboost.spark.catboost4j_spark.core.src.native_impl;

public class TRawObjectsDataProviderPtr {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected TRawObjectsDataProviderPtr(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TRawObjectsDataProviderPtr obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(TRawObjectsDataProviderPtr obj) {
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
        native_implJNI.delete_TRawObjectsDataProviderPtr(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public SWIGTYPE_p_NCB__TObjectsDataProviderPtr ToBase() {
    return new SWIGTYPE_p_NCB__TObjectsDataProviderPtr(native_implJNI.TRawObjectsDataProviderPtr_ToBase(swigCPtr, this), true);
  }

  public TRawObjectsDataProviderPtr() {
    this(native_implJNI.new_TRawObjectsDataProviderPtr(), true);
  }

}
