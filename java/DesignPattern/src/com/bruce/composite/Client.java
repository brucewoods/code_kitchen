package com.bruce.composite;

public class Client {
	public static void main(String[] args) {
		//todo   more logics
        OrganizationComponent university=new University("�廪��ѧ",	"�廪��ѧ");
        
        OrganizationComponent computerCollege=new University("�����ѧԺ",	"�����ѧԺ");
        OrganizationComponent infoCollege=new University("��Ϣ����ѧԺ",	"��Ϣ����ѧԺ");
        
        computerCollege.add(new Department("�������", "�������"));
        
        computerCollege.add(new Department("���繤��", "���繤��"));
        computerCollege.add(new Department("�������ѧ  �뼼��", "�������ѧ  �뼼��"));
       
        infoCollege.add(new Department("ͨ�Ź���", "ͨ�Ź���"));
        infoCollege.add(new Department("��Ϣ����", "��Ϣ����"));
        
        
        university.add(computerCollege);
        university.add(infoCollege);
        
        university.print();
        
	}
}
