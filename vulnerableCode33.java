MyProprietaryMessageDigest extends MessageDigest {
    @Override
    protected byte[] engineDigest() {[...]
        //Creativity is a bad idea
        return [...];
    }
}
//CWE-327: Use of a Broken or Risky Cryptographic Algorithm
