import java.util.Scanner;

class notas{
    public static void main(String[] args){
    double[] n=new double[5];
    notaPrim teste1=new notaPrim(n);
    notaWprr teste2=new notaWprr();
    int o;
    Scanner s=new Scanner(System.in);

    System.out.println("1 - ATRIBUIR NOTAS E CALCULAR A MÉDIA\n");
    System.out.println("2 - CÁCLULO DE MÉDIA DE NOTAS PRÉ-DEFINIDAS\n");
    System.out.println("");
    
    System.out.println("Insira a opção de escolha correspondente: \n");
    o=s.nextInt();
    if(o<1 || o>2){
        System.out.println("Escolha uma opção válida\n");
    }
    switch(o){
        case 1:{
            teste1.insArr();
            teste1.mediaNotas();
        }
        case 2:{
            teste2.mediaNotas();
        }
    }





    }
}