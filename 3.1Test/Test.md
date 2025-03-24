# Test

## ！！！编写程序之前先写测试！！！

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
## selection-sort
介绍选择排序

一共三步
1. find the smallest one
2. move it to the front
3. select the rest (maybe recursion?)

### findSmallest   
```java
public static String findSmallest(String[] s) {
    //...
}
//记得吗？先写测试
 /** 测试findSmallest*/
 public static void testFindSmallest() {
        String[] input = {"i", "have", "an", "egg"};
        String expected = "an";

        String actual = Sort.findSmallest(input);

        org.junit.Assert.assertEquals(expected, actual);        
}
/** Returns the smallest string in x. */
public static String findSmallest(String[] x) {
    String smallest = x[0];
    for (int i = 0; i < x.length; i += 1) {
        //比较两个字符串的大小用a.compareTo(b), 返回一个int;
        int cmp = x[i].compareTo(smallest); 
        if (cmp < 0) {
            smallest = x[i];
        }
    }
    return smallest;
}
```
### Swap
```java
public class TestSort {
    /** test the swap method. */
    pubilc static void testSwap() {
        String[] input = {"an", "have", "i", "egg"};
        int a = 0;
        int b = 2;
        String[] expected = {"i", "have", "an", "egg"};
        Sort.swap(input, a, b);
        org.junit.Assert.assertArrayEquals(expected, input);
    }
    public static void main(String[] args) {
    testSwap();
    }
}
```
实现比较简单在此略过

## Sort
只需要把两个辅助模块拼接起来

但是似乎findSmallest没有给出smallest item的index，修改一下

别忘了修改testFindSmallest!!!
```java
/** test the findSmallest*/
public static void testFindSmallest() {
    String[] input = {"i", "have", "an", "egg"};
    int expected = 2;

    int actual = Sort.findSmallest(input);
    org.junit.Assert.assertEquals(expected, actual);        
}
/** return the index of the smallest items */
public static int findSmallest(String[] x) {
    int smallestIndex = 0;
    for (int i = 0; i < x.length; i += 1) {
        int cmp = x[i].compareTo(x[smallestIndex]);
        if (cmp < 0) {
            smallestIndex = i;
        }
    }
    return smallestIndex;
}
```
接着尝试用递归解决最后一步

in python
```python
sort(x[1:])
```
但是in java这不可能，但我们可以构建一个辅助函数ssort(String[] x, int start)
```java
public static void sort(String[] s ){
    sort(s, 0);
}

private static vois sort(Stirng[] s, int start) {
    int smallestIndex = findSmallest(s);
    swap(s, start, smallestIndes);
    sort(s, start + 1);
}
```
对本质上不是递归的数据结构（例如数组）使用递归时，这种方法非常常见。
    
