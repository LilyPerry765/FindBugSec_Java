EntityManager pm = getEM();

TypedQuery<UserEntity> q = em.createQuery(
    String.format("select * from Users where name = %s", username),
    UserEntity.class);

UserEntity res = q.getSingleResult();
//CWE-89: Improper Neutralization of Special Elements used in an SQL Command ('SQL Injection')
