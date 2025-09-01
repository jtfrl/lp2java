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
            v=s.nextDouble();
            arr[i]=v;
        }
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
        return m;
    }

}