## Packages and JAR files

package is a way to group classes

there are a lot of classes and interfaces in a package

 It's a  namespace that organizes classes and interfaces

## Import a package to use
### if you want to use a class in a package in an other class, you must put the package in the same folder and import it

One way
```
import ug.joshh.animal
...

Dog d = new Dog(...);
```

The other way 

```java
ug.joshh.animal.Dog d = new ug.joshh.animal.Dog(...);
```

### !! put the package and the class in the same folder

## How to create a package

> Every file in a package must put package name at the top

```java
package ug.joshh.animal;
class Dog {...}
```

> Store the files in a appropriate directory

Package name is the directory name and it's also a website address

```
package ug.joshh.animal -> .../ug/joshh/animal;
package animal -> .../animal;
package ug.joshh.animal -> joshh.ug;
```

When you create a package, your IDE will create a directory for you 

## Default package
> If you don't put package name, it belongs to a default package

You can't import a class from a default packaged so you should avoid using default package.