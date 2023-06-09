#include <iostream>
#include <vector>
#include <string>
#include <list>
#include <cstdlib>
#include <bits/stdc++.h>
#include <fstream>
#include <stdlib.h>
#include "Letter.cpp"
#include "Prompt.cpp"

using namespace std;

int main()
{
    int repeat = 0;
    string response;
    while (repeat == 0) {

    // this block gets the user's input to know how many prompts to produce before the game begins:
        int promptNum;
        cout << "How many prompts would you like?" << endl;
        cout << "> ";
        cin >> promptNum;
        cout << endl;

    // this is the call that will produce the prompts:
        Prompt prom;
        prom.getPrompts(promptNum);

    // this is the call to the class method that finds the random letter:
        Letter let;
        let.getLetter();

    // this is the block that decides what to do when the game is over:
        bool timeUp = true;
        while (timeUp) {
            string voidStr;
            cout << "Press enter when time is up... ";
            cin >> voidStr;
            cout << endl;

            bool askForInput = true;
            while (askForInput) {
                cout << "Enter 'n' for new letter, 'r' to restart game or 'q' to quit game" << endl;
                cout << "> ";
                cin >> response;
                cout << endl;

                if (response == "n") {
                    let.getLetter();
                    askForInput = false;
                }
                else if (response == "r") {
                    main();
                    askForInput = false;
                    timeUp = false;
                    repeat = 1;
                }
                else if (response == "q") {
                    repeat = 1;
                    askForInput = false;
                    timeUp = false;
                }
                else {
                    cout << "Invalid response." << endl;
                }
            }
        }
    }
}