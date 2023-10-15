val peopleParser = Macro.parser[Person]("id", "name", "age")

DB.withConnection { implicit c =>
  val people: List[Person] = SQL("select * from people where name = '" + value + "'").as(peopleParser.*)
}
//CWE-89: Improper Neutralization of Special Elements used in an SQL Command ('SQL Injection')
