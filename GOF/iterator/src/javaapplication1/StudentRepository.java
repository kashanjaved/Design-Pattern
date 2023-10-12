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
public class StudentRepository implements Container {
   public Student students[] = {
      new Student("1", "Robert", "Male", "1234567890"),
      new Student("2", "John", "Male", "1234567891"),
      new Student("3", "Julie", "Female", "1234567892"),
      new Student("4", "Lora", "Female", "1234567893")
   };

   @Override
   public Iterator getIterator() {
      return new StudentIterator();
   }

   private class StudentIterator implements Iterator {
      int index;

      @Override
      public boolean hasNext() {
         if(index < students.length){
            return true;
         }
         return false;
      }

      @Override
      public Object next() {
         if(this.hasNext()){
            return students[index++];
         }
         return null;
      }

      @Override
      public boolean hasPrevious() {
         if(index > 0){
            return true;
         }
         return false;
      }

      @Override
      public Object previous() {
         if(this.hasPrevious()){
            return students[--index];
         }
         return null;
      }

      @Override
      public void moveToFirst() {
         index = 0;
      }

      @Override
      public void moveToLast() {
         index = students.length - 1;
      }
   }

   public void printAllStudents() {
      for(Iterator iter = this.getIterator(); iter.hasNext();){
         Student student = (Student)iter.next();
         System.out.println("Student : " + student);
      } 
   }

   public void printStudentsWithNameStartingFrom(String nameStart) {
      for(Iterator iter = this.getIterator(); iter.hasNext();){
         Student student = (Student)iter.next();
         if(student.name.startsWith(nameStart)){
            System.out.println("Student : " + student);
         }
      } 
   }
}
