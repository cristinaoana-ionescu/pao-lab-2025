package lab2.ex3.ex3bis;

import lab2.ex3.ParentClass;

public class ChildClass extends ParentClass {

    // constructor(s): default, parameterized, copy constructor

    public ChildClass() {
        super(6);
    }

    public ChildClass(int i) {
        super(i);
    }


    // override parent method
    @Override
    public void doSomethingPublic() {
        System.out.println("ChildClass.doSomethingPublic()");
    }

    // overload parent method

}
