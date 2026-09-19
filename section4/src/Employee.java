public class Employee {

    String firstName;
    String lastName;
    byte age;
    char gender;
   public  static final String EMPLOYER_NAME ="Google";

    public Employee() {
        this("Will", "Smith", (byte) 55, 'M');
        System.out.println("Object is getting created default constructor....");
    }

    public Employee(String firstName, String lastName, byte age, char gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        System.out.println("Object is getting created overloaded constructor....");
    }

    public byte getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }
}
