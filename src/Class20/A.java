package Class20;

public class A {
    
    /*Write program for multilevel inheritance where class A inherited by B and class B inherit class by C.
    * */
    double retailPrice = 90;
    double lastPrice;
    void print() {
        System.out.println("Class A is base Class");
    }
   /* Write program to inherit class A that has method printF which is static and call or reuse that method into class B*/

    static void printF () {
        System.out.println("Congratulates! It the best price for this product!");
    }
}
