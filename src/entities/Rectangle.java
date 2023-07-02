package entities;

import entities.enums.Color;

public class Rectangle extends Shape {

	
	private Double width;
	private Double heigth;
	
	private Rectangle () {
		super();
	}

	
	
	public Double getWidth() {
		return width;
	}



	public void setWidth(Double width) {
		this.width = width;
	}



	public Double getHeigth() {
		return heigth;
	}



	public void setHeigth(Double heigth) {
		this.heigth = heigth;
	}



	public Rectangle(Color color, Double width, Double heigth) {
		super(color);
		this.width = width;
		this.heigth = heigth;
	}


	@Override
	public double area() {
		// TODO Auto-generated method stub
		return width * heigth;
	}

}
