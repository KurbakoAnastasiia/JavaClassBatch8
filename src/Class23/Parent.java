package Class23;
class Parent {
    void m1() {
        System.out.println("In parent class m1");
    }
}
class Subclass extends Parent {
    void m1() {
        System.out.println("In child class m1");
    }

    void m2() {
        System.out.println("In m2");
    }
}
class TestParent {
    public static void main(String[] args) {
        Parent obj = new Subclass();
        obj.m1();
        ((Subclass) obj).m2();

    }
}
