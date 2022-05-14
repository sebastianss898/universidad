package Modelo;

import Configuracion.Conexion;
import Entidades.Facultad;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FacultadDAO {

    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    Facultad f;

    public List<Facultad> ListarFacultad() {
        List<Facultad> listarFacultad = new ArrayList<>();

        try {
            //Conexion db
            con = Conexion.getConnection();
            //Preparar Consulta
            ps = con.prepareCall("{call psListarFacultad}");
            //ejecucion y lamcenado de resultados
            rs = ps.executeQuery();

            while (rs.next()) {

                int codigo = rs.getInt("codigo");
                String descripcion = rs.getNString("codFacultad");

                //creacion objefo facultd
                f = new Facultad(codigo, descripcion);

                //guardamos en array
                listarFacultad.add(f);
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        } finally {
            Conexion.CerrarConexion(con);
        }
        return listarFacultad;

    }

}
