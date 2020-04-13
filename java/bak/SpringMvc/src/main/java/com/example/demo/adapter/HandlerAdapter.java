package com.example.demo.adapter;

public interface HandlerAdapter {

	public boolean supports(Object handler);

	public void handle(Object handler);
}

class SimpleHandlerAdapter implements HandlerAdapter {

	@Override
	public boolean supports(Object handler) {
		return (handler instanceof SimpleController);
	}

	@Override
	public void handle(Object handler) {
		// TODO Auto-generated method stub
		((SimpleController) handler).doSimpleHandler();
	}

}
class HttpHandlerAdapter implements HandlerAdapter {
	
	@Override
	public boolean supports(Object handler) {
		return (handler instanceof HttpController);
	}
	
	@Override
	public void handle(Object handler) {
		// TODO Auto-generated method stub
		((HttpController) handler).doHttpHandler();
	}
	
}
class AnnotationHandlerAdapter implements HandlerAdapter {
	
	@Override
	public boolean supports(Object handler) {
		return (handler instanceof AnnotationController);
	}
	
	@Override
	public void handle(Object handler) {
		// TODO Auto-generated method stub
		((AnnotationController) handler).doAnnotationHandler();
	}
	
}
