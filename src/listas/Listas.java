package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Listas {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Ana");
		list.add(2,"Marco");
		
		
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("Tamanho da lista: "+list.size());
	
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
		
		list.remove(1);
				
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("Tamanho da lista: "+list.size());
		
		
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
		
		list.removeIf(x -> x.charAt(0) == 'M');//fun��o lambda de predicado (remove x tal que x ponto charAt(0) igual a 'M') 
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("Tamanho da lista: "+list.size());
	
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++");

		System.out.println("Index of Bob: " +list.indexOf("Bob"));
		System.out.println("Index of Marco: " +list.indexOf("Marco"));

		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'B').collect(Collectors.toList());
		for(String x : result) {
			System.out.println("Todos os nomes encontrados com B: "+x);
		}
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println("O primeiro nome com A encontrado �: "+name);
	}
}
