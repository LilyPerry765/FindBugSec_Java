XMLReader reader = XMLReaderFactory.createXMLReader();
reader.setContentHandler(customHandler);
reader.parse(new InputSource(inputStream));
//CWE-611: Improper Restriction of XML External Entity Reference ('XXE')
