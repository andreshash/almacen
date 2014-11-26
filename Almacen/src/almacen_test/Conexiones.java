package almacen_test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Cristiam
 */
public class Conexiones {
    //Inicio atributos
    private String dbname = "almacen";
    private String user = "root";
    private String pass = "";
    private String server = "localhost";
   
    private String url;
    /**
     * 
     */
    public Connection conDB;      

    
    /**
     * 
     */
    public Conexiones(){
        if(dbname != null && user != null && pass != null && server != null ){
            this.url = "jdbc:mysql://localhost/"+dbname;
        }
        else{
            JOptionPane.showMessageDialog(null, "Error en datos de conexión.", " KARDEX Info.", 0);
        }
    }

    /**
     * 
     * @param server1
     * @param db1
     * @param port1
     * @param user1
     * @param pass1
     */
    public Conexiones(String server1, String db1,String port1, String user1, String pass1){
        this.server = server1;
        this.dbname = db1;
        this.user = user1;
        this.pass = pass1;
        
        this.url = "jdbc:mysql://localhost/"+dbname;
        }

    
//METODOS DE LA CLASE--------------------------------------------------------------------------------
    
    /**
     * 
     */
    public void connect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            this.conDB = DriverManager.getConnection(this.url, this.user, this.pass);
            if(conDB != null){
                System.out.println("Conexión a base de datos[ "+this.url+" ]... OK");
                }
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al intentar conectar con base de datos.","PROMETEO SOFT 2.0 Info.",0);
             System.out.println(ex);
             JOptionPane.showMessageDialog(null, ex);
        }
        catch(ClassNotFoundException ee){
            System.out.println(ee);
            JOptionPane.showMessageDialog(null, ee);
        }
    }

    
    /**
     * 
     * @throws SQLException
     */
    public void disconnect() throws SQLException{
        this.conDB.close();    
        System.out.println("Desconexión a base de datos... OK");
    }
    
    /**
     * 
     * @return
     */
    public String get_dbname(){
        return this.dbname;
    }

    /**
     * 
     * @param new_dbname
     */
    public void set_dbname(String new_dbname){
        this.dbname = new_dbname;
    }

    /**
     * 
     * @return
     */
    public String get_user(){
        return this.user;
    }

    /**
     * 
     * @param new_user
     */
    public void set_user(String new_user){
        this.user = new_user;
    }

    /**
     * 
     * @return
     */
    public String get_password(){
        return pass;
    }

    /**
     * 
     * @param new_pass
     */
    public void set_password(String new_pass){
        this.pass = new_pass;
    }

    /**
     * 
     * @return
     */
    public String get_server(){
        return this.server;
    }

    /**
     * 
     * @param new_server
     */
    public void set_server(String new_server){
        this.server = new_server;
    }

 
    /**
     * 
     * @param args
     */
    public static void main(String args[]) throws SQLException {
        Conexiones cone =new Conexiones();
         cone.connect();
         cone.disconnect();
    
    }
    
}