#include <iostream>
#include <string>
using namespace std;

class Bread{
    
    public:
    void  ChargeEnergy(){
     
     cout<< "Charing " << "Energy";
     
    }
   
     
};
int main(){

  Bread bread;
  cout<< Bread::s<< endl;
  bread.ChargeEnergy();
 
}
