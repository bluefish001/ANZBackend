DROP TABLE IF EXISTS Account;

CREATE TABLE Account (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  Account_Number BIGINT NOT NULL,
  Account_Name VARCHAR(250) NOT NULL,
  Account_Type VARCHAR(250) DEFAULT NULL,
  Balance_Date DATE NOT NULL,
  Currency VARCHAR(5) DEFAULT NULL,
  Balance DECIMAL(20,2) DEFAULT NULL
);

INSERT INTO Account (Account_Number, Account_Name, Account_Type,Balance_Date,Currency,Balance) VALUES
(585309209, 'SGSavings726', 'Savings','20181108','SGD',8423.12),
(685309209, 'AUSavings725', 'Savings','20191109','AUD',1283123.12),
(125309209, 'AUCurrent123', 'Current','20171205','AUD',23423.23);


DROP TABLE IF EXISTS account_transaction;

CREATE TABLE account_transaction (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  Account_Number BIGINT NOT NULL,
  Account_Name VARCHAR(250) NOT NULL,
  value_date DATE NOT NULL,
  Currency VARCHAR(5) DEFAULT NULL,
  Credit_Amount DECIMAL(20,2) DEFAULT NULL,
  Debit_Amount DECIMAL(20,2) DEFAULT NULL,
  type VARCHAR(20) DEFAULT NULL,
  transaction_narrative VARCHAR(250) DEFAULT NULL
);

INSERT INTO account_transaction (Account_Number, Account_Name, type,value_date,Currency,Credit_Amount) VALUES
(585309209, 'SGSavings726', 'Credit','20181108','SGD',8423.12),
(585309209, 'SGSavings726', 'Credit','20181108','SGD',23423.12),
(585309209, 'SGSavings726', 'Credit','20181108','SGD',234.12),
(685309209, 'AUSavings725', 'Credit','20191109','AUD',1283123.12),
(125309209, 'AUCurrent123', 'Credit','20171205','AUD',23423.23);