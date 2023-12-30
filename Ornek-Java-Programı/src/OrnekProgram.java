public class OrnekProgram {
    public static void main(String[] args) {
        short exampleValue = (short) 70000;

        /* Burada verilen değer 127 den büyük olduğu için çıktı olarak bize 300 değerini veremez.
           Girilen değerin byte çevrilme işlemi şu şekildedir :
           8 bit 256 tane değer alabilir. Yani -128 ila 127 arasında 256 adet sayı vardır.
           exampleValue = (300 - 256)  => 44 cevabı olacaktır.
        */
        System.out.println("Short Değeri : " + exampleValue); //  asd"dasdad"


    }
}
