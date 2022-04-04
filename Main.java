package atmUygulamasi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String userName,password;
		int right=3;
		int selection,balance=1500,newBalance=0,amount;
		
		while(right>0) {
			System.out.print("Kullanýcý adýnýzý giriniz: ");
			userName=scanner.nextLine();
			System.out.print("Kullanýcý adýnýzý giriniz: ");
			password=scanner.nextLine();
			
			if(userName.equals("user")&&password.equals("1235")) {
				System.out.println("Giriþ baþarýlý. ");
				System.out.println("Yapmak istediðiniz iþlemi seçiniz");
				System.out.println("1-Para yatýrma 2-Para çekme 3-Bakiye sorgulama 4-Çýkýþ ");
				switch (selection=scanner.nextInt()) {
				case 1: System.out.print("Yatýrcaðýnýz miktarý giriniz: ");
						amount=scanner.nextInt();
						newBalance=balance+amount;
						System.out.println("Yeni bakiye: "+newBalance+" tl");
						break;
				case 2:	System.out.print("Çekeceðiniz miktarý giriniz: ");
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
				
				case 4:System.out.println("Çýkýþ yapýldý.");
				
				}
			}else {
				right--;
				System.out.println("Giriþ baþarýsýz "+right+" hakkýnýz kaldý.");
				if(right==0) System.out.println("3 defa yanlýþ þifre girildiðinden hesabýnýz bloke edildi");
			}
			
		}
	}

}
