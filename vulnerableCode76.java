List<Record> BasePeer.executeQuery( "select * from Customer where id=" + inputId );

//CWE-89: Improper Neutralization of Special Elements used in an SQL Command ('SQL Injection')
