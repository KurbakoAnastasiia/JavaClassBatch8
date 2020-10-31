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


        String name = "Mohammad ";
        System.out.println(name.indexOf('m'));
        System.out.println(name.indexOf('d'));
        System.out.println(name.indexOf('M'));
        System.out.println(name.indexOf(' '));
        System.out.println(name.indexOf('z'));
    }
}
