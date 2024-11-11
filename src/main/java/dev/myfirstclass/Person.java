package dev.myfirstclass;

public class Person {

    private String name;
    private String lastName;
    private String dni;
    private int yearOfBirth;
    private String countryOfBirth;
    private char gender;
    


    public Person(String name, String lastName, String dni, int yearOfBirth, String countryOfBirth, char gender) {
        this.name = name;
        this.lastName = lastName;
        this.dni = dni;
        this.yearOfBirth = yearOfBirth;
        this.countryOfBirth = countryOfBirth;
        this.gender = gender;
    }
   /*
    public void printAtributesPerson() {
        System.out.println("First Name: " + name);
        System.out.println("Last Name: " + lastName);
        System.out.println("ID Number: " + dni);
        System.out.println("Birth Year: " + yearOfBirth);
        System.out.println("Birth Country: " + countryOfBirth);
        System.out.println("Gender: " + gender +"\n");
    }*/

    public String printAtributesPerson() {
        String details = "First Name: " + name + "\n" +
                         "Last Name: " + lastName + "\n" +
                         "ID Number: " + dni + "\n" +
                         "Birth Year: " + yearOfBirth + "\n" +
                         "Birth Country: " + countryOfBirth + "\n" +
                         "Gender: " + gender + "\n";

        
        System.out.println(details);
        
        
        return details;
    }
    
    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDni() {
        return dni;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getCountryOfBirth() {
        return countryOfBirth;
    }

    public char getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setCountryOfBirth(String countryOfBirth) {
        this.countryOfBirth = countryOfBirth;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
