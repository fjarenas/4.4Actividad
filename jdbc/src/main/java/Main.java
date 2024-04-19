import bd.SetUpConnection;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try (
                Connection conexion1 = SetUpConnection.getInstance().getConnection();
                Connection conexion2 = SetUpConnection.getInstance().getConnection();
                Connection conexion3 = SetUpConnection.getInstance().getConnection();
                Connection conexion4 = SetUpConnection.getInstance().getConnection();){
            System.out.println("Conectado...");
            System.out.println(conexion1);
            System.out.println(conexion2);
            System.out.println(conexion3);
            System.out.println(conexion4);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
