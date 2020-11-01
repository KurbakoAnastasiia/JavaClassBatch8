package Class16;

public class MainTask {

    public static void main(String[] args) {
        Task1.printLarger(45, 90.7);
        Task1.printLarger(98, -9);
        Task1.printLarger(0, 1);
        Task1.printLarger(45, 45);
        Task1.printLarger(45, 0);

        Task2 task2 = new Task2();
        task2.printNumberoEvenOrOdd(5);
        task2.printNumberoEvenOrOdd(0);
        task2.printNumberoEvenOrOdd(-3);
        task2.printNumberoEvenOrOdd(69);
        task2.printNumberoEvenOrOdd(100);


        Task3 task3 = new Task3();
        task3.isStringPalindrome("aba");
        task3.isStringPalindrome("aladin");
        task3.isStringPalindrome("anna");
        task3.isStringPalindrome("madam");
        task3.isStringPalindrome("abba");

        Task4.sayHello("Russia");
        Task4.sayHello("USA");
        Task4.sayHello("France");
        Task4.sayHello("Spain");
    }
}
