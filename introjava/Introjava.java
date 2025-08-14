class Introjava{
    public static void main(String args[]){
        System.out.println("Testando java\n");

        String[] v=new String [5];
        v[0]="+";

        String[] j={"*", "³", "Ö", "a", "Ø"};
        //não é possível algo como v={"a", "b"...};

        for(String letra:j){
            System.out.println(letra+"\n");
        }
       
     
        //outras implementações com vetor
        int[][]s= new int[3][];
        s[0]=new int[1];
        s[3][3]=8;

        System.out.print(s);

       
    }
}