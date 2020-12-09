package ReplTasks;

public class EncapsulationDemo {
    private String empName="John";
    private int empAge=30;

    public String getEmpName() {
        return empName;
    }
    public int getEmpAge() {
        return empAge;
    }
}
class Account {
    private long acc_no;
    private String name;
    private String email;
    double amount;

    public void setAccNo(long acc_no) {
        this.acc_no = acc_no;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void seteMail(String email) {
        this.email = email;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }

    public long getAccNo() {
        return acc_no;
    }
    public String getName() {
        return name;
    }
    public String geteMail() {
        return email;
    }
    public double getAmount() {
        return amount;
    }
}

class Person {
    private String firstname;
    private String lastname;
    private int birthmonth;
    private int birthday;
    private int birthyear;
    private String ssn;

    Person(String firstname, String lastname, int birthmonth, int birthday, int birthyear, String ssn) {

        this.firstname = firstname;
        this.lastname = lastname;
        this.birthmonth = birthmonth;
        this.birthday = birthday;
        this.birthyear = birthyear;
        this.ssn = ssn;
    }
/*Create a public method called formatBirthday,
which will return a String composed of their birthday in mm/dd/yyyy format.
For example, if birthmonth=3, birthday=22, birthyear=2000, it should return the String "3/22/2000"*/
    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getBirthmonth() {
        return birthmonth;
    }

    public int getBirthday() {
        return birthday;
    }

    public int getBirthyear() {
        return birthyear;
    }

    public String getSsn() {
        return ssn;
    }
    public String formatBirthday() {
        String formatBD = birthmonth + "/" + birthday + "/" + birthyear;
        return  formatBD;
    }
}
