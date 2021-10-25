package day01;

public class School {
    public static void main(String[] args) {
        Students students = new Students();

        students.addHeight(161);
        students.addHeight(162);
        students.addHeight(163);


        System.out.println(students.isHeightIncreasing());
    }
}
