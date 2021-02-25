import java.util.Scanner;

class Structure{
    int length;
    int breadth;
    Structure(int a, int b){
        length = a;
        breadth = b;
    }
    void dimensions(){
        System.out.println("Length: "+length);
        System.out.println("Breadth: "+breadth);
    }
}

class Rectangle extends Structure{
    Rectangle(int a, int b){
        super(a, b);
    }
    void name(){
        System.out.println("Shape: Rectangle");
    }
    void area(){
        System.out.println("Area: "+length*breadth+" units");
    }
    void perimeter(){
        System.out.println("Perimeter: "+2*(length+breadth)+" units");
    }
}

class Square extends Rectangle{
    Square(int a){
        super(a, a);
    }
    void name(){
        System.out.println("Shape: Square");
    }
    void perimeter(){
        System.out.println("Perimeter: "+4*length+" units");
    }
}

public class Geometry{
    public static void main(String args[]){
        int x;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1 for square and 2 for rectangle: ");
        x = input.nextInt();
        if(x == 1){
            System.out.print("Enter the side for the square: ");
            int l = input.nextInt();
            Square sq = new Square(l);
            sq.name();
            sq.dimensions();
            sq.area();
            sq.perimeter();
        }else{
            System.out.println("Enter the side for the rectangle: ");
            int l = input.nextInt();
            int b = input.nextInt();
            Rectangle rc = new Rectangle(l, b);
            rc.name();
            rc.dimensions();
            rc.area();
            rc.perimeter();
        }
    }
}

