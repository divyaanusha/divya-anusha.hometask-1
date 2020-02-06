package com.epam.maven_demo;
import java.util.*;
/**
 * Hello world!
 *
 */
class Gift
{
	public static String[] chocolates=new String[100];
	public static String[] sweets=new String[100];
	public static int num_choco=0;
	public static int quantity_choco=0;
	public static int quantity_sweet=0;
	void get(String c,int ch_qty)
	{
		
	}
	void find_candies(char c)
	{
		
	}
	 public void  sort(int choice){
		 
	 }
	 public void sum_qty() {
			System.out.println(quantity_choco+quantity_sweet);
		}
		
	
}
class Chocolates extends Gift
{
	int i=0;
	void get(String c,int ch_qty)
	{
		chocolates[i]=c;
		quantity_choco=quantity_choco+ch_qty;
		i=i+1;
		num_choco+=1;
		System.out.print(num_choco);
	}
	void find_candies(char c)
	{
		int checker=0;
		for(int i=0;i<num_choco;i++)
		{
			if(chocolates[i].charAt(0)==c)
			{
				System.out.println(chocolates[i]);
				checker=1;
			}
		}
		if(checker==0)
		{
				System.out.println("no chocolate found");
		}
	}
	public void  sort(int k)
	{
		for(int i = 0; i<num_choco ;i++) {
	         for (int j = i+1; j<num_choco; j++) {
	            if(chocolates[i].compareTo(chocolates[j])>0)
	            {
	               String temp = chocolates[i];
	               chocolates[i] = chocolates[j];
	               chocolates[j] = temp;
	            }
	         }
	      }
		if(k==1)
		{
			System.out.println("chocolates in ascending order");
			for (int i=0;i<num_choco;i++)
			{
				System.out.println(chocolates[i]);
			}
		}
		else
		{
			System.out.println("chocolates in descending order");
			for (int i=num_choco-1;i>=0;i--)
			{
				System.out.println(chocolates[i]);
			}
			
		}
		

	}
	
}
class Sweets extends Gift
{
	int j=0;
	void get(String c,int sw_qty)
	{
		sweets[j]=c;
		quantity_sweet=quantity_sweet+sw_qty;
		j=j+1;
	}
	
}

public class App 
{
    public static void main( String[] args )
    {
    	
       Scanner sc=new Scanner(System.in);
       Gift g1;
       g1=new Chocolates();
       System.out.println("enetr number of chocolates to put in gift");
       int x=sc.nextInt();
       while(x>0)
       {
    	   System.out.println("enetr chocolates and its quantity");
    	   String choco=sc.next();
    	   int choco_qty=sc.nextInt();
    	   g1.get(choco, choco_qty);
    	   x=x-1;
       }
       g1=new Sweets();
       System.out.println("enetr number of sweets to put in gift");
       x=sc.nextInt();
       while(x>0)
       {
    	   System.out.println("enetr sweets and its quantity");
    	   String sweet=sc.next();
    	   int sweet_qty=sc.nextInt();
    	   g1.get(sweet, sweet_qty);
    	   x=x-1;
       }
       System.out.println("the quantity of gift pack");
       g1.sum_qty();
       g1=new Chocolates();
       System.out.println("no of chocolates that starts with given letter...to do that enter letter");
       char letter=sc.next().charAt(0);
       g1.find_candies(letter);
       System.out.println("sorting chocolates in ascending order press 1 or press 2 for descending");
       int as_des_choice=sc.nextInt();
       g1.sort(as_des_choice);
       
       
       
       
        
    }
}
