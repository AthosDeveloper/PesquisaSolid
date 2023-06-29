package openClosedPrinciple;

public class PorcentagemDesconto implements Desconto{
    private double porcentagem;
    public void descontoPorcentagem(double porcentagem){
        this.porcentagem = porcentagem;
    }

    @Override
    public double aplicar(double preco) {
        return preco * (1 - porcentagem / 100);
    }


}
