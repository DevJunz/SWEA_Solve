# 문제 링크
<a>https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AZD8K_UayDoDFAVs</a>
# 풀이과정

## 일단 input check<br>
N의 최대값은 9억이다. 그리고 A와 B는 1과 9억 사이의 값이 올 수 있다<br>
어느 하나의 값이 9억이 넘어간 시점에서 프로그램은 종료된다<br>
만약 x와 y가10^9 -2, 10^9-1 이더라도 더 했을 때 21억을 넘지 않는다.<br>
따라서 자료형의 type은 Int를 사용해도 된다.<br>
## 규칙 추론
결국 모든 건 규칙이 존재하기 마련...<br>
가장 효율적으로 x와 y의 값을 증가시켜야한다면 어떻게 해야할까?<br>
더 큰 값을 작은 값에 더해야한다<br>
큰 값에 작은 값을 더하면 계속 같은 값을 더하게 된다<br>
# 사용된 알고리즘
그리디 알고리즘 : 현재의 최선이 전체의 최선이 된다.<br>
매 순간의 선택을 최선으로 가정한다