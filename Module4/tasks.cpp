#include <iostream>
#include <vector>
#include <string>
#include <list>
#include <cstdlib>
#include <bits/stdc++.h>

using namespace std;

int main()
{
    list<string> greetings;

    greetings.push_back("Ola");
    greetings.push_back("Oi mano");
    greetings.push_back("Tudo bem?");
    greetings.push_back("Como vai?");
    greetings.push_back("Como estas?");
    greetings.push_back("Bom dia");

    int removeNum = 0;
    int randNum = 0;
    int index = 0;
    string removeStr;

    srand(time(0));
    randNum = (rand() % (6 - removeNum));
    // cout << randNum << endl;
    for (string choice : greetings) {
        if (index == randNum) {
            cout << choice << endl;
            removeStr = choice;
            break;
        }
        index = index + 1;
    }

    greetings.remove(removeStr);
    removeNum = removeNum + 1;    
    
    cout << "" << endl;
    for (string i : greetings) {
        cout << i << endl;
    }
}