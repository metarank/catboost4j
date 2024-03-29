/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ru.yandex.catboost.spark.catboost4j_spark.core.src.native_impl;

public class TFinalCtrsCalcer {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected TFinalCtrsCalcer(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TFinalCtrsCalcer obj) {
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
        native_implJNI.delete_TFinalCtrsCalcer(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TFinalCtrsCalcer(TFullModel modelWithoutCtrData, TCatBoostOptions catBoostOptions, TQuantizedFeaturesInfo quantizedFeaturesInfo, TVector_float preprocessedLearnTarget, TTargetStatsForCtrs targetStatsForCtrs, SWIGTYPE_p_TCtrHelper ctrHelper, TLocalExecutor localExecutor) throws Exception {
    this(native_implJNI.new_TFinalCtrsCalcer(TFullModel.getCPtr(modelWithoutCtrData), modelWithoutCtrData, TCatBoostOptions.getCPtr(catBoostOptions), catBoostOptions, TQuantizedFeaturesInfo.getCPtr(quantizedFeaturesInfo), quantizedFeaturesInfo, TVector_float.getCPtr(preprocessedLearnTarget), preprocessedLearnTarget, TTargetStatsForCtrs.getCPtr(targetStatsForCtrs), targetStatsForCtrs, SWIGTYPE_p_TCtrHelper.getCPtr(ctrHelper), TLocalExecutor.getCPtr(localExecutor), localExecutor), true);
  }

  public TVector_i32 GetCatFeatureFlatIndicesUsedForCtrs() throws Exception {
    return new TVector_i32(native_implJNI.TFinalCtrsCalcer_GetCatFeatureFlatIndicesUsedForCtrs(swigCPtr, this), true);
  }

  public void ProcessForFeature(int catFeatureFlatIdx, TQuantizedObjectsDataProviderPtr learnData, TVector_TQuantizedObjectsDataProviderPtr testData) throws Exception {
    native_implJNI.TFinalCtrsCalcer_ProcessForFeature(swigCPtr, this, catFeatureFlatIdx, TQuantizedObjectsDataProviderPtr.getCPtr(learnData), learnData, TVector_TQuantizedObjectsDataProviderPtr.getCPtr(testData), testData);
  }

  public TFullModel GetModelWithCtrData() throws Exception {
    return new TFullModel(native_implJNI.TFinalCtrsCalcer_GetModelWithCtrData(swigCPtr, this), true);
  }

}
