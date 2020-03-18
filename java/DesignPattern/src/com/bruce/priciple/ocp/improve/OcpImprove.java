package com.bruce.priciple.ocp.improve;

public class OcpImprove {
	public static void main(String[] args) {
		// todo more logics
		GraphicEditor graphicEditor=new GraphicEditor();
		graphicEditor.doDraw(new Retangle());
		graphicEditor.doDraw(new Circle());
		graphicEditor.doDraw(new Triangle());
		graphicEditor.doDraw(new Pentagon());

	}
}

class GraphicEditor {
	public void doDraw(Shape shape) {
		 
		shape.draw();
		
	}
}

abstract class Shape {
	int m_type;
	public abstract void draw();
}

class Retangle extends Shape {
	public Retangle() {
		// TODO Auto-generated constructor stub
		super.m_type = 1;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("绘制矩形");
		
	}

}

class Circle extends Shape {
	public Circle() {
		super.m_type = 2;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("绘制圆形");
	}
}

class Triangle extends Shape {
	public Triangle() {
		// TODO Auto-generated constructor stub
		super.m_type = 3;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("绘制三角形");	
	}
}
class Pentagon extends Shape{
	public Pentagon() {
		// TODO Auto-generated constructor stub
		super.m_type=5;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("绘制五角形");
	}
}
