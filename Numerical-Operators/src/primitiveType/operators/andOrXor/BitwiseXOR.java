package primitiveType.operators.andOrXor;

public class BitwiseXOR {
    public static void main(String[] args) {
//        ^ (XOR Operatörü - Bitwise XOR):
//        x ^ y ifadesi, x ve y'nin her bir bitini XOR işlemine tabi tutar.
//        Her iki bit de farklı ise sonuç 1, aynı ise 0 olur.
int a = 5;                              // 0000 0101
int b = 3;                              // 0000 0011
int c = a ^ b;                          // 0000 0110 (6)
System.out.println("c : "+c);           // c : 6
    }
}
