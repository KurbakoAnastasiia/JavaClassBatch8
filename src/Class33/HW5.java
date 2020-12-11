package Class33;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HW5 {
    /*Create a Map that will store Employee name and salary.
    Write a logic to retrieve an employee who gets the highest salary. Output should be in the below format
John Smith=$100000*/
    public static void main(String[] args) {
        Map<String, Integer> employee = new HashMap<>();
        employee.put("John Smith", 100000);
        employee.put("Henry Crust", 67000);
        employee.put("Mike Danstry", 120000);
        employee.put("Jane Woody", 119000);
        employee.put("Kit Dautch", 89000);
        employee.put("Cris Klasten", 62000);

        Map.Entry<String, Integer> largestEntry = null;
        int maxSalary = 0;
        Set<Map.Entry<String, Integer>> employeeSet = employee.entrySet();

        for(Map.Entry<String, Integer> entryEmployee : employeeSet) {
            if(entryEmployee.getValue() > maxSalary) {
                maxSalary = entryEmployee.getValue();
              largestEntry = entryEmployee;
            }
        }
        System.out.println(largestEntry.getKey() + "=$" + largestEntry.getValue());
    }
}
