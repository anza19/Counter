#include <iostream>
using namespace std;

int main(){
    int x = 6;
    int y = 2;

    if(x > y){
        cout << "x is greater than y\n"<<endl;
    }
    else if(y > x){
        cout << "y is greater than x\n"<<endl;
    }
    else{
        cout << "x and y are equal!"<<endl;
    }

    return 0;
}