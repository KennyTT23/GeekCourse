package Homework7;

public class Main {

    public static void main(String[] args) {
        
        Cat[] catList = new Cat[10];
        for (int i = 0; i < catList.length; i++) {
            catList[i] = new Cat(i+1);

        }

        Plate plate = new Plate();
        plate.fillThePlate(20);
        for(Cat cat : catList) {
            cat.eat(plate);
        }

        for(Cat cat : catList){
            System.out.println(cat.isHungry());
        }
    }
}
