package Class27and28;
interface Outputs {
    void display(double result);
}

interface Functions extends Outputs {
    double labelAdding(double firstNumber, double secondNumber);
    double labelSubtracting(double firstNumber, double secondNumber);
    double labelMultiply(double firstNumber, double secondNumber);
    double labelDividing(double firstNumber, double secondNumber);
}

class Main implements Functions {


    public void display(double result) {
        System.out.println("Result is ::: " + result);
    }
    public double labelAdding(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }
    public double labelSubtracting(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }
    public double labelMultiply(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }
    public double labelDividing(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }

    public static void main(String[] args) {
        double firstNumber = 100;
        double secondNumber = 20;
        Main obj = new Main();
        obj.display(obj.labelAdding(firstNumber, secondNumber));
        obj.display(obj.labelSubtracting(firstNumber, secondNumber));
        obj.display(obj.labelMultiply(firstNumber, secondNumber));
        obj.display(obj.labelDividing(firstNumber, secondNumber));

    }
}