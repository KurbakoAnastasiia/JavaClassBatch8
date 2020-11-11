package Class21;

import java.sql.SQLOutput;

public class ParentClass {
int money;
    ParentClass(int money){
        this.money = money;
        System.out.println("From parent");
    }
    void marry() {
        System.out.println("We have selected Lisa Clashnova " + this.money);
    }
}
