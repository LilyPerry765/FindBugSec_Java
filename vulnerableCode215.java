DirContext ctx = new InitialDirContext();
//[...]

ctx.search(query, filter,
        new SearchControls(scope, countLimit, timeLimit, attributes,true, //Enable object deserialization if bound in director  
		deref));

//CWE-79: Improper Neutralization of Input During Web Page Generation ('Cross-site Scripting')
