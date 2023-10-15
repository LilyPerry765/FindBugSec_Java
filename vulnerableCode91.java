Connection conn = [...];
Statement stmt = con.createStatement();
ResultSet rs = stmt.executeQuery("update COFFEES set SALES = "+nbSales+" where COF_NAME = '"+coffeeName+"'");
//CWE-89: Improper Neutralization of Special Elements used in an SQL Command ('SQL Injection')
