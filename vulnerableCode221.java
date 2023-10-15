...
String customerID = getAuthenticatedCustomerID(customerName, customerCredentials);
String productCategory = request.getParameter("productCategory");
...
AmazonSimpleDBClient sdbc = new AmazonSimpleDBClient(appAWSCredentials);
String query = "select * from invoices where productCategory = '"
            + productCategory + "' and customerID = '"
            + customerID + "' order by '"
            + sortColumn + "' asc";
SelectResult sdbResult = sdbc.select(new SelectRequest(query));

//CWE-943: Improper Neutralization of Special Elements in Data Query Logic
