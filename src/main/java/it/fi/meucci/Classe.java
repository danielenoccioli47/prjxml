package it.fi.meucci;

import java.util.ArrayList;

public class Classe {
    int numero;
    String sezione;
    String aula;
    ArrayList<Alunno> alunni = new ArrayList<Alunno>();
    public Classe() {
    }
    
    public Classe(final String aula) {
        this.aula = aula;
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(final int numero) {
        this.numero = numero;
    }
    public String getSezione() {
        return sezione;
    }
    public void setSezione(final String sezione) {
        this.sezione = sezione;
    }
    public String getAula() {
        return aula;
    }
    public void setAula(final String aula) {
        this.aula = aula;
    }
    
    public void addAlunno(final Alunno n){
        alunni.add(n);
    }

    public ArrayList<Alunno> getAlunni() {
        return alunni;
    }
    
}
