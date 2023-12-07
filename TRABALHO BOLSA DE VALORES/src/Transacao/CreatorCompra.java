package Transacao;

public class CreatorCompra extends CreatorTransacao{
    @Override
    public Transacao CreateTransacao(int quantidade, float valor, String corretora)
    {
        return new Compra(quantidade, valor,corretora);
    }
}
