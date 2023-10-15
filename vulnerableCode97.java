SqlClient.query( "select * from Customer where id=" + inputId ).execute(ar -> ...);

//CWE-89: Improper Neutralization of Special Elements used in an SQL Command ('SQL Injection')
