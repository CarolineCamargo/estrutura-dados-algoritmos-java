package com.caroline.estruturadados.vetor.teste;

import com.caroline.estruturadados.vetor.Lista;

public class Aula11 {

	public static void main(String[] args) {
		
		Lista<Contato> vetor = new Lista<Contato>(1);
		
		Contato c1 = new Contato ("Contato1", "1234-5678", "contato1@email.com");
		
		vetor.adiciona(c1);
	}
}
