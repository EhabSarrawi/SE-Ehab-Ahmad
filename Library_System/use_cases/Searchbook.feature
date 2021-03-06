Feature: Search book
Background: The System needs to have users and Books
Given these are the users we will but it in the table as a format User(Name,password,user_level,status) noting that user level_1 is Admin and user level_2 is a normal user and status indicates whether user is logged in or not
|Ahmad,1234,1,false|
|Ehab,ehab123,1,true|
|Mohamad,abc,2,false|
|Luna,abc123,2,true|
|Tala,abc41,2,false|
Given these are books and we will but it in the table as format Book(Title,author,signature,isbn,borrowed)
|Mike Nichols: A Life,Mark Harris,Harris2021,0399562249,true|
|Humans,Brandon Stanton,Stanton2020,1250114292,true|
|The Committed,Viet Thanh Nguyen,Nguyen2021,0802157068,false|
|The Silent Patient,Alex Michaelides,Michaelides2019,1250301696,false|
|The Secret History,Donna Tartt,Tartt1992,1400031702,false|

Scenario: Search for a title
When User or Admin want to search for a book by a subtitle like "Mike"
Then The book should be appeared

Scenario: Search for an author 
When User or Admin want to search for a book by a subauthor like "Mark"
Then The book should be appeared

Scenario: Search for an ISBN 
When User or Admin want to search for a book by a subISBN like "0399562"
Then The book should be appeared

Scenario: Search for a book when logged in 
When Admin with username "Ahmad" and password "1234" wants to search for a book like "Humans"
Then The book should be appeared

Scenario: Search for a book and no books match the substring
When User or Admin want to search for a book by substring like "Data"
Then Warning massege will appeared

Scenario: Search for more than one book
When User or Admin want to search for more than one book like "Mike" and "The Secret" 
Then The books should be appeared  