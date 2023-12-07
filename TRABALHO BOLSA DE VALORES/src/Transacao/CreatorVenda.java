package Transacao;

public class CreatorVenda extends CreatorTransacao{
    @Override
    public Transacao CreateTransacao(int quantidade, float valor, String corretora)
    {
        return new Venda(quantidade,valor,corretora);
    }
}