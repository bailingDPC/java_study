package com.itstart.shapes;

public class MyPic {
	public static void main(String[] args)
	{
		Picture pic = new Picture(420,250);
		Circle c1 = new Circle(200,40,40);
		Rectangle r1 = new Rectangle(100, 100, 120, 100);
		Triangle t1 = new Triangle(100, 100, 200, 120, 150, 50);
		Line l1 = new Line(0,205,400,205);
		Circle c2 = new Circle(200,200,50);
		pic.add(c1);
		pic.add(r1);
		pic.add(t1);
		pic.add(l1);
		pic.add(c2);
		pic.draw();
	}
}