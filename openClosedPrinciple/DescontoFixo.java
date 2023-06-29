package openClosedPrinciple;

public class DescontoFixo implements  Desconto{
    private double quantia;
    public void descontoFixo(double quantia){
        this.quantia = quantia;
    }

    @Override
    public double aplicar(double preco) {
        return preco - quantia;
    }
}
