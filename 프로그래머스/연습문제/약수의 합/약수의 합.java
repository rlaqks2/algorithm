import java.util.stream.*;
class Solution {

    public int solution(int n) {
        int result = 0;
        for (int i=1; i<n/2; i++) {
            if( n % i == 0){
                result += i;
            }
        }
        return result + n;
    }

}