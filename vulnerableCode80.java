Session session = sessionFactory.openSession();
Query q = session.createQuery("select t from UserEntity t where id = " + input);
q.execute();
//CWE-89: Improper Neutralization of Special Elements used in an SQL Command ('SQL Injection')
