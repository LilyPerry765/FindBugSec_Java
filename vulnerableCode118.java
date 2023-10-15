Cipher doNothingCihper = new NullCipher();
[...]
//The ciphertext produced will be identical to the plaintext.
byte[] cipherText = c.doFinal(plainText);
//CWE-327: Use of a Broken or Risky Cryptographic Algorithm
