class Area{
    int l = 5;
    int b = 10;
    int calculateArea(){
        return l*b;
    }
}

public class Rectangle{
    public static void main(String args[]){
        Area rectangle = new Area();
        System.out.print("Area of rectangle of unit length 5 and unit breadth 10 is  ");
        System.out.println(rectangle.calculateArea());
    }
}
