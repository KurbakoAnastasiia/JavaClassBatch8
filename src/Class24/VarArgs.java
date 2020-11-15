package Class24;

public class VarArgs {

    void print(int ... a) { // int ... a it s the same as an array but different way to declare. Its 100% similar to the array.
        for (int numberInArray:a
             ) {
            System.out.println(numberInArray);
        }
    }

    public static void main(String[] args) {
        VarArgs varArgs = new VarArgs();
        varArgs.print(1);
        varArgs.print(1, 2);
        varArgs.print(1, 50, 98);
    }
}
