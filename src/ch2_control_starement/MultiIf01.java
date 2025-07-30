package ch2_control_starement;

public class MultiIf01 {
    public static void main(String[] args) {
        int temperature = 35;
        String ondo;

        if(temperature >= 35){
            ondo = "폭염 경보";
        }

        else if(temperature>=30){
            ondo = "무더운 날씨";
        }
        else if(temperature>=20){
            ondo = "쾌적한 날씨";

        }
        else if(temperature>=10){
            ondo = "쌀쌀한 날씨";
        }else {
            ondo = "추운 날씨";

        }
        String message=temperature + "도는 "+ondo+"입니다.";
        System.out.println(message);


    }


}
