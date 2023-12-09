package Broker;
import Ordem.Ordem;

public interface Observer {
  public void update(Ordem ordem,String nome,String codigo); 
}