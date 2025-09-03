package Practical_Modern_Java.ch02.ex03;

public interface HouseAddress {

    // 우편번호를 리턴
    public String getPostCode();

    // 주소 정보를 리턴
    public String getAddress();

    // 상세 정보를 리턴
    public String getDetailAddress();

    // 나중에 추가 필요가 생겨서 여기에만 추가한다면?
    //public String getCountryCode();
    // => 구현체에 오류가 발생한다

    public static final  String DefaultCountry = "Korea";

    default public String getCountryCode() {
        return HouseAddress.DefaultCountry;
    }

    // java 9 이상 에서
    private String getDefaultCountryCode() {
        return HouseAddress.DefaultCountry;
    }
}

/*
이것을 통해 기존 버전의 인터페이스를 구현한 클래스의 소스 코드를 수정하거나
다시 컴파일하지 않고도 인터페이스에 새로운 메서드를 정의할 수 있게 된다
 */