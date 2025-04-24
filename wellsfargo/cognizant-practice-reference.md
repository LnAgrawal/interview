# Interview 1
1. Introduction – Career Path to become lead, technologies and framework worked, day to day activities etc.

2. Given a scenario, application build from scratch, how to you approach on overall solution, how do you give technical guidance as a lead. Highlight from the technical view as a lead, how do you technical approach,

3. What are things considered as overall design approach if you are designing/architecture and overall scalability. How do you scale and what are the patterns for a better scalability.

4. What is scalability? What do you take? Horizontal or vertical scalability.

5. How do you know when to scale? What is the trigger point to make a decision on scalability?

6. How to scale your PODS using Kubernetes? Forget configuration, explain me the concepts.

7. In K8- what artifact will help you to do the scaling.

8. You are a taking lead, building a service, decision to be made decision on monolithic approach or microservice approach. Explain your decision with pros and cons

9. How to decide number of micro services and design patterns to be built in building a new finance application? Explain amazon architecture which could help

10. What do you apply to decide how many modules should be there considering

11. Domain driven design – have you heard of it?

12. Explain use cases for using SAGA and why do you use SAGA?

13. Disadvantage of SAGA Orchestration –Single point of failure in Orchestration.

14. How to you handle your system failure proof? Explain resilience pattern

15. When do you use resilience patten?

16. Why do you need a circuit breaker? Explain me the reasons. What failures circuit breakers can handle?

17. Why do you need a circuit breaker to show error messages… you can simply achieve that using try, catch block.

18. Explain main advantage of spring boot over conventional spring.

19. How does spring boot auto configuration annotation works? How does annotation work in configuration? What is that property for auto configuration?

20. How do you override default configuration in spring boot?

21. @autowire vs @resource  , @inject– what is the difference

22. Transaction propagation – list all transaction propagation

23. What is isolation levels?

24. What Java version you are using?

25. What is the latest version of Java in the market?

26. Key features released in Java 22 and Java 23

27. What is virtual threads?-java 21

28. Dependency injection(DI) vs dependency inversion–(IOC) what are the differences?

29. When do you decide what databases to be used when?(RDBMS VS Document DB)

30. Cap theorem noSQL database.

31. SOLID principal

32. Open and close principal in SOLID


# Interview 2

1. Explain your activities in the last project

2. Multiple failure points from one service to another service. How to address them?

3. What is your traceability here from front to back?

4. Did you manage manually the service ID across multiple services? How did you achieve same service ID for tracking across multiple services?

5. What are the tools for managing errors? Where is Splunk used?

6. ID generated in each flow/instance. One ID is generated in first request. How do you ensure all the remaining 20 requests have their unique ID generated and tracked correctly in a multi-instance environment? How to ensure request ID is unique and not duplicated?

7. What is the API Gateway? Why do we need that?

8. Explain me use case of circuit breaker

9. Have you used Blukin…
   (Probably meant "Bulkin" or "Blukin", could you clarify the spelling or context?)

10. Explain me 12-factor principles for microservices

11. Coding question: List of input numbers (1,2,3,4,5,6,7,8,9,10)
    Thread 1 should print odd numbers, Thread 2 even
    Synchronization between Thread 1 and Thread 2
    Output:

python-repl
Copy
Edit
Thread1 1  
Thread2 2  
Thread1 3  
Thread2 4  
...

12. Explain the main advantage of Spring Boot over conventional Spring

13. How does auto-configuration work in Spring Boot? How does it work internally?

14. What are the different ways of authentication in REST API?

15. How does OAuth2 work?

16. Explain fulfillment when we have API Gateway and multiple services interconnected (with authentication, authorization, and roles)

17. What are the steps to register services and API Gateway?

18. ApplicationContext vs BeanFactory vs WebApplicationContext

19. Bean scope (singleton, prototype, request, session, etc.)

20. BDD (How do you write BDD) and how to write integration test cases?

21. What is the use of Mock in JUnit?

22. What all objects can we mock?

23. What is the difference between JUnit and BDD test cases like Cucumber?

24. What amount of JUnit coverage implemented in your project and how are you checking coverage?

25. Monolithic to microservice migration

26. How to connect from Microservice A to B

27. Circuit breaker pattern

28. OAuth and JWT approach

29. Request body validation

30. Exception handlers

31. Annotations in different layers

32. @Qualifier

33. @Conditional

34. Scope of the bean

35. @Controller vs @RestController

36. @Component vs @Service

37. HTTP POST vs PUT vs PATCH

38. HTTP response codes (200, 201, 400, 404, 500, etc.)

39. Functional interface (with examples)

40. Automated API testing