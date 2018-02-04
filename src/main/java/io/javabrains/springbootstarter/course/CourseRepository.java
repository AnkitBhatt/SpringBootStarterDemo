package io.javabrains.springbootstarter.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface CourseRepository extends CrudRepository<Course,String> {
	public List<Course> findByName(String name);
	//Syntax starts with find -> followed by "By" -> followed by "PropertyName" defined in entity Class
	public List<Course> findByDescription(String name);
	
	public List<Course> findByTopicId(String topicId);
	

}
