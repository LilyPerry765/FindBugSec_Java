public UserData deserializeObject(InputStream receivedFile) throws IOException, ClassNotFoundException {

    try (ObjectInputStream in = new ObjectInputStream(receivedFile)) {
        return (UserData) in.readObject();
    }
}

//CWE-502: Deserialization of Untrusted Data
