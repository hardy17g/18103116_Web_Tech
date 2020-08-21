import java.util.*;
public class Anagram_Q4{
	
	
    public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter Strings:\n");
        char str1[] = sc.next().toCharArray();
        char str2[] = sc.next().toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        System.out.print(Arrays.equals(str1,str2)+"\n");    	
    }   
                             
}