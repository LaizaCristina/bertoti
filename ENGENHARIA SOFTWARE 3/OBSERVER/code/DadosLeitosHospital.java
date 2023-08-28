import java.util.ArrayList;
import java.util.List;

public class DadosLeitosHospital {
    private List<Observer>:observers;
    private leitosComuns:int
    private leitosVIps:int
    private leitosTotal:int
    
    public DadosLeitosHospital(){
        this.observers = new ArrayList<>();
        this.leitosComuns = int
        this.leitosVIps = int
        this.leitosTotal = int
    }

    public void setLeitos(int comuns, int vips, int total){
        this.leitosComuns = comuns;
        this.leitosVIps = vips;
        this.leitosTotal = total;
        notify(comuns, vips, total);
    }

    
    public void addObserver(Observer observer){
        this.observers.add(observer);
    }
    

    public void notify(int comuns, int vips, int total){
        this.observers.stream().forEach(item -> {
           item.update(comuns, vips, total) ;
        });
    }
    
}