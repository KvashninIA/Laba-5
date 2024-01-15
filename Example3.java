package Lr5;

import java.util.Scanner;

//Напишите программу с классом, у которого есть два целочисленных поля.
//В классе должны быть описаны конструкторы, позволяющие создавать
//объекты без передачи аргументов, с передачей одного аргумента и с передачей
//двух аргументов.
public class Example3 {
    private int firstField;
    private int secondField;

    // ничего
    public Example3() {
        firstField = 0;
        secondField = 0;
    }

    // 1 арг передача
    public Example3(int value) {
        firstField = value;
        secondField = 0;
    }
    // 2 арг передача
    public Example3(int firstValue, int secondValue) {
        firstField = firstValue;
        secondField = secondValue;
    }

    public static void main(String[] args) {
        // меняем ручками
        Example3 object1 = new Example3();
        Example3 object2 = new Example3(5);
        Example3 object3 = new Example3(10, 20);

        // Пример вывода значений созданных объектов
        System.out.println("Значения первого объекта: " + object1.firstField + ", " + object1.secondField);
        System.out.println("Значения второго объекта: " + object2.firstField + ", " + object2.secondField);
        System.out.println("Значения третьего объекта: " + object3.firstField + ", " + object3.secondField);
    }
}
