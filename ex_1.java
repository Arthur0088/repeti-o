package primeiraaula;

import java.util.Scanner;


public class ex_1 {

	public static void main(String[] args) {
	
		Scanner leitor=new Scanner(System.in);
		
		int num=1;
		
		while(num!=0) {
			System.out.println("digite um n�mero");
			num=leitor.nextInt();
			
			if(num>0) {
				System.out.println("positivo");
			}
			else if(num<0) {
				System.out.println("negativo");
			}
			else {
				System.out.println("n�mero igual a zero");
			}
		}
		
		
	}
		
		

}
