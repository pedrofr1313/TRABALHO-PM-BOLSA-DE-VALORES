package Acao;
import Ordem.Ordem;
import Broker.Broker;

import java.util.ArrayList;
import java.util.List;

public class Acao implements InterfaceAcao {
    private List<Broker> brokers = new ArrayList<>();
    private String nomeDePregao; 
    private String codigo ;
    private String atividadePrincipal;

    @Override
    public void addBroker(Broker broker)
    {
       brokers.add(broker);    
    }

    @Override
    public void removeBroker(Broker broker)
    {
        brokers.remove(broker);
    }

    @Override
    public void notifyBrokers(Ordem ordem)
    {
        for(Broker broker : brokers)
        {
            broker.update(ordem,getNomeDePregao(),getCodigo());
        }
    }


    public String getNomeDePregao() {
        return nomeDePregao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getAtividadePrincipal() {
        return atividadePrincipal;
    }

    public void setNomeDePregao(String nomeDePregao) {
        this.nomeDePregao = nomeDePregao;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setAtividadePrincipal(String atividadePrincipal) {
        this.atividadePrincipal = atividadePrincipal;
    }
}
