
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
        s[0][0]=5;

        s[1]=new int[3];
        s[1][0]=7;
        s[1][1]=1;

        s[2]=new int[1];
        s[2][0]=19;

       for(int i=0;i<s.length;i++){
         System.out.print("Row "+i+": ");
            for(int j=0;j<s[i].length;j++){
                System.out.print.print(s[i][j]+" ");

        }
       }

       
    }
}