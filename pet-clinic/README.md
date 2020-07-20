## Instructions to use

### Instructive project 
This code is aimed to exemplify the usage of spring.
The project is not authored by me, only using this as an example
about how to use spring-boot.

### Compilation
Use the mvn tab on intellij and from the main pet-clinic root run
the **clean** and then the **package** scripts.

The main pom posseses as a modules the pet-clinic-data and pet-clinic-web.

### Using Maven release plugin
Basically two commands can be used to submit a next release:
```shell script
$ mvn release:prepare
$ mvn release:perform
```

### Troubleshoting
* To avoid errors when a module does not have a main class, add:
```shell script
<properties>
    <spring-boot.repackage.skip>true</spring-boot.repackage.skip>
</properties>
```
* Make sure to set ssh keys on the remote repository.
* Make sure to not have the same release on the repository.

