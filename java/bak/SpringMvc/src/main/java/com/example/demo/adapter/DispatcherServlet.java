
package com.example.demo.adapter;

import java.util.List;
import java.util.ArrayList;

public class DispatcherServlet {
	public static List<HandlerAdapter> handlerAdapters = new ArrayList<HandlerAdapter>();
 //objlkdfla fldfjadfd33eearfafafafafdfssssSS
	public DispatcherServlet() {
		handlerAdapters.add(new AnnotationHandlerAdapter());
		handlerAdapters.add(new SimpleHandlerAdapter());
		handlerAdapters.add(new HttpHandlerAdapter());

	}

	public void doDispatch() {
		//HttpController controller = new HttpController();
		 SimpleController controller=new SimpleController();
		HandlerAdapter adapter=getHandler(controller);
		adapter.handle(controller);

	}

	public HandlerAdapter getHandler(Controller controller) {
		for (HandlerAdapter adapter : this.handlerAdapters) {
			if (adapter.supports(controller)) {
				return adapter;
			}
			
		}
		return null;
	}

	public static void main(String[] args) {
		new DispatcherServlet().doDispatch();
	}
}