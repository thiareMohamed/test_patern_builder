import beans.PersonBuilderImpl;
import beans.Person;
import beans.PersonBuilder;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        PersonBuilder builder = new PersonBuilderImpl();
        Person employee = builder
                .setFirstName("John")
                .setLastName("Doe")
                .setAge(30)
                .setAddress("456 Main St")
                .setPhoneNumber("555-5678")
                .setEmail("john.doe@example.com")
                .build();

        System.out.println("Bonjour: " + employee.toString());
    }
}