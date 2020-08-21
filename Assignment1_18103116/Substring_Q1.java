import java.util.*;
public class Substring_Q1{
    public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);
    	String p = sc.next();
    	String q = sc.next();
    	if(q.length()>p.length()){
    		System.out.print("0\n");
    		return;
    	}
    	char st[] = q.toCharArray();
    	Arrays.sort(st);
    	q = new String(st);
    	int k= q.length();
    	int ans = 0;
    	for(int i = 0;i<=p.length()-k;){
    		String sub = p.substring(i,i+k);
    		st = sub.toCharArray();
    		Arrays.sort(st);
    		sub = new String(st);
    		if(sub.equals(q)){
    			ans++;
    			// System.out.print(i+"\n");
    			i+=k;
    		}
    		else{
    			i++;
    		}
    	}
    	System.out.print("Answer(Each character included in 1 substring only): "+ans+"\n");
    }   
                             
}