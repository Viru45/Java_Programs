/* 
---------Dynamic Method Dispatch-----------------Run Time Polymorphism Ex.

Dynamic Method Dispatch (DMD) is a process in Java where a call to an overridden method is resolved at runtime (not at compile time). 
It allows Java to support runtime polymorphism — that is, the ability to call the correct version of a method based on 
the actual object type, not the reference type.
Simply put: You decide which method to run depending on the object you created, not the reference you use.

*/



class Animal{
    void sound(){
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks");
    }
}

class Cat extends Animal{
    void sound(){
        System.out.println("Cat meows");
    }
}

class Main{

    public static void main(String args[]){

        Animal a;
        a = new Animal();
        a.sound();// Animal makes sound

        a = new Dog();
        a.sound();// Dog barks

        a = new Cat();
        a.sound();// Cat meows
    }
}