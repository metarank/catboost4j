/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ru.yandex.catboost.spark.catboost4j_spark.core.src.native_impl;

public class boolp {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected boolp(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(boolp obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(boolp obj) {
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
        native_implJNI.delete_boolp(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public boolp() {
    this(native_implJNI.new_boolp(), true);
  }

  public void assign(boolean value) {
    native_implJNI.boolp_assign(swigCPtr, this, value);
  }

  public boolean value() {
    return native_implJNI.boolp_value(swigCPtr, this);
  }

  public SWIGTYPE_p_bool cast() {
    long cPtr = native_implJNI.boolp_cast(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_bool(cPtr, false);
  }

  public static boolp frompointer(SWIGTYPE_p_bool t) {
    long cPtr = native_implJNI.boolp_frompointer(SWIGTYPE_p_bool.getCPtr(t));
    return (cPtr == 0) ? null : new boolp(cPtr, false);
  }

}