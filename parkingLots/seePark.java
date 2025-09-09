import java.util.Scanner;

public class seePark{
    public static void main(String[] args){
         System.out.println("SISTEMA - ESTACIONAMENTO DO SHOPPING \n");
        Scanner s=new Scanner(System.in);
        int op=0;
        boolean rnn=true;
        
        /*  em ajuste
        Queue<Car>=filaDeCarros;
        Park emUso=new Park();
        
        */
        while(rnn){
             System.out.println("1. verificar carros\n 2 verificar tempo de permanência\n"+
              "\n3. Sair do programa\n");
              System.out.println("Selecione uma opção: ");
              op=s.nextInt();

              boolean uOpt=false;

              if(op<1 || op>3){
                System.err.println("");
              }



        }
        
    }
}