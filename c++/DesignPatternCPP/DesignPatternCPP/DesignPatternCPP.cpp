// DesignPatternCPP.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"
#include "iostream"
#include <string>
 
class Car 
{
public:
	virtual void run() = 0;
	virtual void stop() = 0;
	virtual ~Car(){}
};

class  HondarCar :public  Car {
public:
	virtual void  run() override {
		std::cout << "宏达车开跑" << std::endl;
	};
	virtual void stop() override {
		std::cout << "宏达车停止" << std::endl;
	};

};
class  BMWCar :public  Car {
public:
	virtual void  run() override {
		std::string s;
		s = "宝马开路";
		std::getline(std::cin,s);
	
	};
	virtual void stop() override {
		std::string s;
		s = "宝马停止";
		std::cout << "test" << std::endl;
		char c;
		std::cin >>  c;
	
	};

};

 class  AutoSystem:public Car {

 public:

	  AutoSystem(Car * c) {
		_c = c;
	}
 
	virtual void run() override {
		_c->run();
	}
	virtual void stop() override {
		_c->stop();
	}

private:Car * _c;
};
void DIP_test() {
	BMWCar * bw = nullptr;
	bw = new BMWCar;
	AutoSystem* as = new AutoSystem(bw);
	as->stop();
	return;
}
int main()
{
	 
	DIP_test();
	return 0;
}

