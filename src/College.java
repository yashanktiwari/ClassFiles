/*
import statement
There are two types of import statement
Normal:
java.lang.*; // implicit import
java.util.Scanner; // explicit import - Always prefer this type of import statement
Static import statement:
If we want to access the static attribute of a particular class.


We cannot write java.*; as it is illegal as it will import only classes that are in the java folder but there is no class in the java folder.
Java folder has many sub folders like util, lang, i/o etc.

To resolve the naming conflict errors we use the concept of the package0

There are total 14 packages available in java.
2 packages are by default available - java.lang package and current working directory.

For normal import statement:
First preference is given to the explicit import statement.
Second preference is given to the current working directory.
Third preference is given to the implicit import statement.

For static import statement:
First preference is given to the current working directory static elements.
Second preference is given to the explicit static elements.
Third preference is given to the implicit static elements.
*/

/*
No error at compilation when main method is not declared but there will be error at runtime when main method is not declared
*/
import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

public class College {
    public static void main(String[] args) {
        System.out.println(MAX_VALUE);
        int a = java.lang.Integer.MAX_VALUE;
        System.out.println(a);
    }
}

