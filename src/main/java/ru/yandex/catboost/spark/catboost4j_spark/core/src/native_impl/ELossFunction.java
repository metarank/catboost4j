/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.0
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ru.yandex.catboost.spark.catboost4j_spark.core.src.native_impl;

public enum ELossFunction {
  Logloss,
  CrossEntropy,
  CtrFactor,
  RMSE,
  LogCosh,
  Lq,
  MAE,
  Quantile,
  MultiQuantile,
  Expectile,
  LogLinQuantile,
  MAPE,
  Poisson,
  MSLE,
  MedianAbsoluteError,
  SMAPE,
  Huber,
  Tweedie,
  Cox,
  RMSEWithUncertainty,
  MultiClass,
  MultiClassOneVsAll,
  PairLogit,
  PairLogitPairwise,
  YetiRank,
  YetiRankPairwise,
  QueryRMSE,
  QuerySoftMax,
  QueryCrossEntropy,
  StochasticFilter,
  LambdaMart,
  StochasticRank,
  PythonUserDefinedPerObject,
  PythonUserDefinedMultiTarget,
  UserPerObjMetric,
  UserQuerywiseMetric,
  R2,
  NumErrors,
  FairLoss,
  AUC,
  Accuracy,
  BalancedAccuracy,
  BalancedErrorRate,
  BrierScore,
  Precision,
  Recall,
  F1,
  TotalF1,
  F,
  MCC,
  ZeroOneLoss,
  HammingLoss,
  HingeLoss,
  Kappa,
  WKappa,
  LogLikelihoodOfPrediction,
  NormalizedGini,
  PRAUC,
  PairAccuracy,
  AverageGain,
  QueryAverage,
  QueryAUC,
  PFound,
  PrecisionAt,
  RecallAt,
  MAP,
  NDCG,
  DCG,
  FilteredDCG,
  MRR,
  ERR,
  SurvivalAft,
  MultiRMSE,
  MultiRMSEWithMissingValues,
  MultiLogloss,
  MultiCrossEntropy,
  Combination;

  public final int swigValue() {
    return swigValue;
  }

  public static ELossFunction swigToEnum(int swigValue) {
    ELossFunction[] swigValues = ELossFunction.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (ELossFunction swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + ELossFunction.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private ELossFunction() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private ELossFunction(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private ELossFunction(ELossFunction swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}
