/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ru.yandex.catboost.spark.catboost4j_spark.core.src.native_impl;

public class TRawDatasetRowsReader {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected TRawDatasetRowsReader(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TRawDatasetRowsReader obj) {
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
        native_implJNI.delete_TRawDatasetRowsReader(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TRawDatasetRowsReader(String schema, ILineDataReader lineReader, String columnDescriptionPathWithScheme, TVector_TColumn columnsDescription, String plainJsonParamsAsString, boolean hasHeader, int blockSize, int threadCount) throws Exception {
    this(native_implJNI.new_TRawDatasetRowsReader(schema, ILineDataReader.getCPtr(lineReader), lineReader, columnDescriptionPathWithScheme, TVector_TColumn.getCPtr(columnsDescription), columnsDescription, plainJsonParamsAsString, hasHeader, blockSize, threadCount), true);
  }

  public TIntermediateDataMetaInfo GetMetaInfo() {
    return new TIntermediateDataMetaInfo(native_implJNI.TRawDatasetRowsReader_GetMetaInfo(swigCPtr, this), true);
  }

  public int ReadNextBlock() throws Exception {
    return native_implJNI.TRawDatasetRowsReader_ReadNextBlock(swigCPtr, this);
  }

  public TRawDatasetRow GetRow(int objectIdx) throws Exception {
    return new TRawDatasetRow(native_implJNI.TRawDatasetRowsReader_GetRow(swigCPtr, this, objectIdx), false);
  }

}
