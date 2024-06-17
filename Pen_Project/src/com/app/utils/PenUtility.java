package com.app.utils;

import java.time.LocalDate;
import java.time.Period;
import java.util.Iterator;
import java.util.List;

import com.app.exception.PenCustomException;
import com.app.pen.Pen;

public class PenUtility {
	public static String updatePenStock(Pen pen,int stock,List<Pen> penList)throws PenCustomException{
		int index=penList.indexOf(pen);
		Pen pen1=penList.get(index);
		pen1.setStock(stock+pen1.getStock());
		pen1.setStockUpdateDate(LocalDate.now());
		return "Pen Stock updated";
		
	}
	public static void addDiscount(List<Pen> penList)throws PenCustomException{
		for(Pen pen:penList) {
			int year=Period.between(pen.getStockUpdateDate(), LocalDate.now()).getYears();
			int month=Period.between(pen.getStockUpdateDate(), LocalDate.now()).getMonths()+year*12;
			if(month>=3) {
				//pen.setDiscount(pen.getPrice()*.20); OR
				double price=pen.getPrice();
				double disc=price*0.20;
				pen.setDiscount(disc);
			}
		}
	}
	public static void removePen(List<Pen> penList)throws PenCustomException{
		Iterator<Pen> itr=penList.iterator();
		while(itr.hasNext()) {
			int year=Period.between(itr.next().getStockUpdateDate(), LocalDate.now()).getYears();
			int month=Period.between(itr.next().getStockUpdateDate(), LocalDate.now()).getMonths()+year*12;
			if (month>=9) {
				itr.remove();
			}
		}
	}
	

}
