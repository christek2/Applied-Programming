#include <iostream>
#include <vector>
#include <string>
#include <list>
#include <cstdlib>
#include <bits/stdc++.h>
#include <fstream>

using namespace std;

class Letter {
    public:

    void getLetter() {
        list<string> letters;
        string let;

        fstream file1;
        string details1;
        file1.open("letters.csv", ios::in);
        for (int j = 1; j<=26; j++) {
            getline(file1, details1);
            letters.push_back(details1);
        }

        srand(time(0));
        int randNum1 = rand() % 26;
        int letterIndex = 0;

        for (string x : letters) {
            if (letterIndex == randNum1){
                cout << "Letter: ";
                cout << x << endl;
            }
            letterIndex = letterIndex + 1;
        }
        cout << endl;
    }
};