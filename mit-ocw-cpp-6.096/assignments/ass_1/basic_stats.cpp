#include <iostream>
using namespace std;

int main(){
    int n,range, temp, max_temp, min_temp;
    double mean;

    cout << "Enter the size of the list"<< endl;
    cin >> n;
    cout << n << endl;

    //we take the first values from the user
    cout << "Enter the first number:" << endl;
    cin >> temp;
    max_temp = temp;
    min_temp = temp;
    mean = temp;

    for(int i = 0; i < n-1; i++){
        cin >> temp;
        mean += temp;
        if(temp < min_temp){
            min_temp = temp;
        }
        if(temp > max_temp){
            max_temp = temp;
        }
    }

    cout << "\n" << endl;

    cout << "min = " << min_temp << endl;
    cout << "max = " << max_temp << endl;
    cout << "mean = " << mean / n << endl;
    range = (max_temp - min_temp);
    cout << "range = " << range << endl;
    return(0);
}