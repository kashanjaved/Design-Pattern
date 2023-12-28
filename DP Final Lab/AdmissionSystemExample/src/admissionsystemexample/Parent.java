/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package admissionsystemexample;

/**
 *
 * @author kasha
 */
public class Parent implements AdmissionObserver {
    @Override
    public void update() {
        System.out.println("Parent is notified that admission changed.");
    }
}