#include <stdio.h>
#include <iostream>
#include  "opencv2/highgui/highgui.hpp"
using namespace std;
int main(){
    
    printf("what is your want");
    Mat image=imread("D:\\test.jpg");   
    imshow("diplay image",image);
    waitKey(0);
    return 0;
    
    
}