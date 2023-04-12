package core;

public class WorkFlowManager {
    public static void start(){};
    public static void stop(Number REASON_CODE){};
    public static void getCurrentStatus(){};
    public static void getCurrentActivity(){};
    public static void nextActivity(){}
    public static void assignActivity(String userId ,String  activityId){}
    public static void completeActivity(String activityId){};
    public static void completeActivity(String activityId, String userAc){};
}
