KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
keyGen.initialize(512);

//CWE-326: Inadequate Encryption Strength
