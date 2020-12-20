/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
/**
 *
 * @author Ginevra
 */
public class Db {
    private final String DRIVER=null;
    String URL_mioDB="jdbc:mysql://localhost:3306/webserver_db";
    String query="SELECT mome,cognome";
    private Connection conn;
    private ResultSet result;
    public Db() throws ClassNotFoundException, SQLException {
        Class.forName(DRIVER);
        conn=DriverManager.getConnection(URL_mioDB, "root", "");
    }
    public ResultSet eseguiQuery() throws SQLException{
        Statement stat=conn.createStatement();
        result=stat.executeQuery(query);
        return result;
    }
    public void chiudi() throws SQLException{
        conn.close();
    } 
    public void setUrl_db(String url) {
        this.URL_mioDB = url;//inserire match regexp
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }

    public String getDRIVER() {
        return DRIVER;
    }

    public String getUrl_db() {
        return URL_mioDB;
    }

    public String getQuery() {
        return query;
    }

    public Connection getConn() {
        return conn;
    }

    public ResultSet getResult() {
        return result;
    }
    public void setQuery(String q){
        if(q.toUpperCase().startsWith("SELECT")){
            query=q;
        }
        else{
            query="select \"Formato della Query non valido\";";
        }
    }
}
