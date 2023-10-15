DocumentBuilder db = DocumentBuilderFactory.newInstance().newDocumentBuilder();

Document doc = db.parse(input);
//CWE-611: Improper Restriction of XML External Entity Reference ('XXE')
