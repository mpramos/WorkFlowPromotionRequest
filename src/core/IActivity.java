package core;

import core.enums.WF_ACTIVITY_STATUS;

public interface IActivity {

    String activityName();

    WF_ACTIVITY_STATUS activityStatus();
}
