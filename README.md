# Microservice Example Architecture


# Query service 
This service manages the certificates queries.


# Logs service 
This service stores the query client info, such as:

- verificationId: String --> queried code 
- host: String --> host ip
- userAgent: String --> agent (browser)
- isValid: Boolean --> tells if is certified is verified correctly

Then it exposes two endpoints:

getAll queries from a certificate
getAll failed queries 
