package com.libatique;

public class Person {
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    private String firstName, lastName;
    private int age;

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
