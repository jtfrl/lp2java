class Emprestimo{
    /*
    INSTRUÇÕES DA ATIVIDADE
    A classe Emprestimo deve representar a ação de um usuário pegando um livro emprestado, 
    com atributos que referenciam o livro e o usuário envolvidos no empréstimo, e 
    métodos para realizar o empréstimo (marcando o 
    livro como indisponível) e para devolver o livro 
    (marcando-o novamente como disponível).


    */
   Usuario u_emp;
   Livro l_emp;
   Boolean emp;

    Emprestimo(Usuario uemp, Livro lemp){
        this.u_emp=uemp;
        this.l_emp=lemp;
        emp=true;
    }

    void downEmp(){
        if(emp){
            // impl: o acervo da biblioteca deve diminuir
        }

        // talvez seja útil ver totalAcervo aqui
    }

    void upEmp(){
        // impl: função que vai fazer o oposto de
        // downEmp
    }


    //o segundo for seria ideal para o acervo em si
    Boolean realizarEmp(int idUs, int cdLivro){
        for(int i=0;i<u_emp.length;i++){
            if(u_emp[i]==idus){
                for(int j=0;j<l_emp.length;j++){
                    if(l_emp[j]==cdLivro){
                        //adciona o usuário na lista de livros emprestados
                    }
                }
            }
        }
    }





   
}