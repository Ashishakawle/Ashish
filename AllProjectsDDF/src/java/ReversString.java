package java;

public class ReversString {

	public static void main(String[] args) {
		String s="Ashish Ashokrao kawale";
        String []words=s.split(" ");
        String Rev=" ";
        for(String a:words) {
        String rev=" ";
        for(int i=a.length()-1;i>=0;i--) {
        rev=rev+a.charAt(i);	
        }
        Rev=Rev+rev+(" ");
        }
        System.out.println(Rev);
	}
}
