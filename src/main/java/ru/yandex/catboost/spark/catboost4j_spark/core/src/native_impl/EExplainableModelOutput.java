/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ru.yandex.catboost.spark.catboost4j_spark.core.src.native_impl;

public enum EExplainableModelOutput {
  Raw,
  Probability,
  LossFunction;

  public final int swigValue() {
    return swigValue;
  }

  public static EExplainableModelOutput swigToEnum(int swigValue) {
    EExplainableModelOutput[] swigValues = EExplainableModelOutput.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (EExplainableModelOutput swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + EExplainableModelOutput.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private EExplainableModelOutput() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private EExplainableModelOutput(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private EExplainableModelOutput(EExplainableModelOutput swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}
