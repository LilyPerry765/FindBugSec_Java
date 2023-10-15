Transformer transformer = TransformerFactory.newInstance().newTransformer();
transformer.transform(input, result);
//CWE-611: Improper Restriction of XML External Entity Reference ('XXE')
