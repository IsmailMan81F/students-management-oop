public class Administration {
    private Student students[] = new Student[500];
    private int index = 0;

    public void addNewStudent(String name, String surname) {
        students[index++] = new Student(name, surname);
    }

    public void addTransferStudent(String name, String surname, double mod1, double mod2, double mod3) {
        students[index++] = new Student(name, surname, mod1, mod2, mod3);
    }

    public void displayAllStudents() {
        System.out.println("All students : ");
        for (int i = 0; i < index; i++) {
            students[i].display();
        }
    }

    public void displayStudentsThreshold(double threshold) {
        System.out.printf("Students with average > %.2f : \n", threshold);
        for (int i = 0; i < index; i++) {
            if (students[i].calculateAverage() > threshold) {
                students[i].display();
            }
        }
    }
}
