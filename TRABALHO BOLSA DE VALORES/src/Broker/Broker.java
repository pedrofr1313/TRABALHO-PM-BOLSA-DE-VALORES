package Broker;
import Ordem.Ordem;




public class Broker implements Observer{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(Ordem ordem,String nome,String codigo)
    {
       System.out.println("A acao " + codigo + "da empresa" + nome + "recebeu uma ordem de" + ordem.getTipo() + "de" 
       + ordem.getQuantidade() + "ações. \n Valor:" + ordem.getValor() + "\nCorretora:" + ordem.getCorretora() +"");
    }



    

}