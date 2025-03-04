### java里有八个基本类型：
  byte, short, int, long, float, double, boolean, char
我们在声明变量时，电脑在内存里给了我们对应的几位bits来存储初始化的value, 而name代表value的地址
当变量没有被赋值，即变量没有指向某一地址，它不可被访问！

Example:
```java  
    int x; 
    x = -1431195969;
```

    ![image](https://github.com/user-attachments/assets/5d5c70ef-2eca-4dff-abd5-26f1b4c6e8b8)
    ![image](https://github.com/user-attachments/assets/83067360-5dbf-4b50-86d4-704b2b5a8af6)
## 位复制

```java
        int y; 
        y = x;
```

实际上是把x指向的地址里的内容复制给y指向的地址，两者内存地址不一样，改变一方对另一方没什么影响。
