package lab2.ex3;

public class ParentClass {

    private final int id;

    private final static int staticId;



    static {
        staticId = 7;
    }

    public ParentClass(int id) {
        this.id = id;
    }

    public void doSomethingPublic() {
        System.out.println("ParentClass.doSomething()");
    }

    protected void doSomethingProtected() {
        System.out.println("ParentClass.doSomethingProtected()");
    }

    private void doSomethingPrivate() {
        System.out.println("ParentClass.doSomethingPrivate()");
    }

    void doSomethingDefault() {
        System.out.println("ParentClass.doSomethingDefault()");
    }
}
