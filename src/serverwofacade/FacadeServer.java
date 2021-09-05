package serverwofacade;

public class FacadeServer {
    /*private static MyFacade MyFacadeObj = null;

    private MyFacade()  {}

    public static MyFacade getMyFacadeObject() {
        if (myFacadeObj == null) {
            myFacadeObj = new MyFacade();
        }
        return MyFacadeObj;
    }*/

    public void startServer() {
        ScheduleServer Server = new ScheduleServer();
        Server.startBooting();
        Server.readSystemConfigFile();
        Server.init();
        Server.initializeContext();
        Server.initializeListeners();
        Server.createSystemObjects();
        System.out.println("Start working......");
    }

    public void stopServer() {
        ScheduleServer Server = new ScheduleServer();
        System.out.println("After work done.........");
        Server.releaseProcesses();
        Server.destory();
        Server.destroySystemObjects();
        Server.destoryListeners();
        Server.destoryContext();
        Server.shutdown();
    }

}