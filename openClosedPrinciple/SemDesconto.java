package openClosedPrinciple;

public class SemDesconto implements Desconto{
    @Override
    public double aplicar(double preco) {
        return preco;
    }
}
