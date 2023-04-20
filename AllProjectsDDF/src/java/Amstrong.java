package java;

import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) {
		int sum,num,rem,org;
		System.out.println("Enter the value");
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
         num=s.nextInt();
         org=num;
         for(sum=0;num>0;num=num/10) {
        	 rem=num%10;
        	 sum=sum+rem*rem*rem;
         }     
         if(sum==org) {
        		 System.out.println("Amstrong no");
        	 }
        	 else {
        		 System.out.println("Not Amstrong no");
        
        	 }}

}
