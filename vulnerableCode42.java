DocumentBuilder builder = df.newDocumentBuilder();

XPathFactory xPathFactory = XPathFactory.newInstance();
XPath xpath = xPathFactory.newXPath();
XPathExpression xPathExpr = xpath.compile("/somepath/text()");

xPathExpr.evaluate(new InputSource(inputStream));
//CWE-611: Improper Restriction of XML External Entity Reference ('XXE')
