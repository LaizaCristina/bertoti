package model;

public class Produto {
	
	private String nome;
	private int valor;
	
	public Produto(String n, int v){
		nome = n;
		valor = v;
	}
	
	public String getnome(){
		return nome;
	}
	
	public int getvalor(){
		return valor;
	}
	
	public boolean matches(Produto p){
		if(!nome.equals(p.nome)) return false;
		if(valor!=p.valor) return false;
		return true;
	}

}