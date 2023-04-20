package java;

public class ReverArray {

 public static void main(String[] args) { 
	 
	  int []arr={1,8,9,3,4,5,65,58,24,79,87};
       System.out.println(" given array");
      for(int i=0;i<arr.length;i++)
    	   System.out.print(arr[i]+" ");
            System.out.println();
       System.out.println("Ater Revers Array");
      for(int i=arr.length-1;i>=0;i--)
    	   System.out.print(arr[i]+" ");
      
	}
}