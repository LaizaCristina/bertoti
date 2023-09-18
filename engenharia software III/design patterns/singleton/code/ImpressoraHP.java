public static class ImpressoraHP {
	private static ImpressoraHP impressoraX;
	private ImpressoraHP(){}
	public void ImpressoraHP getInstance(){
		if(impressoraHP==null){
			impressoraHP = new ImpressoraHP;
		}
		return impressoraHP;
	}

	public imprimir(String documento) {
        // Lógica de impressão aqui.
        System.out.println("Imprimindo: " + documento);
    }
}
