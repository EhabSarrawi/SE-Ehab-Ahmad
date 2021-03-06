Feature: Admin-login
Background: The System needs to have users and Books
Given these are the users we will but it in the table as a format User(Name,password,user_level,status) noting that user level 1 is Admin and user level 2 is a normal user and status indicates whether user is logged in or not
|Ahmad,1234,1,false|
|Ehab,ehab123,1,true|
|Mohamad,abc,2,false|
|Luna,abc123,2,true|
|Tala,abc41,2,false|


Scenario: successful login
When Admin enters "Ahmad" as a user name and enters "1234" as password
Then Admin will login


Scenario: Wrong password
When Admin enters "Ahmad" as a user name and enters "1235" as password
Then Error messege should be appeared 