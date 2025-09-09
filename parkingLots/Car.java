
public class Car{
    String placa;
    String nome; //pessoa dona do carro
    timeCar tempo_do_carro;
    //Car prox;
    
    Car(String pl, String n, timeCar t){
        this.placa=pl;
        this.nome=n;
        this.tempo_do_carro=t;
    }

    @Override //atua para que listaG não use endereços de memória
    public String toString(){
        return "Carro - (dono=' "+nome+"', placa="+placa+")";
    }
}