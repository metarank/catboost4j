/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ru.yandex.catboost.spark.catboost4j_spark.core.src.native_impl;

public enum EAccuracyType {
  Classic,
  PerClass;

  public final int swigValue() {
    return swigValue;
  }

  public static EAccuracyType swigToEnum(int swigValue) {
    EAccuracyType[] swigValues = EAccuracyType.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (EAccuracyType swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + EAccuracyType.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private EAccuracyType() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private EAccuracyType(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private EAccuracyType(EAccuracyType swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

