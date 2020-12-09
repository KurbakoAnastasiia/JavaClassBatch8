package Class31;

import java.util.ArrayList;
import java.util.Iterator;

public class InsuranceTester {
    public static void main(String[] args) {
       Insurance obj1 = new Pet("Healthy Paw Pet", "Cat");
       Insurance obj2 = new Car("Geico", "BMW");
       Insurance obj3 = new Health("Fidelis");
        ArrayList<Insurance> objects = new ArrayList<>();
        objects.add(obj1);
        objects.add(obj2);
        objects.add(obj3);

        for (int i = 0; i < objects.size(); i++) {
           objects.get(i).getQuote();
           objects.get(i).cancelInsurance();
        }
        for (Insurance obj : objects) {
            obj.getQuote();
            obj.cancelInsurance();
        }
        Iterator<Insurance> iterator = objects.iterator();
        while (iterator.hasNext()) {
            Insurance insurance = iterator.next();
            insurance.getQuote();
            insurance.cancelInsurance();
        }

    }
}