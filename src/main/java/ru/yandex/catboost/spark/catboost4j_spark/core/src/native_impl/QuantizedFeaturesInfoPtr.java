/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ru.yandex.catboost.spark.catboost4j_spark.core.src.native_impl;
import java.io.*;
public class QuantizedFeaturesInfoPtr implements Serializable {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected QuantizedFeaturesInfoPtr(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(QuantizedFeaturesInfoPtr obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(QuantizedFeaturesInfoPtr obj) {
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
        native_implJNI.delete_QuantizedFeaturesInfoPtr(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TQuantizedFeaturesInfo __deref__() {
    long cPtr = native_implJNI.QuantizedFeaturesInfoPtr___deref__(swigCPtr, this);
    return (cPtr == 0) ? null : new TQuantizedFeaturesInfo(cPtr, false);
  }

  public TQuantizedFeaturesInfo Get() {
    long cPtr = native_implJNI.QuantizedFeaturesInfoPtr_Get(swigCPtr, this);
    return (cPtr == 0) ? null : new TQuantizedFeaturesInfo(cPtr, false);
  }

  public void Set(TQuantizedFeaturesInfo t) {
    native_implJNI.QuantizedFeaturesInfoPtr_Set(swigCPtr, this, TQuantizedFeaturesInfo.getCPtr(t), t);
  }

        public QuantizedFeaturesInfoPtr(TQuantizedFeaturesInfo pointee) {
            this();
            if (pointee != null) {
                pointee.releaseMem();
                this.Set(pointee);
            }
        }

        private void writeObject(ObjectOutputStream out) throws IOException {
            out.writeObject(this.Get());
        }

        private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
            this.swigCPtr = native_implJNI.new_QuantizedFeaturesInfoPtr();
            this.swigCMemOwn = true;

            TQuantizedFeaturesInfo pointee = (TQuantizedFeaturesInfo)in.readObject();
            if (pointee != null) {
                pointee.releaseMem();
                this.Set(pointee);
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof QuantizedFeaturesInfoPtr) {
                boolean ptrEqual = (((QuantizedFeaturesInfoPtr)obj).swigCPtr == this.swigCPtr);
                if (ptrEqual) {
                    return true;
                } else {
                    return this.equalsImpl(((QuantizedFeaturesInfoPtr)obj).Get());
                }
            } else {
                return false;
            }
        }
    
  public QuantizedFeaturesInfoPtr() {
    this(native_implJNI.new_QuantizedFeaturesInfoPtr(), true);
  }

  public TFeaturesLayoutPtr GetFeaturesLayout() {
    return new TFeaturesLayoutPtr(native_implJNI.QuantizedFeaturesInfoPtr_GetFeaturesLayout(swigCPtr, this), true);
  }

  public void Init(TFeaturesLayout featuresLayout) {
    native_implJNI.QuantizedFeaturesInfoPtr_Init(swigCPtr, this, TFeaturesLayout.getCPtr(featuresLayout), featuresLayout);
  }

  public boolean EqualWithoutOptionsTo(TQuantizedFeaturesInfo rhs, boolean ignoreSparsity) {
    return native_implJNI.QuantizedFeaturesInfoPtr_EqualWithoutOptionsTo__SWIG_0(swigCPtr, this, TQuantizedFeaturesInfo.getCPtr(rhs), rhs, ignoreSparsity);
  }

  public boolean EqualWithoutOptionsTo(TQuantizedFeaturesInfo rhs) {
    return native_implJNI.QuantizedFeaturesInfoPtr_EqualWithoutOptionsTo__SWIG_1(swigCPtr, this, TQuantizedFeaturesInfo.getCPtr(rhs), rhs);
  }

  public ENanMode GetNanMode(int floatFeatureIdx) {
    return ENanMode.swigToEnum(native_implJNI.QuantizedFeaturesInfoPtr_GetNanMode(swigCPtr, this, floatFeatureIdx));
  }

  public void SetNanMode(int floatFeatureIdx, ENanMode nanMode) {
    native_implJNI.QuantizedFeaturesInfoPtr_SetNanMode(swigCPtr, this, floatFeatureIdx, nanMode.swigValue());
  }

  public void GetQuantization(int floatFeatureIdx, TVector_float borders, SWIGTYPE_p_bool hasDefaultQuantizedBin, TDefaultQuantizedBin defaultQuantizedBin) {
    native_implJNI.QuantizedFeaturesInfoPtr_GetQuantization(swigCPtr, this, floatFeatureIdx, TVector_float.getCPtr(borders), borders, SWIGTYPE_p_bool.getCPtr(hasDefaultQuantizedBin), TDefaultQuantizedBin.getCPtr(defaultQuantizedBin), defaultQuantizedBin);
  }

  public void SetQuantization(int floatFeatureIdx, TVector_float borders, TDefaultQuantizedBin defaultQuantizedBin) {
    native_implJNI.QuantizedFeaturesInfoPtr_SetQuantization__SWIG_0(swigCPtr, this, floatFeatureIdx, TVector_float.getCPtr(borders), borders, TDefaultQuantizedBin.getCPtr(defaultQuantizedBin), defaultQuantizedBin);
  }

  public void SetQuantization(int floatFeatureIdx, TVector_float borders) {
    native_implJNI.QuantizedFeaturesInfoPtr_SetQuantization__SWIG_1(swigCPtr, this, floatFeatureIdx, TVector_float.getCPtr(borders), borders);
  }

  public boolean equalsImpl(TQuantizedFeaturesInfo rhs) {
    return native_implJNI.QuantizedFeaturesInfoPtr_equalsImpl(swigCPtr, this, TQuantizedFeaturesInfo.getCPtr(rhs), rhs);
  }

}
