MessageDigest md5Digest = MessageDigest.getInstance("MD5");
    md5Digest.update(password.getBytes());
    byte[] hashValue = md5Digest.digest();
//CWE-327: Use of a Broken or Risky Cryptographic Algorithm
