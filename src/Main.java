//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    int clientOS = 1;
    int clientDeviceYear = 2014;
    if (clientOS == 0) {
        if (clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
    } else if (clientOS == 1) {
        if (clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    int year = 1400;
    if (year > 1584) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 00)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    } else {
        System.out.println("Год должен быть больше 1584");
    }
    int deliveryDistance = 50;
    int days = 1;
    if (deliveryDistance > 100) {
        System.out.println("Доставки нет");
    } else {
        if (deliveryDistance > 20) {
            days = days + 1;
        }
        if (deliveryDistance > 60) {
            days = days + 1;
        }
        System.out.println("Потребуется дней: " + days);
    }
    int monthNumber =6;
    if (monthNumber > 12 || monthNumber < 1) {
        System.out.println("Такого месяца не существует");
    } else {
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
        }
    }
}