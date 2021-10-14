public class ASCIIToString {
    public static void main(String args[]){
        int num[] = {128};
        String str =null;
        for(int i = 0; i<num.length; i++){
            str = Character.toString((char)i);
            System.out.println(str);
        }
    }
}