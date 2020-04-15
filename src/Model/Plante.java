package Model;

public class Plante {
    private int idPlante;
    private String nom;
    private String bienfait;
    private String photo;
    private String posologie;
    private String description;
    private String avertissement;

    public Plante(int idPlante, String nom, String bienfait, String photo, String posologie, String description, String avertissement) {
        this.idPlante = idPlante;
        this.nom = nom;
        this.bienfait = bienfait;
        this.photo = photo;
        this.posologie = posologie;
        this.description = description;
        this.avertissement = avertissement;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getBienfait() {
        return bienfait;
    }

    public void setBienfait(String bienfait) {
        this.bienfait = bienfait;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getPosologie() {
        return posologie;
    }

    public void setPosologie(String posologie) {
        this.posologie = posologie;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAvertissement() {
        return avertissement;
    }

    public void setAvertissement(String avertissement) {
        this.avertissement = avertissement;
    }


}
