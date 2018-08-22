# SpringData
Spring Data
How to run this project:

1. import this
2. resolve all deplendency
3. change db configuration as per user system in application.properties file
4. run on tomcat
5. execute below service:
http://localhost:8080/SpringData/testing
output in console:

Hibernate: insert into sample_data (first_name) values (?)

Hibernate: select sample0_.id as id1_0_, sample0_.first_name as first_na2_0_ from sample_data sample0_ where sample0_.id=? limit ?
data receivedTask [id=1, firstName=sushil]

Hibernate: select sample0_.id as id1_0_, sample0_.first_name as first_na2_0_ from sample_data sample0_ where sample0_.first_name=?
list::[Task [id=1, firstName=sushil], Task [id=2, firstName=sushil], Task [id=3, firstName=sushil], Task [id=4, firstName=sushil], Task [id=5, firstName=sushil], Task [id=6, firstName=sushil]]
