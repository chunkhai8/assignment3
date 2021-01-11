package assignment3;

import java.util.Scanner;

public class assignment3 {

	public static void main(String[] args) {
		
		forloop();
		System.out.println();
		
		String[] cake = {"blackforest","carrot","redvelvet"};
		int[] price = {120,90,130};
		
		name (cake);
		System.out.println();
		
		money (price);
		System.out.println();
		System.out.println();
		
		calculation();
		
		System.out.println("-------------------------------------");
		
		whileloop();
		calculationwhileloop();
		
		System.out.println("-------------------------------------");
		
		dowhile();
		
		name (cake);
		System.out.println();
		
		money (price);
		System.out.println();
		System.out.println();
		
		calculation();
		
	}
	
	public static void forloop() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Customer name: ");
		String name = in.next();
		System.out.print("Age customer: ");
		int age = in.nextInt();
		System.out.print("Gender customer: ");
		String gender = in.next();
		System.out.print("Phone customer:");
		String phone = in.next();

	}
	
	public static void name (String[] x) {
		
		System.out.println("The lists of cake: " );
		for (int i = 0; i<x.length;i++) {
			System.out.println(x[i]);
		}	
	}
	
	public static void money (int[] y) {
		System.out.println("The price of blackforest cake, carrot cake and redvelvet cake is " );
			for (int j =0; j<y.length;j++) {
				System.out.print("RM"+ y[j]+" ");
			}
			
	}
	
	public static void calculation() {
		Scanner in = new Scanner(System.in);
		
		String[] cake = {"blackforest","carrot","redvelvet"};
		int[] price = {120,90,130};
		
		System.out.print("Quantity of "+cake[0]+ " cake:");
		int qcake1 = in.nextInt();
		System.out.print("Quantity of "+cake[1]+ " cake:");
		int qcake2 = in.nextInt();
		System.out.print("Quantity of "+cake[2]+ " cake:");
		int qcake3 = in.nextInt();
		System.out.println();
		
		double sum, dis, paid;
		sum = (price[0]*qcake1)+(price[1]*qcake2)+(price[2]*qcake3);
		
		if(sum > 200 && sum <=400) {//if sum more than 200 got 10% discount
			paid = sum * 90/100;
			dis = sum - paid;
			System.out.println("Total price: RM"+sum);
			System.out.println("Total discount given: RM"+dis);
			System.out.println("Total paid: RM"+paid);
		}else if (sum > 400 && sum <=600) {//if sum more than 400 got 20% discount
			paid = sum * 80/100;
			dis = sum - paid;
			System.out.println("Total price: RM"+sum);
			System.out.println("Total discount given: RM"+dis);
			System.out.println("Total paid: RM"+paid);
		}else if (sum > 600) {//if sum more than 600 got 30% discount
			paid = sum * 70/100;
			dis = sum - paid;
			System.out.println("Total price: RM"+sum);
			System.out.println("Total discount given: RM"+dis);
			System.out.println("Total paid: RM"+paid);
		}
		
	}
	
	public static void whileloop() {
		Scanner in = new Scanner(System.in);
		
		String[]name = {"Azli", "Siti", "Zhong"};
		

		int i=0;
		while(i<1) {			
			name1(name);
			System.out.println("Costumer name: " +name[i]);
			i++;
			}	
		System.out.print("Age customer: ");
		int age = in.nextInt();
		System.out.print("Gender customer: ");
		String gender = in.next();
		System.out.print("Phone customer:");
		String phone = in.next();
		System.out.println();
	}
	
	public static void name1 (String[] a) {
		for (int i=0; i<a.length; i++) {
				
			}
		}
		
	public static void calculationwhileloop() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Product of cake:1. ");
		String cake1 = in.next();
		System.out.print("Product of cake:2. ");
		String cake2 = in.next();
		System.out.print("Product of cake:3. ");
		String cake3 = in.next();
		System.out.println();
	
		System.out.print("Price of a "+cake1+ " cake:RM ");
		int pcake1 = in.nextInt();
		System.out.print("Price of a "+cake2+ " cake:RM ");
		int pcake2 = in.nextInt();
		System.out.print("Price of a "+cake3+ " cake:RM ");
		int pcake3 = in.nextInt();
		System.out.println();
	
		System.out.print("Quantity of "+cake1+ " cake:");
		int qcake1 = in.nextInt();
		System.out.print("Quantity of "+cake2+ " cake:");
		int qcake2 = in.nextInt();
		System.out.print("Quantity of "+cake3+ " cake:");
		int qcake3 = in.nextInt();
		System.out.println();
	

	double sum, dis, paid;
	sum = (pcake1*qcake1)+(pcake2*qcake2)+(pcake3*qcake3);
	
	if(sum>0 && sum<=200) {
		System.out.println("Total price: RM"+sum);
		System.out.println("No discount given.");
		System.out.println("Total paid: RM"+sum);
	}else if (sum > 200 && sum <=400) {//if sum more than 200 got 10% discount
		paid = sum * 90/100;
		dis = sum - paid;
		System.out.println("Total price: RM"+sum);
		System.out.println("Total discount given: RM"+dis);
		System.out.println("Total paid: RM"+paid);
	}else if (sum > 400 && sum <=600) {//if sum more than 400 got 20% discount
		paid = sum * 80/100;
		dis = sum - paid;
		System.out.println("Total price: RM"+sum);
		System.out.println("Total discount given: RM"+dis);
		System.out.println("Total paid: RM"+paid);
	}else if (sum > 600) {//if sum more than 600 got 30% discount
		paid = sum * 70/100;
		dis = sum - paid;
		System.out.println("Total price: RM"+sum);
		System.out.println("Total discount given: RM"+dis);
		System.out.println("Total paid: RM"+paid);
	}
	}
	
	public static void dowhile(){
		Scanner in = new Scanner(System.in);
		String[]name = {"Azli", "Siti", "Zhong"};
		int q=2;
		do {
			name2(name);
			System.out.println("Costumer name: " +name[q]);	
			q++;
	}while(q<1);
		System.out.print("Age customer: ");
		int age = in.nextInt();
		System.out.print("Gender customer: ");
		String gender = in.next();
		System.out.print("Phone customer:");
		String phone = in.next();
		System.out.println();
	

	}
	public static void name2 (String[] a) {
		for (int i=0; i<a.length; i++) {
				
			}
		}
	
	

}
