/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BancoDados;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
public class Conexao {
    public Connection getConnection() {
        try {
            Connection conexao = DriverManager.getConnection("jdbc:mysql://127.0.0.1/produto","root","aluno");
            return conexao;
        } catch (SQLException e) {
            System.out.println("Erro ao tentar conectar ao banco de dados! Favor verificar o caminho.");
        }
        return null;
    }
}
