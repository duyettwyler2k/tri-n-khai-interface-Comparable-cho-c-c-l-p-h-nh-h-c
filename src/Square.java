public class Square extends Rectengle implements Colorable{
    public Square(){}

    public Square(double width, double hight) {
        super(width, hight);
    }

    public Square(String color, Boolean filled, double width, double hight) {
        super(color, filled, width, hight);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public double getHight() {
        return super.getHight();
    }

    @Override
    public double getWidth() {
        return super.getWidth();
    }

    @Override
    public void setHight(double hight) {
        super.setHight(hight);
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }

    @Override
    public String toString() {
        return "Square{}"+
                super.toString();
    }

    @Override
    public void howTocolor() {
        System.out.println("Color all four sides");
    }
}
