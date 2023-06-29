package interfaceSegregationPrinciple;
//Nesse caso, um humano implementa ambas as interfaces por que ele come e trabalha, mas o robô não come e por tanto não precisa implementar essa interface. Não é preciso usar métodos ou interface sem necessidade.
public class Robo implements Trabalhador{
    @Override
    public void trabalha() {
        System.out.println("trabalha realizando tarefas.");
    }
}
