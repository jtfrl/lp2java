import java.util.Scanner;

class notaPrim{
    private double[] arr=new double[5];

    notaPrim(double[] n){
        this.arr=n;
    //impl: controle de array com tamanho igual a 5?

    }

    public void insArr(){
        Scanner s=new Scanner(System.in);
        double v=0.0;
        System.out.println("Insira os valores das notas: \n");
        for(int i=0;i<5;i++){
            System.out.println("Nota "+(i+1)+": \n");
            System.out.println();
            v=s.nextDouble();
            arr[i]=v;
        }
         System.out.println();

    }
    

    public double mediaNotas(){
        double m, t=0.0;
        if(arr.length<5){
            throw new IllegalArgumentException("Tamanho de array inválido\n");
        }
        for(int i=0;i<arr.length;i++){
            t+=arr[i];
        }

        m=t/arr.length;

        double formated_m=m;
        String valFmtd=String.format("%.02f", formated_m); //formatação

        System.out.println("MÉDIA: "+valFmtd+"\n");
        return m;
    }

}