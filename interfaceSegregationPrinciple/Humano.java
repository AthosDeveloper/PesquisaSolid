package interfaceSegregationPrinciple;

public class Humano implements Comer, Trabalhador {
    @Override
    public void come() {
        System.out.println("como arroz e feijão.");
    }

    @Override
    public void trabalha() {
        System.out.println("trabalho fazendo códigos");
    }
}
