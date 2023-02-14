package Class0_SezimCode;

public class Class_objct {
    public static void main(String[] args) {
        Transform car = new Transform();
        car.speed = 250;
        car.color = "red";
        car.setValues(250.5f, 2000, "White\n", new byte[]{0, 0, 2});
        String resp1 = car.getColor();
        System.out.println(resp1);
    }



}
