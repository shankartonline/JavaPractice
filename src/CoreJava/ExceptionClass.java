package CoreJava;

public class ExceptionClass {
    public static void main(String[] args) {
        String s = "ddd";
        if(s == null)
        throw new SfpException("jayashankar");
        try{
            calculate();
        }catch(SfpException e){
            throw new SfpException("EXCEPTION");
        }
        //calculate();
    }

    public static void calculate(){
        throw new SfpException("ramachandran");
    }
}
