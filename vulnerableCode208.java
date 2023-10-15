def doGet(value:String) = Action {
    Ok("Hello " + value + " !").as("text/html")
  }
//CWE-79: Improper Neutralization of Input During Web Page Generation ('Cross-site Scripting')
