/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ru.yandex.catboost.spark.catboost4j_spark.core.src.native_impl;

public class TDataMetaInfo {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected TDataMetaInfo(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TDataMetaInfo obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(TDataMetaInfo obj) {
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
        native_implJNI.delete_TDataMetaInfo(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setObjectCount(java.math.BigInteger value) {
    native_implJNI.TDataMetaInfo_ObjectCount_set(swigCPtr, this, value);
  }

  public java.math.BigInteger getObjectCount() {
    return native_implJNI.TDataMetaInfo_ObjectCount_get(swigCPtr, this);
  }

  public void setFeaturesLayout(TFeaturesLayoutPtr value) {
    native_implJNI.TDataMetaInfo_FeaturesLayout_set(swigCPtr, this, TFeaturesLayoutPtr.getCPtr(value), value);
  }

  public TFeaturesLayoutPtr getFeaturesLayout() {
    long cPtr = native_implJNI.TDataMetaInfo_FeaturesLayout_get(swigCPtr, this);
    return (cPtr == 0) ? null : new TFeaturesLayoutPtr(cPtr, false);
  }

  public void setTargetType(ERawTargetType value) {
    native_implJNI.TDataMetaInfo_TargetType_set(swigCPtr, this, value.swigValue());
  }

  public ERawTargetType getTargetType() {
    return ERawTargetType.swigToEnum(native_implJNI.TDataMetaInfo_TargetType_get(swigCPtr, this));
  }

  public void setTargetCount(long value) {
    native_implJNI.TDataMetaInfo_TargetCount_set(swigCPtr, this, value);
  }

  public long getTargetCount() {
    return native_implJNI.TDataMetaInfo_TargetCount_get(swigCPtr, this);
  }

  public void setBaselineCount(long value) {
    native_implJNI.TDataMetaInfo_BaselineCount_set(swigCPtr, this, value);
  }

  public long getBaselineCount() {
    return native_implJNI.TDataMetaInfo_BaselineCount_get(swigCPtr, this);
  }

  public void setHasGroupId(boolean value) {
    native_implJNI.TDataMetaInfo_HasGroupId_set(swigCPtr, this, value);
  }

  public boolean getHasGroupId() {
    return native_implJNI.TDataMetaInfo_HasGroupId_get(swigCPtr, this);
  }

  public void setHasGroupWeight(boolean value) {
    native_implJNI.TDataMetaInfo_HasGroupWeight_set(swigCPtr, this, value);
  }

  public boolean getHasGroupWeight() {
    return native_implJNI.TDataMetaInfo_HasGroupWeight_get(swigCPtr, this);
  }

  public void setHasSubgroupIds(boolean value) {
    native_implJNI.TDataMetaInfo_HasSubgroupIds_set(swigCPtr, this, value);
  }

  public boolean getHasSubgroupIds() {
    return native_implJNI.TDataMetaInfo_HasSubgroupIds_get(swigCPtr, this);
  }

  public void setHasWeights(boolean value) {
    native_implJNI.TDataMetaInfo_HasWeights_set(swigCPtr, this, value);
  }

  public boolean getHasWeights() {
    return native_implJNI.TDataMetaInfo_HasWeights_get(swigCPtr, this);
  }

  public void setHasTimestamp(boolean value) {
    native_implJNI.TDataMetaInfo_HasTimestamp_set(swigCPtr, this, value);
  }

  public boolean getHasTimestamp() {
    return native_implJNI.TDataMetaInfo_HasTimestamp_get(swigCPtr, this);
  }

  public void setHasPairs(boolean value) {
    native_implJNI.TDataMetaInfo_HasPairs_set(swigCPtr, this, value);
  }

  public boolean getHasPairs() {
    return native_implJNI.TDataMetaInfo_HasPairs_get(swigCPtr, this);
  }

  public void setColumnsInfo(TMaybe_TDataColumnsMetaInfo value) {
    native_implJNI.TDataMetaInfo_ColumnsInfo_set(swigCPtr, this, TMaybe_TDataColumnsMetaInfo.getCPtr(value), value);
  }

  public TMaybe_TDataColumnsMetaInfo getColumnsInfo() {
    long cPtr = native_implJNI.TDataMetaInfo_ColumnsInfo_get(swigCPtr, this);
    return (cPtr == 0) ? null : new TMaybe_TDataColumnsMetaInfo(cPtr, false);
  }

  public long GetFeatureCount() {
    return native_implJNI.TDataMetaInfo_GetFeatureCount(swigCPtr, this);
  }

            // Needed for deserialization
            void setSwigCPtr(long swigCPtr) {
                this.swigCPtr = swigCPtr;
            }
         
  public TDataMetaInfo() {
    this(native_implJNI.new_TDataMetaInfo(), true);
  }

}
