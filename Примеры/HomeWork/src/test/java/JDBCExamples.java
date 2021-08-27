import i18n.examples.DemoResourceBundle;
import jul.example.anotherPackage.Inner;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.apache.tomcat.jdbc.pool.PoolProperties;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

public class JDBCExamples {
    final static Logger logger = LoggerFactory.getLogger(JDBCExamples.class);

    private static final DataSource DS=getDataSource();
    private static DataSource getDataSource(){
            PoolProperties p = new PoolProperties();
            p.setUrl("jdbc:mysql://194.195.241.62:3306/demo_db");
        //p.setUrl("jdbc:postgresql://194.195.241.62:5432/demo_db");
            //p.setDriverClassName("com.mysql.jdbc.Driver");
            p.setDriverClassName("com.mysql.cj.jdbc.Driver");
            //p.setDriverClassName("org.postgresql.Driver");
            //p.setDriverClassName("org.mariadb.jdbc.Driver");
            p.setUsername("demo");
            p.setPassword("V]ibi.dP");
//        p.setPassword("cAduTeQi");
            p.setJmxEnabled(true);
            p.setTestWhileIdle(false);
            p.setTestOnBorrow(true);
            p.setValidationQuery("SELECT 1");
            p.setTestOnReturn(false);
            p.setValidationInterval(30000);
            p.setTimeBetweenEvictionRunsMillis(30000);
            p.setMaxActive(3);
            p.setInitialSize(1);
            p.setMaxWait(2);
            p.setRemoveAbandonedTimeout(60);
            p.setMinEvictableIdleTimeMillis(30000);
            p.setMinIdle(1);
            p.setMaxIdle(2);
            p.setDefaultAutoCommit(false);
            p.setLogAbandoned(true);
            p.setRemoveAbandoned(true);
            p.setJdbcInterceptors(
                    "org.apache.tomcat.jdbc.pool.interceptor.ConnectionState;"+
                            "org.apache.tomcat.jdbc.pool.interceptor.StatementFinalizer");
            DataSource datasource = new DataSource();
            datasource.setPoolProperties(p);
            return datasource;
    }


    @Test
    @DisplayName("DatabaseConnect")
    void getConnection() {
        Connection con = null;
        try {
            con = DS.getConnection();
            assertNotNull(con);
        }catch (Exception ignore) {}
        finally {
            if (con!=null) try {con.close();}catch (Exception ignore) {}
        }

    }

    @Test
    @DisplayName("SimpleQuery")
    void simpleQuery() {
        Connection con = null;
        try {
            con = DS.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select now() as now ");
            int cnt = 1;
            while (rs.next()) {
                logger.info("Текущее время: {}",rs.getTimestamp("now"));
            }
            rs.close();
            st.close();
        }catch (Exception ignore) {} finally {
            if (con!=null) try {con.close();}catch (Exception ignore) {}
        }
    }
    @ParameterizedTest(name = "Поиск сушностей {0}")
    @CsvSource({
            "1",
            "5",
            "7"
    })
    void lookFor(Long id) {
        try (Connection con = DS.getConnection()){
            try(PreparedStatement st = con.prepareStatement("select * from city where id=?")){
                st.setLong(1,id);
                try(ResultSet rs = st.executeQuery()){
                    while (rs.next()) {
                        logger.info("Нашли город: {} -> {}",id,rs.getString("title"));
                    }
                }
            }
        } catch (SQLException throwables) {
            logger.error("Error:",throwables);
            assertFalse(throwables!=null);
        }

    }



}


