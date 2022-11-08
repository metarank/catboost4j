package io.github.metarank;

import ru.yandex.catboost.spark.catboost4j_spark.core.src.native_impl.TVector_TString;
import ru.yandex.catboost.spark.catboost4j_spark.core.src.native_impl.native_impl;

public class Example {
    public static void main(String[] args) {
        TVector_TString params = new TVector_TString(
                new String[] {"--learn-set","train.csv","--test-set","test.csv",
                        "--column-description","train.cd","--loss-function","RMSE",
                        "--iterations","100","--delimiter=,","--has-header"});

        int result = native_impl.ModeFitImpl(params);
        params.delete();
    }
}
