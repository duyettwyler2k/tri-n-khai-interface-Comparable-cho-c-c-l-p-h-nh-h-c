public class Square extends Rectengle{
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
    public String toString() {
        return "Square{}"+
                super.toString();
    }
}
