package operators.andOrXor;

public class BitwiseOR {
    public static void main(String[] args) {
//        | (VEYA Operatörü - Bitwise OR):
//        x | y ifadesi, x ve y'nin her bir bitini OR işlemine tabi tutar.
//        Her iki bit de 0 ise sonuç 0, aksi halde 1 olur.

int a = 5;                              // 0000 0101
int b = 3;                              // 0000 0011
int c = a | b;                          // 0000 0110 (7)
System.out.println("c : "+c);           // c : 7
    }
}
