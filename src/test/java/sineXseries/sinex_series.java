package sineXseries;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sinex_series {
	
//sin x = x1/1! - x3/3! + x5/5! - x7/7! + x9/9! .......
	public double factorial(double x)
	{
		double fact=1;
		  int i;  
		  double number=x;
		  
		  for(i=1;i<=number;i++){    
		      fact=fact*i;    
		  } 
		return fact;
	}
	
	public void sinx(double x,int no_of_terms)
	{
		double sinx=0;
		double x1 = Math.toRadians(x);
		int n1=no_of_terms;
		int pow=1;
		for(int i =1;i<=n1;i++)
		{
			if(i%2==0)
			{
				sinx+=-Math.pow(x1,pow)/factorial(pow);
			}
			else
			{
				sinx+=Math.pow(x1,pow)/factorial(pow);
			}
			pow+=2;
		}
		System.out.println("Sin x of angle :"+sinx);
	}
	

public static void main(String [] args) throws NumberFormatException, IOException
	{
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter angle:");
		double x=Integer.parseInt(br.readLine());
		System.out.println("enter the number of terms:");
		int n=Integer.parseInt(br.readLine());
		sinex_series sin=new sinex_series();
		sin.sinx(x,n);
	}
}

/*
enter angle:
45
enter the number of terms:
10
Sin x of angle :0.7071067811865475
 * */
