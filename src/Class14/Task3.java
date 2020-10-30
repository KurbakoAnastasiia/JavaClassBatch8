package Class14;

public class Task3 {
    public static void main(String[] args) {
        String str = "Anastasiia8390";
        int middle;

        if (!str.isEmpty()) {
            if(str.contains("3") && str.length() >= 3) {
                middle = str.length() / 2;
                System.out.println(middle);
            }
        }
    }
}
