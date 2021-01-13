public class HomeWork {

    //task 1...
    public static void main(String[] args) {

        // task 2...
        byte tiny = 4;
        short small = 205;
        int big = 14324;
        long huge = 1543275772L;

        float  fewAfterDot = 1.5363F;
        double lotsAfterDot = 1.53627272D;

        String name = "George";

        char letter = 'S';

        boolean right = true;

        countNumbers();

        checkTheRange(6,10);

        System.out.println(checkPosOrNeg(23));

        checkPosNeg(5);

        greetNewcomers("John");

        checkTheYear(41);
    }
    // task 3...
    public static float countNumbers(){
        float a = 2.5F;
        float b = 7.3F;
        float c = 9.4F;
        float d = 10.5F;

        return a*(b+(c/d));
    }
    // task 4...
    public static boolean checkTheRange(int a, int b){
        if ((a+b) >= 10 && (a+b) <= 20){
            return true;
        }else{
            return false;
        }
    }
    // task 5...
    public static String checkPosOrNeg(int num){
        if (num >= 0){
            return "Positive";
        }else{
            return "Negative";
        }
    }
    //task 6...
    public static boolean checkPosNeg(int num){
        if (num < 0){
            return true;
        }else{
            return false;
        }
    }
    // task 7...
    public static void greetNewcomers(String name){
        System.out.println("Привет, " + name + "!");
    }
    // task 8...
    public static void checkTheYear(int year){
        if(year % 100 == 0 && year % 400 == 0 ){
            System.out.println("Високосный год.");
        }else if (year % 4 == 0){
            System.out.println("Високосный год.");
        }else {
            System.out.println("Не високосный год.");
        }
    }
}
