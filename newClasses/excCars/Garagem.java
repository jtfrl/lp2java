public class Garagem{
    String nome;
    private Carro[] cars;

    Garagem(String nome, Carro[] cs){
        this.nome=nome;
        this.cars=cs;
    }


/*
copia defensiva
 public Classe(Teste[] arraytest, int cod) {
        this.arraytest = Arrays.copyOf(arraytest, arraytest.length);
        this.cod = cod;
    }

*/
}