package operators.multiplicative;

public class Division {
    public static void main(String[] args) {
        int number1 = 8;
        int number2 = 4;
        int result1 = number1 / number2;
        System.out.println("number1 / number2 = " + result1); // number1 / number2 = 2

        long longNumber1 = 4L;
        long longNumber2 = 12L;
        long result2 = longNumber1 / longNumber2;
        System.out.println("longNumber1 / longNumber2 = " + result2);

        float floatNumber1 = 5f;
        float floatNumber2 = 3f;
        float result3 = floatNumber1 / floatNumber2;
        System.out.println("floatNumber1 / floatNumber2 =" + result3);
    }
}
