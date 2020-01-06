package Password;
import java.util.*;
public class Password {
	public static void main(String[] args)
	{
		int i,j,k=0;
		List pwd = new ArrayList();
	  Scanner S = new Scanner(System.in);
	  System.out.println("Enter user id:");
	  String username = S.nextLine();
	  System.out.println("Enter password:");
	  String pasword= S.nextLine();
	  int m= pasword.length();
	   for(i=0;i<m;i++)
	   {
		   if(pasword.charAt(i)==',')
		   {	
			   j=i;
			   String p;
			   p = pasword.substring(k,j);
			   pwd.add(p);
			   k=j+1;
		   }
	   }
      int s= pwd.size();
      for (i=0;i<s;i++)
      {
    	  String pwds = pwd.get(i).toString();
    	  if(validity(pwds))
    		  System.out.println(pwds);
      }
	}
	public static boolean validity(String pas)
	{
		if(pas.length()<6 || pas.length()>12)
	         return false;
		int nc=0,lc=0,uc=0,sc=0,i;
		for(i=0;i<pas.length();i++)
		{
			if(pas.charAt(i)>=65 && pas.charAt(i)<=90)
				uc++;
			else if(pas.charAt(i)>=97 && pas.charAt(i)<=122)
				lc++;
			else if(pas.charAt(i)>=48 && pas.charAt(i)<=57)
				nc++;
			else if(pas.charAt(i)==35||pas.charAt(i)==36||pas.charAt(i)==64)
				sc++;
		}
			if(uc>0 && lc>0 && nc>0 && sc>0)
				return true;
			else
				return false;
		}
}
