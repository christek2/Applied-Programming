#include <iostream>
#include <vector>
#include <string>
#include <list>
#include <cstdlib>
#include <bits/stdc++.h>
#include <fstream>

using namespace std;

class Prompt {
    public:

    void getPrompts(int promptNum) {
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
        cout << endl;
    }
};