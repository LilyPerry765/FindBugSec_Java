Pattern pattern = Pattern.compile("[<>]"); // Check for angle brackets
Matcher matcher = pattern.matcher(s);
if (matcher.find()) {
  throw new IllegalStateException();
}
s = Normalizer.normalize(s, Form.NFKC);

//CWE-176: Improper Handling of Unicode Encoding
