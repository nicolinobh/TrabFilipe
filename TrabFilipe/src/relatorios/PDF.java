package relatorios;

public class PDF extends Relatorio{
    
    @Override
    public void exportar() {
        System.out.println("Gerar PDF do relatorio de vendas."); 
    }
    
}
