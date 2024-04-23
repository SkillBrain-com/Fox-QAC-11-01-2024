package utils;

import com.github.javafaker.Faker;

public class DataGeneration {
    private static DataGeneration instance;
    Faker faker = new Faker();

    public String fisrtName;
    public String lastName;
    public String dateOfBirth;
    public String address;
    public String postCode;
    public String city;
    public String state;
    public String country;
    public String phone;
    public String email;
    public String password;

    public DataGeneration() {
        fisrtName = faker.name().firstName();
        lastName = faker.name().lastName();
        dateOfBirth = "02121994";
        address = faker.address().streetAddress();
        postCode = faker.address().zipCode();
        city = faker.address().city();
        state = faker.address().state();
        country = faker.address().country();
        phone = faker.number().digits(10);
        email = fisrtName + "." + lastName + "@mailinator.com";
        password = "Testington1994*";
    }

    public static DataGeneration getInstance(){
        if(instance == null){
            instance = new DataGeneration();
        }
        return instance;
    }
}
