MessageDigest md = MessageDigest.getInstance("SHA-256");
byte[] resultBytes = md.digest(password.getBytes("UTF-8"));

StringBuilder stringBuilder = new StringBuilder();
for(byte b :resultBytes) {
    stringBuilder.append( Integer.toHexString( b & 0xFF ) );
}

return stringBuilder.toString();
//CWE-704: Incorrect Type Conversion or Cast
