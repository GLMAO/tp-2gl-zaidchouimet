package com.polytech.tp;

import java.util.ArrayList;
import java.util.List;

public class GestionnaireEmploiDuTemps implements Subject {
    private List<ICours> listeCours = new ArrayList<>();
    private List<Observer> observateurs = new ArrayList<>();

    @Override
    public void attach(Observer o) {
        if (!observateurs.contains(o)) {
            observateurs.add(o);
        }
    }

    @Override
    public void detach(Observer o) {
        observateurs.remove(o);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer o : observateurs) {
            o.update(message);
        }
    }

    public void ajouterCours(ICours cours) {
        this.listeCours.add(cours);
        System.out.println("Nouveau cours ajouté : " + cours.getDescription());
        notifyObservers("Nouveau cours ajouté : " + cours.getDescription());
    }

    public void modifierCours(ICours cours, String message) {
        System.out.println("Cours modifié : " + message);
        notifyObservers("Cours modifié : " + message);
    }

    public void setChangement(String message) {
        notifyObservers(message);
    }

    public List<ICours> getListeCours() {
        return listeCours;
    }
}