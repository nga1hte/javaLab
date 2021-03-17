import java.util.Scanner;

class roots{
    double a;
    double b;
    double c;
    double x1;
    double x2;
    roots(double x, double y, double z){
        a = x;
        b = y;
        c = z;
    }
    void displayRoots(double d){
        x1 = (float)(-b + Math.sqrt(d))/2*a;
        x2 = (float)(-b - Math.sqrt(d))/2*a;
        System.out.println("roots: " + x1 + " " + x2);
    }
}

public class quad{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        double a, b, c, d = 0;
        System.out.println("Enter the values of a,b,c where a is not 0: ");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = (b*b) - (4*a*c);
        roots solution = new roots(a, b, c);
        if(d < 0){
            System.out.println("There are no real solutions!");
        }
        else if(d == 0){
            System.out.println("The solutions are real and equal: ");
            solution.displayRoots(d);
        }
        else{
            System.out.println("The solutions are real and distinct: ");
            solution.displayRoots(d);
        }

    }
}
