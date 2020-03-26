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
		System.out.println("��һ��,�췴�ϺõĲ���");
	}

	void addCondiments() {

	}

	void soak() {
		System.out.println("�ڶ���,��ʼ����...");
	}

	void beat() {
		System.out.println("���Ĳ�,��ʼ����...");
	}
    //���ӷ���
	boolean hasCondiments() {
		return true;
	}
}
