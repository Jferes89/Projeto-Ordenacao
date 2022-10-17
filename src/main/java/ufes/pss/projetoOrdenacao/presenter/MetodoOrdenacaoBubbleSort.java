package ufes.pss.projetoOrdenacao.presenter;

import java.util.ArrayList;
import java.util.Collections;
import ufes.pss.projetoOrdenacao.presenter.inteface.Ordenacao;

public class MetodoOrdenacaoBubbleSort implements Ordenacao{

    @Override
    public ArrayList<Double> ordenarCresente(ArrayList<Double> list) {
        if (!list.isEmpty()) {
            Collections.sort(list);
        }
        return list;
    }

    @Override
    public ArrayList<Double> ordenarDecresente(ArrayList<Double> list) {
       return list;
    }

   

  
   
    
}
