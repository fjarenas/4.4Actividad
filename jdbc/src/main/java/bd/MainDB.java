package bd;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class MainDB {
    public static void main(String[] args) {
        try {
            MobileDB mobileDB = new MobileDB();

            //RELACIONADO CON EL MÉTODO insertMobile

            /*Mobile mobile = new Mobile("yyy", "modelYY", 500.3);
            boolean insertSuccess = mobileDB.insertMobile(mobile);
            System.out.printf("Insercción correcta: %B%n", insertSuccess);

            //RELACIONADO CON EL MÉTODO deleteMobile

            String serial = "xxx2";
            boolean deleteSuccess = mobileDB.deleteMobile(serial);
            System.out.printf("Borrado correcto: %B%n", deleteSuccess);

            //RELACIONADO CON EL MÉTODO updateMobilePrice

            String serial = "xxx1dfdfdfdf";
            double price = 600;
            boolean updateSuccess = mobileDB.updateMobilePrice(price, serial);
            System.out.printf("Actualizado precio, correcto: %B%n", updateSuccess);

            //RELACIONADO CON EL MÉTODO getMobiles

            List<Mobile> mobiles = mobileDB.getMobiles();
            mobiles.forEach(System.out::println);

            //RELACIONADO CON EL MÉTODO getMobileBySerial

            List<Mobile> mobiles = mobileDB.getMobileBySerial("x'  OR '1' = '1");
            mobiles.forEach(System.out::println);*/

            //RELACIONADO CON EL MÉTODO getMobileBySerialEnhaced

            Mobile mobile = mobileDB.getMobileBySerialEnhaced("x'  OR '1' = '1");
            System.out.println(mobile);


        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}