class Solution {
public:
    int minFlips(int a, int b, int c) {
        int count=0;
        for(int i=0; i<32; i++){
            int f=a&1 , t=c&1, s=b&1;
                if((s|f) !=t){
                    if(t==1){
                        count ++;
                    } 
                    else{
                        count += f+s;
                    }
                   

                }
                a>>=1;
                b>>=1;
                c>>=1;
            
        }
        return count;
    }
};