import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Person {
    private String name;
    private int age;
    List<Address> addresses;

    public Person(String name, int age, List<Address> addresses) {
        this.name = name;
        this.age = age;
        this.addresses = addresses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }
}

class Address {
    private List<String> cities;

    public Address(List<String> cities) {
        this.cities = cities;
    }

    public List<String> getCities() {
        return cities;
    }

    public void setCities(List<String> cities) {
        this.cities = cities;
    }
}

public class Question2Java8FlatMap {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 25, Arrays.asList(new Address(Arrays.asList("New York", "Chicago"))));

        Person person2 = new Person("Bob", 17, Arrays.asList(new Address(Arrays.asList("Los Angeles", "San Francisco"))));

        Person person3 = new Person("Charlie", 35, Arrays.asList(new Address(Arrays.asList("Chicago", "Houston"))));

        List<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);

        persons.stream()
                .filter(p -> p.getAge() >= 18)
                .map(Person::getAddresses)
                .flatMap(addresses -> addresses.stream())
                .map(Address::getCities)
                .flatMap(obj -> obj.stream())
                //.flatMap(address -> address.getCities().stream())
                .distinct()
                .forEach(System.out::println);
    }
}