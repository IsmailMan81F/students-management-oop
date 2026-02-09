
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

    public Student(String name, String surname, double mod1, double mod2,
            double mod3) {
        this.name = name;
        this.surname = surname;
        this.idNumber = idNumberBase++;
        this.averages[0] = mod1;
        this.averages[1] = mod2;
        this.averages[2] = mod3;
    }

    public double calculateAverage() {
        double avg = 0;
        for (int i = 0; i < averages.length; i++) {
            avg += averages[i];
        }
        return avg / 3;
    }

    public void display() {
        System.out.printf("Name : %s, Surname : %s, idNumber : %d, Average : %.2f\n", this.name, this.surname,
                this.idNumber, this.calculateAverage());
    }

    public String status() {

        double avg = calculateAverage();

        if (avg > 18)
            return "excellent";
        else if (avg > 16)
            return "very good";
        else if (avg > 15)
            return "good";
        else if (avg > 12)
            return "admitted";
        else if (avg > 10)
            return "retake";
        else
            return "excluded";
    }

}