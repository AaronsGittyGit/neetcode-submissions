class Solution {
public:
    bool isAnagram(string s, string t) {
        
        if (s.length() != t.length()) {return false;}

        bool isAnagram = false;
        
        string sortS = s;
        sort(sortS.begin(), sortS.end());
        string sortT = t;
        sort(sortT.begin(), sortT.end());

        cout << sortS + " " + sortT << endl;

        if (sortS == sortT) {
            return true;
        }

        return isAnagram;
        

    }
};
