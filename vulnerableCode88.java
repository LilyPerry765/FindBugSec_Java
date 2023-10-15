JdbcTemplate jdbc = new JdbcTemplate();
int count = jdbc.queryForObject("select count(*) from Users where name = '"+paramName+"'", Integer.class);
@Value("properties")
private String sql;

public function count() {
    JdcbOperation jdbc = new JdcbOperation();
    int count = jdbc.query(sql);
}
//CWE-89: Improper Neutralization of Special Elements used in an SQL Command ('SQL Injection')
