package atmUygulamasi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String userName,password;
		int right=3;
		int selection,balance=1500,newBalance=0,amount;
		
		while(right>0) {
			System.out.print("Kullan�c� ad�n�z� giriniz: ");
			userName=scanner.nextLine();
			System.out.print("Kullan�c� ad�n�z� giriniz: ");
			password=scanner.nextLine();
			
			if(userName.equals("user")&&password.equals("1235")) {
				System.out.println("Giri� ba�ar�l�. ");
				System.out.println("Yapmak istedi�iniz i�lemi se�iniz");
				System.out.println("1-Para yat�rma 2-Para �ekme 3-Bakiye sorgulama 4-��k�� ");
				switch (selection=scanner.nextInt()) {
				case 1: System.out.print("Yat�rca��n�z miktar� giriniz: ");
						amount=scanner.nextInt();
						newBalance=balance+amount;
						System.out.println("Yeni bakiye: "+newBalance+" tl");
						break;
				case 2:	System.out.print("�ekece�iniz miktar� giriniz: ");
						amount=scanner.nextInt();
						if(amount>balance) {
						System.out.println("Bakiye yetersiz.");	
						}else {
						newBalance=balance-amount;						
						System.out.println("Yeni bakiye: "+newBalance+" tl");	
						}
						
						break;
				case 3: System.out.println("Bakiyeniz: "+ newBalance+" tl" );
						break;
				
				case 4:System.out.println("��k�� yap�ld�.");
				
				}
			}else {
				right--;
				System.out.println("Giri� ba�ar�s�z "+right+" hakk�n�z kald�.");
				if(right==0) System.out.println("3 defa yanl�� �ifre girildi�inden hesab�n�z bloke edildi");
			}
			
		}
	}

}
