package designPattern.builder;

public class BuilderMain {

    public static void main(String[] args) {
        Address address = new Address.Builder()
                .setCity("Krakow")
                .setStreet("Jeeeeeeeaaaa")
                .setNumberOfBuilding(2)
                .setNumberOfFlat(23)
                .setZip("33-332")
                .build();


        User user = new User.Builder()
                .setFirstName("Dawid")
                .setLastName("Ber")
                .setAge(28)
                .setHeight(180)
                .setWeight(87)
                .setAddress(address)
                .build();

        System.out.println(user);
    }
}
