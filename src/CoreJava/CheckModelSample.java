package CoreJava;

public class CheckModelSample {
    public static void main(String[] args) {
        ModelSample modelSample = new ModelSample();
        modelSample.setSample(1);
        int s = modelSample.getSample();

        long startTime = System.nanoTime();
        if(modelSample.getSample()>0){
            if(modelSample.getSample()>20){
                System.out.println("S");
            }
        }
        //System.out.println(modelSample.getSample());
        long endTime = System.nanoTime();

        System.out.println(endTime - startTime);

    }
}
