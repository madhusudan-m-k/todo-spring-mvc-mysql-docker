FROM tomcat:9.0.30-jdk11-openjdk

RUN rm -rf /usr/local/tomcat/webapps/hello-spring-mvc-mysql

RUN rm -rf /usr/local/tomcat/webapps/hello-spring-mvc-mysql.war

COPY ./target/hello-spring-mvc-mysql.war /usr/local/tomcat/webapps/hello-spring-mvc-mysql.war

ENTRYPOINT [ "catalina.sh", "run" ]