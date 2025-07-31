package ch04_class;

public class Main {
    public static void main(String[] args) {
        // Car 객체 생성 (매개변수 전달)
        Car car1 = new Car("빨강", "소나타");
        Car car2 = new Car("파랑", "아반떼");

        // 객체별 멤버 변수 확인
        car1.displayInfo();  // 출력: 모델: 소나타, 색상: 빨강
        car2.displayInfo();  // 출력: 모델: 아반떼, 색상: 파랑

        // static 변수 확인 (클래스명으로 접근)
        Car.displayTotalCars(); // 출력: 총 생성된 자동차 수: 2
    }
}