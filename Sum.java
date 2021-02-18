class AddNum{
    int x = 5;
    int y = 10;
    int display(){
        return x+y;
    }
}

public class Sum{
    public static void main(String args[]){
        AddNum sum = new AddNum();
        System.out.print("The sum of number 5 and 10 is ");
        System.out.println(sum.display());
    }
}
