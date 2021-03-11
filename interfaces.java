interface perimeter{
    int perimeter(int x, int y);
}

interface area{
    int area(int x, int y);
}

interface volume extends area{
    int volume(int z, int x, int y);
}

interface display extends perimeter, volume{
    public void display();
}

class rectangle implements display{
    public int perimeter(int x, int y){
        return 2*(x+y);
    }
    public int area(int x, int y){
        return x*y;
    }
    public int volume(int z, int x, int y){
        return z * area(x, y);
    }
    public void display(){
        System.out.println("Area\tPerimeter\tVolume");
    }
}

public class interfaces{
    public static void main(String args[]){
        rectangle rect = new rectangle();
        rect.display();
        System.out.print(rect.perimeter(5,6));
        System.out.print("\t");
        System.out.print(rect.area(5,6));
        System.out.print("\t\t");
        System.out.println(rect.volume(10,5,6));
    }
}
