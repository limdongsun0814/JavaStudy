<<<<<<< HEAD
package lab1;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;



public class lab1 {
	public static void main(String[] args) throws IOException { 
//		lab1();
//		lab2_1();
//		lab2_2();
//		lab3();
//        lab4('&',4, false); 
//        lab5();
	}
	
    private static void lab5() {
		Scanner sc= new Scanner(System.in);
		int N = sc.nextInt();
		String data = "";
		for(int i=0; i<N;i++) {
			data+="*";
		}
		for(int i=N; i>=0; i--) {
			System.out.println(data.subSequence(0, i));
		}
		
	}

	public static void lab4(char cell, int size, boolean isRect)
    {	
    	String data = "";
        if(isRect){
        	for(int i=0; i < size; i++) {
            	data+=Character.toString(cell);
        	}
        	for(int i=0; i < size; i++) {
            	System.out.println(data);
        	}
        }else {
        	for(int i=0; i < size; i++) {
            	data+=Character.toString(cell);
        		System.out.println(data);
        	}
        }
    }
	private static void lab3() {
		Scanner sc= new Scanner(System.in);
		for(int k=0; k<3;k++) {
			System.out.print("숫자를 입력하세요. :");
			
			int N  = sc.nextInt();
			int result = 0;
			
			if(N%2==0) {
				for(int i=0; i <=N; i+=2) {
					result+=i;
				}
			}else {
				for(int i=1; i <=N; i+=2) {
					result+=i;
				}
			}
			System.out.print("결과 값 : ");
			System.out.println(result);
		}
		sc.close();
		
	}

	private static void lab2_1() {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("문자열을 입력하세요. :");
		String str=sc.nextLine();
		for(int i=1; i<=str.length(); i++) {
			System.out.println(str.subSequence(0, i));
		}
		sc.close();
	}

	private static void lab2_2() throws IOException {
		System.out.print("문자열을 입력하세요. :");
		InputStream is =System.in;
		int i;
		String data ="";
		while((i=is.read())!=-1) {
			if(i >= 97 && i<=122) {
				data += (char)(i-32);
				System.out.println(data);
			}else if(i >= 65 && i <=90){
				data += (char)(i);
				System.out.println(data);
			}
			else if(i==32) {
				data += (char)(i);
				System.out.println(data);
			}
		}
	}

	private static void lab1() {		
		Scanner sc= new Scanner(System.in);
		System.out.print("초기값을 정수로 입력하세요.: ");
		int st=sc.nextInt();
		System.out.println("");
		System.out.print("마지막 값을 정수로 입력하세요.: ");
		int e=sc.nextInt();
		System.out.println("");
		System.out.print("증가분을 정수로 입력하세요.: ");
		int add =sc.nextInt();
		System.out.println("");
		int sum=0;
		for(int i=st;i<=e;i+=add) {
			sum+=i;
		}
		if(sum>1000) sum+=2000;
		System.out.printf("총합은 %d 입니다.",sum);
		sc.close();
	}

}
=======
package lab1;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;



public class lab1 {
	public static void main(String[] args) throws IOException { 
//		lab1();
//		lab2_1();
//		lab2_2();
//		lab3();
//        lab4('&',4, false); 
//        lab5();
	}
	
    private static void lab5() {
		Scanner sc= new Scanner(System.in);
		int N = sc.nextInt();
		String data = "";
		for(int i=0; i<N;i++) {
			data+="*";
		}
		for(int i=N; i>=0; i--) {
			System.out.println(data.subSequence(0, i));
		}
		
	}

	public static void lab4(char cell, int size, boolean isRect)
    {	
    	String data = "";
        if(isRect){
        	for(int i=0; i < size; i++) {
            	data+=Character.toString(cell);
        	}
        	for(int i=0; i < size; i++) {
            	System.out.println(data);
        	}
        }else {
        	for(int i=0; i < size; i++) {
            	data+=Character.toString(cell);
        		System.out.println(data);
        	}
        }
    }
	private static void lab3() {
		Scanner sc= new Scanner(System.in);
		for(int k=0; k<3;k++) {
			System.out.print("숫자를 입력하세요. :");
			
			int N  = sc.nextInt();
			int result = 0;
			
			if(N%2==0) {
				for(int i=0; i <=N; i+=2) {
					result+=i;
				}
			}else {
				for(int i=1; i <=N; i+=2) {
					result+=i;
				}
			}
			System.out.print("결과 값 : ");
			System.out.println(result);
		}
		sc.close();
		
	}

	private static void lab2_1() {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("문자열을 입력하세요. :");
		String str=sc.nextLine();
		for(int i=1; i<=str.length(); i++) {
			System.out.println(str.subSequence(0, i));
		}
		sc.close();
	}

	private static void lab2_2() throws IOException {
		System.out.print("문자열을 입력하세요. :");
		InputStream is =System.in;
		int i;
		String data ="";
		while((i=is.read())!=-1) {
			if(i >= 97 && i<=122) {
				data += (char)(i-32);
				System.out.println(data);
			}else if(i >= 65 && i <=90){
				data += (char)(i);
				System.out.println(data);
			}
			else if(i==32) {
				data += (char)(i);
				System.out.println(data);
			}
		}
	}

	private static void lab1() {		
		Scanner sc= new Scanner(System.in);
		System.out.print("초기값을 정수로 입력하세요.: ");
		int st=sc.nextInt();
		System.out.println("");
		System.out.print("마지막 값을 정수로 입력하세요.: ");
		int e=sc.nextInt();
		System.out.println("");
		System.out.print("증가분을 정수로 입력하세요.: ");
		int add =sc.nextInt();
		System.out.println("");
		int sum=0;
		for(int i=st;i<=e;i+=add) {
			sum+=i;
		}
		if(sum>1000) sum+=2000;
		System.out.printf("총합은 %d 입니다.",sum);
		sc.close();
	}

}
>>>>>>> 7968e9a1b3ab56523a2e2a4a8894f1b58ecbb6e8
