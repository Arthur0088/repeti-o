package repetição;

import java.util.Scanner;

public class ex_3 {

	 public static void main(String[] args) {
	     
	        Scanner leitor = new Scanner(System.in);
	        
	        int c = 1;
	        int valor;
	        int soma = 0 ,media;
	        
	        System.out.println("Digite  os 20 números");
	        do {
	            System.out.printf("%dN:",c);
	            valor = leitor.nextInt();
	            ++c; 
	          soma = soma + valor;
	          media = soma/20;
	          
	        } while (c<= 20);
	         
	         System.out.println(soma);
	         System.out.println(media);
	 }}
