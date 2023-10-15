PermissionCollection pc = super.getPermissions(cs);
pc.add(new RuntimePermission("createClassLoader"));

//CWE-176: Improper Handling of Unicode Encoding
