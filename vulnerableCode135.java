KeyGenerator keyGen = KeyGenerator.getInstance("Blowfish");
keyGen.init(64);
//CWE-326: Inadequate Encryption Strength
