import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Triplets {

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> returned = new ArrayList<>();
        int j = 0;
        int k = 0;
        for(int i= 0; i < a.size();i++){
            if(a.get(i)< b.get(i)){
                j++;
            } else if(a.get(i)!=b.get(i)){
                k++;
            }
        }
        returned.add(j);
        returned.add(k);

        return returned;


    }



    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("sample.txt"));

        String[] aItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a.add(aItem);
        }

        String[] bItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> b = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int bItem = Integer.parseInt(bItems[i]);
            b.add(bItem);
        }

        List<Integer> result = compareTriplets(a, b);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }



}
