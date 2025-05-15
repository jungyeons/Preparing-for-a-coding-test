import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String input = in.nextLine();
        char []Array1 = input.toCharArray();
        char []Array2 = new char[Array1.length];
        for(int i=0; i<input.length(); i++){
            if('A' <= Array1[i] && Array1[i] <= 'Z'){
                Array2[i] = Character.toLowerCase(Array1[i]);
            }else if ('a' <= Array1[i] && Array1[i] <= 'z'){
                Array2[i] = Character.toUpperCase(Array1[i]);
            }
        }

        String str = new String(Array2);
        System.out.println(str);
    }
}