package ch04_class;

public class Saram03 {


    private String name;
    private double height;
    private double weight;
    private String hobby;
    private String blood;

    public void setName(String name){ // 지역 변수
        this.name = name;   // this. = 인스턴스 변수와 지역변수를 나눌때. * 지역 변수에는 사용 불가.
    }
    public String getName(){
    return name; // 찬초 변수 ( instuns ) this. 을 붙여도 상관없음
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getHeight(){
        return height;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }
    public void setHobby(String hobby){
        this.hobby = hobby;
    }
    public String getHobby(){
        return hobby;
    }
    public void setBlood(String blood){
        this.blood = blood;
    }
    public String getBlood(){
        return blood;
    }
    }

