# 빌더 패턴이란
- 빌더패턴은 복잡한 객체를 생성하는 클래스와 표현하는 클래스를 분리하여, 동일한 절차에서도 서로 다른 표현을 생성하는 방법을 제공한다.
- 생성해야하는 객체가 Optional한 속성을 많이 가질 때 용이하다.
- 객체를 생성할 때 생성자만 사용할 때 발생할 수 있는 문제를 개선하기 위해 고안됐다.
- 실생활에서 예로 들수 있는 사례로 햄버거를 들 수 있다.
  - 패티 등 속재료를 주문자의 의사대로 정할 수 있다.

# 탄생 배경
## 점층적 생성자 패턴
점층적 생성자 패턴(Telescoping Constructor Pattern)은 필수 매개변수와 함께 선택 매개변수를 0개, 1개, 2개 .. 받는 형태로,

우리가 다양한 매개변수를 입력 받아 인스턴스를 생성하고 싶을 때 사용하던 생성자를 오버로딩 하는 방식이다.

```
class Hamburger {
    // 필수 매개변수
    private int bun;
    private int patty;

    // 선택 매개변수
    private int cheese;
    private int lettuce;
    private int tomato;
    private int bacon;

    public Hamburger(int bun, int patty, int cheese, int lettuce, int tomato, int bacon) {
        this.bun = bun;
        this.patty = patty;
        this.cheese = cheese;
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.bacon = bacon;
    }

    public Hamburger(int bun, int patty, int cheese, int lettuce, int tomato) {
        this.bun = bun;
        this.patty = patty;
        this.cheese = cheese;
        this.lettuce = lettuce;
        this.tomato = tomato;
    }
    

    public Hamburger(int bun, int patty, int cheese, int lettuce) {
        this.bun = bun;
        this.patty = patty;
        this.cheese = cheese;
        this.lettuce = lettuce;
    }

    public Hamburger(int bun, int patty, int cheese) {
        this.bun = bun;
        this.patty = patty;
        this.cheese = cheese;
    }

    ...
}
```
```
public static void main(String[] args) {
    // 모든 재료가 있는 햄버거
    Hamburger hamburger1 = new Hamburger(2, 1, 2, 4, 6, 8);

    // 빵과 패티 치즈만 있는 햄버거
    Hamburger hamburger2 = new Hamburger(2, 1, 1);

    // 빵과 패티 베이컨만 있는 햄버거
    Hamburger hamburger3 = new Hamburger(2, 0, 0, 0, 0, 6);
}
```
위와 같은 방식은 클래스 인스턴스 필드들이 많아질수록 생성자에 들어갈 인자의 수가 늘어나 몇 번째 인자가 어떤 필드였는지 혼란이 발생할 여지가 있다.

또한 타입이 다양할 수록 생성자 메서드 수가 기하급수적으로 늘어나 가독성이나 유지보수 측면에서 좋지 않다.

Optional한 인자에 따라 새로운 생성자를 만들거나, Null 값으로 채워야하는 문제 발생.

## 자바 빈 패턴
점층적 생성자 패턴의 단점을 보완하기 위해 Setter 메소드를 통한 자바 빈 패턴이 고안되었다.

매개변수가 없는 생성자로 객체를 생성 후 Setter 메소드를 통해 클래스 필드의 값을 설정하는 방식이다.

이로 인해 기존 생성자 오버로딩에서 나타났던 가독성 문제가 사라지고 선택적 파라미터에 대해 해당되는 Setter 메소드를 호출함으로 유연한 객체 생성이 가능해졌다. 

다만, 이러한 방식은 객체 생성 시점에 모든 값이 설정되지 않아 일관성과 불변성 문제가 발생할 수 있다.

* 필수 매개변수 값을 누락하여 객체가 유효하지 않은 상태, 이로 인해 다른 곳(스레드)에서 해당 인스턴스를 사용하며 런타임 예외를 초래할 수 있다.
* 또한, 객체 생성 이후에도 여전히 외부에 Setter 메소드를 노출하고 있으므로, 다른 곳에서 Setter 메소드를 호출해 객체를 조작할 여지가 있다. 이로 인해 불변성 또한 보장될 수 없다.

## 빌더 패턴
위 두 가지 패턴들에서 발생할 문제에 대비해 별도의 Builder 클래스를 통해 단계별로 값을 입력 받은 후 최종적으로 Build() 메소드를 통해 하나의 인스턴스를 생성하려 리턴하는 패턴이다.

필요한 객체를 직접 생성하는 대신, 먼저 필수 인자들을 생성자에 전부 전달하여 빌더 객체를 만든다.

Setter가 없으므로 객체 일관성을 유지하여 불변 객체로 생성할 수 있다.

# Ref
- https://inpa.tistory.com/entry/GOF-%F0%9F%92%A0-%EB%B9%8C%EB%8D%94Builder-%ED%8C%A8%ED%84%B4-%EB%81%9D%ED%8C%90%EC%99%95-%EC%A0%95%EB%A6%AC
- https://dev-youngjun.tistory.com/197#head7