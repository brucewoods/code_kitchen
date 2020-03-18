package com.bruce.priciple.ocp;

public class Ocp {
	public static void main(String[] args) {
		// todo more logics
		GraphicEditor graphicEditor = new GraphicEditor();
		graphicEditor.doDraw(new Retangle());
		graphicEditor.doDraw(new Circle());
		graphicEditor.doDraw(new Triangle());
		graphicEditor.doDraw(new Pentagon());

	}
}

class GraphicEditor {
	public void doDraw(Shape shape) {
		if (shape.m_type == 1) {
			drawRetangle();

		} else if (shape.m_type == 2) {

			drawCircle();
		} else if (shape.m_type == 3) {

			drawTriangle();
		} else if (shape.m_type == 5) {

			drawPentagon();
		}

	}

	void drawRetangle() {
		System.out.println("绘制矩形");
	}

	void drawCircle() {
		System.out.println("绘制圆形");
	}

	void drawTriangle() {
		System.out.println("绘制三角形");
	}

	void drawPentagon() {
		System.out.println("绘制五角形");
	}
}

class Shape {
	int m_type;
}

class Retangle extends Shape {
	public Retangle() {
		// TODO Auto-generated constructor stub
		super.m_type = 1;
	}
}

class Circle extends Shape {
	public Circle() {
		super.m_type = 2;
	}
}

class Triangle extends Shape {
	public Triangle() {
		// TODO Auto-generated constructor stub
		super.m_type = 3;
	}
}

class Pentagon extends Shape {
	public Pentagon() {
		// TODO Auto-generated constructor stub
		super.m_type = 5;
	}
}
