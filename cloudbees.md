
# Step by Step creation of the environment

```
bees app:create -a petclinic -t tomcat7
bees db:create petclinic

bees app:bind -a petclinic -db petclinic -as petclinic
bees config:set -a petclinic -P spring.profiles.active=default,javaee
bees config:set -a petclinic -P jdbc.initLocation=classpath:db/mysql/initDB.sql
bees config:set -a petclinic -P jdbc.dataLocation=classpath:db/mysql/populateDB.sql
bees config:set -a petclinic -P hibernate.dialect=org.hibernate.dialect.MySQLDialect
bees config:set -a petclinic -P jpa.database=MYSQL
bees config:set -a petclinic -P jpa.showSql=false


bees app:deploy -a petclinic target/petclinic.war
```
