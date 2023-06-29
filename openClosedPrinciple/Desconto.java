package openClosedPrinciple;
//Nesse exemplo, a interface desconto está aberta a extenção (pode ser usada por várias classes) mas fechada a implementação não é preciso modificar sua estrutura.
public interface Desconto {
    double aplicar(double preco);
}
