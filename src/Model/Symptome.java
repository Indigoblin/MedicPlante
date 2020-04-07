package Model;

import java.util.ArrayList;

public class Symptome {
    private int idSymptome;
    private String nomSymptome;
    private ArrayList<String> motCleSymptome;

    public Symptome(int id, String nom,ArrayList<String> motCle){
        this.idSymptome = id;
        this.nomSymptome = nom;
        this.motCleSymptome = motCle;
    }

    public int getIdSymptome() {
        return idSymptome;
    }

    public String getNomSymptome() {
        return nomSymptome;
    }

    public ArrayList<String> getMotCleSymptome() {
        return motCleSymptome;
    }
}


