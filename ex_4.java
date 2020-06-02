package repetição;

import java.util.Scanner;

public class ex_4 {
	
	int n, numM=0, C=0;
	
	Scanner leitor=new Scanner(System.in);
	
	while(n<=15) {
		System.out.println("digite um número");
		n=leitor.nextInt();
		
		if(n>numM)
			numM=n;
		
		
		C++;
	}
	
	System.out.println("o maior número é " + numM);
	
	}

}
