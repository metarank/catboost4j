/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ru.yandex.catboost.spark.catboost4j_spark.core.src.native_impl;

public enum ENdcgSortType {
  None,
  ByPrediction,
  ByTarget;

  public final int swigValue() {
    return swigValue;
  }

  public static ENdcgSortType swigToEnum(int swigValue) {
    ENdcgSortType[] swigValues = ENdcgSortType.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (ENdcgSortType swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + ENdcgSortType.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private ENdcgSortType() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private ENdcgSortType(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private ENdcgSortType(ENdcgSortType swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

