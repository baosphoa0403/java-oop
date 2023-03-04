package abstraction;

public class Teacher extends Person implements IClubMoto {
    public Teacher(boolean brain) {
        super(brain);
    }

    @Override
    public void greeting() {
        System.out.println("hi student");
    }


    @Override
    public void pickGirl() {
        System.out.println("em trinh đi với anh");
    }

    @Override
    public void racing() {
        System.out.println("sh mode đua nha");
    }
}
