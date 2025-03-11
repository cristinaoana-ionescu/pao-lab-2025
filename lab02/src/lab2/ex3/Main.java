package lab2.ex3;

import lab2.ex3.ex3bis.ChildClass;

public class Main {

    public static void main(String[] args) {
        AbstractClass myObject = new AbstractClass() {

        };
        System.out.println(myObject.getClass());  // anonymous class extending AbstractClass !


        AbstractClassImpl myConcreteObject = new AbstractClassImpl();
        System.out.println(myConcreteObject.getClass());


        ChildClass childObject = new ChildClass(2);
        System.out.println(childObject.getClass());

        childObject.doSomethingPublic();
        childObject.doSomethingProtected();
        // childObject.doSomethingDefault(); // cannot be accessed from outside package !

    }
}
