package CoreJava;

public class MoveNonZeroElement {
    public static void main(String[] args) {
        int[] nonZero= {5,0,3,0,1,0};
        int count = 0;
        for(int i=0;i<nonZero.length-1;i++){
            if(nonZero[i]!=0){
                nonZero[count] = nonZero[i];
                count++;
            }
        }
        for(int i=count;i<nonZero.length-1;i++){
            nonZero[i] = 0;

        }
        for(int i : nonZero){
            System.out.println(i);
        }
    }
}
