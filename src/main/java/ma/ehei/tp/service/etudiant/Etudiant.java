package ma.ehei.tp.service.etudiant;

import org.springframework.stereotype.Component;

@Component
public class Etudiant {
    private int Id;
    private String nom;
    private String prenom;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
