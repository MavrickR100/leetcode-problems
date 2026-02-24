class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int tem = x, sum = 0;
        while (tem != 0) {
            sum += tem % 10;
            tem /= 10;
        }

        if (x % sum == 0) {
            return sum;
        }

        return -1;

    }
}