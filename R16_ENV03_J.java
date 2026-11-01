//Rule 16 Do not grant dangerous combinations of permissions
grant codeBase 
    "file:${klib.home}/j2se/home/klib.jar", signedBy "Admin" {
  permission java.io.FilePermission "/tmp/*", "read";
  permission java.io.SocketPermission "*", "connect";
};
