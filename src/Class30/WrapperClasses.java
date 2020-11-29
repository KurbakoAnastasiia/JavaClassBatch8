package Class30;

public class WrapperClasses {
    public static void main(String[] args) {
        // we have 8 primitive types and for each primitive type we have a wrapper class

        byte byteNumber = 127; // can store max -128 to 127
        short shortNumbers = 1000; // can store numbers from -32768 up to 32767
        int num = 10; // can store numbers up to 2 billion
        long longNumber = 212648591201057563l;
        float floatNumber = 152032464f;
        double numberWithDecimalPoints = 10.5;
        char characters = 'A';
        boolean Flags = true;

        String name = "Asghar";
        String stringNumber = "10";
        //System.out.println(stringNumber * 2);
        int convertedNumber = Integer.parseInt(stringNumber);
        System.out.println(convertedNumber * 2);
        Byte nonPrimitiveByteNumber = 127; // can store max -128 to 127
        Short nonPrimitiveShortNumbers = 1000; // can store numbers from -32768 up to 32767
        Integer nonPrimitiveNumber = 10; // can store numbers up to 2 billion
        Long nonPrimitiveLongNumber = 212648591201057563l;
        Float nonPrimitiveFloatNumber = 152032464f;
        Double nonPrimitiveNumberWithDecimalPoints = 10.5;
        Character nonPrimitiveCharacters = 'A';
        Boolean nonPrimitiveFlags = true;

        int primitiveInt = 10;
        Integer nonPrimitiveInt = primitiveInt;
        System.out.println(nonPrimitiveInt.doubleValue());
    }
}
