package Homework6;

public class Cat extends Animal{
    private int count;
    public Cat(){
        count++;
    }

    @Override
    public void run(int distance) {
        int maxRun = 200;
        if(distance > maxRun) {
            System.out.println("Cat can't run so much");
        } else
            super.run(distance);

    }

    @Override
    public void swim(int distance) {
        int maxSwim = 0;
        if(distance > maxSwim) {
            System.out.println("Cat can't swim at all, sorry");
        }else
            super.swim(distance);
    }
}
