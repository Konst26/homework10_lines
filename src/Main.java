public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа");
        System.out.println("Задача 1");
        String firstName = "ivan ";
        String lastName = "ivanov ";
        String middleName = "ivanovich";
        String fullName = lastName + firstName + middleName;
        System.out.println("Ф.И.О. сотрудника - " + fullName);
        System.out.println();
        System.out.println("Задача 2");
        String small = "ivanov ivan ivanovich";
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + small.toUpperCase());
        System.out.println();
        System.out.println("Задача 3");
        String fullName2 = "Иванов Семён Семёнович";
        String replace = fullName2.replace("ё", "e");
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + replace);
    }
}
