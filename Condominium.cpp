//   AtCoder Beginner Contest 203（Sponsored by Panasonic）//
//  Problem B //
/*
Problem Statement
A condominium AtCoder has N floors, called the 1-st floor through the N-th floor. Each floor has K rooms, called the 1-st room through the K-th room.
Here, both N and K are one-digit integers, and the j-th room on the i-th floor has the room number i0j. 
For example, the 2-nd room on the 1-st floor has the room number 102.
Takahashi, the manager, got interested in the sum of the room numbers of all rooms in the condominium, where each room number is seen as a three-digit integer. Find this sum.
Constraints
1≤N,
K≤9
N and K are integers.
Input
Input is given from Standard Input in the following format:
N K
Output
Print the answer.
*/

#include <iostream>
using namespace std;
// ACCEPTED SOLUTION
int main() {
  int n,k;
  cin>>n>>k;
 int i=1,sum=0,j=1,nom;
   while (j<=n) {

       nom=100*j;
       int i=1;
       while (i<=k ) {
       sum+= nom+i;
       i++;
     }
       j++;
  }
   cout<<sum;
}
''
/*
                1st         2nd            3rd
3 3 => 303  = (101+102+103)+(201+202+203)+(301+302+303)=? => 1818
*/
