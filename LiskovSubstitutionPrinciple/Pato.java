package LiskovSubstitutionPrinciple;
//Aqui o princípio de Liskov é respeitado, porque o método que o pato extende pode ser substituido pela função da super classe pássaro.
public class Pato extends Passaro{
    @Override
    public void Voar() {
        System.out.println("eu posso voar também!");
    }
}
