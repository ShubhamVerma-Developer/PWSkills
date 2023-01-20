import java.util.Scanner;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Clipboard;
import java.awt.event.KeyEvent;
import java.awt.*;

class Whatsapp{
   /**
    * @param args
    * @throws AWTException
    * @throws InterruptedException 
    */ 

    public static void main(String[] args) throws AWTException, InterruptedException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the msg : ");
        String msg = sc.nextLine();
        System.out.println("How many times you want to print : ");
        int size = sc.nextInt();

        StringSelection stringSelection = new StringSelection(msg);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);

        Thread.sleep(5000);

        Robot robot = new Robot();
        for(int i=1; i<=size; i++){
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);

            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_V); 

            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        }        
        }
    }
