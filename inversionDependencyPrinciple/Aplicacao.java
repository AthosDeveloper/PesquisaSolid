package inversionDependencyPrinciple;
//A classe aplicação precisa da interface notificador, não de uma interface notificadorEmail ou notificadorSms. Respeita a inversão de dependência porque a aplicação pode inverter para qualquer uma das interface sem auterar o código.
public class Aplicacao {
    private Notificador notificador;
    public Aplicacao(Notificador notificador){
        this.notificador = notificador;
    }
    public void executar(){
        notificador.notificar("aplicação iniciada.");
        //aqui ficaria a implementação
   notificador.notificar("aplicação finalizada");
    }
}
