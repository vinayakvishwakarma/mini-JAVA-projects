package com.app.pen;

import java.time.LocalDate;
import java.util.Objects;

public class Pen {
	private int id;
	private PenBrand brand;
	private PenColor color;
	private PenInkColor inkColor;
	private PenMaterial material;
	private int stock;
	private LocalDate stockUpdateDate;
	private LocalDate stockListingDate;
	private double price;
	private double discount;
	private static int counter=0;
	
	public Pen(PenBrand brand, PenColor color, PenInkColor inkColor, PenMaterial material, int stock,
			LocalDate stockUpdateDate, LocalDate stockListingDate, double price, double discount) {
		counter++;
		this.id=counter;
		this.brand = brand;
		this.color = color;
		this.inkColor = inkColor;
		this.material = material;
		this.stock = stock;
		this.stockUpdateDate = stockUpdateDate;
		this.stockListingDate = stockListingDate;
		this.price = price;
		this.discount = discount;
	}
	
	public Pen(int id) {
		this.id=id;
	}

	@Override
	public String toString() {
		return "Pen [id=" + id + ", brand=" + brand + ", color=" + color + ", inkColor=" + inkColor + ", material="
				+ material + ", stock=" + stock + ", stockUpdateDate=" + stockUpdateDate + ", stockListingDate="
				+ stockListingDate + ", price=" + price + ", discount=" + discount + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public PenBrand getBrand() {
		return brand;
	}

	public void setBrand(PenBrand brand) {
		this.brand = brand;
	}

	public PenColor getColor() {
		return color;
	}

	public void setColor(PenColor color) {
		this.color = color;
	}

	public PenInkColor getInkColor() {
		return inkColor;
	}

	public void setInkColor(PenInkColor inkColor) {
		this.inkColor = inkColor;
	}

	public PenMaterial getMaterial() {
		return material;
	}

	public void setMaterial(PenMaterial material) {
		this.material = material;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public LocalDate getStockUpdateDate() {
		return stockUpdateDate;
	}

	public void setStockUpdateDate(LocalDate stockUpdateDate) {
		this.stockUpdateDate = stockUpdateDate;
	}

	public LocalDate getStockListingDate() {
		return stockListingDate;
	}

	public void setStockListingDate(LocalDate stockListingDate) {
		this.stockListingDate = stockListingDate;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Pen) {
			Pen pen=(Pen)obj;
			return this.getId()==pen.getId();
		}
		return false;
	}
	
	
	
	
	

}
