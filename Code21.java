//Inheritance
class Animal {
    void eat(){
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog barks");
    }
}

public class Code21{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
        
    }
}