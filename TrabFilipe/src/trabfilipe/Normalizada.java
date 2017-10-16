package trabfilipe;

public class Normalizada implements EstadoVenda{
    
    @Override
    public void finalizada() {
        System.out.println("A venda ocorreu normalmente.");
    }

    @Override
    public void emAndamento() {
        System.out.println("A venda ainda esta sendo processada.");
    }
    
}
