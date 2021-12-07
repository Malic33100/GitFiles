#include <iostream>
#include <iomanip>
#include <fstream>
#include <string>

using namespace std;

void work(){
int income[5];
string Incometype[5];
int check;

cout <<"Type the name of the income type :" << endl;
getline(cin,Incometype);

cout <<"How much does this bring in monthly ?:" << endl;
cin >> check;

int total = income[0] + income[1] + income[2] + income[3] + income[4];

cout <<"Total monthly income is currently at :" << total << endl;

};

void bills(){

};

void future(){

};

void debt(){

};

void house(){

};

void pool(){

};

void over(){

};

int main(){
    int chin;

    cout <<"Welcome to Shillings! What would you like to do today?" << endl;
    cout <<"1: Input income " << endl;
    cout <<"2: Input expenses " << endl;
    cout <<"3: Input investments and savings " << endl;
    cout <<"4: Input Monthly debts " << endl;
    cout <<"5: Calculate how much house you can afford " << endl;
    cout <<"6: Calculate your investment pools " << endl;
    cout <<"7: See an overview of your finances " << endl;
    cin >> chin;

    switch (chin){
        case '1': 
        void work();
        break;
        case '2': 
        void bills();
        break;
        case '3':
         void future();
        break;
        case '4':
         void debt();
        break;
        case '5': 
        void house();
        break;
        case '6': 
        void pool();
        break;
        case '7': 
        void over();
        break;
    }

return 0;
}