import java.time.ZoneId;

public class Us{
    public String nome, pais;
    public Double valor;
    public ZoneId infoTimeUs;
    private Integer idUs;

    public Us(String nome, Double v, String pais, ZoneId itUs, Integer id) {
        this.nome=nome;
        this.valor=v; //esse valor já indica a transferencia
        this.pais=pais;
        this.infoTimeUs=itUs; //toma o fuso horário
            if(id>1000 && id<4000) this.idUs=id.hashCode(); //cria um hash para identificar o usuário
            else throw new IllegalArgumentException("Insira um valor válido para identificação");
    }

    public void addSaldo(Double sd){
        if(sd<0) throw new IllegalArgumentException("Valor inserido inválido.");
        this.valor=sd;
    }


    //usar função now() para tomar o horário em que a transf foi feita
}