def is_leap(year):
    if year%4==0:
        if year%100!=0:
            if year%400==0:
               return True
    else:
               return False      
year=2000          
print(is_leap(year))   
  #FIXME:
       

   