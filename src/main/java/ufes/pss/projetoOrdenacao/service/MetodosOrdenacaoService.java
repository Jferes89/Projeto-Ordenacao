package ufes.pss.projetoOrdenacao.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import ufes.pss.projetoOrdenacao.presenter.MetodoOrdenacaoBubbleSort;
import ufes.pss.projetoOrdenacao.presenter.inteface.Ordenacao;

public class MetodosOrdenacaoService {

    private HashMap<String, Ordenacao> listMetodosOrdenacao;
    private MetodoOrdenacaoBubbleSort metodoOrdenacaoBubbleSort;

    public MetodosOrdenacaoService() {
        this.listMetodosOrdenacao = new HashMap<String, Ordenacao>();
    }

    public void addMetodosOrdenacao(String nameMetodo, Ordenacao metodoOrdenacao) {
        this.listMetodosOrdenacao.put(nameMetodo, metodoOrdenacao);
    }

    public HashMap<String, Ordenacao> getListMetodosOrdencao() {
        return this.listMetodosOrdenacao;
    }

    public ArrayList<Double> ordenarCrescente(String nameMetodo, HashMap<String, Ordenacao> listMetodosOrdenacao, ArrayList<Double> listSalarios ) {
        for (Map.Entry<String, Ordenacao> entrada : listMetodosOrdenacao.entrySet()) {
            if (entrada.getKey().equals(nameMetodo)) {
                return entrada.getValue().ordenarCresente(listSalarios);
            }
        }
        return new ArrayList<Double>();
    }

    public ArrayList<Double> ordenarDecresvente(String nameMetodo, HashMap<String, Ordenacao> listMetodosOrdenacao,ArrayList<Double> listSalarios ) {
        for (Map.Entry<String, Ordenacao> entrada : listMetodosOrdenacao.entrySet()) {
            if (entrada.getKey().equals(nameMetodo)) {
                return entrada.getValue().ordenarDecresente(listSalarios);
            }
        }
        return new ArrayList<Double>();
    }
}
