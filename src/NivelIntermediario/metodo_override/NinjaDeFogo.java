package NivelIntermediario.metodo_override;

public class NinjaDeFogo extends Ninja {

    public NinjaDeFogo() {
        super();
    }

    public NinjaDeFogo(String nome, int idade, String aldeia) {
        super(nome, idade, aldeia);
    }

    //Não é obrigátorio usar, pois como extende da super classe o Java consegue identificar se o metódo existe
    @Override
    public void jogarPoder() {
        System.out.println("O seu poder é de ninja, todo ninja é furtivo");
    }

    //A anotation @Override é uma boa pratica e convenção do Java
    //Se sobrescrever metódos que não existe na super classe da erro
    //Nome do metodo deve ser exatamente o mesmo do que foi criado na classe mãe

    /*
    * @Override
    public void jogarPoderes() {
        System.out.println("O seu poder é de ninja, todo ninja é furtivo");
    }
    * */

}
