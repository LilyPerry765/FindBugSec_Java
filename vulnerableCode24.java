byte[] hashValue = DigestUtils.getSha1Digest().digest(password.getBytes());
//CWE-327: Use of a Broken or Risky Cryptographic Algorithm
