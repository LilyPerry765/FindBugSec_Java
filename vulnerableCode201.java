def doGet(value:String) = Action {
  val configElement = configuration.underlying.getString(value)

  Ok("Hello "+ configElement +" !")
}
//CWE-200: Information Exposure
