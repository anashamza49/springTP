package ma.ehei.tp.configuration;

import ma.ehei.tp.service.reduction.ReductionService;
import ma.ehei.tp.service.reduction.impl.ParametrableReductionService;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = "ma.ehei.tp")
@PropertySource("classpath:app.properties")
@ImportResource("classpath:spring-config.xml")
public class AppConfig {

    @Bean("franceParametrableReductionService")
    public ReductionService genererReductionFrance(){
        ParametrableReductionService reductionService = new ParametrableReductionService();
        reductionService.setTaux(30.0);
        return reductionService;
    }

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        dataSource.setUrl("jdbc:sqlserver://SPLUX\\SQLEXPRESS;databaseName=springTP;");
        dataSource.setUsername("");
        dataSource.setPassword("");
        return dataSource;
    }
    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {

        return new JdbcTemplate(dataSource);
    }
}