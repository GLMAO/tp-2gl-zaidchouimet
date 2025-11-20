package com.polytech.tp;

public class CoursBuilder {
    private String matiere;
    private String enseignant;
    private String salle = "TBD";
    private String date = "TBD";
    private String heureDebut = "TBD";
    private boolean estOptionnel = false;
    private String niveau = "Tous";
    private boolean necessiteProjecteur = false;

    public CoursBuilder setMatiere(String matiere) {
        this.matiere = matiere;
        return this;
    }

    public CoursBuilder setEnseignant(String enseignant) {
        this.enseignant = enseignant;
        return this;
    }

    public CoursBuilder setSalle(String salle) {
        this.salle = salle;
        return this;
    }

    public CoursBuilder setDate(String date) {
        this.date = date;
        return this;
    }

    public CoursBuilder setHeureDebut(String heureDebut) {
        this.heureDebut = heureDebut;
        return this;
    }

    public CoursBuilder setEstOptionnel(boolean estOptionnel) {
        this.estOptionnel = estOptionnel;
        return this;
    }

    public CoursBuilder setNiveau(String niveau) {
        this.niveau = niveau;
        return this;
    }

    public CoursBuilder setNecessiteProjecteur(boolean necessiteProjecteur) {
        this.necessiteProjecteur = necessiteProjecteur;
        return this;
    }

    public Cours build() {
        if (matiere == null || enseignant == null) {
            throw new IllegalArgumentException("Matière et enseignant sont obligatoires");
        }
        return new Cours(matiere, enseignant, salle, date, heureDebut,
                estOptionnel, niveau, necessiteProjecteur);
    }
}