public class Test{
    public static void main(String[] args) throws Exception{
        Compras compras = new Compras();
        Scrunchie esmary = new Scrunchie('MAX',"Cetim","Esmary",10.50);
        FronhaCetim eclipse = new FronhaCetim('U',"Cetim","Eclipse",30.00);

        Compras.addProduto(esmary);
        Compras.addProduto(eclipse);
        Compras.comprarProduto();
    }
}