def getWordList(value:String) = Action {
  if (!Files.exists(Paths.get("public/lists/" + value))) {
    NotFound("File not found")
  } else {
    val result = Source.fromFile("public/lists/" + value).getLines().mkString // Weak point
    Ok(result)
  }
}
//CWE-22: Improper Limitation of a Pathname to a Restricted Directory ('Path Traversal')
