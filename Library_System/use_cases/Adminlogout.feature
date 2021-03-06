Feature: Admin logout
Background: The System needs to have users and Books
Given these are the users we will but it in the table as a format User(Name,password,user_level,status) noting that user level one is Admin and user level two is a normal user and status indicates whether user is logged in or not
|Ahmad,1234,1,true|
|Ehab,ehab123,1,true|
|Mohamad,abc,2,false|
|Luna,abc123,2,true|
|Tala,abc41,2,false|

Scenario: Logout
When Admin "Ahmad" is already logged in and Admin press logout
Then System will exit 