package Homework6;

public class Main {
    public static void main(String[] args) {
        /**
         * dog's maxRun 500
         * dog's maxSwim 10
         *
         *
         * cat's maxRun 200
         * cat's maxSwim 0
         * */

        Dog dog = new Dog();
        dog.run(400);
        dog.swim(5);

        System.out.println();

        Cat cat = new Cat();
        cat.run(100);
        cat.swim(0);

        System.out.println(Animal.getCount());
        System.out.println(Cat.getCount());
        System.out.println(Dog.getCount());
    }
}
