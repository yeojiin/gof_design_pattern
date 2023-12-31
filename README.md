# gof_design_pattern

## 1. 디자인 패턴 소개와 전략 패턴
<details>
<summary>더보기</summary>

### 디자인 원칙
- 애플리케이션에서 달라지는 부분과 달라지지 않는 부분을 **분리**한다.
  - 달라지는 부분은 `캡슐화` 한다. -> 코드 유지보수 시 유연성을 향상시킬 수 있음
  - fly 패키지와 quack 패키지는 각각 **캡슐화** 되었다고 볼 수 있음 
    - 인터페이스를 변수로 선언해 fly() 메소드를 모두 공통으로 호출하고
    - 이 인터페이스를 상속받는 클래스에서 행동을 각각 다르게 설정할 수 있다
    - 여러개의 클래스(행동)이 인터페이스의 하나의 메소드로 동적으로 돌기 때문에
    - fly 폴더 안의 내용이 캡슐화 되어 있다고 볼 수 있다.
- 상속보다는 구성을 활용한다.
  - 행동 및 기능이 다수일 때 이들을 **공통된 특성이 있는 클래스끼리 합치는 것**
  - Duck 클래스 안에 FlyBehavior와 QuackBehavior이 같이 선언됨
- 구현보다는 인터페이스(특정 행동 및 기능 단위)에 맞춰서 프로그래밍 한다.
  - ex) 오리의 꽥꽥 거리는 행동은 Duck 클래스가 아닌 `QuakBehavior 인터페이스`에 구현

### 전략 패턴(Strategy Patter)
- 알고리즘(행동 및 기능)군을 정의하고 캡슐화해서 각각 수정해서 쓸 수 있음
- 클라이언트와 알고리즘이 분리되어 독립적으로 변경이 용이함

</details>


## 2. 옵저버 패턴

<details>
<summary>더보기</summary>

- 변화에 따라 `확장성`이 용이한 코드를 작성하는 것이 중요.
  - 확장성이 용이하기 위해 상호작용하는 객체는 **느슨한 결합**을 고려해야 함 -> 의존성이 낮아짐

### 옵저버 패턴
- 주제(subject)와 구독자(observer) 로 이루어진 패턴
- 옵저버는 객체의 상태가 바뀌면 객체에 의존하는 다른 객체에게 변화를 호출하고, 이를 자동으로 갱신함
- 일대다(one-to-many) 관계

#### 느슨한 결합
- 주제는 옵저버가 특정 인터페이스(observer interface)를 구현한다는 사실만 알고 있음
- 옵저버는 언제든지 새로 추가 가능
- 새로운 형식의 옵저버를 추가할 때도 주제는 변경할 필요가 없음
- 주제와 옵저버는 서로 **독릭적으로 재사용이** 가능
- 주제나 옵저버가 달라져도 서로에게 영향을 주지 않음

### 푸시 & 풀
- 주제가 푸시(주제가 옵저버에게 상태를 알리는 방식), 풀(옵저버가 주제로부터 상태를 끌어오는 방식)을 활용한다
- 주제는 상태 변경을 모두에게 알리지만 옵저버는 이 중 필요한 내용만 끌어다 쓸 수 있음 -> 풀 방식을 더 권장
</details>


---

#### 참고 문헌
<details>
<summary>더보기</summary>

헤드퍼스트 디자인 패턴 개정판(한빛 미디어)
</details>
    
