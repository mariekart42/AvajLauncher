package ScenarioFileValidation;

import java.util.ArrayList;

public class Tower {
    private ArrayList<Flyable> _observers = new ArrayList<>();

    public void register(Flyable p_flyable) {
        if (_observers.contains(p_flyable))
        {
            System.out.println("Tower says: " + p_flyable + " already registered.");
            return;
        }
        _observers.add(p_flyable);
        System.out.println("Tower says: " + p_flyable + " registered to weather tower.");
    }

    public void unregister(Flyable p_flyable) {
        if (!_observers.contains(p_flyable))
        {
            System.out.println("Tower says: " + p_flyable + " is not registered and therefor can't get unregistered.");
            return;
        }
        _observers.remove(p_flyable);
        System.out.println("Tower says: " + p_flyable + " unregistered from weather tower.");
    }


    protected void conditionChanged() {
        for (Flyable f : _observers)
        {
            f.updateConditions();
        }
    }



}
