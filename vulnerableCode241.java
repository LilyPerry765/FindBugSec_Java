Pattern pattern = Pattern.compile("<script>");
Matcher matcher = pattern.matcher(s);
if (matcher.find()) {
  throw new IllegalArgumentException("Invalid input");
}

s = s.replaceAll("[\\p{Cn}]", "");

//CWE-176: Improper Handling of Unicode Encoding
