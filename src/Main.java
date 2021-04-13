public class Main {
    public static void main(String[] args) {

     Circle circle=new Circle("red",true,3);
        System.out.println("dien tich hinh tron la "+circle.getArea());
     Square square=new Square("blue",true,2,2);
       square.howTocolor();
        System.out.println("dien tich hinh vuong la "+square.getArea());


    }
}
