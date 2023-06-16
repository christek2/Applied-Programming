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
        cout << endl;
        cout << "Welcome to Scattergories." << endl;
        cout << endl;
        cout << "The goal of the game is to think of a word for each prompt that starts with the random letter given. Grab" << endl << "a piece of paper and something to write with. When prompted, choose how many prompts you would like to answer" << endl << "and start a timer for each round. When the timer ends, stop and tally your points for each word you wrote down!" << endl;
        cout << endl;

        int promptNum;
        cout << "How many prompts would you like (max 60)?" << endl;
        cout << "> ";
        cin >> promptNum;
        cout << endl;

    // this is the block that calls what will produce the prompts:
        int ind = 1;

        Prompt prom;
        list<string> prompts = prom.getPrompts(promptNum);
        for (string z : prompts) {
            cout << ind << ". " << z << ":" << endl;
            ind = ind + 1;
        }
        cout << endl;

    // this is the call to the class method that finds the random letter:
        Letter let;
        let.getLetter();

    // this is the block that decides what to do when the game is over:
        bool timeUp = true;
        while (timeUp) {
            string voidStr;
            cout << "Enter 'f' when the time has run out:" << endl;
            cout << "> ";
            cin >> voidStr;
            cout << endl;

            bool askForInput = true;
            while (askForInput) {
                cout << "Enter 'n' for new letter, 'r' to restart game or 'q' to quit game" << endl;
                cout << "> ";
                cin >> response;
                cout << endl;

                if (response == "n") {
                    ind = 1;
                    for (string y : prompts) {
                        cout << ind << ". " << y << ":" << endl;
                        ind = ind + 1;
                    }
                    cout << endl;
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