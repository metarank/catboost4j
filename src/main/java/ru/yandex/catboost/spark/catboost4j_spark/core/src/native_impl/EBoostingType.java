/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ru.yandex.catboost.spark.catboost4j_spark.core.src.native_impl;

public enum EBoostingType {
  Ordered,
  Plain;

  public final int swigValue() {
    return swigValue;
  }

  public static EBoostingType swigToEnum(int swigValue) {
    EBoostingType[] swigValues = EBoostingType.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (EBoostingType swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + EBoostingType.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private EBoostingType() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private EBoostingType(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private EBoostingType(EBoostingType swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

