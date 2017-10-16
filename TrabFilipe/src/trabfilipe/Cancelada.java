package trabfilipe;

public class Cancelada implements EstadoVenda{
    
    @Override
    public void finalizada() {
        System.out.println("A venda foi cancelada com sucesso.");
    }

    @Override
    public void emAndamento() {
        System.out.println("Venda esta sendo cancelada.");
    }
    
}
