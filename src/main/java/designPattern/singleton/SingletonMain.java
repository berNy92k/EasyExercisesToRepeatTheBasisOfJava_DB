package designPattern.singleton;

public class SingletonMain {

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        singleton1.setName("test1");

        System.out.println(singleton1);
        System.out.println(singleton1.getName());

        System.out.println("----------------");

        Singleton singleton2 = Singleton.getInstance();
        singleton2.setName("test1");

        System.out.println(singleton2);
        System.out.println(singleton2.getName());
    }

}
