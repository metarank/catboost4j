/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ru.yandex.catboost.spark.catboost4j_spark.core.src.native_impl;

public class ILineDataReader {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ILineDataReader(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ILineDataReader obj) {
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
        native_implJNI.delete_ILineDataReader(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    native_implJNI.ILineDataReader_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    native_implJNI.ILineDataReader_change_ownership(this, swigCPtr, true);
  }

  public java.math.BigInteger GetDataLineCount(boolean estimate) {
    return native_implJNI.ILineDataReader_GetDataLineCount__SWIG_0(swigCPtr, this, estimate);
  }

  public java.math.BigInteger GetDataLineCount() {
    return native_implJNI.ILineDataReader_GetDataLineCount__SWIG_1(swigCPtr, this);
  }

  public TMaybe_TString GetHeader() {
    return new TMaybe_TString(native_implJNI.ILineDataReader_GetHeader(swigCPtr, this), true);
  }

  public boolean ReadLine(SWIGTYPE_p_TString line, SWIGTYPE_p_unsigned_long_long lineIdx) {
    return native_implJNI.ILineDataReader_ReadLine__SWIG_0(swigCPtr, this, SWIGTYPE_p_TString.getCPtr(line), SWIGTYPE_p_unsigned_long_long.getCPtr(lineIdx));
  }

  public boolean ReadLine(SWIGTYPE_p_TString line) {
    return native_implJNI.ILineDataReader_ReadLine__SWIG_1(swigCPtr, this, SWIGTYPE_p_TString.getCPtr(line));
  }

  public ILineDataReader() {
    this(native_implJNI.new_ILineDataReader(), true);
    native_implJNI.ILineDataReader_director_connect(this, swigCPtr, true, true);
  }

}
