import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        char b = sc.nextLine().charAt(0);
        char a_array[] = a.toCharArray();
        int count = 0;
        for(int i = 0; i < a.length(); i++){
            if(a_array[i] == b){
                count++;
            }
        }
        System.out.println(count);
    }
}