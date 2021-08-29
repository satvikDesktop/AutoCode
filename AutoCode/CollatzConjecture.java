
public class CollatzConjecture {
public static void main (String[]args) {

int random_Number=(int)Math.floor(Math.random()*(10000-1+1)+1);
System.out.println(" ");
System.out.println("Random Number : " + random_Number);
System.out.println(" ");
int steps=0;
while (true) {
    
if (random_Number%2==0) {
     random_Number = random_Number/2;
     steps++;
}
else if (random_Number%2!=0){
     random_Number = (3*random_Number+1);  
     steps++;
}
 System.out.println(random_Number);

if (random_Number==1)
    break;
}
System.out.println("Loop");
System.out.println(" ");
System.out.println("Stoppage time = "+steps); // no. of steps
System.out.println(" ");

   }   
} 