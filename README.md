# Request Tracking Assignment

Creates service reqeust by providing account and contact information and updates the database. It is an admin side project in which an employee will have access on data to create and update details. 

### Prerequisites

1. Install java and tomcat. make sure both versions are compaitable with each other. check compaitable versions [here](http://tomcat.apache.org/whichversion.html).

```
ex: Tomcat v9.0.8 is supported by java8 and later versions.
```

2. Install Mysql.

3. * create a hibernate configuration file and place all required properties in it. 

   * see [hibernate.cfg.xml](https://github.com/saikrishna1214/CustomerServicePortal/blob/master/src/main/resources/hibernate.cfg.xml) for reference. Replace required propeties(ex: database name and password) and their values according to your database properties.

   * replace  CustomerServicePortal/src/main/resources/hibernate.cfg.xml with newly created file.

### Installing java

Run this Command in your terminal to install java.

```
$ sudo apt-get install oracle-java8-installer
```
replace 8 with newer versions.

### Installing Tomcat

1. Download latest version of [Apache tomcat](http://tomcat.apache.org/)

2. Unzip tomcat and install it.

3. you can start and stop the server from IDE like Eclipse or you can do it from terminal.

### Installing Mysql

Download and Install Mysql from [here](https://www.mysql.com/downloads).

## Steps to build Application

* Download source code from Git repository and extract it.

* Open terminal from this folder and run "mvn install" to build a jar file.

## Steps to run Application

* Now run command java -jar filename.jar.

* Options are displayed after running it.

* Enter required option to continue further.

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management

* Spring Core

* Hibernate

## License

This project is licensed under the MIT License.



