/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repository;

/**
 *
 * @author Hafiz laptop
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Repository
{
    private static StudentRepositoryImpl repo;
    private static BufferedReader br;

    public static void main(String[] args) throws NumberFormatException, IOException
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        int choice = 0;
        repo = new StudentRepositoryImpl();

        while (choice != 9)
        {
            System.out.println();
            System.out.println();
            System.out.println("Choose operation: ");
            System.out.println();
            System.out.println("1. Add New Student");
            System.out.println("2. Retreive Student");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("9. Exit");
            System.out.println();
            System.out.print("Enter choice here: ");
            choice = Integer.parseInt(br.readLine());

            switch (choice)
            {
                case 1: addStudent();       break;
                case 2: retreiveStudent();  break;
                case 3: updateStudent();    break;
                case 4: deleteStudent();    break;
                
                case 9: System.out.println("Bye!"); break;
                default:    System.out.println("Invalid!");
            }
        }
    }
    
    private static void addStudent() throws NumberFormatException, IOException
    {
        int id;
        String name, email;

        System.out.println("Entering student: ");
        System.out.print("Enter id: ");
        id = Integer.parseInt(br.readLine());

        if (repo.exists(id))
        {
            System.out.println("ID Exists! Cannot add student!");
            return;
        }
        else
        {
            System.out.print("Enter name: ");
            name = br.readLine();
            System.out.print("Enter email: ");
            email = br.readLine();
            repo.addStudent(new Student(id, name, email));
        }
    }

    private static void retreiveStudent() throws NumberFormatException, IOException
    {
        int id;

        System.out.println("Retreiving student: ");
        System.out.print("Enter id: ");
        id = Integer.parseInt(br.readLine());

        if (repo.exists(id))
            System.out.println(repo.getStudentById(id).toString());
        else
            System.out.println("Student not found!");
    }

    private static void updateStudent() throws NumberFormatException, IOException
    {
        int id;
        String name, email;

        System.out.println("Entering student: ");
        System.out.print("Enter id: ");
        id = Integer.parseInt(br.readLine());

        if (repo.exists(id))
        {
            System.out.print("Enter name: ");
            name = br.readLine();
            System.out.print("Enter email: ");
            email = br.readLine();

            repo.updateStudent(new Student(id, name, email));
        }
        else
            System.out.println("ID does not exist! Cannot update student!");
    }

    private static void deleteStudent() throws NumberFormatException, IOException
    {
        int id;

        System.out.println("Retreiving student: ");
        System.out.print("Enter id: ");
        id = Integer.parseInt(br.readLine());

        if (repo.exists(id))
            repo.deleteStudent(id);
        else
            System.out.println("Student not found!");
    }
}