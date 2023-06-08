#include <iostream>
#include <vector>
#include <string>
#include <list>
#include <cstdlib>
#include <bits/stdc++.h>
#include <fstream>

using namespace std;

int main()
{
// this block gets the user's input to know how many prompts to produce before the game begins:
    int promptNum;
    cout << "How many prompts would you like?" << endl;
    cout << "> ";
    cin >> promptNum;
    cout << endl;


// this is the block that finds the random letter:
    list<string> letters;

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

        for (string b : letters) {
            if (letterIndex == randNum1){
                cout << b << endl;
            }
            letterIndex = letterIndex + 1;
        }
        cout << "" << endl;


// now starts the block that will produce the prompts:
    list<string> prompts;

    fstream file;
    string details;
        file.open("prompts.csv", ios::in);
        for (int i = 1; i<=26; i++) {
            getline(file, details);
            prompts.push_back(details);
        }

    int removeNum = 0;
    int randNum = 0;
    int index = 0;
    string removeStr;
    int repeat = 0;

    while (repeat < promptNum) {

        index = 0;
        removeStr;

        srand(time(0));
        randNum = (rand() % (26 - removeNum));
        for (string choice : prompts) {
            if (index == randNum) {
                cout << choice << endl;
                removeStr = choice;
                break;
            }
            index = index + 1;
        }

        prompts.remove(removeStr);
        removeNum = removeNum + 1;
        repeat = repeat + 1;
    }
    
    cout << "" << endl;

    // for (string x : prompts) {
    //     cout << x << endl;
    // }
}