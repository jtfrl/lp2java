public class contaBancaria{
    private String titular;
    private String numeroConta;
    private double saldo;

    contaBancaria(String tit, String nConta, double sd){
        if(sd<0){
            sd=0.0;
        }
        this.titular=tit;
        this.numeroConta=nConta;
        this.saldo=sd;
    }

    public void depositar(double valor){
        if(valor>0){
            this.saldo+=valor;
        }else{
            throw new IllegalArgumentException("Valor informado precisa ser positivo\n");
        }
    }

    public void sacar(double valor){
        if(valor>0 && saldo>=valor){
            this.saldo-=valor;
        }else{
             throw new IllegalArgumentException("Valor informado precisa ser positivo\n");
        }
    }

    public void exibirInfo(){
        System.out.println("##################################");
        System.out.println("       CONTA BANCÁRIA       \n");
        System.out.println("##################################");
        System.out.println();
        System.out.println("TÍTULAR | N. CONTA \t |\tSALDO ");

        System.out.println();
        System.out.println(this.titular+"\t   "+this.numeroConta+"\t\t"+this.saldo);

    }


      public static void main(String[] args) {
        contaBancaria c1=new contaBancaria("JOSÉ", "81687665-1", 22.65);

        //c1.depositar(42.70);
        c1.sacar(5.63);
        c1.exibirInfo();   

    }

}