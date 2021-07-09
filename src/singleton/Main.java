package singleton;

public class Main {

    public static void main(String[] args) {

        School school = School.getInstance();

        System.out.println(school.getName());

        System.out.println(school.getAdress());
    }
}
