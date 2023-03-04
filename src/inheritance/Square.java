package inheritance;

public class Square extends Rectangle {

    public Square(String owner, String color, double width, double length) {
        super(owner, color, width, length);
    }

    @Override
    public double area() {
        return super.area();
    }


    public void squareHi() {
        System.out.println("square hi");

    }
}
