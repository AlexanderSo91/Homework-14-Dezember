package homework;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    public static void task1() {

        System.out.println("\nЗадача_1");

        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName + " " + " " + middleName + " " + lastName;

        System.out.println("ФИО сотрудника - " + fullName);

    }

    public static void task2() {

        System.out.println("\nЗадача_2");

        String fullName = "Ivanov Ivan Ivanovich";
        String small = "Ivanov Ivan Ivanovich";

        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + small.toUpperCase());

    }

    public static void task3() {

        System.out.println("\nЗадача_3");

        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");

        System.out.println("Данные ФИО сотрудника - " + fullName);

    }
}




