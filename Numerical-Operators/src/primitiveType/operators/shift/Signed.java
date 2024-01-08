package primitiveType.operators.shift;

public class Signed {
    public static void main(String[] args) {
// << (Sol Kaydırma Operatörü - Left Shift Operator)
        int number1 = 5;  // 0000 0101 (5)
        int number2 = number1 << 2; // 0001 0100 (20)
        System.out.println("number2 = " + number2); // number2 = 20

// >> (Sağ Kaydırma Operatörü - Right Shift Operator)
        int number3 = -16;  // 1111 0000 (-16)
        int number4 = number3 >> 2; // 1111 1100 (-4)
        System.out.println("number4 = " + number4); // number4 = -4
    }
}
