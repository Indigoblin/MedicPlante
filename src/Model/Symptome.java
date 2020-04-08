package Model;

import java.util.ArrayList;

public class Symptome {
    private int idSymptome;
    private String nomSymptome;

    public Symptome(int id, String nom){
        this.idSymptome = id;
        this.nomSymptome = nom;
    }

    public int getIdSymptome() {
        return idSymptome;
    }

    public String getNomSymptome() {
        return nomSymptome;
    }

}


