package view;
import java.util.List;
import model.Produto;
import controller.Relatorio;

public class View implements Observer{
	private Relatorio r;
	private List listaProdutos;
	
	public void setN(Relatorio relatorio){
		r = relatorio;
	}
	
	public void update(List l){
		listaProdutos = l;
		r.emitirRelatorio();
		
	}
	
	public void imprimirDadosProdutos(){
		if(!listaProdutos.isEmpty()){
			for(Object i: listaProdutos){
				Produto p = (Produto)i;
				System.out.println(p.getNome()+" "+p.getValor());
			}
		}
	}
	
	public void imprimirRelatorioPortugues(){
		System.out.println("Relatorio em Português");
		System.out.println("ID...");
	}

}