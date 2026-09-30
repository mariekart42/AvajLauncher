package ScenarioFileValidation;

public class JetPlane extends Aircraft {

    public JetPlane(long p_id, String p_name, Coordinates p_coordinates)
    {
        super(p_id, p_name, p_coordinates);
    }

    public void updateConditions()
    {
        // todo
        // SUN
        //  latitude += 10
        //  height += 2
        // RAIN
        //  latitude += 5
        // FOG
        //  latitude += 1
        // SNOW
        //  height -= 7
    }
}
