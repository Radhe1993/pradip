package Homework;

public class tri
{
        public static void main(String[] args)
        {
                int i,j,n=6,k;
                for(i=0; i<n; i++)
                {
                        for(k=n-i; k>1; k--)
                        {
                                System.out.print(" ");
                        }
                        for(j=0; j<i; j++)
                        {
                                System.out.print("* ");
                        }
                        System.out.print("\n");
                }
                System.out.println("*");
                System.out.println("**");
                System.out.println("***");
                System.out.println("****");
                System.out.println("*****");
                System.out.println("*******");
        }
}
