package ch07.sec10.exam02;

public class AbstractMethodExample {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.sound();

        System.out.println();

        // 매개변수를 이용해서 다형성을 구현
        animalSound(new Dog());
        animalSound(new Cat());
    }
    
    // 매개변수로 다형성 구현
    public static void animalSound(Animal animal) { // Animal animal = new Dog(); or Animal animal = new Cat();
        animal.sound();
    }
}
