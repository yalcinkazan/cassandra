package com.microservice.cassandra.repository;

import java.util.UUID;

import org.springframework.data.cassandra.repository.CassandraRepository;

import com.microservice.cassandra.model.User;

public interface UserRepository extends CassandraRepository<User, UUID>{

}
