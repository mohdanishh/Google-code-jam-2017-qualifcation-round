import java.io.*;
import java.util.*;
public class cjq1
{
    public static void main(String args[])throws IOException
    {
        Scanner in=new Scanner(new File("A-large.in"));
        PrintWriter writer = new PrintWriter("final_uploadA_large.txt", "UTF-8");
        while(in.hasNext())
        {
            int t=in.nextInt();
            for(int cases=1;cases<=t;cases++)
            {
             String str=in.next();
             int n=in.nextInt();
                int len=str.length();int i=-1;int count=0;int flagger=0;
                for(int l=len-1;l>=0;l--)
                {
                    if(str.charAt(l)=='-')
                    {
                        String s="";
                        for(i=l;i>l-n;i--)
                        {
                            if(i<0)
                            {
                        flagger=1;
                        break;
                    }
                    if(str.charAt(i)=='-')
                    s='+'+s;
                    else
                    s='-'+s;
                }
                if(flagger!=1)
                {
                str=str.substring(0,l-n+1)+s+str.substring(l+1,len);
                count++;
                // System.out.println(s);
                // System.out.println(str);
                }
            }
            }
            //System.out.println(str);
            int flag=0;
            for(i=0;i<len;i++)
            {
                if(str.charAt(i)=='-')
                {
                    flag=1;
                    break;
                }
            }
            if(flag==1)
             writer.println("Case #"+cases+":  "+"IMPOSSIBLE");
            else
             writer.println("Case #"+cases+":  "+count);
         }
    }
        writer.close();
            in.close();
   }
}
        