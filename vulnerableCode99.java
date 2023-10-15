String query = "SELECT * FROM  messages WHERE uid= '"+userInput+"'" ;
Cursor cursor = this.getReadableDatabase().rawQuery(query,null);
//CWE-89: Improper Neutralization of Special Elements used in an SQL Command ('SQL Injection')
