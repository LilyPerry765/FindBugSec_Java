String generateSecretToken() {
    Random r = new Random();
    return Long.toHexString(r.nextLong());
}
//CWE-330: Use of Insufficiently Random Values
