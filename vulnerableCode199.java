Source xslt = new StreamSource(new FileInputStream(inputUserFile)); //Dangerous source

Transformer transformer = TransformerFactory.newInstance().newTransformer(xslt);

Source text = new StreamSource(new FileInputStream("/data_2_process.xml"));
transformer.transform(text, new StreamResult(...));

//CWE-501: Trust Boundary Violation
