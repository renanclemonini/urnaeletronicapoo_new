/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.senai.ds1;

import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author aluno
 */
public interface UrnaInterface {
    public void addCandidatoLista(Candidato candidato);
    public void reiniciarVotacao();
    public void setExibicao();
    public void setNumeroCandidato();
    public void setVotoConfirm();
    public void setExibicaoInicial();
    public void showPopMenu(MouseEvent e);
    public void exibirResultados();
    public void setEnter(KeyEvent evt);
}
