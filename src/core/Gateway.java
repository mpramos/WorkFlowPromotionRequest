package core;

import core.enums.WF_ACTIVITY_STATUS;

import java.util.Map;

public abstract class Gateway implements IActivity {
  private String[] userActions;
  private Map<String, String> outboundMap;
  @Override
  public String activityName() {
    return null;
  }

  @Override
  public WF_ACTIVITY_STATUS activityStatus() {
    return null;
  }

  public String[] userActions() {
    return null;
  }
}
