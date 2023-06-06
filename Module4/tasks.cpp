#include <iostream>
#include <vector>
#include <string>
#include <list>
#include <cstdlib>

using namespace std;

int main()
{
    // std::list<string> greetings = {
    //     "Ola",
    //     "Oi mano",
    //     "Tudo bem?",
    //     "Como vai",
    //     "Como estas?",
    //     "Bom dia"
    // };

    // for (string i : greetings) {
    //     cout << i << endl;
    // }

    srand(time(0));
    int i = (rand() % 10) + 1;

    cout << i << endl;
}