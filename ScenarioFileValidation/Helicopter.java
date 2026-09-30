package ScenarioFileValidation;

public class Helicopter extends Aircraft {

    public Helicopter(long p_id, String p_name, Coordinates p_coordinates)
    {
        super(p_id, p_name, p_coordinates);
    }

    public void updateConditions()
    {
        // todo
        // SUN
        //  longitude += 10
        //  height += 2
        // RAIN
        //  longitude += 5
        // FOG
        //  longitude += 1
        // SNOW
        //  height -= 12
    }
}
