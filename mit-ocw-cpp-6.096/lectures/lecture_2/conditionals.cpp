#include <iostream>
using namespace std;

int main(){
    int x = 6;
    int y = 2;
    int z = 10;

    if(x > y){
        cout << "x is greater than y\n"<<endl;
    }
    else if(y > x){
        cout << "y is greater than x\n"<<endl;
    }
    else{
        cout << "x and y are equal!"<<endl;
    }

    switch(z){
        case 1:
            cout << "z is 1" << endl;
            break;
        case 2:
        case 3:
            cout << "z is 2 or 3"<<endl;
            break;
        default:
            cout << "z is neither 1,2 nor 3. In fact it is " << z << endl;
            break;
    }
    return 0;
}