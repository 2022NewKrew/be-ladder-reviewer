# be-w1-ladder-game

자바 웹 백엔드 1주차 사다리 게임

## 기능 요구사항

- 간단한 사다리 게임을 구현한다.
- n명의 사람과 m개의 사다리 개수를 입력할 수 있어야 한다.
- 사다리의 라인은 랜덤 값에 따라 있거나 없을 수도 있다.
- 사다리가 있으면 -를 표시하고 없으면 " " 빈공백을 표시한다. 양옆에는 |로 세로를 표시한다.
- 사다리 상태를 화면에 출력한다. 어느 시점에 출력할 것인지에 대한 제약은 없다.

## 프로그래밍 요구사항

- 메소드의 크기가 최대 10라인을 넘지 않도록 구현한다.
- method가 한 가지 일만 하도록 최대한 작게 만들자.

## 기능 목록

- LadderApplication : 사다리 게임 수행
- adapter
    - in.console
        - LadderInputConsole
            - 참여할 사람 숫자 입력
            - 최대 사다리 높이 입력
    - web
        - LadderController : 사다리 애플리케이션 컨트롤러
            - 사다리 생성
- application
    - port
        - in
            - LadderCommand : application dto
            - LadderUseCase : controller와 service의 의존제어
        - out
            - LadderOutput : service와 outputConsole의 의존제어
        - service
            - LadderService : 사다리 생성 수행
- domain
    - factory
        - LineFactory : Line 생성
    - Ladder : 사다리 전체의 결과 (Line의 일급컬렉션)
    - Line : 사다리 한줄의 결과 (Point의 일급컬렉션)

