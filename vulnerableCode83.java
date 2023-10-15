PersistenceManager pm = getPM();

Query q = pm.newQuery("select * from Users where name = " + input);
q.execute();
//CWE-89: Improper Neutralization of Special Elements used in an SQL Command ('SQL Injection')
