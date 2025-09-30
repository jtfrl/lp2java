import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Queue;
//trechos do exercício
/* transferências e aplicações de juros, garantindo precisão decimal nos cálculos*/

public class Transf{
    public LocalDate hrTransf;
    public Queue<Transf> relTrfs; //implementar função para adicionar transferencia
    public Us ptrans, prec;

    Transf(LocalDate hr, Us ptrans, Us pr){
        this.hrTransf=hr;
        this.ptrans=ptrans;
        this.prec=pr; //pessoa que recebe a transferencia
    }

    public BigDecimal realizarTrf(Us a, Us b, Double val){
        //necessário tomar o gmt de cada usuário envolvido
        if(a.valor<0) throw new IllegalArgumentException("O usuário não está apto a fazer transferências");
        Double valEmTrf=a.valor-val;
        //é possível que haja valor primitivo

        BigDecimal valBIG= new BigDecimal(valEmTrf); //novo valor em big
        BigDecimal valBIG_b=new BigDecimal(b.valor);
        //b.valor+=valBig;
        BigDecimal result=valBIG.add(valBIG_b);

        /*
        criar localdate, adicionar a pessoa q transferiu e a pessoa que recebeu
        para adicionar na queue
         */
        return result;
    }

    public boolean checkInfoTrans(Transf aDestB){
        if(relTrfs.contains(aDestB)){
            System.out.println("Transferência ocorrida");
            return true;
        }

        return false;
    }


    public boolean seeInfoInterest(){
        return false;
    }


    public void seeInfoTrans(){

    }

    /*FUNÇÕES PENDENTES
     *
     * TRANSFERENCIA --- OK
     * APLICAÇÃO DE JUROS
     * VER SE APLICAÇÃO FOI FEITA --- EM PROG
     * VER SE A TRANSF. FOI FEITA --- EM PROG
     * VER FUSO DO USUÁRIO
     * CONVERTER FUSO NO HORÁRIO CORRETO
     *
     *     //usar função now() para tomar o horário em que a transf foi feita:
     * https://docs.oracle.com/javase/8/docs/api/java/time/LocalDateTime.html#now--

     *
     */

}