package Homework7;

public class Cat {

    private int appetite;
    private boolean isHungry = true;

    public Cat(int appetite) {
        if (appetite <= 0) {
            System.out.println("Cat won't eat this food, not enough!");
        } else {
            this.appetite = appetite;
        }
    }
        public void eat (Plate plate){
        if(plate.getFoodAmount() > this.appetite){
                plate.setFoodAmount(plate.getFoodAmount() - this.appetite);
                this.isHungry = false;

            }
        }

        public boolean isHungry(){
        return this.isHungry;
        }

        public void setAppetite ( int appetite){
            this.appetite = appetite;
        }

        public int getAppetite () {
            return appetite;
        }
}
