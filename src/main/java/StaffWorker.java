class StaffWorker {

    private String name;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public int getAge(){
        return age;
    }

    public StaffWorker (String name, String position, String email,
                        String phoneNumber, int salary, int age){
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;

    }

    public void printStaffWorkerInfo(){
        System.out.println("Staff name is " + this.name + ". " + "Position: " + this.position + ". " +
                "Email address is " + this.email + ". " + "Phone number is " + this.phoneNumber + ". " +
                "Salary: " + this.salary + ". " + "Age: " + this.age + ".");
    }
}
