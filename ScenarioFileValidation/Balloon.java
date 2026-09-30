package ScenarioFileValidation;

public class Balloon extends Aircraft {

    public Balloon(long p_id, String p_name, Coordinates p_coordinates)
    {
        super(p_id, p_name, p_coordinates);
    }

    public void updateConditions()
    {
        // todo
        // SUN
        //  longitude += 2
        //  height += 4
        // RAIN
        //  height -= 5
        // FOG
        //  height -= 3
        // SNOW
        //  height -= 15
    }
}
