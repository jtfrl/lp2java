import java.util.ArrayList;
import java.util.Queue; 

class Park{
    //int tempoEmMin; //deve estar no intervalo de 5 a 240 
    ArrayList<Car> traffic=new ArrayList<>();//carros para entrar no estacionamento
    Queue<Car> parkedCars; 

    Park(Queue<Car> CarsinLine){
        this.parkedCars=CarsinLine;
    }


    void regCar(Car carr){
        if(traffic.contains(carr)){
        traffic.remove(carr);
            if(!parkedCars.contains(carr)){
            parkedCars.add(carr);
            }
        }
    }

    //void Date() //o professor sugere new Date(), mas criei um tipo para ca 
    /*
    void seeRepeatedCars(Car carr){
    //função para verificar com o método .contains() se o carro
    está no estacionamento
    //vai impedir que carros iguais sejam registrados duas vezes ou mais. 
    }
   */ 
}