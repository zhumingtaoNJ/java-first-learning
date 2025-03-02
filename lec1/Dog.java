package lec1;
/** all code should be in class */
public class Dog { 
    public int weight;
    /**this is a method */
    public void makeNoise() {
        if (weight < 10) {
            System.out.println("yip!");
        } else if (weight < 30) {
            System.out.println("bark!");
        } else {
            System.out.println("woof");
        }
    }

    public Dog(int w) {
        weight = w;
    }

}
