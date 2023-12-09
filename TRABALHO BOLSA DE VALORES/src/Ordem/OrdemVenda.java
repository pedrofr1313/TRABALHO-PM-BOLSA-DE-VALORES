package Ordem;
public class OrdemVenda implements Ordem {
    
    private int quantidade;
    private float valor;
    private String corretora;
    private String tipo = "Venda";
    
    
    public OrdemVenda(int quantidade, float valor, String corretora) {
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

    public String getTipo() {
        return tipo;
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
    

