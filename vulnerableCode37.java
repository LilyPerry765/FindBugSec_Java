public void parseXML(InputStream input) throws XMLStreamException {

    XMLInputFactory factory = XMLInputFactory.newFactory();
    XMLStreamReader reader = factory.createXMLStreamReader(input);
    [...]
}
//CWE-611: Improper Restriction of XML External Entity Reference ('XXE')
