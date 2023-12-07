package Transacao;
public class Venda implements Transacao {
    
    private int quantidade;
    private float valor;
    private String corretora;
    
    public Venda(int quantidade, float valor, String corretora) {
        this.quantidade = quantidade;
        this.valor = valor;
        this.corretora = corretora;
    }
    public int getQuantidade() {
        return quantidade;
    }

    public float getValor() {
        return valor;
    }

    public String getCorretora() {
        return corretora;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void setCorretora(String corretora) {
        this.corretora = corretora;
    }
}
    

