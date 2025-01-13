
class Animal {

    public void AnimalSound() {
        System.out.println("this animal make sound");
    }
}

class Cat extends Animal {
    public void AnimalSound() {
        System.out.println("this cat say: meow meow");
    }
}

class Dog extends Animal {
    public void AnimalSound() {
        System.out.println(" this dog say: baw baw");
    }
}

public class Polymorphism {

    public static void main(String[] args) {

        Animal myanmal = new Animal();
        Animal myCat = new Cat();
        Animal myDog = new Dog();

        myanmal.AnimalSound();
        myCat.AnimalSound();
        myDog.AnimalSound();

    }

}
