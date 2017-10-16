package trabfilipe;

import java.util.ArrayList;
import java.util.List;

public class Observable {
    
    private String nome;
    private List<Observador> observadores = new ArrayList<>();
    
    public void addObservador(Observador observador){
        this.observadores.add(observador);
    }

    public void setNome(String nome) {
        this.nome = nome;
        notificarTodos();
    }
    
    private void notificarTodos(){
        for(Observador o:observadores){
            o.notificar();
        }
    }
}
