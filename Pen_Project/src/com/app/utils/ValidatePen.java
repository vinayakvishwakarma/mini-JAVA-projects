package com.app.utils;

import java.time.LocalDate;
import java.util.List;

import com.app.exception.PenCustomException;


import com.app.pen.Pen;
import com.app.pen.PenBrand;
import com.app.pen.PenColor;
import com.app.pen.PenInkColor;
import com.app.pen.PenMaterial;

public class ValidatePen {
	/*" brand\n"
	+ "	color\n"
	+ "	penColorr\n"
	+ "	material\n"
	+ "	stock\n"
	+ "	updateDate\n"
	+ "	listDate\n"
	+ "	price\n"
	+ "	discount\n"
	+ "");*/
	public static Pen validatePenInput(String brand,String color,String penInkColor,String material,
			int stock,String updateDate,String listDate,double price,double discount) throws PenCustomException{
		PenBrand br=parsePenBrand(brand);
		PenColor clr=parsePenColor(color);
		PenInkColor ink=parsePenInkColor(penInkColor);
		PenMaterial mtr=parsePenMaterial(material);
		
		return new Pen(br,clr,ink,mtr,stock,parseDate(updateDate),parseDate(listDate),price,discount);
		
	}
	public static PenBrand parsePenBrand(String brand) throws PenCustomException {
		PenBrand br= PenBrand.valueOf(brand.toUpperCase());
		if(br==null) {
			throw new PenCustomException("Invalid brand!");
		}
		return br;
	}
	public static PenColor parsePenColor(String color)throws PenCustomException{
		PenColor clr=PenColor.valueOf(color.toUpperCase());
		if(clr==null) {
			throw new PenCustomException("Invalid Pen Color!!");
		}
		return clr;
	}
	public static PenInkColor parsePenInkColor(String inkColor)throws PenCustomException {
		PenInkColor ink=PenInkColor.valueOf(inkColor.toUpperCase());
		if (ink==null) {
			throw new PenCustomException("Invalid Ink Color");
		}
		return ink;
	}
	public static PenMaterial parsePenMaterial(String material)throws PenCustomException{
		PenMaterial mtr=PenMaterial.valueOf(material.toUpperCase());
		if(mtr==null) {
			throw new PenCustomException("Invalid Material!!");
		}
		return mtr;
	}
	public static LocalDate parseDate(String date) {
		return LocalDate.parse(date);
	}
	public static Pen validatePenDetails(int id,List<Pen> penList)throws PenCustomException {
		Pen pen=new Pen(id);
		if(penList.contains(pen)) {
			return pen;
		}
		throw new PenCustomException("pen not found!");
		
		
	}


}
