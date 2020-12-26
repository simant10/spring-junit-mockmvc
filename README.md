# spring-junit-mockmvc

Important Terms
----
1. What is Unit Testing ?
2. What is Mocking ?
3. What is Need of Mocking ?
3. What is Mockito Framwork?
4. Why Mackito Framwork ?

>What is Unit Testing ?
>> When a developer develop an application then it should be tested at the developer end . Developer should be responsible to test the function or module ,
 his function or module should give the expected output on the basis of input.</br>
>> Unit Testing means , the small small units of application need to be tested.
>> To achieve the above developer need to write unit test cases.</br>

> What is Mocking ?
>> Mocking is a process by which we can convert real object into mock OR clone object.</br>
>> Developer use Mock object instead of real object to perform Unit Testing .</br>
>> Mock Object works with a Dummy input and also produced Dummy output.</br>

> What is Need of Mocking :- 
>> If we want to test a component that depends on the other component, but the other component is under development. In generally , when we are working in a team and parts are divided between several team-mates. In this case, mocking plays an essential role in the testing of that component. Without mocking, we need to wait for the completion of the required elements for testing.</br>
>> If the real components perform slow operations while dealing with database connections or another complex read/ write operation. Sometimes the database queries can take 10, 20, or more seconds to execute. In such cases, we require mock objects to perform testing, and it can be done via mocking.</br>

> What is Mockito Framwork?
>>
