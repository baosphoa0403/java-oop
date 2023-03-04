import abstraction.Person;
import abstraction.Teacher;
import inheritance.Rectangle;
import inheritance.Square;

public class Main {
    public static void main(String[] args) {
        // inheritance
        System.out.println("Hello world!");
        Rectangle rec1 = new Rectangle("gia bảo", "green", 2, 3);
        Rectangle rec2 = new Square("hieu", "purple", 3, 2);
        System.out.println(rec2.toString());
        System.out.println(((Square)rec2).toString());
        //polymorphism
        //abstraction
        // abstract class cố tình new 1 class
        Person p = new Person(false) {
            @Override
            public void greeting() {
                System.out.println("hello");
            }
        };
        p.greeting();
        Teacher t = new Teacher(false);
        t.greeting();
        t.pickGirl();
        t.racing();


    }
}