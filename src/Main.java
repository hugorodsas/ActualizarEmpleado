import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String url="jdbc:oracle:thin:@localhost:1521:xe";
        String user="RIBERA";
        String password="ribera";

        try (Connection conn = DriverManager.getConnection(url,user,password)){
            String sql="UPDATE empleado2 SET SALARIO=400 WHERE id=2";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);

            preparedStatement.executeUpdate();
        }catch (SQLException e){
            System.out.println("ERROR: "+e.getMessage());
        }
    }
}
