//import java.util.stream.Stream;
//stream() só é aplicável em collection

/*

*/


import java.util.ArrayList;

public class Bib{
    private ArrayList<UsBib> lista_u;
    private ArrayList<LivroBib> lista_l;
    private long qtdEmp=lista_l.stream().filter(lv->lv.posRealizarEmp()).count();
    private ArrayList<Emp> lista_emp;

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
    // addLivroEmp==realizarEmp
    public boolean addLivroEmp(LivroBib lv, String n, int mat){
        UsBib uEmp=new UsBib(n, mat);
        LivroBib lEmp=sqLSearch(lv.cod);

        if(uEmp==null || lEmp==null){
            System.err.println("Usuário e/ou código não encontrados\n");
            return false;
        }

        //checa se a quantidade é menor que 1
        //lista_l.stream().anyMatch(lvToCheck -> lvToCheck.qtd<1&&lvToCheck==lv);
        lista_l.stream()
               .filter(lvCheck->lvCheck.qtd<1)
               .findFirst()
               .ifPresent(lvCheck->{System.out.println("Livro não disponível "+lv.titulo);});

        boolean empEfetivado=lEmp.posRealizarEmp();

        //conta a qtd de empréstimos
        if(qtdEmp<=3&&(empEfetivado)){
            Emp novoEmp=new Emp(uEmp,lEmp);
            lista_emp.add(novoEmp);
            return true;
        }

        return false;
    }

    void exibirLivroAluno(){
        System.out.println("CATÁLOGO DE LIVROS\n");
        System.out.println("LEGENDA: S/E='SEM EMPRÉSTIMO\n"+
        "C/E='COM EMPRÉSTIMO ATIVO'\n");

            for(LivroBib l:lista_l){
                    System.out.print("' "+l.titulo+" '"+ " por "+l.autor);
                

                if(l.qtd>0){
                    System.out.println(" ::: DISPONÍVEL (S/E)\n");
                    System.out.println(" ::: Há alguns livros que não foram emprestados.\n");

                    //while(lista_emp.item()!=null){
                    for(Emp emp:lista_emp){
                        if(emp.lBib.cod==l.cod && emp.EmpStatus){
                            //AJUSTAR: mostrar o usuário do livro emprestado
                            //System.out.println("EMPRÉSTIMO "+lista_emp.item().titulo);
                            break;
                        }
                    }
                }else{
                    System.out.println("\n ::: C/E");
                    if(l.qtd==0) System.out.println(l.titulo+"TODOS OS LIVROS DESSE TÍTULO FORAM EMPRESTADOS\n ");
                }
                System.out.println();
        }
        //}
        
    }


    boolean devolverLivro(int cod){
        lista_emp.stream()
                 .filter(l_emp->l_emp.lBib.cod==cod && l_emp.EmpStatus)
                 .findFirst()
                 .ifPresentOrElse(
                    l_emp->{
                        l_emp.devolver();
                        String tit=l_emp.lBib.titulo;
                        System.out.println("Livro devolvido.\n"+tit);
                    },
                 //abaixo: caso não haja o livro na lista
                 ()->{
                    //String tit=l_emp.titulo;
                    System.out.println("Livro não encontrado ou já devolvido.\n");
                 }
                 );
        return true;
    }
}