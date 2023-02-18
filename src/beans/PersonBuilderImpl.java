package beans;

public class PersonBuilderImpl implements PersonBuilder {
    private String firstName;
    private String lastName;
    private int age;
    private String address;
    private String phoneNumber;
    private String email;

    @Override
    public PersonBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Override
    public PersonBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    @Override
    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    @Override
    public PersonBuilder setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    @Override
    public PersonBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    @Override
    public Person build() {
        Person person = new Person(firstName, lastName, age, address, phoneNumber, email);
        return person;
    }
}
