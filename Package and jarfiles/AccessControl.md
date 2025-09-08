# Access Control

now we have four levels of access

> public \\ protected \\private \\ none

    
![imageOfFourLevel](https://joshhug.gitbooks.io/hug61b/content/assets/access_modifiers.png)

using four different access modifiers, we can control who can access what.

### What about the code belongs to the default package?

The code belongs to the default package is accessible to all other classes in the default package.

## Access is Based Only On Stativ Type

```java
package universe;
public interface BlackHole {
    void add(Object o); //Even though this method has no modifier, it's still public
}

package universe;
public class CreationUtils {
    public static BlackHol hirsute() {
        return new HasHair();
    }
}

package universe;
class HasHair implements BlackHole {
    Object[] items;
    public void add(Object o) {...}
    public Object get(int index) {...}
}
```
In the above code, the `add()` method is public, but the `HasHair` class is not.

Now let's see what happens when we try to use `HasHair`:
```java
import static CreationUtils.hirsute;
class Client {
    void demoAccess() {
        BlackHole b = hirsute(); 
        //This is fine though hirsute() returns a HasHair and HasHair is not public, the static type of b is BlackHole
        b.add("Hello");
        //This is fine  The complier only checks tha static type of b, BlackHole has a add() method
        b.get(0);
        //This is not fine because the static type of b is BlackHole, which does not have a get() method The complier will complain
        HasHair h = (HasHair) b;
        //This is not fine You can't access the static type HasHair, it has no modifier
    }
}