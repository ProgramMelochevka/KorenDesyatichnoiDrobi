package by.home.maxzzzit;

import java.util.Scanner;

public class KorenDesyatichnoiDrobi {

	public static void main(String[] args) {
		// Написать цикл, который принимает с клавиатуры 5 десятичных дробей и для введенных
		// положительных значений выводит на экран квадратные корни (с соответствующим текстовым сообщением)
		Scanner scn = new Scanner(System.in);
		double drob = 0, sq;
		System.out.println("Введите дробное число: ");
		for (int i = 0; i < 5; i++) {
			drob = scn.nextDouble();
			if (drob > 0) {
				sq = Math.sqrt(drob);
				System.out.println("Корень подожительной дроби " + drob + " равен " + sq);
			} else
				System.out.println("Нельзя извлечь положительный корень");
		}
	}

}
