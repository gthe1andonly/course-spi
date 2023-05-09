package io.javabrains.springbootquickstart.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return Arrays.asList(
				new Topic("spring", "spring framework", "spring framweork description"), 
				new Topic("java", "spring java", "java coffee description"),
				new Topic("python", "pandas framework", "panda description"));
	}
}
