// ConsoleApplication1.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"
#include <iostream>
#include "highgui.hpp"

int main()
{
	std::cout << "what you want";
	IplImage * test = cvLoadImage("F:\\workspace\\workstation\\materials\\1_bematrix\\设计规划\\公司照片\\1.jpg",1);
	cvNamedWindow("opencv_demo", 1);
	cvShowImage("opencv_demo", test);
	cvWaitKey(0);
	cvDestroyWindow("opencv_demo");
    return 0;
}

