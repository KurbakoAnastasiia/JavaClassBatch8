package Class14;

public class IndexOfMethod {
    public static void main(String[] args) {
        String Str = new String("Welcome on Board");
        String SubStr1 = new String("Tutorials");
        String SubStr2 = new String("Sutorials");
        System.out.print("Found Index :" );
        System.out.println(Str.indexOf( 'o' ));
        System.out.print("Found Index :" );
        System.out.println( Str.indexOf( SubStr1 ));
        System.out.print("Found Index :" );
        System.out.println(Str.indexOf( SubStr2 ));
    }
}
