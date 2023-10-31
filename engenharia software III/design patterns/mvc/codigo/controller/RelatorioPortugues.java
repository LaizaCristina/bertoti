package controller;

import model.Estoque;
import view.View;

public class RelatorioPortugues implements Relatorio{
	
	private View v;
	private Estoque e;
	
	public void setV(View view){
		v = view;
	}
	
	public void emitirNota(){
		v.imprimirDadosProduto();
        v.imprimirRelatorioPortugues();

	}

}