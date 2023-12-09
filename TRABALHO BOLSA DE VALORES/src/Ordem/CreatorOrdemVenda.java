package Ordem;

public class CreatorOrdemVenda extends CreatorOrdem{
    @Override
    public Ordem CreateOrdem(int quantidade, float valor, String corretora)
    {
        return new OrdemVenda(quantidade,valor,corretora);
    }
}