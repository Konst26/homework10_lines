public class Main {
    public static void main(String[] args) {
        System.out.println("задача из урока");
        String phone = "+909-773-0 38-8";
        phone = phone.replace("-","");
        phone = phone.replace(" ", "");
        phone = phone.replace("+", "");
        if (phone.length() == 10) {
//              phone = '7' + phone;
        } else if (phone.length() > 11) {
            throw new RuntimeException("Телефон слишком длинный");
        } else if (phone.length() < 10) {
            throw new RuntimeException("Телефон слишком короткий");
        } else if (phone.length() == 11 && phone.charAt(0) != '7') {
            throw new RuntimeException("Среди нас посторонний!");
        }
        System.out.println("phone = " + phone);
        String expectedPhone = "79097730388";
        if (phone.equals(expectedPhone)) {
            System.out.println("Успех");
        } else {
            System.out.println("Неудача");
        }
        System.out.println("Домашняя работа");
        }
    }