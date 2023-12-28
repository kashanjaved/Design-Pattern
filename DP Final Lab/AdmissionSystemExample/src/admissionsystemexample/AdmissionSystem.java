/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package admissionsystemexample;

/**
 *
 * @author kasha
 */
import java.util.HashSet;
import java.util.Set;

public class AdmissionSystem {
    private Set<AdmissionObserver> admissionObservers = new HashSet<>();
    private AdmissionStrategy admissionStrategy;

    public void registerObserver(AdmissionObserver observer) {
        admissionObservers.add(observer);
    }

    public void removeObserver(AdmissionObserver observer) {
        admissionObservers.remove(observer);
    }

    public void notifyObservers() {
        for (AdmissionObserver observer : admissionObservers) {
            observer.update();
        }
    }

    public void setAdmissionStrategy(AdmissionStrategy strategy) {
        admissionStrategy = strategy;
    }

    public void processAdmission() {
        notifyObservers();
        if (admissionStrategy != null) {
            admissionStrategy.processApplication();
        }
    }
}