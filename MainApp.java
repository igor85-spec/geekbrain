package ru.geekbrains.lesson1;
/*
Created by Igor Bushnev
 */
// Создать переменные типов: byte, short, int, long, float, double, char, boolean
public class MainApp {
    public static void main(String[] args) {
        byte a1 = -5;
        short b1 = 30000;
        int c1 = 500;
        long d1 = 250000L;
        float e1 = 15.67f;
        double f1 = -235.89;
        char j1 = '\u2271';
        boolean k1 = true;
    }

    /* Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
где a, b, c, d – аргументы этого метода, имеющие тип float
*/
    public static float calculate(float a, float b, float c, float d) { //
        return a * (b + (c / d));
    }

    /* Написать метод, принимающий на вход два целых числа и проверяющий,
    что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false
     */
    public static boolean isAmountFrom10to20(int x1, int x2) {
        int c = x1 + x2;
        return (c >= 10 && c <= 20);
    }

    /* Написать метод, которому в качестве параметра передается целое число, метод должен
    напечатать в консоль, положительное ли число передали или отрицательное. Замечание:
    ноль считаем положительным числом
     */
    public static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
        /*Написать метод, которому в качестве
        параметра передается целое число, метод должен вернуть true, если число отрицательное
         */
    }

    public static boolean isChekNumber(int n) {
        return n < 0;
    }

    /*Написать метод, которому в качестве параметра передается строка,
    обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»
     */
    static void printName(String txt) {
        System.out.println("Привет," + txt + "!");
    }
}

