# concurrency
동시성관련해 발생할 수 있는 문제를 redis나 jpa lock 관련 기능등을 통해서 해결

## 강의
- https://www.inflearn.com/course/%EB%8F%99%EC%8B%9C%EC%84%B1%EC%9D%B4%EC%8A%88-%EC%9E%AC%EA%B3%A0%EC%8B%9C%EC%8A%A4%ED%85%9C/dashboard : 재고시스템으로 알아보는 동시성 이슈 해결방법

## 사용기술
- redis(lettuce, redisson 의존성 사용)
- Spring Data Jpa(낙관적 락, 비관적 락)
- Junit5
