package com.example.springcollege.CollegeAppSpring.repository;
import com.example.springcollege.CollegeAppSpring.model.Holiday;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface HolidayRepository extends CrudRepository<Holiday,String> {

}
