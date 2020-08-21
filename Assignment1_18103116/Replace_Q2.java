import java.util.*;
public class Replace_Q2{
	
    public static void main(String args[]){
    	Scanner t = new Scanner(System.in);
    	System.out.print("Enter size of word vector:\n");
    	int n = t.nextInt();
    	System.out.print("Enter words needed to be reduced: \n");
    	Set<String> set = new HashSet<String>();
    	for(int i = 0;i<n;i++){
    		set.add(t.next());
    	}
    	System.out.print("Enter word 'paraend' to mark the end of paragraph\n");
    	System.out.print("Enter the paragraph:\n");
    	String word = t.next();
    	StringBuffer para = new StringBuffer();
    	while(!word.equals("paraend")){
    		if(set.contains(word)){
    			para.append(word.charAt(0)+"");
    			for(int i = 1;i<word.length();i++){
    				para.append("*");
    			}
    			para.append(" ");
    		}
    		else{
    			para.append(word);
    			para.append(" ");
    		}
    		word = t.next();
    	}
    	System.out.print("Answer:\n");
    	System.out.print(para.toString().trim());
    	System.out.print("\n");
    	
    }   
}