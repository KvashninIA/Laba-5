package Lr5;

public class Example6 {
    private int max;
    private int min;

    public Example6() {
        setMinMax(0, 0);
    }

    public void setMinMax(int value1, int value2) {
        max = Math.max(value1, value2);
        min = Math.min(value1, value2);
    }

    public void outValues() {
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
    }

    public static void main(String[] args) {
        Example6 values = new Example6();

        values.setMinMax(10, 5);
        values.outValues();

        values.setMinMax(3, 8);
        values.outValues();

        values.setMinMax(0, 15);
        values.outValues();
    }
}