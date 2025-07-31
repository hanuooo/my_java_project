package ch04_class;

public class Car {
    // 🔹 static 변수: 모든 객체가 공유하는 변수 (클래스 변수)
    static int totalCars = 0;

    // 🔹 멤버 변수: 객체마다 개별적으로 가지는 변수 (인스턴스 변수)
    String color;
    String model;

    // 🔹 생성자: 매개변수를 사용해서 멤버 변수 초기화
    public Car(String color, String model) {  // ← 매개 변수
        this.color = color;                   // ← 멤버 변수에 매개 변수 저장
        this.model = model;

        totalCars++;                          // ← static 변수 증가 (모든 객체에 공통)
    }

    // 🔹 멤버 메서드
    public void displayInfo() {
        // 🔹 지역 변수: 메서드 내에서만 사용됨
        String info = "모델: " + model + ", 색상: " + color;
        System.out.println(info);
    }

    // 🔹 static 메서드: 클래스 변수 사용 예시
    public static void displayTotalCars() {
        System.out.println("총 생성된 자동차 수: " + totalCars);
    }
}