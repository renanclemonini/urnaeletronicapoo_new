package br.senai.ds1;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Candidato extends Apuracao{
    
    private String nome;
    private String vice;
    private int numero;
    private String partido;
    private int votos;
    

    public Candidato() {
    }

    public Candidato(String nome, String vice, int numero, String partido) {
        this.nome = nome;
        this.vice = vice;
        this.numero = numero;
        this.partido = partido;
        this.votos = 0;
    }
    
    public Candidato(String nome, int votos){
        this.nome = nome;
        this.votos = votos;
    }
    
    public static List<Candidato> listaVotos = new ArrayList<>();

    public List<Candidato> getListaVotos() {  
        return listaVotos;
    }
    
    public void addCandidatoLista(Candidato candidato){
        listaVotos.add(candidato);
    }
    
    public void resetVotacao(Candidato candidato){
        listaVotos.remove(candidato);
    }
    
    public void setVotos(Candidato candidato){
        this.setVotos(this.getVotos()+1);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getVice() {
        return vice;
    }

    public void setVice(String vice) {
        this.vice = vice;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }
    
    public void resetVotos(){
        this.votos = 0;
    }
    
    public String getResultados(){
        String str = "";
        if(listaVotos.isEmpty()){
            str += "Enésima zerada";
        }else{
            for(int i = 0; i < listaVotos.size(); i++){
                str += "Candidato: "+listaVotos.get(i).nome+" possui "+listaVotos.get(i).votos+" votos válidos.";
            }
        }
        return str;
    }
    
    @Override
    public String toString() {
        return "Candidato{" + " nome: " + nome + " - votos: " + votos + '}';
    }

    @Override
    public String apurar() {
        String res = "";
        int maior = 0;
        for(int i = 0; i < listaVotos.size(); i++){
            if(listaVotos.get(i).votos > maior){
                maior = listaVotos.get(i).votos;
                res = "Candidato "+listaVotos.get(i).nome+" eleito com "+listaVotos.get(i).votos+" válidos!";
            }
        }
        return res;
    }
    
    public void addVotoLista(int numero){
        for(int i = 0; i < listaVotos.size(); i++){
            if(listaVotos.get(i).numero == numero){
                listaVotos.get(i).votos += 1;
                break;
            }
        }
    }
}

