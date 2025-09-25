//import java.util.stream.Stream;
//stream() só é aplicável em collection

import java.util.ArrayList;

public class Bib{
    private ArrayList<UsBib> lista_u;
    private ArrayList<LivroBib> lista_l;
    private long qtdEmp=lista_l.stream().filter(lv->lv.posRealizarEmp()).count();
    //EmpBib lista_emp;

    public void insListadeLivros(int c, int q, String t, String a){
        LivroBib novol=new LivroBib(c, q, t, a);
        lista_l.add(novol);
    }


    public LivroBib sqLSearch(int cod){
        for(int i=0; i<lista_l.size();i++){
            if(lista_l.get(i).cod==cod){ //cpd agora é 'public'
                return lista_l.get(i);
            }

        }
        System.out.println("Livro não encontrado: "+cod);
        return null;
    }

    public UsBib sqUSearch(Integer mat){
        return lista_u.stream().filter(usBib -> usBib.mat==mat).findFirst().orElse(null);
        //findFirst() -> terminal: procura até achar o primeiro
        //filter() -> para cada usuário no fluxo, procure aquele que tiver o código igual

    }





    //atualizar mat para usar hashcode
    public boolean addLivroEmp(LivroBib lv, String n, int mat){
        UsBib uEmp=new UsBib(n, mat);
        LivroBib lEmp=sqLSearch(lv.cod);

        if(uEmp==null || lEmp==null){
            System.err.println("Usuário e/ou código não encontrados\n");
            return false;
        }

        //checa se a quantidade é menor que 1
        lista_l.stream().anyMatch(lvToCheck -> lvToCheck.qtd<1&&lvToCheck==lv);


        //conta a qtd de empréstimos
        if(qtdEmp<=3){
            return true;
        }


    }
}