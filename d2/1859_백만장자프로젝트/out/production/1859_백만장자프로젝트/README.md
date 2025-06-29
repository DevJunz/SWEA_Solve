# 문제 링크
<a>https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5LrsUaDxcDFAXc</a>
# 풀이과정
## 시작은 input check
가장 값이 커지는 상황을 가정하면 N이 10^7이 들어오고<br>
마지막날 가격이 10^5이고 나머지 날 가격이 전부 1이 들어있다면<br>
약 10^12라는 값이 나오는데 Int 자료형의 범위를 초과하기에 long type을 채택한다<br>
## 문제 해결
주어진 배열에 대해서 뒤에서 부터 접근해서 가장 뒤에 값을 Max로 한다.<br>
한 칸씩 앞으로 오면서 더 큰 값이 있으면 Max를 갱신하고 그 이전 까지의 배열 요소들은<br>
이전의 Max값에서 cost를 빼서 cost의 합을 구한다. <br>

# 사용된 알고리즘
그리디 알고리즘 : 현재의 최선이 전체의 최선이 된다.<br>
매 순간의 선택을 최선으로 가정한다<br>
역방향 순회<br>