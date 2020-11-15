package Class24;

class X
{
    void calculate(int a, int b)
    {
        System.out.println("Class X");
    }
}

class Y extends X
{
    @Override
    void calculate(int a, int b)
    {
        System.out.println("Class Y");
    }
}

class Z extends Y
{
    @Override
    void calculate(int a, int b)
    {
        System.out.println("Class Z");
    }
}

class MainClass
{
    public static void main(String[] args)
    {
        X x = new Y(); // create new object of type y and as X is a parent of Y so we can store y into a box of tupe X

        x.calculate(10, 20);

        Y y = (Y) x; // re-store the same object to another box y

        y.calculate(50, 100);


    /*    Z z = (Z) y; // can not store


        z.calculate(100, 200);*/
    }
}

