package com.polytech.tp;

public class CoursEnLigne extends CoursDecorator {
    private double dureeSupplementaire;

    public CoursEnLigne(ICours cours) {
        super(cours);
        this.dureeSupplementaire = 0.5; // 30 minutes supplémentaires
    }

    @Override
    public String getDescription() {
        return coursDecorated.getDescription() + " - En ligne";
    }

    @Override
    public double getDuree() {
        return coursDecorated.getDuree() + dureeSupplementaire;
    }
}