import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Park{
    public ArrayList<Car> traffic=new ArrayList<>();//carros para entrar no estacionamento
    public Queue<Car> parkedCars= new LinkedList<>(); 

    Park(Queue<Car> CarsinLine){
        this.parkedCars=CarsinLine;
    }


    void regCar(Car carr){
        if(traffic.contains(carr)){
        traffic.remove(carr);
            if(!parkedCars.contains(carr)){
            carr.regEnter();
            parkedCars.add(carr);
            System.out.println("Carro: "+carr.seePl()+" entrou. Horário:"+
            carr.getTempo().seeEnter());
            }
        }
    }


    void rmvCar(Car carr){
            if(parkedCars.contains(carr)){
            parkedCars.remove(carr);
            carr.regLeave();
            System.out.println("Carro: "+ carr.seePl()+" saiu. Horário de saída: "+
            carr.getTempo().getDuration());
        }
    }

    void addTrafiic(Car carr){
        if(!traffic.contains(carr)) traffic.add(carr);
    }

      void displayParkingStatus() {
        System.out.println("\n--- Status do estacionamento ---");
        System.out.println("Carros para entrar: " + traffic.size()+"\n\n");
        System.out.println("Carros estacionados: " + parkedCars.size()+"\n\n");
        
        for (Car car : parkedCars) {
            long duration = car.getTempo().getDuration();
            System.out.println("Car " + car.seePl() + " - Estacionado por: " + duration + " minutos");
        }
    }
}