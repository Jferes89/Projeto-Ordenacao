package ufes.pss.projetoOrdenacao.presenter;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import ufes.pss.projetoOrdenacao.view.OrdenacaoView;

public class BuscarSalariosPresente {
    private OrdenacaoView view;
    private String arq = "teste.txt";

    
    public OrdenacaoView getView() {
        return view;
    }

    public void setView(OrdenacaoView view) {
        this.view = view;
    }

    public String getArq() {
        return arq;
    }

    public void setArq(String arq) {
        this.arq = arq;
    }
    
    public BuscarSalariosPresente() {
        this.view = new OrdenacaoView();
        view.getBtnCarregarArquivo().addActionListener((ActionEvent ae) -> {
            this.busca();
        });
    }

    public ArrayList<Double> busca() {
        Arquivo arq = new Arquivo();
        ArrayList<Double> list = Arquivo.Read(this.getArq());
        if (!list.isEmpty()) {
            return list;
        }
        return new ArrayList<Double>();
    }

}
