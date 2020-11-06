package Class16;


import javax.sound.midi.Soundbank;

public class MainHW {
    public static void main(String[] args) {
            System.out.println(HW.createEmail("Anastasiia", "Kurbako", "gmail").toLowerCase());

            if(HW.isPrime(2)) {
                System.out.println("It is a prime number");
            } else {
                System.out.println("It is not a prime number");
            }


        System.out.println(Student.getGrade(83));

            HW task2 = new HW();
            boolean prime = task2.primeIs(25);
            boolean prime1 = task2.primeIs(1);
            boolean prime2 = task2.primeIs(10);

        System.out.println("primeIs(25) " + prime);
        System.out.println("primeIs(1) " + prime1);
        System.out.println("primeIs(10) " + prime2);
    }
}
