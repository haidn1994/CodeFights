/*

Given an integer n, return the largest number that contains exactly n digits.

Example

For n = 2, the output should be
largestNumber(n) = 99.

Input/Output

    [time limit] 3000ms (java)

    [input] integer n

    Constraints:
    1 ≤ n ≤ 7.

    [output] integer

    The largest integer of length n.

*/

int largestNumber(int n) {
    // 10^n이 n+1자리수에서 가장 작은 수라는 점을 이용하면
    // 제곱함수를 정의해서 10^n을 구한다.
    // 그 다음 여기서 1을 빼면 n자리 수에서 가장 큰 수임이 보장되므로
    // 다음과 같이 문제를 풀 수 있다.

    //math 클래스의 제곱을 사용하면 더 짧게 풀 수도 있을것 같은데... 
    return basePowerExponent(10, n) - 1;
}

int basePowerExponent (int base, int exponent){
	// 1은 곱셈에 대한 항등원	   밑         지수  
    int result = 1;
    
    // 제곱은 재귀함수와 비슷하다. 재귀함수로도 풀어보자.
    for (; exponent > 0; exponent--)
        result = result * base;
	    
    return result;
}