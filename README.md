CurrencyConverter
=================

Convert USD to INR, GBP, EURO. Project made while learning Android. 
The app converts entered US Dollar amounts to Indian Rupee, Great Britain Pounds, Euro in realtime. No "Convert" button is used.
I used direct calculation rather than live prices because assignment had strict guidelines not to include any permissions.

The two major issues were caused by realtime conversion. First, if the user deletes everything with backspace the program tries to convert null value to currencies, force closing the app.
Second, if a person inputs a wrong number format, for eg: "1..2" instead of "1.2". This also force closed the app. This was solved by two steps.
First by checking if the input is "" and setting the value of USD to 0 and second by try-catch block of NumberFormatException.

The app was rated 10/10
