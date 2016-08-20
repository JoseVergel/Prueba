

package huellero;

import java.sql.*;
import javax.swing.JOptionPane;

public class conexion {
    private final String bd="UFPSO";
    private final String url="jdbc:mysql://localhost/"+bd;    
    private final String user="root";
    private final String password="031958";
    private Connection link=null;
    public Connection conectar(){
        
        try{
            Class.forName("org.gjt.mm.mysql.Driver");            
            link=DriverManager.getConnection(url, user, password);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error al conectar con la base de datos \n"+e);
        } catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null,"Error, driver no encontrado "+ex);
        }
        return link;
    }
    
    public void cerrar() throws SQLException{
        if(link!=null)
            link.close();
            
    }
}
