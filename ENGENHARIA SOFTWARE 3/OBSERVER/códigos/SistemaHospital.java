public class SistemaHospital implements Observer {
    public void update(int leitosComuns, int leitosVIPs, int leitosTotal);
    display(int leitosComuns, int leitosVIPs, int leitosTotal);
}

public void display(int comuns, int vips, int total){
    System.out.println("Total de leitos do Hospital: " + total);
    System.out.println("Leitos Comuns ocupados: " + comuns);
    System.out.println("Leitos VIPs ocupados: " + vips);
}