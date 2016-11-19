/*
n children have got m pieces of candy. They want to eat as much candy as they can, but each child must eat exactly the same amount of candy as any other child. Determine how many pieces of candy will be eaten by all the children together. Individual pieces of candy cannot be split.

Example

For n = 3 and m = 10, the output should be
candies(n, m) = 9.

Each child will eat 3 pieces. So the answer is 9.

Input/Output

    [time limit] 3000ms (java)

    [input] integer n

    The number of children.

    Constraints:
    1 ≤ n ≤ 10.

    [input] integer m

    The number of pieces of candy.

    Constraints:
    2 ≤ m ≤ 100.

    [output] integer

    The total number of pieces of candy the children will eat provided they eat as much as they can and all children eat the same amount.

*/

// solution

// 황당할 정도로 쉬운문제
// 총 사탕의 갯수를 아이 수의 최대공약수의 배수중 될 수 있는 가장 큰 수에 맞춰서
// 나눠주고 그 사탕 수를 맞추라는 건데 그러면 사탕수에서 그 나머지만 빼면 만사 OK

int candies(int n, int m) {
    return m - m%n;
}

// 사탕수 - 사탕수/아이들  