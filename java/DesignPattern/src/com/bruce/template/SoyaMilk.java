package com.bruce.template;

public abstract class SoyaMilk {

	final void make() {
		select();
		if (hasCondiments()) {
			addCondiments();
		}
		soak();
		beat();
	}

	void select() {
		System.out.println("第一部,造反上好的材料");
	}

	void addCondiments() {

	}

	void soak() {
		System.out.println("第二步,开始浸泡...");
	}

	void beat() {
		System.out.println("第四步,开始搅拌...");
	}
    //钩子方法
	boolean hasCondiments() {
		return true;
	}
}
