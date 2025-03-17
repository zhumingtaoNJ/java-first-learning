# ArrayList
类似DList的一个链表，不过用数组来存储数据而不是链表。
## Why using AList
  当我们想要实现int get(int i)来获取链表第i个元素时，DList花费时间太多

  而Array访问第i个元素花费常数时间，因此引入。

  我们引入了一个数组，来存储数据，并且用一个int类型的变量来记录数组的长度。

  ```java
  int size;
  int[] items;
  ```
## AddLast
  当item的大小不够时，我们创建一个新的更大的数组，并将原数组中的元素复制到新数组中。
  ```java
  // capacity为新数组的容量
  private void resize(int capacity) {
    int[] a = new int[capacity];
    System.arraycopy(items, 0, a, 0, size);
    items = a;
  }
  //用乘法适当扩容来减少运行时间
  resize(size * 2);
  items[size] = x;
  size *= 2;
  ```

