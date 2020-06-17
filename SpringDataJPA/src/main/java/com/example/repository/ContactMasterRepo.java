package com.example.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.example.entity.ContactEntity;

public interface ContactMasterRepo extends CrudRepository<ContactEntity, Serializable>
{

}
