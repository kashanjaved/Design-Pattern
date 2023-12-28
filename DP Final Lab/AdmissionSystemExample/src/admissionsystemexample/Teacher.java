/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package admissionsystemexample;

/**
 *
 * @author kasha
 */
public class Teacher implements AdmissionObserver {
    @Override
    public void update() {
        System.out.println("Teacher notified that admission changed.");
    }
}