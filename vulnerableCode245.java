PermissionCollection pc = super.getPermissions(cs);
pc.add(new ReflectPermission("suppressAccessChecks"));

//CWE-176: Improper Handling of Unicode Encoding
