package polymorphism;

public class Human {

    // overloading, overriding
    public void swim() {
        System.out.println("swim sãi");
    }
    public void swim(int meter) {
        System.out.println("swim bướm" + meter);
    }

    public void swim(String type){
        System.out.println("swim " + type);
    }

}
