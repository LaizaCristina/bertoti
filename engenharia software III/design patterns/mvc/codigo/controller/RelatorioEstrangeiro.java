package controller;

import model.Estoque;
import view.View;

public class RelatorioEstrangeiro implements Relatorio{

	private View v;
	private Estoque e;
	
	public void setV(View view){
		v = view;
	}
	
	public void emitirRelatorio(){
		v.imprimirDadosProduto();
		v.imprimirRelatorioEstrangeiro();
	}
	
}