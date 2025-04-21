# INTERFACE

class之间有上下位词的关系

class ALList<Item> 和class SLList<Item>是两个class,可以被归类为List61B的下位词

List61B 被称为接口,即interface，如下：

  ![三者的关系](https://joshhug.gitbooks.io/hug61b/content/assets/subclass.png)

指定接口的语法是：
```java
/** 一个有List相关属性和对象操作的接口*/
public interface List61B<Item> {
    public void addFirst(Item x);
    public void addLast(Item y);
    public Item getFirst();
    public Item getLast();
    public Item removeLast();
    public Item get(int i);
    public void insert(Item x, int position);
    public int size();
}
```
## Implements 上下位词联系起来
将class ALList<Item>添加到List61B中的语法是：
```java
public class AList<Item> implements List61B<Item>{    
    @Override
    public void addFirst(Item x) {
        insert(x, 0);
    }    
}
```
### "@Override"表示覆盖，不写也不妨碍实现

但有了它可以帮助我们判断是否二者在声明上有无不一致错误

## Methods实现
各种methods的实现一般是在class里而不是interface里

但interface可以声明method的实现，加上"default"即可，如下
```java
default public void print() {
    for (int i = 0; i < size(); i += 1) {
        System.out.print(get(i) + " ");
    }
    System.out.println();
}
```
如果我们对SLList<Item>的print方法有不同要求，可以更改：
```java
@Override
public void print() {
    for (Node p = sentinel.next; p != null; p = p.next) {
        System.out.print(p.item + " ");
    }
}
```

## dynamic method selection
```java
List61B<String> lst = new SLList<String>();
```
以上代码声明了一个类型为List61B的变量lst，该盒子中装着SLList类型的元素的地址

即指针类型和对象“不匹配”

这里我们称SLList为“动态类型”, 而List61B为静态本身类型


