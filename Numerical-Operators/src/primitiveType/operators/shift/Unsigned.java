package primitiveType.operators.shift;

public class Unsigned {
    public static void main(String[] args) {
// >>> (Unsigned Right Shift Operator)
        int number5 = -16;  // // 1111 1111 1111 1111 1111 1111 1111 0000
        int number6 = number5 >>> 2; // 0011 1111 1111 1111 1111 1111 1111 1100 (1073741820)
        System.out.println("number6 = " + number6); // number6 = 1073741820
    }
}
