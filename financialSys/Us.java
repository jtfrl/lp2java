import java.time.ZoneId;

public class Us{
    public String nome, pais;
    public double valor;
    public ZoneId infoTimeUs;

    public Us(String nome, double v, String pais, ZoneId itUs) {
        this.nome=nome;
        this.valor=v;
        this.pais=pais;
        this.infoTimeUs=itUs; //toma o fuso horário
    }


    //usar função now() para tomar o horário em que a transf foi feita
}