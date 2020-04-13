#include <iostream>
#include <vector>
#include <string>
#include "opencv2/highgui/highgui.hpp"
using namespace std;

int main()
{
    // vector<string> msg {"Hello", "C++", "World", "from", "VS Code", "and the C++ extension!"};

    // for (const string& word : msg)
    // {
    //     cout << word << " ";
    // }
    // cout << endl;
    // std::cout << "what you want"<< "";
     
	cv::Mat image = cv::imread("F:\\workspace\\workstation\\materials\\1_bematrix\\设计规划\\公司照片\\1.jpg");
	cv::imshow("image7 display test", image);
	cv::waitKey(0);
}