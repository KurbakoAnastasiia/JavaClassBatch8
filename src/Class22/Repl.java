package Class22;

public class Repl {

    static String mixString(String s1, String s2){
        String mixString = "";
        for(int i = 0; i < s1.length() || i < s2.length(); i++) {
            if(i < s1.length()) {
                mixString += s1.charAt(i);
            } if (i < s2.length()) {
                mixString += s2.charAt(i);
            }
        }
        return mixString;
    }



    //test case below (dont change):
    public static void main(String[] args){
        String firstValue = mixString("12345","abcde");
        System.out.println(firstValue);
        String secondValue = mixString("howdy","hello");
        System.out.println(secondValue);
    }
}
