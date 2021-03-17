import java.util.Scanner;
class pet{
    String name, animal;
    //Constructor
    pet(String n){
        name = n;
        animal = "dog";
    }
    //Constructor overloaded
    pet(String n, String type){
        name = n;
        animal = type;
    }

    //method
    void display(){
        System.out.println("The name of the pet "+ animal +" is "+ name); 
    }
    //method overloading
    void display(String color){
        System.out.println("The name of the pet "+ animal +" is "+ name); 
        System.out.println("It is "+ color +" in color.");
    }

}

public class overloading{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of the pet: ");
        String name = input.nextLine();
        pet first = new pet(name);
        first.display();
        System.out.println();

        //entering color as argument
        first.display("brown");
        System.out.println();

        System.out.println("Enter the name of the next pet: ");
        name = input.nextLine();
        System.out.println("Enter the animal type of the next pet: ");
        String type = input.nextLine();
        pet second = new pet(name, type); 
        second.display();
    }
}

