// Write a program to display the sequence ABA, BCB, CDC, DED, ...................

public class Q17 {
    public static void main(String[] args) {
        for(int i = 0; i<25; i++){
            System.out.print((char)(65+i)+""+(char)(66+i)+""+(char)(65+i)+" ");
        }
        System.out.println("");
    }
}
