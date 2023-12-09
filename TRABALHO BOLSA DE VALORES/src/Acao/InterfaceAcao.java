package Acao;

import Broker.Broker;
import Ordem.Ordem;

public interface InterfaceAcao
{
    public void addBroker(Broker Broker);
    public void removeBroker(Broker Broker);
    public void notifyBrokers(Ordem ordem);
}