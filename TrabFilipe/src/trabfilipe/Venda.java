package trabfilipe;

public class Venda {
    
    private EstadoVenda estado;
    
    public Venda(){
        this.estado = new Normalizada();
    }
    
    public void setEstado(EstadoVenda estado){
        this.estado = estado;
    }
    
    public void finalizada(){
        estado.finalizada();
    }
    
    public void cancelada(){
        estado.emAndamento();
    }
    
}
