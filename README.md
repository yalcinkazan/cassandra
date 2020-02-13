# cassandra
Spring Boot Cassandra Microservice

# Prerequisites
Cassandra installed in your machine
</br>

# Cassandra Codes:

cqlsh </br>

CREATE KEYSPACE user WITH replication  = {'class': 'SimpleStrategy','replication_factor': 1}; </br>

USE user; </br>

CREATE TABLE user( </br>
   id uuid PRIMARY KEY, </br>
   firstName text, </br>
   lastName text </br>
   ); </br>
   
   
 # Service Usage:
 
 # Post 'http://localhost:8080/user'
 -JSON Content; </br>
{ </br>
    "firstName": "John", </br>
    "lastName": "Frusciante" </br>
} </br>

# Update 'http://localhost:8080/user/{id}'
 -JSON Content; </br>
{ </br>
    "firstName": "Jimi", </br>
    "lastName": "Hendrix" </br>
} </br>

# Delete 'http://localhost:8080/user/{id}'
# Get 'http://localhost:8080/user/{id}'
# Get All 'http://localhost:8080/user'

 

   
 
                                       

   
