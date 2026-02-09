public class Test {
    public static void main(String[] args) {
        Administration administration = new Administration();
        administration.addNewStudent("fegorah", "epson");
        administration.addNewStudent("ferhat", "abbas");

        administration.addTransferStudent("rocket", "super", 20, 15, 20);
        administration.addTransferStudent("fortnite", "cal", 0, 18, 15);


        administration.displayStudentsThreshold(10);
    }
}
