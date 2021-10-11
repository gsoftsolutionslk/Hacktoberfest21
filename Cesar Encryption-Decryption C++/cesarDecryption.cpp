#include<iostream>
#include<string>

using namespace std;

int main(){
    int i,j,k;
    string s,t;
    int key;
	
    cout<<"Enter the key\n";
    cin>>key;
    cout<<"Enter the message to decrypt\n";
    cin>>s;
	
    for(i=0;i<s.size();i++){
        t+=(s[i]-'A'-key+26)%26+'A';
    }
	
    cout<<"\n\nDecrypted message is "<<t<<'\n';
    return 0;
}