package day05;

public class JournalMain {
    public static void main(String[] args) {
        Journal j = new Journal();
        System.out.println(j.addStudent("Sanyi"));
        System.out.println(j.addStudent("Sanyi Bacsi"));
        System.out.println(j.getNames().size());
    }

}
