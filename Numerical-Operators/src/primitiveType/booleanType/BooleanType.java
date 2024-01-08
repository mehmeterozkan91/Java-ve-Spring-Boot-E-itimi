package primitiveType.booleanType;

public class BooleanType {
    static boolean isEven(int number) {
        return (number % 2 == 0);
    }

    public static void main(String[] args) {
        boolean isJavaFun = true;

        if (isJavaFun) {
            System.out.println("Java is fun!");
        } else {
            System.out.println("Java is not fun.");
        }

        boolean isSunny = true;
        boolean isWarm = true;

        if (isSunny && isWarm) {  // true ve true ise koşul sağlanıyor demektir.
            System.out.println("It's a sunny and warm day!");
        }

        System.out.println(isEven(10));  // true
        System.out.println(isEven(7));   // false


    }
}
