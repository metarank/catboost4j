/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ru.yandex.catboost.spark.catboost4j_spark.core.src.native_impl;
import java.io.*;
public class TVector_TFeatureMetaInfo extends java.util.AbstractList<TFeatureMetaInfo> implements java.util.RandomAccess,Serializable {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected TVector_TFeatureMetaInfo(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TVector_TFeatureMetaInfo obj) {
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
        native_implJNI.delete_TVector_TFeatureMetaInfo(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void yresize(long new_size) {
    native_implJNI.TVector_TFeatureMetaInfo_yresize(swigCPtr, this, new_size);
  }

  public void reserve(long new_cap) {
    native_implJNI.TVector_TFeatureMetaInfo_reserve(swigCPtr, this, new_cap);
  }

  public TFeatureMetaInfo getImpl(int index) {
    return new TFeatureMetaInfo(native_implJNI.TVector_TFeatureMetaInfo_getImpl(swigCPtr, this, index), false);
  }

  public TFeatureMetaInfo setImpl(int index, TFeatureMetaInfo element) {
    return new TFeatureMetaInfo(native_implJNI.TVector_TFeatureMetaInfo_setImpl(swigCPtr, this, index, TFeatureMetaInfo.getCPtr(element), element), true);
  }

  public int sizeImpl() {
    return native_implJNI.TVector_TFeatureMetaInfo_sizeImpl(swigCPtr, this);
  }

  public void addImpl(TFeatureMetaInfo element) {
    native_implJNI.TVector_TFeatureMetaInfo_addImpl__SWIG_0(swigCPtr, this, TFeatureMetaInfo.getCPtr(element), element);
  }

  public void addImpl(int index, TFeatureMetaInfo element) {
    native_implJNI.TVector_TFeatureMetaInfo_addImpl__SWIG_1(swigCPtr, this, index, TFeatureMetaInfo.getCPtr(element), element);
  }

  public TFeatureMetaInfo removeImpl(int index) {
    return new TFeatureMetaInfo(native_implJNI.TVector_TFeatureMetaInfo_removeImpl(swigCPtr, this, index), true);
  }

        public TVector_TFeatureMetaInfo(TFeatureMetaInfo[] elements) {
            this();
            reserve(elements.length);
            for (TFeatureMetaInfo element : elements) {
                addImpl(element);
            }
        }

        public TVector_TFeatureMetaInfo(Iterable<TFeatureMetaInfo> elements) {
            this();
            for (TFeatureMetaInfo element : elements) {
                addImpl(element);
            }
        }

        public TFeatureMetaInfo get(int index) {
            return getImpl(index);
        }

        public TFeatureMetaInfo set(int index, TFeatureMetaInfo element) {
            return setImpl(index, element);
        }

        public int size() {
            return sizeImpl();
        }

        public boolean add(TFeatureMetaInfo element) {
            modCount++;
            addImpl(element);
            return true;
        }

        public void add(int index, TFeatureMetaInfo element) {
            modCount++;
            addImpl(index, element);
        }

        public TFeatureMetaInfo remove(int index) {
            modCount++;
            return removeImpl(index);
        }

        // Generic serialization implementation - not very fast

        private void writeObject(ObjectOutputStream out) throws IOException {
            int length = this.size();
            out.writeInt(length);
            for (int i = 0; i < length; ++i) {
                out.writeObject(this.get(i));
            }
        }

        private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
            this.swigCPtr = native_implJNI.new_TVector_TFeatureMetaInfo();
            this.swigCMemOwn = true;

            int length = in.readInt();
            this.reserve(length);
            for (int i = 0; i < length; ++i) {
               this.add((TFeatureMetaInfo)in.readObject());
            }
        }
    
  public boolean equalsImpl(TVector_TFeatureMetaInfo rhs) {
    return native_implJNI.TVector_TFeatureMetaInfo_equalsImpl(swigCPtr, this, TVector_TFeatureMetaInfo.getCPtr(rhs), rhs);
  }


public boolean equals(Object obj) {
    if (obj instanceof TVector_TFeatureMetaInfo) {
        boolean ptrEqual = (((TVector_TFeatureMetaInfo)obj).swigCPtr == this.swigCPtr);
        if (ptrEqual) {
            return true;
        } else {
            return this.equalsImpl((TVector_TFeatureMetaInfo)obj);
        }
    } else {
        return false;
    }
}

public int hashCode() {
    return (int)this.swigCPtr;
}


  public TVector_TFeatureMetaInfo() {
    this(native_implJNI.new_TVector_TFeatureMetaInfo(), true);
  }

}
