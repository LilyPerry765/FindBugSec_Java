Set<PosixFilePermission> perms = new HashSet<>();
perms.add(PosixFilePermission.OWNER_READ);
perms.add(PosixFilePermission.OWNER_WRITE);
perms.add(PosixFilePermission.OWNER_EXECUTE);

perms.add(PosixFilePermission.GROUP_READ);
perms.add(PosixFilePermission.GROUP_WRITE);
perms.add(PosixFilePermission.GROUP_EXECUTE);

perms.add(PosixFilePermission.OTHERS_READ);
perms.add(PosixFilePermission.OTHERS_WRITE);
perms.add(PosixFilePermission.OTHERS_EXECUTE);

//CWE-732: Incorrect Permission Assignment for Critical Resource
