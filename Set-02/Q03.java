// program to display the sequence AMM, COO, EQQ,..........

public class Q03 {
    public static void main(String[] args) {
        for(int i = 0; i<13; i+=2){
            System.out.print((char)(65+i)+""+(char)(77+i)+""+(char)(77+i)+" ");
        }
    }
}
