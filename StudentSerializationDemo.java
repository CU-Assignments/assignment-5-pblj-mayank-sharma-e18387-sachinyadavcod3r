import java.io.*;

public class StudentSerializationDemo {
    public static void main(String[] args) {
        Student student = new Student(101, "John Doe", 3.8);

        // Serialization
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.ser"))) {
            out.writeObject(student);
            System.out.println("Student details saved successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialization
        System.out.println("\nReading from file...");
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.ser"))) {
            Student deserializedStudent = (Student) in.readObject();
            System.out.println("Student ID: " + deserializedStudent.getId());
            System.out.println("Student Name: " + deserializedStudent.getName());
            System.out.println("Student GPA: " + deserializedStudent.getGpa());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
