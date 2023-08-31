# algorithm-study
알고리즘을 공부하는 레파지토리 입니다. (using Java)
풀지 못한 문제는 앞에 "re"를 붙이고 일정 시간이 지난 후에 다시 풀이합니다. 

### 정수론
#### 유클리드 호제법
```java
// 최대공약수 구하기
public static int gcd(int a, int b) {
    if(b == 0) return a;
    else
        return gcd(b, a % b);
}
```
- 최소공배수: "A * B / 최대공약수"

### 기하 
- ccw값 : (x1*y2 + x2*y3 + x3*y1) - (x2*y1 + x3*y2 + x1*y3)
  - ccw == 0 : 일직선
  - ccw > 0 : 반시계 방향
  - ccw < 0 : 시계 방향
  - |CCW값| /2 : 세 점으로 이루어진 삼각형의 넓이