package Package;

import App.Route;
import java.lang.ProcessBuilder;

public class ConsoleManagement {
    public static void ClearConsole(){
        try{
            String operatingSystem = System.getProperty("os.name"); //Check the current operating system
            if(operatingSystem.contains("Linux")){
                ProcessBuilder pb = new ProcessBuilder("clear");
                Process startProcess = pb.inheritIO().start();
                startProcess.waitFor();
            } else if(operatingSystem.contains("Windows")){
                ProcessBuilder pb = new ProcessBuilder("cls");
                Process startProcess = pb.inheritIO().start();
                startProcess.waitFor();
            } else {
                ProcessBuilder pb = new ProcessBuilder("clear");
                Process startProcess = pb.inheritIO().start();
                startProcess.waitFor();
            }
            Route.GetRoute();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
