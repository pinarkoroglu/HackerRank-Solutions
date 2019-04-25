returned = str(input()).split(" ")
day_returned = int(returned[0])
month_returned = int(returned[1])
year_returned = int(returned[2])

expected = str(input()).split(" ")
day_expected = int(expected[0])
month_expected = int(expected[1])
year_expected = int(expected[2])    

year_late=year_returned-year_expected;
month_late=month_returned-month_expected;
day_late=day_returned-day_expected;

if(year_late>0): 
    print(10000)
else:
    if(year_late==0):
        if(month_late>0):
            print(500*month_late)          
        elif(month_late==0 or day_late>0): 
            print(15*day_late)
        else:
            print(0)
    else: 
         print(0)
         

