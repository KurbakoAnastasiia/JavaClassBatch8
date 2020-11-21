package ReviewClass06;

public class StringClass {

    public static void main(String[] args) {

        String str = "Danilo";
        String str2=new String("anything !@@345&*");
        System.out.println(str2);

        //returns the number of characters in the String variable including spaces
        System.out.println(str.length());
        System.out.println(str2.length());
        String name = new String("Mina 123 !@#");

        System.out.println(name.length());
        System.out.println(str.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        String newString = str.concat(name);
        System.out.println(newString);
        System.out.println(name + str);

        //always prefer the + to combine two string
        // why because we can get an error some cases when using the concat method
        String var1 = null;String var3 = new String();String var2 = "Burju";
        // System.out.println(var1.concat(var2)); // error null pointer exception
        // System.out.println(var2.concat(var1)); // error null pointer exception

        System.out.println(var1+var2);
        System.out.println(var2+var1);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Anastasiia");
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Anastasiia");
    }
}
