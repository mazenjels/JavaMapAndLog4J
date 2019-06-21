/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package log4j;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 *
 * @author Beaudry Mazenjels
 */
public class PropertiesFileLog4jExample {

    static Logger logger = Logger.getLogger(PropertiesFileLog4jExample.class);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        String log4jConfigFile = System.getProperty("user.dir")
//                + File.separator + "log4j.properties";
//        PropertyConfigurator.configure(log4jConfigFile);
//        logger.debug("this is a debug log message");
//        logger.info("this is a information log message");
//        logger.warn("this is a warning log message");
        Map<Integer, String> bands = new HashMap<Integer, String>();

        bands.put(11, "MPESA");
        bands.put(12, "CASH");
        bands.put(13, "CARD");

//        for (Map.Entry<Integer, String> entry : bands.entrySet()) {
//            Integer key = entry.getKey();
//            String value = entry.getValue();
//            System.out.println(key + ", " + value);
//        }
//
//        System.out.println("Size : " + bands.size());
        // get value of key 3
        String val = (String) bands.get(13);

        // check the value
        System.out.println("Value for key 3 is: " + val);
//
//        System.out.println(System.getProperty("user.name"));

//        int x=1;
//        int y=2;
//        
//        String xy=String.valueOf(x)+String.valueOf(y);
//        System.out.println("String xy : " + xy);
//        
//         System.out.println("Integer xy : " + Integer.valueOf(xy));
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"One");
        map.put(2,"Two");
        map.put(3,"Three");
        map.put(4,"Four");

        System.out.println(getKey(map, "Four"));
    }


    public static <K, V> K getKey(Map<K, V> map, V value) {
        for (K key : map.keySet()) {
            if (value.equals(map.get(key))) {
                return key;
            }
        }
        return null;
    }
}
