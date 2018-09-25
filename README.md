# spring-boot-exercise
Spring boot exercise.

Spring-boot application with a REST controller, which expose a Swagger API catalog.
Requirements:
The application needs to expose the following APIs:
  1. List of inventory items list (item, no, name, amount, inventory code)
  2. Read item details (by item no)
  3. Withdrawal quantity of a specific item from stock
  4. Deposit quantity of a specific item to stock
  5. Add item to stock
  6. Delete an item from stock  

Please note that this API was created to demonstrate the ability to learn and implement new technologies, therefore it’s not production ready, to clarify, no exceptions are handled in this project and the logical validity of users input is not tested.

Docker image of the project is available via the following pull command: 
docker pull vbdock/spring-boot-proj:0.0.1-SNAPSHOT
