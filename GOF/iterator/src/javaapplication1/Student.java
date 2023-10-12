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
public class Student {
   String regNo;
   String name;
   String gender;
   String phoneNumber;

   public Student(String regNo, String name, String gender, String phoneNumber) {
      this.regNo = regNo;
      this.name = name;
      this.gender = gender;
      this.phoneNumber = phoneNumber;
   }

   @Override
   public String toString() {
      return "Student [regNo=" + regNo + ", name=" + name + ", gender=" + gender + ", phoneNumber=" + phoneNumber + "]";
   }
}