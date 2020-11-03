import java.io.*;

public class WindowsTest {
    public static void main(String[] args) {
//        testWinCmd();
//        dirOpt();
        String cmd = "C:\\Users\\viruser.v-desktop\\Desktop\\x.bat 1 2";
        executeBat(cmd);
    }
    private static void dirOpt() {
        System.out.println("------------------dirOpt()--------------------");
        Process process;
        try {
            //执行命令
            process = Runtime.getRuntime().exec("C:\\Users\\viruser.v-desktop\\Desktop\\x.bat 1 2");
            //取得命令结果的输出流
            InputStream fis = process.getInputStream();
            //用一个读输出流类去读
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            String line = null;
            //逐行读取输出到控制台
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static String executeBat(String cmd){
        StringBuilder res = new StringBuilder();
        try {
            Process process = Runtime.getRuntime().exec(cmd);
            //取得命令结果的输出流
            InputStream fis = process.getInputStream();
            //用一个读输出流类去读
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            //逐行读取输出到控制台
            String line = null;
            while ((line = br.readLine()) != null) {
                res.append(line);
            }
            System.out.println(res);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return res.toString();
    }

}
