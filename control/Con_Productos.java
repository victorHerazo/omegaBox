/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import conexion.UConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Mod_Productos;

/**
 *
 * @author victor
 */
public class Con_Productos {
    
    public ArrayList<Mod_Productos> generarListadoCursos() {
        ArrayList listaCursos = new ArrayList();
        String sql;
        UConnection con = new UConnection();
        sql = "SELECT * FROM producto";
        ResultSet resul;
        Mod_Productos cursos;

        try {
            resul = con.consultar(sql);
            while (resul.next()) {
                cursos = new Mod_Productos(resul.getInt("id"), resul.getString("nombre"), resul.getString("descripcion"));
                listaCursos.add(cursos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Mod_Productos.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listaCursos;
    }
}
