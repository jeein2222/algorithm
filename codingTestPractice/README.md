### codingTestPractice
Java 코테 연습 및 알고리즘 개념 정리

---

#### [String]

##### 예시)
- [문자찾기](https://github.com/jeein2222/codingTestPractice/blob/main/inflearn/Sol1.java)
- [대소문자 변환](https://github.com/jeein2222/codingTestPractice/blob/main/inflearn/Sol2.java)
- [문장 속 단어](https://github.com/jeein2222/codingTestPractice/blob/main/inflearn/Sol3.java)
- [단어 뒤집기](https://github.com/jeein2222/codingTestPractice/blob/main/inflearn/Sol4.java)
- [특정 문자 뒤집기](https://github.com/jeein2222/codingTestPractice/blob/main/inflearn/Sol5.java)
- [중복 문자 제거](https://github.com/jeein2222/codingTestPractice/blob/main/inflearn/Sol6.java)
- [회문 문자열](https://github.com/jeein2222/codingTestPractice/blob/main/inflearn/Sol7.java)
- [유효한 팰린드롬](https://github.com/jeein2222/codingTestPractice/blob/main/inflearn/Sol8.java)
- [숫자만 추출](https://github.com/jeein2222/codingTestPractice/blob/main/inflearn/Sol9.java)
- [가장 짧은 문자거리](https://github.com/jeein2222/codingTestPractice/blob/main/inflearn/Sol10.java)
- [문자열 압축](https://github.com/jeein2222/codingTestPractice/blob/main/inflearn/Sol11.java)
- [암호](https://github.com/jeein2222/codingTestPractice/blob/main/inflearn/Sol12.java)

***

#### [Array]

##### 예시)

***
#### [Two Pointers]

##### 예시)

***
#### [HashMap]

##### 예시)

___
#### [Stack, Queue]
__1) Stack__ 
- 먼저 들어간 자료가 나중에 나옴(LIFO, Last In First Out)
- 그래프의 깊이 우선 탐색(DFS)에서 사용
- 재귀적 함수를 호출할 때 사용
```
Stack<Integer> st=new Stack<>();
st.push(1);
st.push(2);
st.push(3);
st.pop();//값 삭제
System.out.println(st.peek());//가장 상단 값 출력
System.out.println(st);//[1, 2]
System.out.println(st.contains(1));//값 포함하는지 여부 true
st.empty(); //값 비우기
```
__2) Queue__
- 먼저 들어간 자료가 먼저 나오는 구조 FIFO(First In First Out)구조
- 그래프 넓이 우선 탐색(BFS)에서 사용
- 컴퓨터 버퍼에서 주로 사용. 
```
Queue<Integer> queue=new LinkedList<>();
queue.add(1);
queue.add(2);
queue.add(3);

System.out.println(queue);//[1, 2, 3]
System.out.println(queue.poll());//1 첫번째 값을 반환하고 제거
System.out.println(queue);//[2, 3]
queue.remove();//첫번째 값 제거
System.out.println(queue);//[3]
```


__3) PriorityQueue__

##### 예시)
- [올바른 괄호 문제](https://github.com/jeein2222/codingTestPractice/blob/main/inflearn/Sol36.java)
- [괄호문자제거](https://github.com/jeein2222/codingTestPractice/blob/main/inflearn/Sol37.java)
- [크레인 인형뽑기](https://github.com/jeein2222/codingTestPractice/blob/main/inflearn/Sol38.java)
- [후위식 연산](https://github.com/jeein2222/codingTestPractice/blob/main/inflearn/Sol39.java)


***

#### [Recursive, Tree, Graph(DFS, BFS 기초)]

##### 예시)
- [재귀함수 1~n까지 출력하기](https://github.com/jeein2222/codingTestPractice/blob/main/inflearn/Sol41.java)
- [재귀함수 10진수 -> 2진수](https://github.com/jeein2222/codingTestPractice/blob/main/inflearn/Sol42.java)
- [재귀함수 팩토리얼](https://github.com/jeein2222/codingTestPractice/blob/main/inflearn/Sol43.java)
- [재귀함수 피보나치(메모이제이션)](https://github.com/jeein2222/codingTestPractice/blob/main/inflearn/Sol44.java)
- [이진트리 순회 DFS](https://github.com/jeein2222/codingTestPractice/blob/main/inflearn/Sol45.java)
- [부분집합 구하기 DFS](https://github.com/jeein2222/codingTestPractice/blob/main/inflearn/Sol46.java)



***

#### 그리디 알고리즘
현재 상황에서 지금 당장 좋은 것만 고르는 방법 -> 단순히 가장 좋아하는 것을 반복적으로 선택해도 최적의 해가 나오는가?

##### 예시)
- [거스름돈 문제](https://github.com/jeein2222/codingTestPractice/blob/main/ndb/greedy_imple/Sol02.java)
- [큰수의 법칙](https://github.com/jeein2222/codingTestPractice/blob/main/ndb/greedy_imple/Sol01.java)
- [숫자카드게임](https://github.com/jeein2222/codingTestPractice/blob/main/ndb/greedy_imple/Sol03.java)
- [1이될 때까지](https://github.com/jeein2222/codingTestPractice/blob/main/ndb/greedy_imple/Sol04.java)
- [곱하기 혹은 더하기](https://github.com/jeein2222/codingTestPractice/blob/main/ndb/greedy_imple/Sol5.java)
- [회의실 배정](https://github.com/jeein2222/codingTestPractice/blob/main/ndb/greedy_imple/Bj01.java)
- [보물](https://github.com/jeein2222/codingTestPractice/blob/main/ndb/greedy_imple/Bj02.java)

***
#### 구현
머릿속의 알고리즘을 소스코드로 바꾸는 과정. 거의 모든 범위의 코딩 테스트 문제 유형을 포함한다.
- 완전 탐색 : 모든 경우의 수를 다 계산하는 해결 방법
- 시뮬레이션 : 문제에서 제시한 알고리즘을 한 단계씩 다 계산하는 해결 방법

##### 예시)

***
