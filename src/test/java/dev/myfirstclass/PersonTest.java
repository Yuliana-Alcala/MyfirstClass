package dev.myfirstclass;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Test;

public class PersonTest {
    private Person person = new Person("María", "Perez", "Z12345T", 2010, "España", 'F');

    @Test
    void testConstructorAndGetters() {
        assertThat(person.getName(), is("María"));
        assertThat(person.getLastName(), is("Perez"));
        assertThat(person.getDni(), is("Z12345T"));
        assertThat(person.getYearOfBirth(), is(2010));
        assertThat(person.getCountryOfBirth(), is("España"));
        assertThat(person.getGender(), is('F'));
    }

    
    @Test
    void testSetters() {
        person = new Person("Luisa", "Gómez", "Y415345Z", 2015, "Colombia", 'F');
        person.setName("Luisa");
        person.setLastName("Gómez");
        person.setDni("Y415345Z");
        person.setYearOfBirth(2015);
        person.setCountryOfBirth("Colombia");
        person.setGender('F');

        assertThat(person.getName(), is("Luisa"));
        assertThat(person.getLastName(), is("Gómez"));
        assertThat(person.getDni(), is("Y415345Z"));
        assertThat(person.getYearOfBirth(), is(2015));
        assertThat(person.getCountryOfBirth(), is("Colombia"));
        assertThat(person.getGender(), is('F'));
    }
    @Test
    void testPrintAtributesPerson() {
        person = new Person("Luisa", "Gómez", "Y415345Z", 2015, "Colombia", 'F');

        String result = person.printAtributesPerson();

        assertThat(result, containsString("First Name: Luisa"));
        assertThat(result, containsString("Last Name: Gómez"));
        assertThat(result, containsString("ID Number: Y415345Z"));
        assertThat(result, containsString("Birth Year: 2015"));
        assertThat(result, containsString("Birth Country: Colombia"));
        assertThat(result, containsString("Gender: F"));

    }
}
