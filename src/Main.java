public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа");
        System.out.println("Задача 1");
        String firstName = "Ivan";
        String lastName = "Ivanov";
        String middleName = "Ivanovich";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф.И.О. сотрудника - " + fullName);
        System.out.println("Задача 2");
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());
        System.out.println("Задача 3");
        String correctedFullName = "Иванов Семён Семёнович";
        String replace = correctedFullName.replace("ё", "e");
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + replace);
    }
}
