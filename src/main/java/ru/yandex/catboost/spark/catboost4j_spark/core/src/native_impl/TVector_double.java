/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ru.yandex.catboost.spark.catboost4j_spark.core.src.native_impl;
import java.io.*;
public class TVector_double extends java.util.AbstractList<Double> implements java.util.RandomAccess,Serializable {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected TVector_double(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TVector_double obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(TVector_double obj) {
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
        native_implJNI.delete_TVector_double(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void yresize(long new_size) {
    native_implJNI.TVector_double_yresize(swigCPtr, this, new_size);
  }

  public void reserve(long new_cap) {
    native_implJNI.TVector_double_reserve(swigCPtr, this, new_cap);
  }

  public double getImpl(int index) {
    return native_implJNI.TVector_double_getImpl(swigCPtr, this, index);
  }

  public double setImpl(int index, double element) {
    return native_implJNI.TVector_double_setImpl(swigCPtr, this, index, element);
  }

  public int sizeImpl() {
    return native_implJNI.TVector_double_sizeImpl(swigCPtr, this);
  }

  public void addImpl(double element) {
    native_implJNI.TVector_double_addImpl__SWIG_0(swigCPtr, this, element);
  }

  public void addImpl(int index, double element) {
    native_implJNI.TVector_double_addImpl__SWIG_1(swigCPtr, this, index, element);
  }

  public double removeImpl(int index) {
    return native_implJNI.TVector_double_removeImpl(swigCPtr, this, index);
  }

        public TVector_double(double[] elements) {
            this();
            reserve(elements.length);
            for (double element : elements) {
                addImpl(element);
            }
        }

        public TVector_double(Iterable<Double> elements) {
            this();
            for (double element : elements) {
                addImpl(element);
            }
        }

        public Double get(int index) {
            return getImpl(index);
        }

        public Double set(int index, Double element) {
            return setImpl(index, element);
        }

        public int size() {
            return sizeImpl();
        }

        public boolean add(Double element) {
            modCount++;
            addImpl(element);
            return true;
        }

        public void add(int index, Double element) {
            modCount++;
            addImpl(index, element);
        }

        public Double remove(int index) {
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
            this.swigCPtr = native_implJNI.new_TVector_double();
            this.swigCMemOwn = true;

            int length = in.readInt();
            this.reserve(length);
            for (int i = 0; i < length; ++i) {
               this.add((Double)in.readObject());
            }
        }
    
  public boolean equalsImpl(TVector_double rhs) {
    return native_implJNI.TVector_double_equalsImpl(swigCPtr, this, TVector_double.getCPtr(rhs), rhs);
  }


public boolean equals(Object obj) {
    if (obj instanceof TVector_double) {
        boolean ptrEqual = (((TVector_double)obj).swigCPtr == this.swigCPtr);
        if (ptrEqual) {
            return true;
        } else {
            return this.equalsImpl((TVector_double)obj);
        }
    } else {
        return false;
    }
}

public int hashCode() {
    return (int)this.swigCPtr;
}


            public double[] toPrimitiveArray() {
                return native_implJNI.toPrimitiveArrayImpl_double(swigCPtr, this);
            }

            // valid only until next reallocation of TVector, so, use with caution.
            public java.nio.ByteBuffer asDirectByteBuffer() {
                return (java.nio.ByteBuffer)native_implJNI.asDirectByteBufferImpl_double(swigCPtr, this);
            }
        
  public TVector_double() {
    this(native_implJNI.new_TVector_double(), true);
  }

}