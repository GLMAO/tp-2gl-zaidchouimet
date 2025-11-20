package com.polytech.tp;

/**
 * Décorateur concret qui ajoute la caractéristique "En anglais" à un cours
 */
public class CoursEnAnglais extends CoursDecorator {

    public CoursEnAnglais(ICours cours) {
        super(cours);
    }

    @Override
    public String getDescription() {
        return coursDecorated.getDescription() + " - En anglais";
    }

    @Override
    public double getDuree() {
        return coursDecorated.getDuree();
    }
}