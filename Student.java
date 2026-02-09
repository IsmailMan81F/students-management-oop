
public class Student {

    private String name;
    private String surname;
    private int idNumber;

    private double[] averages = new double[3];

    private static int idNumberBase = 1;

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.idNumber = idNumberBase++;
    }

    public static Student registrationTransfer(String name, String surname, double mod1, double mod2,
            double mod3) {

        Student student = new Student(name, surname);
        student.averages[0] = mod1;
        student.averages[1] = mod2;
        student.averages[2] = mod3;
        return student;

    }

    public double calculateAverage() {
        return (averages[0] + averages[1] + averages[2]) / 3;
    }

    public void display() {
        System.out.printf("Name : %s, Surname : %s, idNumber : %d, Average : %.2f\n", this.name, this.surname,
                this.idNumber, this.calculateAverage());
    }

    public String status() {
        if (calculateAverage() > 18)
            return "excellent";
        else if (calculateAverage() > 16)
            return "very good";
        else if (calculateAverage() > 15)
            return "good";
        else if (calculateAverage() > 12)
            return "admitted";
        else if (calculateAverage() > 10)
            return "retake";
        else
            return "excluded";
    }

}