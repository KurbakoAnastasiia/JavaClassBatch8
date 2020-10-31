package Class14;

public class CharAtMethod {
    public static void main(String[] args) {
        String s = "Strings are immutable";
        char result = s.charAt(8);
        System.out.println(result);

        String jasoor = new String("never");
        char c = jasoor.charAt(1);
        System.out.println(jasoor.charAt(0));
        System.out.println(jasoor.charAt(1));
        System.out.println(jasoor.charAt(2));
    }
}
