package core.utils.AndroidCore;

import com.testvagrant.mdb.android.Android;
import org.testng.asserts.SoftAssert;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class AndroidApp {

    private static String AppPackage = "";

    private static SoftAssert softAssertions = null;

    public static String GetAppPackage() {
        return AppPackage;
    }

    public static SoftAssert SoftAssertionObject() {
        softAssertions = new SoftAssert();
        return softAssertions;
    }

    public static void AssertingDestroySoftAssetObject() {
        if(softAssertions != null)
        {
            softAssertions.assertAll();
            softAssertions = null;
        }
        else
        {
            System.out.println("Null");
        }
    }

    public static void uninstallApp(String udid, String appPackage) throws IOException,InterruptedException {
        ProcessBuilder pb = new ProcessBuilder(Android.getAdbPath()+"adb", "-s", udid, "uninstall",appPackage);
        Process pc = pb.start();
        pc.waitFor();
        System.out.println("Uninstalling "+appPackage+" done");
    }

    public static void executeCmd(String arg) throws IOException, InterruptedException {
        String[] splited = arg.split("\\s+");
        ProcessBuilder pb = new ProcessBuilder(splited);
        Process pc = pb.start();
        pc.waitFor();
        System.out.println("Command : " + arg + " executed");
    }

    public static void startEmulator(String arg) throws IOException, InterruptedException {
        String[] splited = arg.split("\\s+");
        ProcessBuilder pb = new ProcessBuilder(splited);
        Process pc = pb.start();
        //pc.waitFor();
        System.out.println("Command : " + arg + " executed");
    }

    public static void executeScript(String pathOfScript)
    {
        Process p;
        try {

            List<String> cmdList = new ArrayList<String>();
            // adding command and args to the list
            cmdList.add("sh");
            cmdList.add(pathOfScript);
            ProcessBuilder pb = new ProcessBuilder(cmdList);
            p = pb.start();

            p.waitFor();
            BufferedReader reader=new BufferedReader(new InputStreamReader(
                    p.getInputStream()));
            String line;
            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
