package inversionDependencyPrinciple;

public class NotificadorEmail implements Notificador{
    @Override
    public void notificar(String mensagem) {
        System.out.println("Chegou um email para você." + mensagem);
    }
}
