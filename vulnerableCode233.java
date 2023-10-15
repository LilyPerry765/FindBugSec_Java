@Bean
ParserPool parserPool1() {
    BasicParserPool pool = new BasicParserPool();
    pool.setIgnoreComments(false);
    return pool;
}

//CWE-79: Improper Neutralization of Input During Web Page Generation ('Cross-site Scripting')
