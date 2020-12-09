package ReplTasks;

public class Main {
    public static void main(String[] args) {
        Account newAccount = new Account();
        newAccount.setAccNo(7560504000l);
        newAccount.setName("Sumair");
        newAccount.seteMail("sumair@syntax.com");
        newAccount.setAmount(50000.0);

        System.out.println(newAccount.getAccNo() + " " + newAccount.getName() + " " + newAccount.geteMail() + " " + newAccount.getAmount());

        Person newPerson = new Person("John", "Doe", 10, 25, 1900, "123-45-6789");
        System.out.println(newPerson.getFirstname());
        System.out.println(newPerson.getLastname());
        System.out.println(newPerson.formatBirthday());
        System.out.println(newPerson.getSsn());
    }
}
