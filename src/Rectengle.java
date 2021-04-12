public class Rectengle extends Shape{
    private double width=1.0;
    private double hight=1.0;
    Rectengle(){};

    public Rectengle(double width, double hight) {
        this.width = width;
        this.hight = hight;
    }

    public Rectengle(String color, Boolean filled, double width, double hight) {
        super(color, filled);
        this.width = width;
        this.hight = hight;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }
    public double getArea(){
        return this.width*this.hight;
    }
    public double getPerimeter(){
        return (this.hight+this.width)*2;
    }

    @Override
    public String toString() {
        return "Rectengle{" +
                "width=" + width +
                super.toString()+
                ", hight=" + hight +
                '}';
    }
}
