package Homework6;

public class Dog extends Animal{
    private int count;
    public Dog(){
        count++;
    }

    @Override
    public void run(int distance) {
        int maxRun = 500;
        if(distance > maxRun) {
            System.out.println("Dog can't run so much");
        }else
            super.run(distance);
    }

    @Override
    public void swim(int distance) {
        int maxSwim = 10;
        if(distance >= maxSwim) {
            System.out.println("Dog can't swim more than that, sorry");
        }else
            super.swim(distance);
    }
}
