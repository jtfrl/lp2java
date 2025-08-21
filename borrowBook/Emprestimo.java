class Emprestimo{
   Usuario u_emp;
   Livro l_emp;
   Boolean empAtivo;
   Emprestimo prox;

    Emprestimo(Usuario uemp, Livro lemp){
       this.u_emp=uemp;
       this.l_emp=lemp;
       this.prox=null;
       empAtivo=l_emp.posRealizarEmp();
    }

    void devolver(){
        if(this.empAtivo){
            this.empAtivo=false;
            this.l_emp.devolver();
            System.out.println("Livro devolvido: "+this.l_emp.titulo);
        }
    }

   
}