The overall purpose of this app is to collect event data, create event data, and store event data within a database.
The event data can be manipulated by deleting event data, adding categories for the event creation process, and also adding tags for the events.
This application is inspired by the Meetup app.  

Currently this app allows users to view lists of upcomming events. Create new events, tag events with relevant tags, and filter each event by its category.  
The app uses Springboot for backend development, and also uses Thymeleaf for rendering the front end of the application. 
The data is stored via a MySQL database using an ORM with JPA and Hibernate.

Future Improvements:

To create a Person class.  This will allow users to follow events and keep a calender of their events.

Some fields we would create are:

Id(int): Unique user ID.
firstName(String): Users first name.
lastName(String): Users last name.
email(String): Users email, which can be the users Username
password(String): Users password, securley hashed.

We would need to create a PersonProfile.  This would have a one to one relationship with the Person class.  This would hold the profile data of each user of the application.

Events:
eventsAttending: We would have a Many to Many relationship to the events the user is attending.  This is because many events could have many people, and many people can attend many different events. 

eventsOwned: This is a list of events the user has created.  One user can create many events, so this would be a One to Many relationship. 

