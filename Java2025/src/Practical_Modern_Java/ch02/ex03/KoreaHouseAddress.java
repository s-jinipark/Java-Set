package Practical_Modern_Java.ch02.ex03;

public class KoreaHouseAddress implements HouseAddress {
    private String postCode;
    private String address;
    private String detailAddress;

    public KoreaHouseAddress(String postCode, String address, String detailAddress) {
        this.postCode = postCode;
        this.address = address;
        this.detailAddress = detailAddress;
    }

    // 우편번호를 리턴
    @Override
    public String getPostCode() {
        return postCode;
    }

    // 주소 정보를 리턴
    @Override
    public String getAddress() {
        return address;
    }

    // 상세 정보를 리턴
    @Override
    public String getDetailAddress() {
        return detailAddress;
    }
}
