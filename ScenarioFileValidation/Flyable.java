package ScenarioFileValidation;

import java.util.ArrayList;

public abstract class Flyable {
    protected WeatherTower _weatherTower;

    public abstract void updateConditions();
    public void registerTower(WeatherTower p_tower)
    {
        // todo
    }
}
