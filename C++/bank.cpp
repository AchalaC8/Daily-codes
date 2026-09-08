#include <iostream>
using namespace std;

int main() {
	class Bank{
	    public:
    	    double balance;
    	    string Acc_num;
    	    
    	    Bank(string an,double b){
    	        balance=b;
    	        Acc_num=an;
    	    };
    	    
    	    void deposit(double amount){
    	        cout<<"The previous balance: "<<balance<<endl;
    	        balance=balance+amount;
    	        cout<<"The amount deposited is: "<<amount<<endl;
    	        cout<<"The current balance: "<<balance<<endl;
    	    };
    	    
    	    void withdraw(double amount){
    	        if(amount>balance){
    	            cout<<"Insufficient balance"<<endl;
    	            return;
    	        };
    	        cout<<"The previous balance: "<<balance<<endl;
    	        balance=balance-amount;
    	        cout<<"The amount withdrawn is: "<<amount<<endl;
    	        cout<<"The current balance: "<<balance<<endl;
    	    };
    	    
    	    void Balance(){
    	        cout<<"The Account number is: "<<Acc_num<<endl;
    	        cout<<"The current balance: "<<balance<<endl;
    	    };
	    
	    
	};
	
	Bank b("AC001",0.00);
	
	b.Balance();
	b.withdraw(77);
	b.deposit(60394.3940);
	b.withdraw(922.88);
	
	
	return 0;
}
