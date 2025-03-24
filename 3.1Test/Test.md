# Test

## 编写程序之前先写测试

对于Sort.sort这个method，我们写TestSort.testSort这个method来测试。

TestSort.testSort代码可能如下：

```java
/** Tests the sort method of the Sort class. */
    public static void testSort() {
        String[] input = {"i", "have", "an", "egg"};
        String[] expected = {"an", "egg", "have", "i"};
        Sort.sort(input); //运用sort来排序
        for (int i = 0; i < input.length; i += 1) { //检查结果
            if (!input[i].equals(expected[i])) {
                System.out.println("Mismatch in position " + i + ", expected: " + expected + ", but got: " + input[i] + ".");
                break;
            }
        }
    }
```

## Junit库

我们可以用junit来测试

Ex:

```java
  org.junit.Assert.assertEquals(expected, input);
  // 注意这里expected和input都是String[]
  //因此我们不用那么普遍那么老的assertEquals
  //而用assertArrayEquals()
  org.junit.Assert.assertArrayEquals(expected, input);
```

