Spring Boot makes it very easy to create Spring based applications. Spring Boot takes an opinionated view of the Spring platform and third-party libraries, allowing us to get started with a minimal configuration. 

For example we can develop a Jave EE based web application without any configuration files. Not even a web.xml file is required!

When required, however, we can take control over parts of the configuration and override the conventions that Spring Boot puts in play. 
We can also, if we really must, use traditional XML configuration files for some parts of the configuration.

we will develop a plain REST service using the Spring Web MVC framework and package it in a web application, ready to be deployed in any Servlet 3.0 compliant web server. 

GET THE SOURCE CODE
If you want to check out the source code and test it on your own you need to have Java SE 8 and Git installed. Then perform:

$ git clone https://github.com/hakuna16/SpringBootApp.git
$ cd SpringBootApp

##Folder Structure

<a href="https://ibb.co/fahyZn"><img src="https://preview.ibb.co/cOXbLS/floder_Structure.png" alt="floder_Structure" border="0"></a>

## Requirements

For building and running the application you need:

- [JDK 1.8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Maven 3](https://maven.apache.org)


## Installation and Getting Started
The {docs}/htmlsingle/[reference documentation] includes detailed
{docs}/htmlsingle/#getting-started-installing-spring-boot[installation instructions]
as well as a comprehensive {docs}/htmlsingle/#getting-started-first-application[``getting
started``] guide. Documentation is published in {docs}/htmlsingle/[HTML],
{docs}/pdf/spring-boot-reference.pdf[PDF] and {docs}/epub/spring-boot-reference.epub[EPUB]
formats.

Here is a quick teaser of a complete Spring Boot application in Java:


----
	import org.springframework.boot.*;
	import org.springframework.boot.autoconfigure.*;
	import org.springframework.web.bind.annotation.*;

	@RestController
	@SpringBootApplication
	public class Example {

		@RequestMapping("/")
		String home() {
			return "Hello World!";
		}

		public static void main(String[] args) throws Exception {
			SpringApplication.run(Example.class, args);
		}

	}
----
