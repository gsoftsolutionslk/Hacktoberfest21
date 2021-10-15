int crashIt;
#include <iostream>
#include <math.h>
using namespace std;

double mathh(double num, double num2, string op) {
    if (op == "*") {
        return num * num2;
    }
    if (op == "/") {
        return num / num2;
    }
    if (op == "+") {
        return num + num2;
    }
    if (op == "-") {
        return num - num2;
    }
		if (op == "^") {
			return pow(num, num2);
		}
		if (op == "sqrt1" or op == "sqrt" or op == "sq") {
			return sqrt(num);
		}
		if (op == "sqrt2") {
			return sqrt(num2);
		}
		if (op == "ln") {
			return log(num);
		}
		if (op == "log2") {
			return log2(num);
		}
		if (op == "log") {
			return log10(num);
		}
		if (op == "rem" or op == "remainder" or op == "fmod") {	
			return fmod(num, num2);
		}
		if (op == "cbrt") {
			return cbrt(num);
		}
	else {
		crashIt = 0;
		return crashIt / crashIt;
	}
}

int main() {
	while (true) {
    double num1;
    double num2;
    double zzz;
    string opmath;
    cout << "Please enter your first number: ";
    cin >> num1;
    cout << "Please enter your second number: ";
    cin >> num2;
    cout << "Please enter your operator (+, -, *, /, ^, sq, rem, log, ln): ";
    cin >> opmath;
    zzz = mathh(num1, num2, opmath);
    cout << "Result: " << zzz << "\n";
	}
}
