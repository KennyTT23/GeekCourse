package Homework6;

public class Animal {
    private static int count = 0;

    public static int getCount() {
        return count;
    }

    public void run(int distance){
        System.out.println("Animal ran " + distance + ".");
    }

    public void swim(int distance){
        System.out.println("Animal swam " + distance + ".");
    }

}


