/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author fa20-bse-040
 */
public class IteratorPatternDemo {
   
   public static void main(String[] args) {
      StudentRepository studentRepository = new StudentRepository();

      // print all students
      studentRepository.printAllStudents();

      // print students with name starting from "Muhammad"
      studentRepository.printStudentsWithNameStartingFrom("Muhammad");
   }
}
