import java.util.ArrayList;
import java.util.Queue; 
//será usado para usar com a fila de carros a entrar no estacionamento

class Park{
    int tempoEmMin; //deve estar no intervalo de 5 a 240 
    ArrayList<Car> traffic=new ArrayList<>();//carros para entrar no estacionamento
    Queue<Car> parkedCars; 

    Park(Queue<Car> CarsinLine){
        this.parkedCars=CarsinLine;
    }


    void regCar(Car carr){
        //if(parkedCars.contains(carr)) ---> ver qual é o equivalente de contains para queue
        traffic.remove(carr);

    }
    /*
    void seeRepeatedCars(Car carr){
    //função para verificar com o método .contains() se o carro
    está no estacionamento
    //vai impedir que carros iguais sejam registrados duas vezes ou mais. 
    }
   */ 
}