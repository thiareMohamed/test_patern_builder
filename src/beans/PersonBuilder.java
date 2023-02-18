package beans;

public interface PersonBuilder {
    PersonBuilder setFirstName(String firstName);
    PersonBuilder setLastName(String lastName);
    PersonBuilder setAge(int age);
    PersonBuilder setAddress(String address);
    PersonBuilder setPhoneNumber(String phoneNumber);
    PersonBuilder setEmail(String email);
    Person build();

}
