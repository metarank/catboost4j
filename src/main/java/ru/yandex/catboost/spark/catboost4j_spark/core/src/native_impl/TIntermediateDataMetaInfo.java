/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ru.yandex.catboost.spark.catboost4j_spark.core.src.native_impl;
import java.io.*;
public class TIntermediateDataMetaInfo extends TDataMetaInfo implements Serializable {
  private transient long swigCPtr;

  protected TIntermediateDataMetaInfo(long cPtr, boolean cMemoryOwn) {
    super(native_implJNI.TIntermediateDataMetaInfo_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TIntermediateDataMetaInfo obj) {
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
        native_implJNI.delete_TIntermediateDataMetaInfo(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public TIntermediateDataMetaInfo() {
    this(native_implJNI.new_TIntermediateDataMetaInfo__SWIG_0(), true);
  }

  public TIntermediateDataMetaInfo(TDataMetaInfo dataMetaInfo, boolean hasUnknownNumberOfSparseFeatures) {
    this(native_implJNI.new_TIntermediateDataMetaInfo__SWIG_1(TDataMetaInfo.getCPtr(dataMetaInfo), dataMetaInfo, hasUnknownNumberOfSparseFeatures), true);
  }

  public boolean HasSparseFeatures() {
    return native_implJNI.TIntermediateDataMetaInfo_HasSparseFeatures(swigCPtr, this);
  }

  public void setHasUnknownNumberOfSparseFeatures(boolean value) {
    native_implJNI.TIntermediateDataMetaInfo_HasUnknownNumberOfSparseFeatures_set(swigCPtr, this, value);
  }

  public boolean getHasUnknownNumberOfSparseFeatures() {
    return native_implJNI.TIntermediateDataMetaInfo_HasUnknownNumberOfSparseFeatures_get(swigCPtr, this);
  }

  public TIntermediateDataMetaInfo Clone() {
    return new TIntermediateDataMetaInfo(native_implJNI.TIntermediateDataMetaInfo_Clone(swigCPtr, this), true);
  }

  public TIntermediateDataMetaInfo SetAvailableFeatures(int[] selectedFeatures) throws Exception {
    return new TIntermediateDataMetaInfo(native_implJNI.TIntermediateDataMetaInfo_SetAvailableFeatures(swigCPtr, this, selectedFeatures), true);
  }

        private void writeObject(ObjectOutputStream out) throws IOException {
            out.writeUnshared(this.getObjectCount());

            out.writeUnshared(this.getFeaturesLayout());

            out.writeUnshared(this.getTargetType());
            out.writeLong(this.getTargetCount());

            out.writeLong(this.getBaselineCount());

            out.writeBoolean(this.getHasGroupId());
            out.writeBoolean(this.getHasGroupWeight());
            out.writeBoolean(this.getHasSubgroupIds());
            out.writeBoolean(this.getHasWeights());
            out.writeBoolean(this.getHasTimestamp());
            out.writeBoolean(this.getHasPairs());

            out.writeUnshared(this.getColumnsInfo());

            out.writeBoolean(this.getHasUnknownNumberOfSparseFeatures());
        }

        private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
            this.swigCPtr = native_implJNI.new_TIntermediateDataMetaInfo__SWIG_0();
            super.setSwigCPtr(native_implJNI.TIntermediateDataMetaInfo_SWIGUpcast(this.swigCPtr));
            this.swigCMemOwn = true;

            this.setObjectCount((java.math.BigInteger)in.readUnshared());

            this.setFeaturesLayout((TFeaturesLayoutPtr)in.readUnshared());

            this.setTargetType((ERawTargetType)in.readUnshared());
            this.setTargetCount(in.readLong());

            this.setBaselineCount(in.readLong());

            this.setHasGroupId(in.readBoolean());
            this.setHasGroupWeight(in.readBoolean());
            this.setHasSubgroupIds(in.readBoolean());
            this.setHasWeights(in.readBoolean());
            this.setHasTimestamp(in.readBoolean());
            this.setHasPairs(in.readBoolean());

            this.setColumnsInfo((TMaybe_TDataColumnsMetaInfo)in.readUnshared());

            this.setHasUnknownNumberOfSparseFeatures(in.readBoolean());
        }
    
  public boolean equalsImpl(TIntermediateDataMetaInfo rhs) {
    return native_implJNI.TIntermediateDataMetaInfo_equalsImpl(swigCPtr, this, TIntermediateDataMetaInfo.getCPtr(rhs), rhs);
  }


public boolean equals(Object obj) {
    if (obj instanceof TIntermediateDataMetaInfo) {
        boolean ptrEqual = (((TIntermediateDataMetaInfo)obj).swigCPtr == this.swigCPtr);
        if (ptrEqual) {
            return true;
        } else {
            return this.equalsImpl((TIntermediateDataMetaInfo)obj);
        }
    } else {
        return false;
    }
}

public int hashCode() {
    return (int)this.swigCPtr;
}


}
