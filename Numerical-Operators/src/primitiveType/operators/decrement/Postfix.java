package primitiveType.operators.decrement;

public class Postfix {
    public static void main(String[] args) {
        int number1 = 8;
        int number2 = number1--;
        System.out.println("number2 = " + number2); // number2 = 8

        long longNumber1 = 4L;
        long longNumber2 = longNumber1--;
        System.out.println("longNumber2 = " + longNumber2);

        float floatNumber1 = 5f;
        float floatNumber2 = floatNumber1--;
        System.out.println("floatNumber2 = " + floatNumber2);
    }
}
