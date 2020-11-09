package Class18;

public class Main {

    String censorLetter(String s, char ch) {
        return s.replace(ch, '*');
    }
    public static void main(String[] args) {
        Main mm = new Main();
        System.out.println(mm.censorLetter("computer science", 'e'));
    }
}
