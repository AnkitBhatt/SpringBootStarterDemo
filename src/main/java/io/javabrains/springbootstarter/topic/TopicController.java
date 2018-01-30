package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		List<Topic> list = new ArrayList<>();
		list.add(new Topic("1","Java","Java Topic"));
		list.add(new Topic("2","Javascript","Javascript Topic"));
		return list;
	}
}
