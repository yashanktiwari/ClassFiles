/*
* Final is a modifier
* In c programming language to create a constant value
* const int a = 45;
*
* In Java
* const replaced with final
* If you want to impose some restrictions use final modifier
*
* We can use this with:
* with variable
* with method
* with class
*
* instance variable
* if we are declaring a final instance variable then we have to initialize before the completion of constructor, or we can initialize the variable in the
* constructor also
*
* final int a;
* {
*   a = 90;
* }
*
* or
*
* final int a;
* Constructor()
* {
*   a = 90;
* }
*
* if we are creating the final variable or final static variable then jvm will not provide the default value.
* There is only one modifier which can be used with the local variable that is 'final'.
*
*
* Now with non-primitive datatype:
* final method can never be overwritten
* final class can never be inherited
*
* We cannot pass the primitive datatype as the reference variable
*
* modifier abstract
*  Illegal Combinations :-
* 1. We can't jointly use private and abstract modifier
* 2. We can't jointly use abstract and final modifier
*
* We can change the sequence of the modifiers
* */
class myClass
{
    public int num1;
    public int num2;
    myClass()
    {
        num1 = 50_000;
        num2 = 1_45_000;
    }

    public int sum(int a, int b) {
        return a+b;
    }
    public void display()
    {
        System.out.println(num1 + " " + num2);
    }
}
public class FinalDemo {
    public static void main(String[] args) {
        //final myClass obj = new myClass();
        myClass obj = new myClass();
        obj.num1 = 78;
        obj.num2 = 79;
        obj.display();
        int x = 5, y = 6;
        obj.sum(x, y);
        myClass obj2 = obj; //constructor will not be invoked as both the objects are having the same reference


    }
}
