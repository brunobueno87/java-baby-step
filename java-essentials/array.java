import java.util.Arrays;
import java.util.List;


public class array {
    public static void main(String[] args) {
	
       // estrutura de dados simples para armazenar uma colecao de elemntos

       // forma mais comum de declarar arrays
       int[] arrayDeInt;
       //forma menos comum
       int arrayDeInt2 [];

       //inicializando um array - caso voce ja saiba o numero de elementos
       int[] arrayDeInt3 = new int[20];

       //preenchendo o array
       Integer[] arrayDeInt4 = {1,2,3,4,5,6,7,8,9,10};

       //descobrindo o tamanho do array
       int arraySize = arrayDeInt4.length;
//	System.out.println("O Tamanho do array é" + arraySize);

       
       //percorrendo o array
       List<Integer> itens = Arrays.asList(arrayDeInt4);
       //  itens.forEach(System.out::println);
       
       //copiando um array - copyOfRange
       String[] treinamento = new String[]{"treinamento", "descomplicando", "java", "e", "spring", "da", "linux", "tips"};
       String[] treinamentoNome = Arrays.copyOfRange(treinamento, 1, 5);
       List<String> treinamentoList = List.of(treinamento);
       List<String> treinamentoNomeList = List.of(treinamentoNome);
    //   treinamentoList.forEach(System.out::println);
    //   treinamentoNomeList.forEach(System.out::println);


       //copy of - nao consegue escolher o range
       String[] arrayCom2 = Arrays.copyOf(treinamentoNome, 2);
       List<String> arrayCom2List = List.of(arrayCom2);
      // arrayCom2List.forEach(System.out::println);


       //preenchendo um aray - fill
       String[] java = new String[10];
       Arrays.fill(java, "java");
       List<String> javaList = List.of(java);
//     javaList.forEach(System.out::println);


       int[] arrayDeIntUm = {
       	1,2,3,4,5,6,7,8,9,10
       };
       int[] arrayDeIntDois = {
        1,2,3,4,5,6,7,8,9,11
       
       };
//       System.out.println("Os arrays sao iguais ???" + 
//	       Arrays.equals(arrayDeIntUm, arrayDeIntDois));
//
	//sorted
	String[] sorted = Arrays.copyOf(treinamento, 5);
	Arrays.sort(sorted);
	List<String> sortedList = List.of(sorted);
	sortedList.forEach(System.out::println);

    }

} 
