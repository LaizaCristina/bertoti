package teste;
import controller.Relatorio;
import view.View;
import model.Produto;
import model.Estoque;


public class Teste {
	
	public static void main(String[] args) {
		
		Estoque e = new Estoque();
		e.addProduto(new Produto("Scrunchie Azul", 9));
		e.addProduto(new Produto("Scrunchie Preta", 10));
		
		View v = new View();
		
		e.registerObserver(v);//ligacao do model para view
		
		Relatorio nfp = new Relatorio();
		
		v.setR(relatorio); //ligacao da view para controler
		
		nfp.setV(v); // ligacao do controler para view
		
		e.buscarProduto(new Produto("Scrunchie Azul", 9));
		
		
		
		
	}

}