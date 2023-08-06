package ru.otus.java.basic.hw;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int inputValue = 1;
        System.out.println("Введите число от 1 до 5.\nДля выхода введите 0.");

        while (inputValue != 0) {
            inputValue = scanner.nextInt();

            switch (inputValue) {
                case (1):
                    greetings();
                    break;
                case (2):
                    checkSign((int)((Math.random() * 40) - 20), (int)((Math.random() * 40) - 20), (int)((Math.random() * 40) - 20));
                    break;
                case (3):
                    selectColor();
                    break;
                case (4):
                    compareNumbers();
                    break;
                case (5):
                    addOrSubtractAndPrint((int)((Math.random() * 40) - 20), (int)(Math.random() * 20), (Math.random() < 0.5));
                    break;
                case(0):
                    break;
                default:
                    System.out.println("Введено некорректное значение \"inputValue\". Повторите ввод:");
                    break;
            }

        }
    }

    public static void greetings(){
        System.out.println("Hello\nWorld\nfrom\nJava");
    }

    public static void checkSign(int a, int b, int c){
        if (a + b + c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void selectColor(){
        int data = 0;
        if (data <= 10) {
            System.out.println("Красный");
        } else if (data > 10 && data <= 20) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers(){
        int a = 1;
        int b = 2;
        System.out.println((a >= b) ? "a >= b" : "a < b");
    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment){
        System.out.println((increment) ? (initValue += delta) : (initValue -= delta));
    }
}
