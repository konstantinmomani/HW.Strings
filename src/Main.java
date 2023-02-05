public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1() {
        System.out.println("Задача 1");
//        String street = "манежная";
//        String streetTrue = street.replace("м", "М");
//        streetTrue += " площадь";
//        System.out.println("Адрес магазина - " + streetTrue);
//        String phone = "+977 188-16-24";
//        phone = phone.replace("-", "");
//        phone = phone.replace(" ", "");
//        phone = phone.replace("+", "");
//        if (phone.length() == 10) {
//            phone = '7' + phone;
//        } else if (phone.length() > 11) {
//            throw new RuntimeException("Телефон слишком длинный");
//        } else if (phone.length() < 10) {
//            throw new RuntimeException("Телефон слишком короткий");
//        } else if (phone.length() == 11 && phone.charAt(0) != 7) {
//            throw new RuntimeException("Среди нас посторонний!");
//        }
//        System.out.println("phone = " + phone);
//        String expectedPhone = "79771881624";
//        if (phone.equals(expectedPhone)) {
//            System.out.println("Успех!");
//        } else {
//            System.out.println("Неудача!");
//        }
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);
    }
    public static void task2() {
        System.out.println("Задача 2");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        String text = "Данные ФИО сотрудника для заполнения отчёта - ";
        System.out.println(text + fullName.toUpperCase());
    }
    public static void task3() {
        System.out.println("Задача 3");
        String firstName = "Семён";
        String middleName = "Семёнович";
        String lastName = "Иванов";
        String fullName = lastName + " " + firstName + " " + middleName;
        String text = "Данные ФИО сотрудника для заполнения отчёта - ";
        String trueFullName = fullName.replace('ё', 'е');
        System.out.println(trueFullName);
    }
}