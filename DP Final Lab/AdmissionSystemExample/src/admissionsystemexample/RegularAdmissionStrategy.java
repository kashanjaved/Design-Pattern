/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package admissionsystemexample;

/**
 *
 * @author kasha
 */
public class RegularAdmissionStrategy implements AdmissionStrategy {
    @Override
    public void processApplication() {
        System.out.println("Processing application with regular admission strategy.");
    }
}