# 문제 링크
<a>https://swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AV5LrsUaDxcDFAXc</a>
# 풀이과정
## 시작은 input check
가장 값이 커지는 상황을 가정하면 N이 10^7이 들어오고<br>
마지막날 가격이 10^5이고 나머지 날 가격이 전부 1이 들어있다면<br>
약 10^12라는 값이 나오는데 Int 자료형의 범위를 초과하기에 결과값이 저장되는 변수는 long으로 선언한다<br>
이외의 변수는 int를 사용해도 된다.<br>
## 문제 해결
주어진 배열에 대해서 뒤에서 부터 접근해서 가장 뒤에 값을 Max로 한다.<br>
한 칸씩 앞으로 오면서 더 큰 값이 있으면 Max를 갱신하고 그 이전 까지의 배열 요소들은<br>
이전의 Max값에서 cost를 빼서 cost의 합을 구한다. <br>

# 사용된 알고리즘
그리디 알고리즘 : 현재의 최선이 전체의 최선이 된다.<br>
매 순간의 선택을 최선으로 가정한다<br>
역방향 순회<br>

# 생각
이게 그리디 인가? 싶은 문제다.<br>
푸는 방법이 생각나면 바로 되고 안나면 1시간이 넘게 걸리는 문제