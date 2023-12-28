/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package admissionsystemexample;

/**
 *
 * @author kasha
 */
public class AdmissionSystemExample {
    public static void main(String[] args) {
       
        AdmissionObserver parent = new Parent();
        AdmissionObserver teacher = new Teacher();

      
        AdmissionStrategy regularStrategy = new RegularAdmissionStrategy();
        AdmissionStrategy earlyStrategy = new EarlyAdmissionStrategy();
        AdmissionStrategy rollingStrategy = new RollingAdmissionStrategy();

    
        AdmissionSystem admissionSystem = new AdmissionSystem();

      
        admissionSystem.registerObserver(parent);
        admissionSystem.registerObserver(teacher);

     
        admissionSystem.setAdmissionStrategy(rollingStrategy);

       
        admissionSystem.processAdmission();
    }
}