## Environment ##
 
 * Java 8
 * Maven
 * Springboot 2.19
 * H2

## Instruction ##

 * This is project uses H2 in memory db to store the demo data. It will auto insert the data when run the project.
 * The H2 db config is in the file resource/application.properties
 * Demo table and date is in the file resource/data.sql


## How to run ##

 * Go to ~/backend and run "mvn spring-boot:run"
 * Use the Url http://localhost:8080/api/accounts to retrieve all the accounts info
 * Use the Url http://localhost:8080/api/transaction/{accountNumber} (Eg.http://localhost:8080/api/transaction/585309209) to retrieve the transactions.
 * Please note the account and transaction info are in the resource/data.sql. They would be load to h2 db when start up     

