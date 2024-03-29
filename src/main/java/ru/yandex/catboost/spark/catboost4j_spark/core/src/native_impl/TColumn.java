/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ru.yandex.catboost.spark.catboost4j_spark.core.src.native_impl;
import java.io.*;
public class TColumn implements Serializable {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected TColumn(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TColumn obj) {
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
        native_implJNI.delete_TColumn(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setType(EColumn value) {
    native_implJNI.TColumn_Type_set(swigCPtr, this, value.swigValue());
  }

  public EColumn getType() {
    return EColumn.swigToEnum(native_implJNI.TColumn_Type_get(swigCPtr, this));
  }

  public void setId(String value) {
    native_implJNI.TColumn_Id_set(swigCPtr, this, value);
  }

  public String getId() {
    return native_implJNI.TColumn_Id_get(swigCPtr, this);
}

        private void writeObject(ObjectOutputStream out) throws IOException {
            out.writeUnshared(this.getType());
            out.writeUnshared(this.getId());
        }

        private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
            this.swigCPtr = native_implJNI.new_TColumn();
            this.swigCMemOwn = true;

            this.setType((EColumn)in.readUnshared());
            this.setId((String)in.readUnshared());
        }
    
  public boolean equalsImpl(TColumn rhs) {
    return native_implJNI.TColumn_equalsImpl(swigCPtr, this, TColumn.getCPtr(rhs), rhs);
  }


public boolean equals(Object obj) {
    if (obj instanceof TColumn) {
        boolean ptrEqual = (((TColumn)obj).swigCPtr == this.swigCPtr);
        if (ptrEqual) {
            return true;
        } else {
            return this.equalsImpl((TColumn)obj);
        }
    } else {
        return false;
    }
}

public int hashCode() {
    return (int)this.swigCPtr;
}


  public TColumn() {
    this(native_implJNI.new_TColumn(), true);
  }

}
