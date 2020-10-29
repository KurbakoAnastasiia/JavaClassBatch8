package Class13;

public class SmartPhone1 {
    public static void main(String[] args) {
        SmarPhone anastasiiaPhone = new SmarPhone();
        anastasiiaPhone.brand = "Apple";
        anastasiiaPhone.model = "iPhone 11 Pro";
        anastasiiaPhone.color = "green";
        anastasiiaPhone.memory = 256;

        anastasiiaPhone.text("Hello");
        anastasiiaPhone.call("5671239078");


        SmarPhone elenasPhone = new SmarPhone();
        elenasPhone.brand = "Nokia";
        elenasPhone.model = "3310";
        elenasPhone.color = "balck";
        elenasPhone.memory = 64;
        elenasPhone.call(" 2470987651");
        elenasPhone.text(" I can all");
    }
}
