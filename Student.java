
public class Student {

    private String name;
    private String surname;
    private int idNumber;

    private double mod1;
    private double mod2;
    private double mod3;

    private static int idNumberBase = 1;

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.idNumber = idNumberBase++;
    }

    public static Student registrationTransfer(String name, String surname, double mod1, double mod2,
            double mod3) {

        Student student = new Student(name, surname);
        student.mod1 = mod1;
        student.mod2 = mod2;
        student.mod3 = mod3;
        return student;

    }

    public void mod1(double mark) {
        this.mod1 = mark;
    }

    public void mod2(double mark) {
        this.mod2 = mark;
    }

    public void mod3(double mark) {
        this.mod3 = mark;
    }

    public double calculateAverage() {
        return (mod1 + mod2 + mod3) / 3;
    }

    public void display() {
        System.out.printf("Name : %s, Surname : %s, idNumber : %d, Average : %.2f\n", this.name, this.surname,
                this.idNumber, this.calculateAverage());
    }

}