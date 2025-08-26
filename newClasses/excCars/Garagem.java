
import java.util.Arrays;


public class Garagem{
    String nome;
    private Carro[] cars=new Carro[50];
    private int sizeG=0;

    Garagem(String nome, Carro[] cs){
        this.nome=nome;
        this.cars=cs;
    }

    public int tam(){
        return cars.length;
    }

    public int currentNumOcupation(){
        return sizeG;
    }

    public void addCarro(Carro v){
        if(v.modelo==null || v.ano<0 || v.motordoCarro==null){
            System.err.println("Informe um carro válido\n");
        }

        cars[sizeG]=v;
        sizeG++;
    }


    public void listaG(){
        System.out.println(Arrays.toString(cars));
    }
}