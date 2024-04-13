public class condicionais {
     public static void main(String[] args) {
      
	//if-else/ else-if 
	long valor1 = 198379837423649286L;
	long valor2 = 12345677L;

	if (valor1 == valor2) {
		System.out.println("sao iguais");
	} else if (valor1 < valor2){
		System.out.println("valor1 é menor que valor2");
	} else {
		System.out.println("sao diferentes");
	
	}

	//switch case
	String nomeDoMes = "java";
	switch (nomeDoMes){
		case "janeiro":
		System.out.println(1);
		break;
		case "fevereiro":
		System.out.println(2);
		break;
		case "marco":
		System.out.println(3);
		break;
		case "abril":
		System.out.println(4);
		break;
		case "maio":
		System.out.println(5);
		break;
		case "junho":
		System.out.println(6);
		break;
		case "julho":
		System.out.println(7);
		break;
		case "agosto":
		System.out.println(8);
		break;
		case "setembro":
		System.out.println(9);
		break;
		case "outubro":
		System.out.println(10);
		break;
		case "novembro":
		System.out.println(11);
		break;
		case "dezembro":
		System.out.println(12);
		break;
		default: System.out.println("que mes e esse?");
                break;
	}

     }

}
