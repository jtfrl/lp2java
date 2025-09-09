import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class seePark{
    public static void main(String[] args){
         System.out.println("SISTEMA - ESTACIONAMENTO DO SHOPPING \n");
        Scanner s=new Scanner(System.in);
        int op=0;
        boolean rnn=true;
        Car c1=new Car("ABC10606");
        Car c2=new Car("ABD10656");
        Car c3=new Car("MKC13506");
        Car c4=new Car("LOC19606");
       
       Queue<Car>filaDeCarros=new LinkedList<>();

       filaDeCarros.add(c1);
        filaDeCarros.add(c2);
         
      
        
        Park emUso=new Park(filaDeCarros);
        
        emUso.addTrafiic(c4);
        emUso.addTrafiic(c3);


        
        while(rnn){
             System.out.println("1. verificar carros\n 2 verificar tempo de permanência\n"+
              "\n3. Sair do programa\n");
              System.out.println("Selecione uma opção: ");
              op=s.nextInt();

              boolean uOpt=false;

              if(op<1 || op>3){
                System.err.println("Solicite uma opção válida\n");
              
              }else{
                uOpt=true;
              }

              if(uOpt){
                switch(op){
                  case 1:{
                    emUso.displayParkingStatus();
                    break;
                  }

                  case 2:{
                    for(Car car:filaDeCarros){
                      car.getTempo();
                         if(car.getTempo() != null) {
                            long tempo = car.getTempo().getDuration();
                            System.out.println("Carro " + car.seePl() + 
                                             ": " + tempo + " minutos");
                    }

                    break;

                  }

                  case 3:{
                    rnn=false;
                    System.out.println("Saindo do programa\n");
                    break;
                  }
                  default:{
                    break;
                  }
                }
              }

        }
        
    }
}