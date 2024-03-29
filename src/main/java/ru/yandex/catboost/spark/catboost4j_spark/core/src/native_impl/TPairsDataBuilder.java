/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ru.yandex.catboost.spark.catboost4j_spark.core.src.native_impl;

public class TPairsDataBuilder {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected TPairsDataBuilder(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TPairsDataBuilder obj) {
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
        native_implJNI.delete_TPairsDataBuilder(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void Add(long groupIdx, int winnerIdxInGroup, int loserIdxInGroup) {
    native_implJNI.TPairsDataBuilder_Add__SWIG_0(swigCPtr, this, groupIdx, winnerIdxInGroup, loserIdxInGroup);
  }

  public void Add(long groupIdx, int winnerIdxInGroup, int loserIdxInGroup, float weight) {
    native_implJNI.TPairsDataBuilder_Add__SWIG_1(swigCPtr, this, groupIdx, winnerIdxInGroup, loserIdxInGroup, weight);
  }

  public void AddToResult(IQuantizedFeaturesDataVisitor visitor) throws Exception {
    native_implJNI.TPairsDataBuilder_AddToResult(swigCPtr, this, IQuantizedFeaturesDataVisitor.getCPtr(visitor), visitor);
  }

  public void setPairs(SWIGTYPE_p_NCB__TGroupedPairsInfo value) {
    native_implJNI.TPairsDataBuilder_Pairs_set(swigCPtr, this, SWIGTYPE_p_NCB__TGroupedPairsInfo.getCPtr(value));
  }

  public SWIGTYPE_p_NCB__TGroupedPairsInfo getPairs() {
    return new SWIGTYPE_p_NCB__TGroupedPairsInfo(native_implJNI.TPairsDataBuilder_Pairs_get(swigCPtr, this), true);
  }

  public TPairsDataBuilder() {
    this(native_implJNI.new_TPairsDataBuilder(), true);
  }

}
