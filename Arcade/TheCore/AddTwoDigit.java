/*
    1116 CodeFight Arcade
    You are given a two-digit integer n. Return the sum of its digits.
    Example
    For n = 29, the output should be
    addTwoDigits(n) = 11.
    Input/Output
    •   [time limit] 3000ms (java)
    •   [input] integer n
    A positive two-digit integer.
    Constraints:
    10 ≤ n ≤ 99.
    •   [output] integer
    The sum of the first and second digits of the input number.
*/

//  Solution

/*
    현업에서 만든 함수라면 일단 보호절로 숫자가 아닌 경우(48~57번 테이블에 대응하는 숫자가 안보임) 이를 막아주는 보호절이 필요하다.
    If(each < 48 && each > 57) return assert();
    이렇게 막아주는 보호절이 필요하다.
*/
int addTwoDigits(int n) {
    int result = 0;
    char[] charArr;
    String argTemp;
    // int를 읽어들여서 스트링으로 바꿔주는 함수 String.ValueOf(int arg)
    argTemp = String.valueOf(n);
    // String을 읽어들여서 Char[]로 바꿔주는 함수 String.toCharArray()
    charArr = argTemp.toCharArray();
    
    for (char each : charArr)
        result += (int) (each - 48);
    // 숫자는 48번이 0이고, 9는 57번이다. 기억하자.
    return result;
}
