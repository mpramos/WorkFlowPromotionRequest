package core;

import core.enums.WF_ACTIVITY_STATUS;

public abstract class UserActivity implements  IActivity{
    private String[] roles;
    @Override
    public String activityName() {
        return null;
    }

    @Override
    public WF_ACTIVITY_STATUS activityStatus() {
        return null;
    }

    public String outbound(){
        return "";
    }
}
