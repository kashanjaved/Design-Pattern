/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FA20-BSE-040
 */
public class ProxyPatternExamDemo {
   
   public static void main(String[] args) {
      // Example using Virtual Proxy
      Exam virtualProxyExam = new VirtualProxyExam();

      // Exam data will be loaded only once
      virtualProxyExam.load();

      // Display results for a specific student
      virtualProxyExam.displayResults("student123");

      // Example using Protected Proxy
      Exam protectedProxyExam = new ProtectedProxyExam("teacher");

      // Exam data will be loaded only once
      protectedProxyExam.load();

      // Display results for all students (teacher's view)
      protectedProxyExam.displayResults("anyStudentId");
   }
}