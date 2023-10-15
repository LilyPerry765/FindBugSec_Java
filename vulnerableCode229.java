try {
  out = httpResponse.getOutputStream()
} catch (Exception e) {
  e.printStackTrace(out);
}
//CWE-211: Information Exposure Through Externally-Generated Error Message
