import java.util.*;

class Animal{
    String name;
    int age;
    Animal(String a, int b){
        name = a;
        age = b;
    }
}

class Dog extends Animal{
    String color;
    Dog(String a, int b, String c){
        super(a, b);
        color = c;
    }
    void describe(){
        System.out.println("#####################"); 
        System.out.println("Pet: Dog"); 
        System.out.println("Name: "+ name);  
        System.out.println("Age: "+ age);  
        System.out.println("Color: "+ color);  
        System.out.println("#####################"); 
    }
}

class Cat extends Animal{
    String color;
    Cat(String a, int b, String c){
        super(a, b);
        color = c;
    }

    void describe(){
        System.out.println("#####################"); 
        System.out.println("Pet: Cat"); 
        System.out.println("Name: "+ name);  
        System.out.println("Age: "+ age);  
        System.out.println("Color: "+ color);  
        System.out.println("#####################"); 
    }
}

public class Pet{
    public static void main(String args[]){
        String name, color;
        int age, breed;
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter name for pet: ");
        name = inp.nextLine();
        System.out.print("Enter color for pet: ");
        color = inp.nextLine();
        System.out.print("Enter age for pet: ");
        age = inp.nextInt();
        System.out.print("Enter 1 for dog and 2 for cat: ");
        breed = inp.nextInt();
        Animal pet = new Animal(name, age);
        if(breed == 1){
            Dog dog = new Dog(name, age, color);
            dog.describe();
        }else{
            Cat cat = new Cat(name, age, color);
            cat.describe();
        }
    }

}
