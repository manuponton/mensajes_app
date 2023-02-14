package com.platzi.mensajes_app;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

  public Connection getConnection() {
    Connection connection = null;
    try {
      connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app", "root",
          "admin");
      if(connection != null ){
        System.out.println("Se pudo realizar conexion correctamente");
      }
    } catch (Exception e) {
      System.out.println("Error en conexion de base de datos");
    }
    return connection;
  }
}
