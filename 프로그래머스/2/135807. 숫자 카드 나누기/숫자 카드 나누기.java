class Solution {
    public int solution(int[] arrayA, int[] arrayB) {
        int gcdA = computeGCD(arrayA);
        int candidate1 = checkCondition(gcdA, arrayB) ? gcdA : 0;

        int gcdB = computeGCD(arrayB);
        int candidate2 = checkCondition(gcdB, arrayA) ? gcdB : 0;

        return Math.max(candidate1, candidate2);
    }

    private int computeGCD(int[] arr) {
        int currentGCD = arr[0];
        for (int num : arr) {
            currentGCD = gcd(currentGCD, num);
        }
        return currentGCD;
    }

    private boolean checkCondition(int divisor, int[] arr) {
        for (int num : arr) {
            if (num % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
