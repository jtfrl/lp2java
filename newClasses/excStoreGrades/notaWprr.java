
class notaWprr{
    private Double[] arr=new Double[5];

    notaWprr(){
        arr[0]=3.5;
        arr[1]=3.5;
        arr[2]=7.0;
        arr[3]=null;
        arr[4]=null;
    }

    
    Double mediaNotas(){
        Double m, t=0.0;
        if(arr.length!=5){
            throw new IllegalArgumentException("Tamanho de array inválido\n");
        }
        for(int i=0;i<arr.length;i++){
           if(arr[i]!=null) t+=arr[i];
        }

        m=t/arr.length;
        return m;
    }

    

}