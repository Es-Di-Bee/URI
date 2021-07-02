#include<bits/stdc++.h>
using namespace std;
int main() {
    int players;
    while (scanf("%d", &players) == true) {
        char a[players] = {0};
        for(int i = 0; i < players; ++i) {
            int x,y,z;
            scanf("%d %d=%d", &x, &y, &z);
            if ((x+y)==z) a[i] = '+';
            else if ((x-y)==z) a[i] = '-';
            else if ((x*y)==z) a[i] = '*';
            else a[i] = 'I';
        }
        int correctPlayers = 0;
        vector<string>v;
        for (int i = 0; i < players; ++i) {
            string name; int index; char operation;
            cin >> name;
            scanf("%d %c", &index, &operation);
            if (a[index-1] == operation) {
                ++correctPlayers;
            } else {
                v.push_back(name);
            }
        }
        if (correctPlayers == players) {
            cout << "You Shall All Pass!" << endl;
        } else if (correctPlayers == 0) {
            cout << "None Shall Pass!" << endl;
        } else {
            sort(v.begin(), v.end());
            for (int i = 0; i < v.size(); ++i) {
                cout << v[i];
                if (i != v.size()-1) {
                    cout << " ";
                }
            }
            cout << endl;
        }
    }
}
