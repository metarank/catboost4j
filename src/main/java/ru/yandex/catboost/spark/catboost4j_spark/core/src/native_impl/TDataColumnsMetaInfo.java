/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ru.yandex.catboost.spark.catboost4j_spark.core.src.native_impl;
import java.io.*;
public class TDataColumnsMetaInfo implements Serializable {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected TDataColumnsMetaInfo(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TDataColumnsMetaInfo obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(TDataColumnsMetaInfo obj) {
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
        native_implJNI.delete_TDataColumnsMetaInfo(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setColumns(TVector_TColumn value) {
    native_implJNI.TDataColumnsMetaInfo_Columns_set(swigCPtr, this, TVector_TColumn.getCPtr(value), value);
  }

  public TVector_TColumn getColumns() {
    long cPtr = native_implJNI.TDataColumnsMetaInfo_Columns_get(swigCPtr, this);
    return (cPtr == 0) ? null : new TVector_TColumn(cPtr, false);
  }

            private void writeObject(ObjectOutputStream out) throws IOException {
                out.writeUnshared(this.getColumns());
            }

            private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
                this.swigCPtr = native_implJNI.new_TDataColumnsMetaInfo();
                this.swigCMemOwn = true;

                this.setColumns((TVector_TColumn)in.readUnshared());
            }
        
  public boolean equalsImpl(TDataColumnsMetaInfo rhs) {
    return native_implJNI.TDataColumnsMetaInfo_equalsImpl(swigCPtr, this, TDataColumnsMetaInfo.getCPtr(rhs), rhs);
  }


public boolean equals(Object obj) {
    if (obj instanceof TDataColumnsMetaInfo) {
        boolean ptrEqual = (((TDataColumnsMetaInfo)obj).swigCPtr == this.swigCPtr);
        if (ptrEqual) {
            return true;
        } else {
            return this.equalsImpl((TDataColumnsMetaInfo)obj);
        }
    } else {
        return false;
    }
}

public int hashCode() {
    return (int)this.swigCPtr;
}


  public TDataColumnsMetaInfo() {
    this(native_implJNI.new_TDataColumnsMetaInfo(), true);
  }

}