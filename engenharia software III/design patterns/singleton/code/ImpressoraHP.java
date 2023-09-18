public static class ImpressoraHP {
	private static ImpressoraHP impressoraX;
	private ImpressoraHP(){}
	public ImpressoraX getInstance(){
		if(impressoraHP==null){
			impressoraHP = new ImpressoraHP;
		}
		return impressoraHP;
	}

	public void imprimir(String documento) {
        // Lógica de impressão aqui.
        System.out.println("Imprimindo: " + documento);
    }
}