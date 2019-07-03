#include <iostream>
using namespace std;

int main(){
    int user_request;
    cout << "Enter how many times you want to print hello, world"<<endl;
    cin >> user_request;
    for(int i = 0; i < user_request; i++){
        cout<< "Hello, world!"<<endl;
    }
    return 0;
}