import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.LinkedList;
import java.time.LocalDateTime;
import java.util.Queue;
import java.util.Scanner;
//trechos do exercício
/* transferências e aplicações de juros, garantindo precisão decimal nos cálculos*/

public class Transf {
    public LocalDateTime hrTransf;
    public Queue<Transf> relTrfs;
    public Us ptrans, prec;
    public BigDecimal valorTransf, tax;
    private ZoneId timeZone;

    Transf(LocalDateTime hr, Us ptrans, Us pr, BigDecimal val, ZoneId tmz) {
        this.hrTransf = hr;
        this.ptrans = ptrans;
        this.prec = pr; //pessoa que recebe a transferencia
        this.valorTransf = val;
        this.timeZone = tmz;
        this.relTrfs = new LinkedList<>(); //fila inicializada
    }

    public boolean realizarTrf(Us a, Us b, BigDecimal val) {
        //necessário tomar o gmt de cada usuário envolvido
        if (a == null || b == null || val == null) {
            throw new IllegalArgumentException("Parâmetros não podem ser nulos");
        }

        if (val.compareTo(BigDecimal.ZERO) <= 0) throw new IllegalArgumentException("Valor negativo. Tente novamente");

        //if(a.valor().compareTo(val)<0) throw new IllegalArgumentException("Saldo Insuficiente");
        try {
            BigDecimal novoSaldoA = a.valor.subtract(val);
            BigDecimal novoSaldoB = b.valor.add(val);

            a.valor = novoSaldoA;
            b.valor = novoSaldoB; //atualização de saldo

            ZoneId pagTZ = a.getTimeZone();
            LocalDateTime atual = LocalDateTime.now();
            Transf trfs_ab = new Transf(atual, a, b, val, pagTZ);


            //adicionando ao histórico
            this.addTransf(trfs_ab);

            //criar histórico para ambos (individual)

            /*
            Double valEmTrf = a.valor - val;
            //é possível que haja valor primitivo

            BigDecimal valBIG = new BigDecimal(valEmTrf); //novo valor em big
            BigDecimal valBIG_b = new BigDecimal(b.valor);
            //b.valor+=valBig;
            BigDecimal result = valBIG.add(valBIG_b);
            */
            return true;
        } catch (Exception e) {
            throw new RuntimeException("Erro durante a transferência: \n" + e.getMessage(), e);
            //caso haja algum problema não detectado (unchecked)
        }

        //return false;
    }

    public boolean checkInfoTrans(Transf aDestB) {
        if (relTrfs.contains(aDestB)) {
            System.out.println("Transferência ocorrida em: "+
                    formatDateTime(aDestB.hrTransf, aDestB.timeZone));
            //mostra a hora da transferência e a zona onde ocorreu
            //AJUSTAR >>>FORMAT DATE TIME WITH<<<
            return true;
        }

        return false;
    }


    public void seeInfoTrans(Transf info) {
        if (info == null) return;

        System.out.println("#### INFORMAÇÕES DA TRANSFERÊNCIA ####\n");
        System.out.println("DATA/HORA: " + info.ptrans.infoTimeUs);
        System.out.println("PAGANTE: " + info.ptrans.nome + " ID: " + info.ptrans.idUs +
                "| " + "\n RECEBEDOR: " + info.prec.nome + " ID: " + info.prec.idUs);
        //mostra o valor arrendondado
        System.out.println("\n VALOR TRANSFERIDO: "+info.valorTransf.setScale(2, RoundingMode.HALF_UP));
        System.out.println("MODEDA: BRL\n");
    }

    public void addTransf(Transf info) {
        if (info != null) relTrfs.add(info);
    }

    public boolean realizarAppJuros(Us a, BigDecimal val){
        if(a==null || val==null) throw new IllegalArgumentException("Informações inválidas\n");

        if(val.compareTo(BigDecimal.ZERO)<=0) throw new IllegalArgumentException("Valor negativo. Tente novamente\n");

        try{
            BigDecimal valInt;
            //Double valInt_conv;

            System.out.println("Informe o valor do percentual de juros aplicado: ");
            Scanner s=new Scanner(System.in);
            valInt=s.nextBigDecimal();

            if(valInt==null || valInt.compareTo(BigDecimal.ZERO)<=0) throw new IllegalArgumentException("Indique um valor aceitável para aplicação.\n");

            BigDecimal novoVal= a.valor.subtract(val); //valor que vai ser modificado no saldo
            BigDecimal resApp=val.multiply(valInt.add(BigDecimal.ONE));


            ZoneId appJ=a.getTimeZone();
            LocalDateTime atual=LocalDateTime.now();
            Transf infoJ=new Transf(atual, a, null, resApp, appJ);
            this.addTransf(infoJ);

            a.valor=novoVal;

            return true;

        }catch(Exception e){
            throw new RuntimeException("Erro durante a aplicação de juros: "+ e.getMessage());
        }
    }

    public void seeInfoInterest(Transf info) {
        if(info==null ) throw new IllegalArgumentException("Não há informações disponíveis.\n");

        if(info.prec!=null) throw new IllegalStateException("Aplicação de juros não envolve mais de um usuário\n");

        System.out.println("#### INFORMAÇÕES DA APLICAÇÃO DE JUROS ####\n");

        System.out.println("DATA/HORA: " + info.ptrans.infoTimeUs);
        System.out.println("APLICADOR: "+info.ptrans.nome);
        System.out.println("VALOR APLICADO: "); //ver como colocar o valor aqui
        System.out.println("VALOR APÓS A APLICAÇÃO DO JURO: "+info.valorTransf.setScale(2, RoundingMode.HALF_UP));
    }

    private String formatDateTime(LocalDateTime dateTime, ZoneId zoneId) {

        ZonedDateTime znd=dateTime.atZone(zoneId);
        return znd.toString();
    }

    public BigDecimal seeValorTransf(){
        return valorTransf;
    }

    /*FUNÇÕES PENDENTES
     *
     * TRANSFERENCIA --- OK
     * VER SE APLICAÇÃO FOI FEITA --- EM PROG
     * VER SE A TRANSF. FOI FEITA --- Ok
     * VER FUSO DO USUÁRIO --- OK
     *  APLICAÇÃO DE JUROS
     * CONVERTER FUSO NO HORÁRIO CORRETO
     *
     *     //usar função now() para tomar o horário em que a transf foi feita:
     * https://docs.oracle.com/javase/8/docs/api/java/time/LocalDateTime.html#now--

     *
     */

}
