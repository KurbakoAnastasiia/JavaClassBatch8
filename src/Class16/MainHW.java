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


        System.out.println(Student.grade(83));
    }
}
