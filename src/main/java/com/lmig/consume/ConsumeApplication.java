package com.lmig.consume;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
//import com.ituple.common.dto.ServiceResponse;

@SpringBootApplication 
public class ConsumeApplication {
	Book book;

	private static final Logger log = LoggerFactory.getLogger(ConsumeApplication.class);

//	CODE for consuming rest API using rest template
//	public static void main(String args[]) {
//		SpringApplication.run(ConsumeApplication.class);
//	}
//
//	@Bean
//	public RestTemplate restTemplate(RestTemplateBuilder builder) {
//		return builder.build();
//	}

//
//	@Bean
//	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
//		return args -> {
//			 book = restTemplate.getForObject(
//					"https://www.googleapis.com/books/v1/volumes?q=quilting", Book.class);
//			log.info(book.toString());
//		};
//	}
//	
//	@Bean
//	public   Book run(RestTemplate restTemplate) throws Exception {
//		HttpEntity<Book> request = new HttpEntity<>(new Book());
//		B idclass;
//		idclass = restTemplate
//				  .postForObject("http://jsonplaceholder.typicode.com/posts", book, null, null);
////		log.info("ok1");
////		URI location = restTemplate
//		System.out.println(idclass);
////		assertThat(location, notNullValue());
//		return idclass;
//		};
	
//	Code for posting to REST API using rest template
	   public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        MultiValueMap<String, String> headers = new LinkedMultiValueMap<String, String>();
	        Map map = new HashMap<String, String>();
	        map.put("Content-Type", "application/json");

	        headers.setAll(map);

	        Map req_payload = new HashMap();
	        req_payload.put("name", "david");
	        req_payload.put("name2", "Tracy");
	        req_payload.put("name3", "Ravi");
	        HttpEntity<?> request = new HttpEntity<>(req_payload, headers);
	        String url = "http://jsonplaceholder.typicode.com/posts";

	        ResponseEntity<?> response = new RestTemplate().postForEntity(url, request, String.class);
//	        ServiceResponse entityResponse = (ServiceResponse) response.getBody();
//	        System.out.println(entityResponse.getData());
	        System.out.println(response);
	    }	
	
	
	}
//}