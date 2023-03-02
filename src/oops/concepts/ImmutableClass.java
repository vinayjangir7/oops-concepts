package oops.concepts;

import com.example.design.patterns.Address;

final class ImmutableClass {
    private final String name;
    private final int age;
    private final Address address;

    public ImmutableClass(String name, int age,Address address){
        this.name = name;
        this.age = age;
        this.address = new Address(address);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return new Address(address);
    }

    public static void main(String[] args) {
        ImmutableClass emp = new ImmutableClass("Adithya", 34, new Address("Home", "Madhapur", "Hyderabad"));
        Address address = emp.getAddress();
        System.out.println(address);
        address.setStreet("Hi-tech City");
        address.setCity("Delhi");
        address.setCountry("India");
        System.out.println(emp.getAddress());
    }
}
