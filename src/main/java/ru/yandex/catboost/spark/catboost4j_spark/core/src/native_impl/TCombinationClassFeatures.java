/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ru.yandex.catboost.spark.catboost4j_spark.core.src.native_impl;

public class TCombinationClassFeatures {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected TCombinationClassFeatures(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TCombinationClassFeatures obj) {
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
        native_implJNI.delete_TCombinationClassFeatures(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public long size() {
    return native_implJNI.TCombinationClassFeatures_size(swigCPtr, this);
  }

  public TCombinationClassFeatures() {
    this(native_implJNI.new_TCombinationClassFeatures(), true);
  }

}
