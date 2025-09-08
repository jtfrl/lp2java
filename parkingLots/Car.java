
public class Car{
    String placa;
    String nome; //pessoa dona do carro
    Car prox;
    
    Car(String pl, String n){
        this.placa=pl;
        this.nome=n;
        this.prox=null;
    }

    @Override //atua para que listaG não use endereços de memória
    public String toString(){
        return "Carro - (dono=' "+nome+"', placa="+placa+")";
    }
}