public class Carro{
    String modelo;
    int ano;
    Motor motordoCarro;

    Carro(String md, int a, Motor mCarro){
        this.modelo=md;
        this.ano=a;
        this.motordoCarro=mCarro;
    }

    @Override //atua para que listaG não use endereços de memória
    public String toString(){
        return "Carro - (modelo=' "+modelo+"', ano="+ano+")";
    }
}