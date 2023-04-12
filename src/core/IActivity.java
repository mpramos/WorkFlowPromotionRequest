package core;

import core.enums.WF_ACTIVITY_STATUS;

public interface IActivity {
    public static void activityName(){};
    abstract WF_ACTIVITY_STATUS activityStatus();
}
