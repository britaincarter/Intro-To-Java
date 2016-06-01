Britain Carter, bic2106

Fail2Ban is a program meant to ban certain ip addresses that have attempted to login
and have failed 3 times. The class will do this by reading in the txt file from 
bin/logs_processed, that contains invalid and accepted on each line with the ip address 
on the same line. The class will first look for "Accepted" and carry on to next line
but if the line contains "Invalid" it will count how many times from that ip address 
it has had a invalid login. Once that ip address has reached 3 invalid logins the class
will read that ip address to a txt file named ban.txt and will tell the user what ips
have been banned. 