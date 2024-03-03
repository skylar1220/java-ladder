## 기능명세서
- [x] 참여자 이름을 입력받는다.
  - [x] 쉼표 기준으로 구분한다.
  - [x] 5글자 이하인지 확인한다.
  - [x] 구분자가 연속해서 포함되지 않는다.
  - [x] 구분자로 시작하거나 끝나지 않는지 확인한다.
  - [x] 공백을 입력하지 않는다.
  - [x] all을 입력하지 않는다.
  - [x] 중복된 참가자가 있으면 안된다.
- [x] 사다리 높이를 입력받는다.
  - [x] 1이상인지 확인한다.
  - [x] 정수인지 확인한다.
  - [x] Integer범위 이내의 숫자인지 확인한다.
- [x] 실행 결과를 입력받는다.
  - [x] 쉼표 기준으로 구분한다.
  - [x] 5글자 이하인지 확인한다.
  - [x] 구분자가 연속해서 포함되지 않는다.
  - [x] 구분자로 시작하거나 끝나지 않는 지 확인한다.
  - [x] 공백을 입력하지 않는다.
  - [x] 참여자 수와 같은지 확인한다.
- [x] 사다리를 생성한다.
  - [X] 한 층의 다리를 랜덤으로 생성한다.
  - [x] 사다리 높이만큼 생성한다.
  - [x] 사다리의 가로 라인이 겹치지 않도록 생성한다.
- [x] 사다리 높이만큼 이동을 진행한다.
  - [x] 사다리의 각 지점에서 발판이 있으면 가로로 전진한다.
- [x] 모든 플레이어가 이동을 진행한다.
- [x] 플레이어별 실행결과를 저장한다.
- [x] 사다리 결과를 출력한다.
- [x] 결과를 보고 싶은 사람을 입력받는다.
  - [x] 공백을 입력하지 않는다.
    - [x] 입력했던 플레이어 중에 있어야한다.
- [x] 플레이어별 실행결과를 출력한다.

## 리팩토링 목록
- [x] 클래스 리팩토링
- [x] 원시값 포장, 일급 컬렉션
- [x] depth (1)
- [x] 메소드 라인 (10)
- [x] public 메소드 테스트 점검
- [x] getter 리스트 레퍼런스에 unmodifaible 추가
- [x] ~~불변객체~~
- [x] ~~예외 메시지 작성~~
- [x] ~~enum 적용~~
- [x] ~~record 처리~~
- [x] 예외 발생시 재입력
- [x] 컨트롤러 메소드 네이밍 정리 및 분리 개선
- [x] 숫자 리터럴 상수화 (outputFormatter, inputView, inputValidator도)
- [x] 부생성자가 있는 경우 생성자의 접근제어자가 private인지
- [x] 내부 호출 메서드 private인지
- [x] 메서드 순서 점검
- [x] DisplayName 붙이
- [x] 테스트 코드 리팩토링
- [x] 이해를 위한 코드 전반의 공백 추가
- [x] final: 생성자, 테스트 클래스 로컬변수 
- [x] 컨벤션 전체 확인 돌리기
- [ ] 일반 메서드 로컬변수, 파라미터에 final 키워드 추가
- [ ] TODO 체크
- [ ] 결과를 보고 싶은 사람에 바로 all 입력 오류 해결

## 고민점
- [x] Players의 findByIndex, getCount() 처럼 갖고오는 게 디미터 법칙 위반은 아닐까?
- [x] 현재는 Line에 의해 Step의 index가 움직이고 있는데
  - [x] Step 스스로 움직이게(벽을 만나거나 등)
  - [ ] Index의 원시값 포장 필요성이 느껴지나?