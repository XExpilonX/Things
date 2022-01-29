import java.awt.Desktop;
import java.net.URI;


public class rickroll {
    public static void main(String[] var0) {
        try {
            Desktop.getDesktop().browse(new URI("https://youtu.be/dQw4w9WgXcQ"));
        } catch (Exception var2) {
            var2.printStackTrace();
        }

    }
}
