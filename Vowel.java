import java.io.*;
import java.util.*;
public class Vowel
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char []a=s.toCharArray();
        char []v={'a','e','i','o','u','A','E','I','O','U'};
        int flag=0;
        int i=0;
        for(i=0;i<v.length;i++)
        {
            if(a[0]==v[i])
            {
            System.out.println("Vowel");
             flag=1; 
        }
        }
        if(flag==0)
        {
            System.out.println("consonant");
        }
    }
        
}
