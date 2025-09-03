package Practical_Modern_Java.ch02.ex02;

import java.util.List;

public interface Input {
    public static class KeyEvent {
        public static final int KEY_DOWN = 0;
        public static final int KEY_UP = 1;
        public int type;
        public int keyCode;
        public int keyChar;
    }

    public static class TouchEvent {
        public static final int TOUCH_DOWN = 0;
        public static final int TOUCH_UP = 1;
        public static final int TOUCH_DRAGGED = 2;
        public int type;
        public int x, y;
        public int pointer;
    }

    public boolean isKeyPressed(int keyCode);

    public boolean isTouchDown(int pointer);

    public int getTouchX(int pointer);

    public int getTouchY(int pointer);

    public float getAccelX();

    public float getAccelY();

    public float getAccelZ();

    public List<KeyEvent> getKeyEvents();

    public List<TouchEvent> getTouchEvents();

}

/*

예제 2.6은 사용자의 입력값을 제어하기 위해 정의한 인터페이스이며
이 중 입력값에 대한 상세한 정의는 중첩 클래스로 정의했다.
이렇게 인터페이스 내에 중첩 클래스를 정의하면 인터페이스의 동작을 더 상세히 규정할 수 있고,
이 부분을 별도로 개발자가 구현할 필요 없이 인터페이스 차원에서 제어할 수 있다는
장점도 있다.

=> 설명예 대한 소스 샘플이 없어서 딱 이해가 안감
   [일단 PASS]
 */