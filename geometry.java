import java.util.Scanner;

class Rectangle{
    int x, y;
    Rectangle(int a, int b){
        x = a;
        y = b;
    }
    int area(){
        int ar;
        ar = x * y;
        return ar;
    }   
}

class Cuboid extends Rectangle{
    int z;
    Cuboid(int a, int b, int c){
        super(a, b);
        z = c;
    }
    int volume(){
        int vol;
        vol = super.area() * z;
        return vol;
    }
}

public class geometry{
    public static void main(String args[]){
        int length, breadth, height;
        Scanner input = new Scanner(System.in);
        System.out.println("Program to calculate area of a rectangle and volume of a cuboid");
        System.out.println("Enter the length and height of a rectangle: ");
        length = input.nextInt();
        breadth = input.nextInt();
        Rectangle rect = new Rectangle(length, breadth);
        System.out.println("Area of the rectangle is " + rect.area());
        System.out.println("Enter the length, height and breadth of a cuboid: ");
        length = input.nextInt();
        breadth = input.nextInt();
        height = input.nextInt();
        Cuboid cubo = new Cuboid(length, breadth, height);
        System.out.println("Volume of the cuboid is " + cubo.volume());
    }
}
