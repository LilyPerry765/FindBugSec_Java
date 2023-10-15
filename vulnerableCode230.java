Message message = new MimeMessage(session);
message.setFrom(new InternetAddress("noreply@your-organisation.com"));
message.setRecipients(Message.RecipientType.TO, new InternetAddress[] {new InternetAddress("target@gmail.com")});
message.setSubject(usernameDisplay + " has sent you notification"); //Injectable API
message.setText("Visit your ACME Corp profile for more info.");
Transport.send(message);

//CWE-93: Improper Neutralization of CRLF Sequences ('CRLF Injection')
