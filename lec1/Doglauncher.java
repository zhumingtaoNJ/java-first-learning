package lec1;

public class Doglauncher {
    public static void main(String[] args) {
        /**a class uses another class is called client */
        /**java要包和目录一致，编译时要在父目录编译运行，因为在本目录下找不到包 */
        Dog d = new Dog(20);
        d.makeNoise();
    }
}