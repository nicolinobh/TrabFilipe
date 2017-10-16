package relatorios;

import processadores.Processador;

public abstract class Relatorio {
    
    private Processador processador;
    
    public void setProcessador(Processador processador){
        this.processador = processador;
    }
    
    public void gerarRelatorio(){
        
        buscar();
        calcular();
        exportar();
        processar();
        
    }
    
    private void buscar(){
        System.out.println("buscando ...");
    }
    
    private void calcular(){
        System.out.println("calculando ...");
    }
    
    protected abstract void exportar();
    
    public void processar(){
        processador.processar();
    }
}
