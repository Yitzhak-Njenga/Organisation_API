import com.google.gson.Gson;
import dao.Sql2oOrganisationDao;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

public class App {

    public static void main (String[] args){
        Sql2oOrganisationDao newDao;
        Connection connection;
        Gson gson = new Gson();

        String connectionString = "jdbc:posgresql:locolhost:5432/departments";
        Sql2o sql2o = new Sql2o(connectionString,"moringa","1234");
    }
}
