//import java.util.Collection;
import java.util.stream.Stream;
import java.util.ArrayList;

public class Bib{
    //UsBib lista_u;
    private ArrayList<LivroBib> lista_l;
    private long qtdEmp=lista_l.stream().filter(lv->lv.posRealizarEmp()).count();
    //EmpBib lista_emp;

    void insListadeLivros(int c, int q, String t, String a){
        LivroBib novol=new LivroBib(c, q, t, a);
        /*modificar a função: agora é com array list */
        
        //novol.prox=lista_l; //talvez fosse melhor que prox fosse privado
       // lista_l=novol;
    }


    public void addLivro(LivroBib lv){
        //conta a qtd de empréstimos
        if(qtdEmp<=3) //lista_l.<método para adicionar livro>
    }
}