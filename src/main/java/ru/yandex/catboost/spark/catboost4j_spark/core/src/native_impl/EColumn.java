/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ru.yandex.catboost.spark.catboost4j_spark.core.src.native_impl;

public enum EColumn {
  Num,
  Categ,
  Label,
  Auxiliary,
  Baseline,
  Weight,
  SampleId,
  GroupId,
  GroupWeight,
  SubgroupId,
  Timestamp,
  Sparse,
  Prediction,
  Text,
  NumVector;

  public final int swigValue() {
    return swigValue;
  }

  public static EColumn swigToEnum(int swigValue) {
    EColumn[] swigValues = EColumn.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (EColumn swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + EColumn.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private EColumn() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private EColumn(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private EColumn(EColumn swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

