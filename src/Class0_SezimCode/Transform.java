package Class0_SezimCode;

public class Transform {
    public  float speed, weight;
    public String color;
    public byte[] coordinate;

    public void setValues(float _speed, int _weight, String _color, byte[] _coordinate){
        speed = speed;
        weight = _weight;
        color = _color;
        coordinate = _coordinate;

    }
    public String getColor(){
        String info = "Object speed: " + speed + ". Weight: " + weight + ". Color: " + color;
        String infoCoordinate = "Coordivates\n";
        for(int i = 0; i < coordinate.length; i++){
            infoCoordinate += coordinate[i] + "\n";
        }
        return info + infoCoordinate;
    }
}
