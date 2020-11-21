package Class26;

public class Parent {
        public void access() {
            System.out.println("I am a parent public method");
        }
        protected void access2() {
            System.out.println("I am a parent protected method");
        }
        void access3() {
            System.out.println("I am a parent default method");
        }
        private void access4() {
            System.out.println("I am a parent private method");
        }

    }

class Child extends Parent {
    public void access() {
        System.out.println("I am a child public method");
    }
    protected void access2() {
        System.out.println("I am a child protected method");
    }
    void access3() {
        System.out.println("I am a child default method");
    }
}
class Main1 {
    public static void main(String[] args) {
        Child child = new Child();
        child.access();
        child.access2();
        child.access3();

    }

}