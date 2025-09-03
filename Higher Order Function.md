# Higher Order Function

在python中，函数(function)可以作为一个变量被使用，
Ex:
```python
  def tenX(N):
    return 10 * X

  def do_twice(f, x):
    return f(f(x))
```

### Java版本

通过接口来实现函数调用

```java
  public interface IntUnaryFunction {
    //any function that takes in an integer and returns an integer
    int apply(int x);
}

public class TenX implements IntUnaryFunction {
    /* Returns ten times the argument. */
    public int apply(int x) {
        return 10 * x;
    }
}

public static int do_twice(IntUnaryFunction f, int x) {
    return f.apply(f.apply(x));
}

//example
System.out.println(do_twice(new TenX(), 2));
```


