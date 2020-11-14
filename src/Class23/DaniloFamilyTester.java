package Class23;

public class DaniloFamilyTester {
    public static void main(String[] args) {
       /* DaniloParents child = new Danilo();
        child.sleep();
        child.eat();
        child = new Jelena();
        child.sleep();
        child.eat();
        child = new Milos();
        child.sleep();
        child.eat();

        /*public static void print(DaniloParents[] daniloParents) {
            for (DaniloParents childs : daniloParents) {
                childs.eat();
                childs.sleep();
            }
        }*/

        DaniloParents daniloParents = new DaniloParents();
    /*daniloParents = new Milos();
        ((Milos) daniloParents).run();*/  // can call only explicitly because its narrowing. Common (parent) class dont have the method run
        Danilo danilo = new Danilo();
        Jelena jelena = new Jelena();
        Milos milos = new Milos();
        milos.run();

        DaniloParents[] familyArray = new DaniloParents[3];
        familyArray[0] = new Danilo();
        familyArray[1] = new Jelena();
        familyArray[2] = new Milos();

        //traditional approach
        print(danilo, jelena, milos);
        //advance polymorphism approach
        System.out.println("--------------------------------");
        print(familyArray);

    }
    public static void print(Danilo danilo, Jelena jelena, Milos milos) {
        danilo.eat();
        danilo.sleep();

        jelena.eat();
        jelena.sleep();

        milos.eat();
        milos.sleep();
    }

public static void print(DaniloParents[] daniloParent){
            for (DaniloParents childs : daniloParent) {
                childs.eat();
                childs.sleep();
            }

        }


}
