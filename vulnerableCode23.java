MessageDigest sha1Digest = MessageDigest.getInstance("SHA1");
    sha1Digest.update(password.getBytes());
    byte[] hashValue = sha1Digest.digest();
//CWE-327: Use of a Broken or Risky Cryptographic Algorithm
