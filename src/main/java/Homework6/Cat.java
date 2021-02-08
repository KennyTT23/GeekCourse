package Homework6;

public class Cat extends Animal{
    private int count;
    public Cat(){
        super();
        count++;
    }

    @Override
    public void run(int distance) {
        if(distance > 200) {
            System.out.println("Cat can't run so much");
        } else{
            System.out.println("Cat ran " + distance + ".");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Cat can't swim at all");
    }
}
