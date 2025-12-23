public class Transport {
    //variablen
    public float speed;
    public int weight;
    public String color;
    public byte[] coordinate;

    //Join to DB
    public Transport(float _speed, int _weight, String _color, byte[] _coordinate){
        System.out.println("Object created");
        setValues(_speed, _weight, _color, _coordinate);
        System.out.println(getValues());

    }

    public Transport(int _weight, byte[] _coordinate){
        weight = _weight;
        coordinate = _coordinate;
        System.out.println(getValues());
    }
    //Methode, bei der die Werte zu den Parametern zugehört werden
    public void setValues(float _speed, int _weight, String _color, byte[] _coordinate){
        speed = _speed;
        weight = _weight;
        color = _color;
        coordinate = _coordinate;
    }
    //Methode, bei der die Werte angezeigt werden
    public String getValues(){
        String getInfo = "Speed: " + speed + " Weight: " + weight + " Color: " + color;
        String getInfoCoordinate = " Coordinates: \n";
        for(int i=0; i<coordinate.length; i++){
            getInfoCoordinate = getInfoCoordinate + coordinate[i] + " ";
        }
        return getInfo + getInfoCoordinate;
    }
}
