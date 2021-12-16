public class Ex4LacosdeDecisao {
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double numero, calculo;
		String texto;
		
		System.out.println("Digite um numero: ");
		numero = in.nextDouble();
		
		if (numero % 2 == 0) {
			calculo = Math.sqrt(numero);
			texto = "O número " + numero + " é par e sua raiz quadrada é " + calculo;
			
		} else {
			calculo = Math.pow(numero, 2);
			texto = "O número " + numero + " é ímpar e seu quadrado é " + calculo;
		}
		System.out.println(texto);
		in.close();
	}	
}
    
}
