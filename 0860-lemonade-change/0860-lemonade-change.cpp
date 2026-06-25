class Solution {
public:
    bool lemonadeChange(vector<int>& bills) {
        int f =0, t=0;
        for(int a : bills) {
            if(a == 5) f++;
            else if (a == 10){
                if(f == 0){
                    return false;
                }
                f--;
                t++;

            }
            else {


                if(t>0 && f>0){
                    f--;
                    t--;
                }
                else if(f>=3){
                    f -=3;
                }
                else {
                    return false;
                }

            }
        }
        return true;
    }
};