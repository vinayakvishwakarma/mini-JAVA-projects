package com.app.tester;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static com.app.utils.ValidatePen.*;
import static com.app.utils.PenUtility.*;
import com.app.pen.Pen;

public class Client {

	public static void main(String[] args) {
		//using ArrayList as collection
		List<Pen> penList=new ArrayList<>();
		try(Scanner sc=new Scanner(System.in)){
			boolean exit=false;
			while(!exit) {
				System.out.println("Enter the Choice:\n"
						+"1. Add new Pen\r\n"
						+ "2. Update stock of aPen\r\n"
						+ "3. Set discount of 20% for all the pens which are not at all sold in last 3 months\r\n"
						+ "4. Remove Pens which arenever sold once listed in 9 months\n"
						+ "5. display all pen");
				try {
				switch(sc.nextInt()) {
				case 1://add a new pen
					System.out.println("Give the details:"
							+ " brand\n"
							+ "	color\n"
							+ "	penInkColor\n"
							+ "	material\n"
							+ "	stock\n"
							+ "	updateDate\n"
							+ "	listDate\n"
							+ "	price\n"
							+ "	discount\n"
							+ "");
					
					Pen pen=validatePenInput(sc.next(),sc.next(),sc.next(),sc.next(),
							sc.nextInt(),sc.next(),sc.next(),sc.nextDouble(),sc.nextDouble());
					penList.add(pen);
					System.out.println("Pen Added!");
					break;
				case 2://update stock of a pen.
					System.out.println("Enter the pen Id:");
					Pen pen1=validatePenDetails(sc.nextInt(), penList);
					System.out.println("Enter the new stock:");
					System.out.println(updatePenStock(pen1, sc.nextInt(),penList));
					break;
				case 3://add discount
					addDiscount(penList);
					for(Pen pen2:penList) {
						System.out.println(pen2);
						break;
					}
				case 4://remove
					removePen(penList);
					System.out.println("pen removed!");
					for(Pen pen3:penList) {
						System.out.println(pen3);
					
					}
					break;
					
				case 5://display all stock
					System.out.println("all pens:");
					for(Pen pen2:penList) {
						System.out.println(pen2);
					}
					break;
				default :
					break;
					
				}
			}
				catch (Exception e) {
					System.out.println(e);
					sc.nextLine();
				}
		}
		

	}

}
}
