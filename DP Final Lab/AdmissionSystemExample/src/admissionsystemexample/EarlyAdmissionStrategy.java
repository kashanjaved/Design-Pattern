/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package admissionsystemexample;

/**
 *
 * @author kasha
 */
public class EarlyAdmissionStrategy implements AdmissionStrategy {
    @Override
    public void processApplication() {
        System.out.println("Processing application with early admission strategy.");
    }
}