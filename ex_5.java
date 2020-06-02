package repetição;

import java.util.Scanner;

public class ex_5 {

	public static void main(String[] args) {
		
		Scanner leitor=new Scanner(System.in);
;	
		int c=1,qntd;
		float altura,alturaM = 0,alturaME=1000;
		char sexo;
		double salario, media=0;
		
		while(c<=20) {
			
			System.out.println(c+"º funcionário");
			
			System.out.println("gidite a altura");
			altura=leitor.nextFloat();
			
			System.out.println("digite o sexo f/m");
			sexo=leitor.next().charAt(0);
			
			System.out.println("digite o salário");
			salario=leitor.nextDouble();
			
			media += salario;
			
			
			c++;
			 
			if(altura > alturaM) 
				alturaM =altura;
			
			if(altura>alturaME)
				alturaME=altura;
			
			if(sexo == "f" && salario < 1000)
			qntd++;
		
		}
			media=media/20;
			
			System.out.println("média salarial: " +media);
			System.out.println("maior altura: " +alturaM);
			System.out.println("menor altura: " + alturaME);
			System.out.println("mulher com alário até 1000: "+ qntd);
	}

}
