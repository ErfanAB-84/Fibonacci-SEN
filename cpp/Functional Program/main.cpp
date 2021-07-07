#include<iostream>
using namespace std;

long* seq = new long[100];

void fib(int SeqNum) {
    seq[0] = 0;
    seq[1] = 1;

    for(int i=0; i<=SeqNum; i++) {
        seq[i+2] = seq[i] + seq[i+1];
    }
}

int main() {
    cout << "enter seq: ";
    int tmp;
    cin >> tmp;
    if(tmp >=1 && tmp <= 99) {
        fib(tmp);
        for(int i=0; i<=tmp; i++) {
            cout << seq[i] << '\n';
        }
    }
    else {
        cout << "the number should be under 99 and grater then 1 or equal to 1\n";
        main();
    }
}