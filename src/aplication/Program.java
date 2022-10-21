package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		double[] vect = new double [n];
		
		for (int i=0;i<vect.length;i++) {
			System.out.printf("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		
		double media = 0.0;
		double soma = 0.0;
		
		for (int i=0;i<vect.length;i++) {
			soma += vect[i];
		}
		
		media = soma/vect.length;
		
		for (int i=0;i<vect.length;i++) {
			soma += vect[i];
		}
		
		System.out.println();
		System.out.printf("Media do vetor = %.3f%n", media);
		System.out.println("Elementos abaixo da media : ");
		
		for(int i=0;i<vect.length;i++) {
			if(vect[i] < media) {
				System.out.println(vect[i]);
			}
		}
		sc.close();

	}

}
