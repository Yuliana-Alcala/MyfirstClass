package dev.myfirstclass;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        
        Person person1 = new Person("María", "Perez","Z12345T",2010,"España",'M');

        Person person2 = new Person("Carlos", "Gómez","Y415345Z",2015,"Colombia",'H');

        person1.printAtributesPerson();
        person2.printAtributesPerson();
        
    }
}
