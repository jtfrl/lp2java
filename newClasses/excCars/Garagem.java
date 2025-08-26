public class Garagem{
    String nome;
    private Carro[] cars;

    Garagem(String nome, Carro[] cs){
        this.nome=nome;
        this.cars=null;
    }

    public void addCarro(Carro v){
        if(v.modelo==null || v.ano<0 || v.motordoCarro==null){
            System.err.println("Informe um carro válido\n");
        }

        
    }


/*
copia defensiva
 public Classe(Teste[] arraytest, int cod) {
        this.arraytest = Arrays.copyOf(arraytest, arraytest.length);
        this.cod = cod;
    }

*/
}