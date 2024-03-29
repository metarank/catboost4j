/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ru.yandex.catboost.spark.catboost4j_spark.core.src.native_impl;

public class TShapValuesResult {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected TShapValuesResult(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TShapValuesResult obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        native_implJNI.delete_TShapValuesResult(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TShapValuesResult(SWIGTYPE_p_TVectorT_TVectorT_TVectorT_double_t_t_t data) {
    this(native_implJNI.new_TShapValuesResult(SWIGTYPE_p_TVectorT_TVectorT_TVectorT_double_t_t_t.getCPtr(data)), true);
  }

  public int GetObjectCount() throws Exception {
    return native_implJNI.TShapValuesResult_GetObjectCount(swigCPtr, this);
  }

  public int GetShapValuesCount() throws Exception {
    return native_implJNI.TShapValuesResult_GetShapValuesCount(swigCPtr, this);
  }

  public TVector_double Get(int objectIdx) throws Exception {
    return new TVector_double(native_implJNI.TShapValuesResult_Get(swigCPtr, this, objectIdx), true);
  }

}
