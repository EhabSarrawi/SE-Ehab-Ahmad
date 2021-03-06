Feature: Add book 
Background: The System needs to have users and Books
Given these are the users we will but it in the table as a format User(Name,password,user_level,status) noting that user level 1 is Admin and user level 2 is a  user and status indicates whether user is logged in or not
|Ahmad,1234,1,false|
|Ehab,ehab123,1,true|
|Mohamad,abc,2,false|
|Luna,abc123,2,true|
|Tala,abc41,2,false|
Given these are book and we will but it in the table as format Book(Title,author,signature,isbn,borrowed)
|Mike Nichols: A Life,Mark Harris,Harris2021,0399562249,true|
|Humans,Brandon Stanton,Stanton2020,1250114292,true|
|The Committed,Viet Thanh Nguyen,Nguyen2021,0802157068,false|
|The Silent Patient,Alex Michaelides,Michaelides2019,1250301696,false|
|The Secret History,Donna Tartt,Tartt1992,1400031702,false|

Scenario: Add a book when admin is logged in
When Admin with username "Ehab" is already logged in add a book with title "We Begin at the End" and author "Chris Whitaker" and signature "Whirtaker2021" and isbn "1250759668" and borrowed "false"
Then Book will be added

Scenario: Add a book when admin is not logged in
When Admin with username "Ahmad" is not logged in and try to add book
Then Book should be not added
 
