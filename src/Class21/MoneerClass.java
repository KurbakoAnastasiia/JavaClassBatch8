package Class21;

public class MoneerClass extends ParentClass {
int money;
    MoneerClass(int money) {
        super(money);
       /* super.money = 10;*/
    }
   /* MoneerClass(int money) {
        super(money);
        System.out.println("From child");
    }*/
    void marry() {
        super.marry();
        System.out.println("I will marry Katrina" + super.money);
    }

    public static void main(String[] args) {
        MoneerClass moneerClass = new MoneerClass(25);
        moneerClass.marry();
    }
}
