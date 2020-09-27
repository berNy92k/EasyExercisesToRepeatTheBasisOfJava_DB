package files.serializable;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializableTest {

    private static final String fileName = "TestSerializableFile";
    private static List<TestObject> testObjectList = null;

    public static void main(String[] args) {
        initArrayList();
        serializableToFile(testObjectList);

        initEmptyArrayList();
        deserializableToObject();
        readArrayListAfterDeSerializable();
    }

    private static void initEmptyArrayList() {
        testObjectList = new ArrayList<>();
    }

    private static void initArrayList() {
        initEmptyArrayList();
        testObjectList.add(new TestObject("Test1", 11));
        testObjectList.add(new TestObject("Test2", 22));
        testObjectList.add(new TestObject("Test3", 33));
    }

    private static void deserializableToObject() {
        File file = new File(fileName);

        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            objectInputStream = new ObjectInputStream(fileInputStream);

            while (true) {
                TestObject testObject = (TestObject) objectInputStream.readObject();
                testObjectList.add(testObject);
            }
        } catch (EOFException e) {
            System.out.println("There is no more data in the file.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            closeInputStreams(fileInputStream, objectInputStream);
        }
    }

    private static void serializableToFile(List<TestObject> testObjectList) {
        File file = new File(fileName);
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);

            for (TestObject testObject : testObjectList) {
                objectOutputStream.writeObject(testObject);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            closeOutputStreams(fileOutputStream, objectOutputStream);
        }
    }

    private static void readArrayListAfterDeSerializable() {
        testObjectList.stream()
                .forEach(System.out::println);
    }

    private static void closeOutputStreams(FileOutputStream fileOutputStream, ObjectOutputStream objectOutputStream) {
        try {
            if (objectOutputStream != null) {
                objectOutputStream.close();
            }
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void closeInputStreams(FileInputStream fileInputStream, ObjectInputStream objectInputStream) {
        try {
            if (objectInputStream != null) {
                objectInputStream.close();
            }
            if (fileInputStream != null) {
                fileInputStream.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
