JdbcTemplate jdbc = new JdbcTemplate();
int count = jdbc.queryForObject("select count(*) from Users where name = '"+paramName+"'", Integer.class);

//CWE-89: Improper Neutralization of Special Elements used in an SQL Command ('SQL Injection')
