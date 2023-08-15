package strategydesignpattern;

public class Cliente {
	private Compra compra;
	public void setCompra (Compra c) {
		compra = c;
	}
	
	public void fazerCompra(){
		compra.comprar();
	}
}