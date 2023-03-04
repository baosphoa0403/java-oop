package abstraction;

public abstract class Person {
 // same như class bth nhưng khi có từ khoá abstract ở function class extend phải override lại

    final boolean brain;

    public Person(boolean brain) {
        this.brain = brain;
    }

    // keywork final bỏ ovveride
    final public void hello(){
        System.out.println("hello");
    }

    @Override
    public String toString() {
        return "Person{" +
                "brain=" + brain +
                '}';
    }

    abstract public  void greeting();
    // abstract ko đi vs private



}
