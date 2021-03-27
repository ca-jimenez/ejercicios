import java.io.FileInputStream;
import java.util.Properties;

public class MiFactory {
    public static Object getInstance(String objName){

        FileInputStream file = null;

        try{
            file = new FileInputStream("MiFactory.properties");
            Properties properties = new Properties();
            properties.load(file);
            String className = properties.getProperty(objName);

            return Class.forName(className).getDeclaredConstructor().newInstance();

        }catch (Exception e){
            e.printStackTrace();
            throw  new RuntimeException(e);
        }
    }
}
