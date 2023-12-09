package Ordem;

public class CreatorOrdemCompra extends CreatorOrdem{
    @Override
    public Ordem CreateOrdem(int quantidade, float valor, String corretora)
    {
        return new OrdemCompra(quantidade, valor,corretora);
    }
}
