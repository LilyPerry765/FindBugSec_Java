def executeCommand(value:String) = Action {
    val result = value.!
    Ok("Result:\n"+result)
}
//CWE-78: Improper Neutralization of Special Elements used in an OS Command ('OS Command Injection')
