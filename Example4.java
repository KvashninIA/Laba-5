package Lr5;

//Напишите программу с классом, у которого есть символьное и
//целочисленное поле. В классе должны быть описаны версии конструктора с
//двумя аргументами (целое число и символ – определяют значения полей), а
//также с одним аргументом типа double. В последнем случае действительная
//часть аргумента определяет код символа (значение символьного поля), а
//дробная часть (с учетом десятых и сотых) определяет значение
//целочисленного поля. Например, если аргументом передается число 65.1267,
//то значением символьного поля будет символ ‘A’ с годом 65, а целочисленное
//поле получит значение 12 (в дробной части учитываются только десятые и
//сотые).
public class Example4 {
    private char symbolField;
    private int intField;

    public Example4(int intValue, char charValue) {
        intField = intValue;
        symbolField = charValue;
    }

    public Example4(double doubleValue) {
        int intPart = (int) doubleValue; // целая часть
        int fractionalPart = (int) ((doubleValue - intPart) * 100); // дробная часть .00

        symbolField = (char) intPart;
        intField = fractionalPart;
    }

    public static void main(String[] args) {
        Example4 object1 = new Example4(65, 'A');
        Example4 object2 = new Example4(65.1267);

        // Вывод значений полей для объекта с двумя аргументами
        System.out.println("Значение символьного поля объекта 1: " + object1.symbolField);
        System.out.println("Значение целочисленного поля объекта 1: " + object1.intField);

        // Вывод значений полей для объекта с одним аргументом типа double
        System.out.println("Значение символьного поля объекта 2: " + object2.symbolField);
        System.out.println("Значение целочисленного поля объекта 2: " + object2.intField);
    }
}