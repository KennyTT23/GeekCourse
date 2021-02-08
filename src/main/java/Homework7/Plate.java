package Homework7;

public class Plate {
    private int foodAmount;

    public Plate(int foodAmount){
        this.foodAmount = foodAmount;
    }

    public Plate() {

    }

    public void fillThePlate(double capacity){
        this.foodAmount += capacity;
    }

    public void decreaseFoodAmount(int n){
        foodAmount -= n;
    }

    public void setFoodAmount(int foodAmount) {
        this.foodAmount = foodAmount;
        if(foodAmount < 0){
            System.out.println("You can;t give that amount of food");
        }
    }

    public int getFoodAmount() {
        return foodAmount;
    }
}
