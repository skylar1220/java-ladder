## 기능명세서
- [x] 참여자 이름을 입력받는다.
  - [x] 쉼표 기준으로 구분한다.
  - [x] 5글자 이하인지 확인한다.
  - [x] 구분자가 연속해서 포함되지 않는다.
  - [x] 구분자로 시작하거나 끝나지 않는 지 확인한다.
  - [x] 공백을 입력하지 않는다.
- [x] 사다리 높이를 입력받는다.
  - [x] 1이상인지 확인한다.
  - [x] 정수인지 확인한다.
  - [x] Integer범위 이내의 숫자인지 확인한다.
- [x] 사다리를 생성한다.
  - [X] 한 층의 다리를 랜덤으로 생성한다.
  - [x] 사다리 높이만큼 생성한다.
  - [x] 사다리의 가로 라인이 겹치지 않도록 생성한다.
- [x] 실행 결과를 출력한다.

## 리팩토링 목록
- [x] 테스트를 클래스 별로 분리하기
- [x] OutputView 메소드 정리하기
- [x] public 메소드 테스트 점검
- [x] 테스트 displayName 추가
- [x] 테스트 내 변수 final 적용
- [x] 이름 중복 검증
- [x] 원시값 포장
- [X] dto 변환
- [X] 일급 컬렉션
- [x] 메소드 10라인
- [x] final: 생성자  (로컬변수) 
- [x] 예외 메시지 작성
- [x] enum 적용
- [x] 예외 발생시 재입력
- [ㅇ] WoodWorkMachine 랜덤 책임 문제
- [x] outputView 개선 - 커비
- [x] 컨트롤러 메소드 네이밍 정리 및 분리 개선
- [ㅇ] 숫자 리터럴 상수화 (outputFormatter, inputView, inputValidator도)
- [ ] 부생성자가 있는 경우 생성자의 접근제어자가 private인지
- [ ] 이해를 위한 코드 전반의 공백 추가
- [ ] 각 클래스 메소드 순서 점검하기
- [ ] 테스트 코드 리팩토링
- [ ] getter 리스트 레퍼런스에 unmodifaible 추가
- [ ] 메서드 순서 수정

## 고민점
- [ ] 일반 메서드의 파라미터에도 final 키워드가 효과적일까?
- [ ] 같은 맥락으로 컨트롤러의 모든 로컬 변수에 final 붙이는 이유에 대해서도
- [ ] readWithRetry 작동 원리 이해
