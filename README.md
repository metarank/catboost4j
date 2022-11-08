# Catboost4j

A lightweight Java-only wrapper for CatBoost. Uses original native JNI libs from catboost-spark, but without the spark dependency.

## Usage 

For maven, use the following snippet:
```xml
<dependency>
  <groupId>io.github.metarank</groupId>
  <artifactId>catboost4j</artifactId>
  <version>1.1.1-1</version>
</dependency>
```

## Example

```java
public class Main {
    public static void main(String[] args) {
        TVector_TString params = new TVector_TString(
                new String[] {"--learn-set","train.csv","--test-set","test.csv",
                        "--column-description","train.cd","--loss-function","RMSE",
                        "--iterations","100","--delimiter=,","--has-header"});

        int result = native_impl.ModeFitImpl(params);
        params.delete();
    }
}

```

## License

As this library is a repackaged original SWIG-generated classes and JNI native libs, we use the same Apache 2.0 License.