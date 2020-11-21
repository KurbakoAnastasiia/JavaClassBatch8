package Class26;

class Main {
    public void sub (int a, int b) {

        System.out.println(a - b);
    }
    public void sub (int a, int b, int c) {
        System.out.println(a - b - c);
    }
    public void sub (int a, int b, int c, int d) {
        System.out.println(a - b - c - d);
    }


    public static void main(String[] args) {
        Main obj = new Main();

        obj.sub(100, 20, 10, 30);
        obj.sub(100, 50, 20);
        obj.sub(100, 80);
    }
}
