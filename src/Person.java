public class Person {
    public static void main(String[] args) {
        Person person = new Person("Hello", "World", 0);
//        person.setFirstName("Hello");
//        person.setLastName("World");
        person.setAge(2);
        System.out.println(person.getFullName());
        System.out.println(person.isTeen());
    }

    private String firstName, lastName;
    private int age;

    // Test constructor, figuring out stuff
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getAge() { return age; }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = (age < 0 || age > 100) ? 0 : age;
    }

    public boolean isTeen () {
        return (this.age > 12 && this.age <20);
    }

    public String getFullName () {
        if (this.firstName.isEmpty() || this.lastName.isEmpty()){
            System.out.println("Entered if block");
            return this.firstName.isEmpty() ? this.lastName : this.firstName;
        }

        return (this.firstName + " " + this.lastName);
    }
}