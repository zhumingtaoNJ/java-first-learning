# Create an array
数组也是一种引用变量，它代表那N个box的地址

## ways to create
```java
  x = new int[]{1, 2, 3};
  y = new int[4];  //with default value 0 inside the box
  int[] z = {1, 2, 3, 4, 5};
```
## arraycopy
```java
/** 把b的从0开始的2个内容复制到x的从3开始的位置
    in Python : x[3:5] = b[0:2];
*/
int[] b = {1, 2, 3, 4};
x = new int[]{6, 7, 8, 9, 10};
System.arraycopy(b, 0, x, 3, 2);

/** 全部复制*/
int[] y;
y = x;
```
