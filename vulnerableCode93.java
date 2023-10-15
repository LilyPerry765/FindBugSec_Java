db.run {
  sql"select * from people where name = '#$value'".as[Person]
}
//CWE-89: Improper Neutralization of Special Elements used in an SQL Command ('SQL Injection')
