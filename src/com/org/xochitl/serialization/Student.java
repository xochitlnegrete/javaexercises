package com.org.xochitl.serialization;

import java.io.*;

public class Student implements Serializable {

    public String nameStudent;
    transient String addressStudent;
    public int id_student;

    public static void main(String[] args) {
        Student student = new Student();
        student.nameStudent = "Xochitl Negrete";
        student.addressStudent = "Address 123";
        student.id_student = 1;

        Student student1 = new Student();
        try {
            FileOutputStream fileOut = new FileOutputStream("storeObject.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(student);
            out.close();
            fileOut.close();

            // Serialization complete
            System.out.println("Object serialized");

            FileInputStream fileIn = new FileInputStream("storeObject.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);

            // Deserialization in process.
            student1 = (Student) in.readObject();

            // Close input stream and the file.
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (Exception e) {
            System.out.println("Class not found");
            e.printStackTrace();
            return;
        }
        // Print the values of deserialized object.
        System.out.println("Deserialized Student...");
        System.out.println("Name: " + student1.nameStudent);
        System.out.println("Address: " + student1.addressStudent);
    }
}
