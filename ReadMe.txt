How to Run this Project
-----------------------

* This project is build in Spring Boot.
* To run this project, get pull from github repositry.
* To run this you need STS setup installed on your machine with postman Java 8 and Maven.
* After importing project to STS, please update project by right clicking on project --> MAVEN--> UPDATE PROJECT.
* Once all dependencies downloaded then Right click on BootStrapper class to deploy this project on embedded tomcat server.

About Code
-----------
* I have created One Controller Class "BillController" recieve call Request from Client "Postpman",
* request populated "BillRequest" in BillDTO and pass Requested Data to proccess to ServiceLayer 
* "BillService" class that perform business logic and return response with code and message and netpayable amount in BillDTO.
* BillDTO then recieved by Rest Controller Class and controller Class send response "BillResponse" back to client "Postman" 
* There exist two supporting classes "Constants and CommonUtils"

Execute Request in Client "Postman"

* Once deployed, please do POST request with following samples.

Possible Values for Parameters

"userType": 
		EMP --> employee of the store
		AFF --> user is an affiliate of the store
		O2Y --> user has been a customer for over 2 years

		Any thing other than above to 
		testcase 4 "For every $100 on the bill, there would be a $ 5 discount (e.g. for $ 990, you get $ 45 as a discount)"	


"shoppingType": 
		GROC --> to check only testcase 5
		OTH  --> other than GROC to check remaining test case expect 5

"bill" : should be always greater than 0.

* Note that all parameters in request are mandatory if any of missing  or invalid value passed in bill you will get invalid request paraemters in response.
 
Request

Sample 1 #{
    "bill": -1,
    "userType": "",
    "shoppingType": ""
}
Sample 2 #{
    "bill": 10,
    "userType": null,
    "shoppingType": "OTH"
}
Response
{
    "netPayableAmount": null,
    "erroCode": "-2",
    "errorMessage": "Invalid request parameters"
}

1. If the user is an employee of the store, he gets a 30% discount 

http://localhost:8080/bill/discount

Request
{
    "bill": 10,
    "userType": "EMP",
    "shoppingType": "OTH"
}


Response
{
    "netPayableAmount": 7,
    "erroCode": "00",
    "errorMessage": "Congratulations, you got 30.0% discount on bill."
}

2. If the user is an affiliate of the store, he gets a 10% discount
Request
{
    "bill": 10,
    "userType": "AFF",
    "shoppingType": "OTH"
}

Response
{
    "netPayableAmount": 9,
    "erroCode": "00",
    "errorMessage": "Congratulations, you got 10.0% discount on bill."
}

3 If the user has been a customer for over 2 years, he gets a 5% discount. 

Request
{
    "bill": 10,
    "userType": "O2Y",
    "shoppingType": "OTH"
}
Response
{
    "netPayableAmount": 9.5,
    "erroCode": "00",
    "errorMessage": "Congratulations, you got 5.0% discount on bill."
}

4. For every $100 on the bill, there would be a $ 5 discount (e.g. for $ 990, you get $ 45 
as a discount)

Request
{
    "bill": 990,
    "userType": "OTH",
    "shoppingType": "OTH"
}

Response

{
    "netPayableAmount": 945,
    "erroCode": "00",
    "errorMessage": "Congratulations, you got 5.0% discount on bill."
}

 5. The percentage based discounts do not apply on groceries. 

Request
{
    "bill": 10,
    "userType": "EMP",
    "shoppingType": "GROC"
}

Response

{
    "netPayableAmount": 10,
    "erroCode": "01",
    "errorMessage": "Sorry you're not applicable for any discount."
}
