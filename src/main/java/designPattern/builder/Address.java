package designPattern.builder;

import java.util.Objects;

public class Address {

    private String city;
    private String street;
    private int numberOfBuilding;
    private int numberOfFlat;
    private String zip;

    public Address() {
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getNumberOfBuilding() {
        return numberOfBuilding;
    }

    public int getNumberOfFlat() {
        return numberOfFlat;
    }

    public String getZip() {
        return zip;
    }

    public Address(Builder builder) {
        this.city = builder.city;
        this.street = builder.street;
        this.numberOfBuilding = builder.numberOfBuilding;
        this.numberOfFlat = builder.numberOfFlat;
        this.zip = builder.zip;
    }

    public static class Builder {
        private String city;
        private String street;
        private int numberOfBuilding;
        private int numberOfFlat;
        private String zip;

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Builder setStreet(String street) {
            this.street = street;
            return this;
        }

        public Builder setNumberOfBuilding(int numberOfBuilding) {
            this.numberOfBuilding = numberOfBuilding;
            return this;
        }

        public Builder setNumberOfFlat(int numberOfFlat) {
            this.numberOfFlat = numberOfFlat;
            return this;
        }

        public Builder setZip(String zip) {
            this.zip = zip;
            return this;
        }

        public Address build() {
            return new Address(this);
        }
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", numberOfBuilding=" + numberOfBuilding +
                ", numberOfFlat=" + numberOfFlat +
                ", zip='" + zip + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return numberOfBuilding == address.numberOfBuilding &&
                numberOfFlat == address.numberOfFlat &&
                Objects.equals(city, address.city) &&
                Objects.equals(street, address.street) &&
                Objects.equals(zip, address.zip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, street, numberOfBuilding, numberOfFlat, zip);
    }
}
