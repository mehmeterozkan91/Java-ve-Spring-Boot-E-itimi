package operators.AndOrXor;

public class BitwiseNOT {
    public static void main(String[] args) {
//        ~ (Tersleme Operatörü - Bitwise NOT):
//        ~x ifadesi, x'in her bir bitini tersine çevirir.
//        Yani, 0 ise 1'e, 1 ise 0'a çevirir.
        int a = 5;  // 0000 0101
        int b = ~a; // 1111 1010 (-6)
        System.out.println("b : " + b); // b : -6
    }
}
