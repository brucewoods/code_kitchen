package com.example.demo.adapter;


public interface Controller{
	
}

class HttpController implements Controller{
	public void doHttpHandler() {
		System.out.println("http request processing...");
	}
	
}
class SimpleController implements Controller{
	public void doSimpleHandler() {
		System.out.println("simple request processing...");
	}
}
class AnnotationController implements Controller{
	public void doAnnotationHandler() {
		System.out.println("annotation request processing...");
	}
}