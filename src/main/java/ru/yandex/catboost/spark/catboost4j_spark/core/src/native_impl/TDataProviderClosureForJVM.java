/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ru.yandex.catboost.spark.catboost4j_spark.core.src.native_impl;

public class TDataProviderClosureForJVM {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected TDataProviderClosureForJVM(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TDataProviderClosureForJVM obj) {
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
        native_implJNI.delete_TDataProviderClosureForJVM(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TDataProviderClosureForJVM(EDatasetVisitorType visitorType, TDataProviderBuilderOptions options, boolean hasFeatures, TLocalExecutor localExecutor) throws Exception {
    this(native_implJNI.new_TDataProviderClosureForJVM(visitorType.swigValue(), TDataProviderBuilderOptions.getCPtr(options), options, hasFeatures, TLocalExecutor.getCPtr(localExecutor), localExecutor), true);
  }

  public IQuantizedFeaturesDataVisitor GetQuantizedVisitor() throws Exception {
    long cPtr = native_implJNI.TDataProviderClosureForJVM_GetQuantizedVisitor(swigCPtr, this);
    return (cPtr == 0) ? null : new IQuantizedFeaturesDataVisitor(cPtr, false);
  }

  public TDataProviderPtr GetResult() throws Exception {
    return new TDataProviderPtr(native_implJNI.TDataProviderClosureForJVM_GetResult(swigCPtr, this), true);
  }

}
