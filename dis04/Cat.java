public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age); // 调用父类的构造方法
        this.noise = "Meow";
    }

    public void greet() {
        System.out.println("CAt " + name + " says: " + makeNoise());
    }
}
