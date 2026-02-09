public class Test {
    public static void main(String[] args) {
        Administration administration = new Administration();
        administration.addNewStudent("meguehout", "ismail");
        administration.addNewStudent("ferhat", "abbas");

        administration.addTransferStudent("benaziza", "loukeman", 20, 15, 20);
        administration.addTransferStudent("fortnite", "cal", 0, 18, 15);


        administration.displayStudentsThreshold(10);
    }
}
