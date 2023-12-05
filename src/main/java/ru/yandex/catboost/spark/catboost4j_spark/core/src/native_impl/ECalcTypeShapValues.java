/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ru.yandex.catboost.spark.catboost4j_spark.core.src.native_impl;

public enum ECalcTypeShapValues {
  Approximate,
  Regular,
  Exact,
  Independent;

  public final int swigValue() {
    return swigValue;
  }

  public static ECalcTypeShapValues swigToEnum(int swigValue) {
    ECalcTypeShapValues[] swigValues = ECalcTypeShapValues.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (ECalcTypeShapValues swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + ECalcTypeShapValues.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private ECalcTypeShapValues() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private ECalcTypeShapValues(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private ECalcTypeShapValues(ECalcTypeShapValues swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

