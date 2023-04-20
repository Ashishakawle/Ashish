package java;

public class intsuminstring {

	public static void main(String[] args) {
		String srt="kawaleashish2022@gmail.com";
        char[] c=srt.toCharArray();
        int sum=0;
        for(int i=0;i<srt.length();i++) {
            if (Character.isDigit(c[i])) {
//                System.out.print("Digits in the String : " + c[i]);
//                System.out.println();
                int a = Integer.parseInt(String.valueOf(c[i]));
                sum = sum + a;
            }       	       
	}
        System.out.println(sum);
}}

