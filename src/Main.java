public class Main { ;

    public static void main(String[] args) {
        task0();
        task1();
        task2();
        task3();

    }

    public static void task0 () {
        System.out.println("Задача 0");
        String phone = "7 965-518-11-19";
        phone = phone.replace(" ", "");
        phone = phone.replace("-", "");
        phone = phone.replace("+", "");
        if (phone.length() == 10) {
//            phone = '7' + phone;
        } else if (phone.length() > 11) {
            throw new RuntimeException("Телефон слишком длинный");
        } else if (phone.length() < 10) {
            throw new RuntimeException("Телефон слишком короткий");
        } else if (phone.length() == 11 && phone.charAt(0) != '7') {
            throw new RuntimeException("Среди нас посторонний!");
        }
        System.out.println("phone = " + phone);
        String expectedPhone = "79655181119";
        if (phone.equals(expectedPhone)) {
            System.out.println("Успех");
        } else {
            System.out.println("Неудача(");
        }
    }

    public static void task1 () {
        System.out.println("Задача 1");
        String firstName = "Ivan";
        String middleName = "Ivanov";
        String fullName = "Ivanovich";
        fullName = firstName + " " + middleName + " " + fullName;
        System.out.println("ФИО сотрудника - " + fullName);


    }

    public static void task2 () {
        System.out.println("Задача 2");
        String firstName = "ivan";
        String middleName = "ivanov";
        String fullName = "ivanovich";
        fullName = firstName + " " + middleName +  " " + fullName;

        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName.toUpperCase());

    }

    public static void task3 () {
        System.out.println("Задача 3");
        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника - " + fullName);
    }

}
