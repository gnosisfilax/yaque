package controlDeFlujo;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Elige una opci�n: ");
		int enter = s.nextInt();
		
		switch (enter){
			case 1:
				System.out.println("Elegiste opci�n uno");
			break;
			case 2:
				System.out.println("Elegiste la opci�n dos");
			break;
			default:
				System.out.println("Elecci�n incorrecta");
			break;
		}
		

	}

}
