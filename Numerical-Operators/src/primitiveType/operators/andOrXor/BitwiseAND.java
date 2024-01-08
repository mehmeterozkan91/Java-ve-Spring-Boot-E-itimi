package primitiveType.operators.andOrXor;

public class BitwiseAND {
    public static void main(String[] args) {
//        & (VE Operatörü - Bitwise AND):
//        x & y ifadesi, x ve y'nin her bir bitini AND işlemine tabi tutar.
//        Her iki bit de 1 ise sonuç 1, aksi halde 0 olur.
int a = 5;                              // 0000 0101
int b = 3;                              // 0000 0011
int c = a & b;                          // 0000 0001 (1)
System.out.println("c : "+c);           // c : 1
    }
}
