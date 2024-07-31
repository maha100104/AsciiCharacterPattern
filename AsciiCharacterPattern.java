import java.util.*;
public class Asciipattern {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        StringBuilder s=new StringBuilder(sc.nextLine());
        String s1=s.reverse().toString();
        for(int i=s1.length()-1;i>=0;i--)
        {
            for(int j=0;j<s1.length();j++)
            {
                if(i==j)
                {
                    int ch=(int)s1.charAt(j);
                    System.out.print(ch);
                }
                else
                {
                    String len=((int)s1.charAt(j))+"";
                    for(int k=0;k<len.length();k++)
                    {
                        System.out.print("*");
                    }

                }

            }
            System.out.println();
        }
    }
}
/*
Input: 
Enter the string: github
Output:
**************103
***********105***
********116******
*****104*********
**117************
98***************
  */
