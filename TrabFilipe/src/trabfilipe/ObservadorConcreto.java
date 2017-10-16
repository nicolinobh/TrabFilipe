package trabfilipe;

public class ObservadorConcreto implements Observador{
    
    @Override
    public void notificar() {
        System.out.println("fui notificado");
    }
    
}
