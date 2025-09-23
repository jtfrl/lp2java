public class Worker{
    public final String nome;
    public wID idWorker;
    private double sal;


    Worker(String n, int idW, double salario){
        this.nome=n;
        this.idWorker=new wID(idW); //cria um id com base no inteiro inserido
        this.sal=salario;
    }
}