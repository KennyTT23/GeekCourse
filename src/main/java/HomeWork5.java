public class HomeWork5 {

    public static void main(String[] args) {
        doStaffArray();

    }

    public static void doStaffArray() {
        StaffWorker[] staffArray = new StaffWorker[5];

        staffArray[0] = new StaffWorker("Bogach Sergey", "Judge", "justletmeknow@bk.ru",
                "89995143945", 300000, 25);
        staffArray[1] = new StaffWorker("YaZHMat Jessy", "Housewife", "im_always_right@bk.ru",
                "89153335500", 40000, 32);
        staffArray[2] = new StaffWorker("Ivan Ivanovich", "Gardener", "flowers&crops@bk.ru",
                "89312043274", 75000, 70);
        staffArray[3] = new StaffWorker("Hannibal Lektor", "Psychologist", "soul_and_feeling@bk.ru",
                "893130020050", 400000, 46);
        staffArray[4] = new StaffWorker("Johny ThreeFingers", "Cook", "no_more_failure@bk.ru",
                "89854308561", 20000, 24);

        int maxAge = 40;
        for (int i = 0; i < staffArray.length; i++) {
            if (staffArray[i].getAge() >= maxAge) {
                staffArray[i].printStaffWorkerInfo();
            }
        }
    }
}
