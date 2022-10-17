
package ufes.pss.projetoOrdenacao.presenter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;
import ufes.pss.projetoOrdenacao.presenter.inteface.Ordenacao;
import ufes.pss.projetoOrdenacao.service.MetodosOrdenacaoService;

public class MetodosOrdenacaoPresente {
   private MetodosOrdenacaoService mos;
   

    public MetodosOrdenacaoPresente() {
        this.mos = new MetodosOrdenacaoService();
        MetodoOrdenacaoBubbleSort mbs = new MetodoOrdenacaoBubbleSort(); 
        MetodoOrdenacaoSelectionSor mos = new MetodoOrdenacaoSelectionSor();
       
        this.mos.addMetodosOrdenacao("Método BubbleSort", mbs);
        this.mos.addMetodosOrdenacao("Método Sort", mos);
  
    }

    public HashMap<String, Ordenacao> getListMetodosOrdencao(){
        return this.mos.getListMetodosOrdencao();
    }

    public ArrayList<Double> ordenarCresente(String nameMetodo,HashMap<String, Ordenacao> listMetodosOrdenacao, ArrayList<Double> listSalarios ) {
       return this.mos.ordenarCrescente(nameMetodo, listMetodosOrdenacao,listSalarios);
    }
    
    public ArrayList<Double>  ordenarDecresente(String nameMetodo,HashMap<String, Ordenacao> listMetodosOrdenacao, ArrayList<Double> listSalarios) {
       return this.mos.ordenarDecresvente(nameMetodo, listMetodosOrdenacao,listSalarios);
    }
}
