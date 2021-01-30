package Homework6;

public class Dog extends Animal{
    private static int count = 0;
    public Dog(){
        super();
        count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public void run(int distance) {
        if(distance > 500) {
            System.out.println("Dog can't run so much");
        }else{
            System.out.println("Dog ran " + distance + ".");
        }

    }

    @Override
    public void swim(int distance) {
        if(distance >= 10) {
            System.out.println("Dog can't swim more than that, sorry");
        }else{
            System.out.println("Dog swam " + distance);
        }
    }
}
