##Homework 2 - Servlet and JDBC Programming

**Due: 10/26/2013**  
**15 points**

Create a Web browser-based application that
calculates the price of a given number of
shares (stock) of up to 4 companies listed on
the Dow Industrial Index. The companies
should be given by their DOW ticker symbols.
You must use the unit stock price values from
the MySQL database called `stocks`, available
on `uml.cs.uga.edu`. The user name and
password are given on uml in the directory
`~kochut/csx050/Stocks.txt`

Your application must have an HTML form
where the user should be able to enter up to 4
companies (by their ticker symbols) and specify
the number of requested shares for each
company. You may use lists, text fields, and
buttons as form elements. The lists of ticker
symbols may facilitate the selection of the
companies. After a form has been submitted by
the user, the application should retrieve the
information about the selected companies from
the stocks database, calculate the total cost
of the shares, and return the response HTML
page with a listing of all information about the
selected companies and the total cost of the
purchase.

In case a user enters no ticker symbols, an
unknown ticker symbol, an illegal number of
shares (different than a positive integer), or if
one of the ticker symbols entered does not
have the corresponding number of shares (or
vice versa), the application should return an
error page with a suitable error message.

It is your responsibility to discover the column
names and create a suitable SQL query to
retrieve the required data. For example, you
may use the `mysql` command to connect to the
`stocks` database and then discover the table
names, as well the defined columns and their
types.

Your application *must* utilize a Java servlet and
an HTML form. The application’s WAR archive
must have a name of the form
*firstname_lastname*_invest.war and it must be
deployed to our JBoss Application Server on
uml by copying the WAR file to the directory
`/opt/jboss/standalone/deployments
/homework2` Remember to set the read
permissions of the WAR file to world-readable.
The easiest way to do this is to use the
`install` Unix command (use the –m 644
option to set the permissions) to deploy the
WAR file and set its permissions at the same
time.

Your application must be accessible at the following URL:  
http://uml.cs.uga.edu:8080/firstname_lastname_invest/stocks.html

(of course, substitute your name in the URL above).

Submit a directory with your complete
application to the user `csx050` on
`nike.cs.uga.edu` Include the Java
sources, the Web application directory
structure, and the final (deployed) WAR archive
file. You must also provide a `README.txt` file
describing how to compile your program and
create the WAR archive, as well as providing
the complete URL to use when invoking your
application. The `submit` command is only
available on `nike`, therefore you will have to
copy the directory with your application from
`uml` to `nike` before submitting it.
