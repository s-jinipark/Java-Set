package Practical_Modern_Java.ch02.ex01;

public class VehicleImpl implements Vehicle{

    // public 으로 반드시 선언되어야 한다
    public int getSpeedLimit() {
        // SPEED_LIMIT 속성이 public static final 로 인식
        return Vehicle.SPEED_LIMIT;
    }
}
/*
최초 자바 버전에서는 인터페이스에 다음과 같은 제약이 있었다.

• 상수를 선언할 수 있다. 해당 상수는 반드시 값이 할당되어 있어야 하며 값을
  변경할 수 없다. 명시적으로 final을 선언하지 않더라도 final로 인식된다.
• 메서드는 반드시 추상(abstract) 메서드여야 한다. 즉, 구현체가 아니라 메서드
  명세만 정의되어 있어야 한다.
• 인터페이스를 구현한 클래스는 인터페이스에서 정의한 메서드를 구현하지
  않았다면 반드시 추상 클래스로 선언되어야 한다.
• 인터페이스에 선언된 상수와 메서드에 public을 선언하지 않더라도 public으로
  인식한다.
 */