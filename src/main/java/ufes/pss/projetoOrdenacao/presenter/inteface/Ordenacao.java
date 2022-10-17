/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ufes.pss.projetoOrdenacao.presenter.inteface;

import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author itix
 */
public interface Ordenacao {
 
    public ArrayList<Double> ordenarCresente(ArrayList<Double> list);
    public ArrayList<Double> ordenarDecresente(ArrayList<Double> list);
    
}
