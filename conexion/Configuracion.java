/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

/**
 *
 * @author victor
 */
public interface Configuracion {
//        String DRIVER = "oracle.jdbc.driver.OracleDriver";
//    String CONNECTION_URL = "jdbc:oracle:thin:@localhost:1521:orcl";
//    String USERNAME = "Java";
//    String PASSWORD = "Java";
    
    String DRIVER = "com.mysql.jdbc.Driver";
    String CONNECTION_URL = "jdbc:mysql://localhost/omegabox";
    String DATA_BASE = "omegabox";
    String USERNAME = "root";
    String PASSWORD = "";
    
//    String DRIVER = "org.postgresql.Driver";
//    String DATA_BASE = "postgres";
//    String CONNECTION_URL = "jdbc:postgresql://localhost:5432/"+DATA_BASE;    
//    String USERNAME = "postgres";
//    String PASSWORD = "jaime";
}
