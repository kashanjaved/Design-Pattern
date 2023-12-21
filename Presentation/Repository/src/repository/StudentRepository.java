/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository;

/**
 *
 * @author Hafiz laptop
 */
public interface StudentRepository
{
    public Student getStudentById (int id);
    public void addStudent(Student s);
    public void updateStudent(Student s);
    public void deleteStudent(int id);
    public boolean exists(int id);
}
