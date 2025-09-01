
class notaWprr{
    private Double[] arr=new Double[5];

    notaWprr(){
        arr[0]=1.6;
        arr[1]=1.0;
        arr[2]=10.0;
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

        m=t/3;

        
        Double formated_m=m;
        String valFmtd=String.format("%.02f", formated_m); //formatação

        System.out.println("MÉDIA: "+valFmtd+"\n");
        return m;
    }

    

}