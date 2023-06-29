package inversionDependencyPrinciple;

public class NotificadorSms implements Notificador{
    @Override
    public void notificar(String mensagem) {
        System.out.println("chegou uma mensagem." + mensagem);
    }
}
