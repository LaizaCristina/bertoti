package model;
import java.util.List;
import java.util.LinkedList;

import view.Observer;

public class Estoque implements Subject{
	
	private List produtos;
	private List observers;
	
	public Estoque(){
		produtos = new LinkedList();
		observers = new LinkedList();
	}
	
	
	
	public void registerObserver(Observer o){
		observers.add(o);
	}
	
	
	public void notifyObservers(List encontrados){
		for(Object i: observers){
			Observer ob = (Observer)i;
			ob.update(encontrados);
		}
	}
	
	public void addProduto(Produto p){
		produtos.add(p);
	}
	
	public void buscarProduto(Produto p){
		List encontrados = new LinkedList();
		for(Object i: produtos){
			Produto produtoEstoque = (Produto)i;
			if(produtoEstoque.matches(p)) encontrados.add(produtoEstoque);
		}
		notifyObservers(encontrados);
	}

}