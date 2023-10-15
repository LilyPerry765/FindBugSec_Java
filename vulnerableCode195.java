public class Example {
    static class ABean {
        public int id;
        public Object obj;
    }

    static class AnotherBean {
        @JsonTypeInfo(use = JsonTypeInfo.Id.CLASS) // or JsonTypeInfo.Id.MINIMAL_CLASS
        public Object obj;
    }

    public void example(String json) throws JsonMappingException {
         ObjectMapper mapper = new ObjectMapper();
         mapper.enableDefaultTyping();
         mapper.readValue(json, ABean.class);
    }

    public void exampleTwo(String json) throws JsonMappingException {
         ObjectMapper mapper = new ObjectMapper();
         mapper.readValue(json, AnotherBean.class);
    }

}

//CWE-502: Deserialization of Untrusted Data
