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
}
