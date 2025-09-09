
public class Car{
    private String placa;
    //private String nome; //pessoa dona do carro
    private timeCar tempo_do_carro;
    //Car prox;
    
    Car(String pl){
        this.placa=pl;
        this.tempo_do_carro=null;
    }

    public void regEnter(){
        this.tempo_do_carro= new timeCar();
    }

    public void regLeave(){
        if(tempo_do_carro!=null) tempo_do_carro.setexit();
    }

    public timeCar getTempo(){
        return tempo_do_carro;
    }

    public String seePl(){
        return placa;
    }

    @Override

    public boolean equals(Object obj){
        if(this==obj) return true;
        if(obj==null || getClass()!=obj.getClass()) return false;
        Car car=(Car) obj;
        return placa.equals(car.placa);
    }


    //Cria um hash para as placas

    @Override
    public int hashCode(){
        return placa.hashCode();
    }
}