package designPattern.builder;

import java.util.Objects;

public class User {

    private String firstName;
    private String lastName;
    private int age;
    private int height;
    private double weight;
    private int pesel;
    private Address address;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public int getPesel() {
        return pesel;
    }

    public Address getAddress() {
        return address;
    }

    public User(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.height = builder.height;
        this.weight = builder.weight;
        this.pesel = builder.pesel;
        this.address = builder.address;
    }

    public static class Builder {
        private String firstName;
        private String lastName;
        private int age;
        private int height;
        private double weight;
        private int pesel;
        private Address address;

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setHeight(int height) {
            this.height = height;
            return this;
        }

        public Builder setWeight(double weight) {
            this.weight = weight;
            return this;
        }

        public Builder setPesel(int pesel) {
            this.pesel = pesel;
            return this;
        }

        public Builder setAddress(Address address) {
            this.address = address;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", pesel=" + pesel +
                ", address=" + address +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                height == user.height &&
                Double.compare(user.weight, weight) == 0 &&
                pesel == user.pesel &&
                Objects.equals(firstName, user.firstName) &&
                Objects.equals(lastName, user.lastName) &&
                Objects.equals(address, user.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, height, weight, pesel, address);
    }
}
