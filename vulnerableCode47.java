SAXParser parser = SAXParserFactory.newInstance().newSAXParser();

parser.parse(inputStream, customHandler);
//CWE-611: Improper Restriction of XML External Entity Reference ('XXE')
