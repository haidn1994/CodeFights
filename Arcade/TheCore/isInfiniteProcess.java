// 요점은 2가지
// 둘 사이의 거리
boolean isInfiniteProcess(int a, int b) {
    return (a > b) ? true : ((a - b) % 2 != 0);
}
