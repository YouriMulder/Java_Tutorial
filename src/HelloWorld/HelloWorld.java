package HelloWorld;

public class HelloWorld {

    static String randomString = "Hello World";
    static final double PINUM = 3.2345;
    static byte bigByte = 127;


    public static void main(String[] args){
        long bigLong =  929030303L;
        float bigFloat = 3.14F;

        String randomString = "Random";

        char randomChar = 66;

        String byteString = Byte.toString(bigByte);

        System.out.println(randomString);
        System.out.println(PINUM);
        System.out.println(bigByte);

        System.out.println(bigLong);
        System.out.println(bigFloat);

        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);

        System.out.println(randomChar);
        System.out.println(randomString + "String");
        System.out.println(byteString);

        double aDoubleValue = 3.123123412341234;
        int doubleToInt = (int) aDoubleValue;
        System.out.println(doubleToInt);


    }

}