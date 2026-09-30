package ScenarioFileValidation;


public class Coordinates {
    private int longitude;
    private int latitude;
    private int height;

    // default visibility: all classes in the same package have access but no subclasses from different packages (difference to protected)
    Coordinates(int longitude, int latitude, int height) {
        this.longitude = longitude;
        this.latitude = latitude;
        this.height = height;
    }

    public int getLongitude() {
        return longitude;
    }

    public int getLatitude() {
        return latitude;
    }

    public int getHeight() {
        return height;
    }
}
