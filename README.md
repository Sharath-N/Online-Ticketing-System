# Online-Ticketing-System

   The Online Smart Ticketing software is a way to help a passenger to book a ride through the easiest way from his home to his desired destination and at the desired time with a variety in bus types and tickets prices. Also, user can know the estimated time for the trip and the arrival of the bus. In addition, software uses an algorithm to generate unique QR-Codes for each ticket. When the bus arrives to the passenger, the passenger must scan the ticket QR-Code via the bus door QR-Scanner. So, with this the ticket issuance is fully automated and removes the human cost for the same.
In general, actors of the system can be classified into three categories:
1. Users/Passengers/Commuters
2. Driver
3. Customer Service

---

## Requirements
* User Requirements - *A smart system that helps to book tickets using an online application for a variety of transportations like buses or trains to ease the payment method and the booking method for the commuter.*
* System Requirements - *The smart system is an application on the smart phones, the user will book the tickets by first registering on the application then he will choose the transportation type and choose the desired time for the trip, then the systems ask the user to confirm the information the user entered after the process is finished; a barcode will appear for the user, the estimated time for the trip, the bus number and the destination of the trip. The user will use the ticket on a scanner to check the validity of the ticket and then he will enter the bus or train.*


---

### Functional Requirements
#### General
* All users will have to log on to the system before they are provided access to any functionality.
* Users will also be able to change their password at any time.
#### User Requirements
User can be anyone who needs to travel from one place to other.
Every user will be uniquely identified and will be provided an e-Ticket in the form of QR-Code, which is then used to enter the bus allotted for their requirement.
##### End users should be able to :
* Easily book transportation tickets.
* Book tickets at their desired time and their desired location not from specific station.
* View the estimated fee for their ride.
* View the available transportation types and the available seats on it.
* Make payment for the ticket by more than one method: cash or card.
* Book more than one ticket.
* View the estimated time for the trip.
* Either chat or call the Customer Service Executive.
* Make an SOS signal in case of emergency.
#### Driver Requirements
* Driver should be able to monitor the verification of e-Ticket that is done through QR-Scanner.
* Driver should be displayed with proper scheduling of Pick-Up and Drop-Off of the user.
* Driver should be able to handle late Pick-Up.
* Driver should be able to update Drop-Off(based on in-between User requirement) making the booking, price services flexible.
#### Customer Service Requirements
* Service Executives should address the issue of the user all the time.
* Customer Service should handle the Cancellation charge, Insufficient balance, etc issues.
---
### Non – Functional Requirements
#### User Interface Requirements
* Simple and understandable user interface.
* Software should be accessible to the general user through a smartphone.
* Drivers will use a related but different user interface.
* The user interface should be self-explanatory, and a help feature should also be available.
#### Performance Requirements
* Response to queries should not exceed 10 seconds.
* Ticket processing doesn’t take more than 5 seconds.
* The system must support up to 200 concurrent users.
* If the system went down it won’t take more than 2 minutes to be up again.
* Response should be fast.
#### Security
* Payments should be secure and data should be kept anonymous.
* Unauthorized access to the server must be prevented.
* Unsuccessful login attempts must be logged and an alert must be generated.
#### Other Requirements
* User can send feedback.
* Software is expected to run 365*24.
* Super flexible.
