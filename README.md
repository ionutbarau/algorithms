# algorithms
Algorithms in java examples

https://www.geeksforgeeks.org/searching-algorithms/

Time complexity :
https://www.geeksforgeeks.org/analysis-of-algorithms-set-4-analysis-of-loops/
https://en.wikipedia.org/wiki/Time_complexity
https://discrete.gr/complexity/

Terms
Complexity analysis is a tool that allows us to explain how an algorithm behaves as it's input grows larger.
In order to determine the complexity of an algorithm we need to calculate the number of instructions as a function of n,
where n is the number of times it executes (f(n)= 6 + 2n) in the worst cases (Worst-case analysis).
Asymptomatic behavior is the process of taking the function that resulted from counting the number of
instructions through a filter, ignoring the processing power of the CPU, programming language details, etc.
Besides this kind of details, we have to remove the constant part of the function and
keep the one that grow the fastest (if we have multiple n). (E.g f(n)=6n+2 becomes f(n)=n)
Mathematically speaking, what we're saying here is that we're interested in the limit of function f as n tends to infinity.


f( n ) = n + 12 -> f(n) = n
f( n ) = 3 pow(n) + 2n -> f(n) = 3 pow(n) (3 pow n is bigger that 2n)
f( n ) = 100 -> f(n) = 1


Generally for small programs we can conclude :

If we have a program without any loops then the asymptomatic behavior will be f(n) = 1,
because the number of instructions will always be constant(we need to add 1 if there is no n; we cannot put 0 because
the function should return non zero value).
If we have 1 loop(no recursion) then the asymptomatic behavior will always be f(n)=n.
For each loop that we add inside another loop there will f(n)=n pow(number of loops)
If we have multiple sequential for loops, the slowest of them dominates the asymptomatic behaviour.

Time complexity uses Big O notation.
Time complexity (algorithm complexity) for f(n)=3n + 12 -> f(n)=n is the asymptomatic behavior noted as O(n).
Rule of thumb: Programs with bigger O run slower than programs with smaller O
--------------------------------------
O(1) is constant time algorithm      |
O(n) is linear algorithm             |
O(n pow(2)) is quadratic algorithm   |
O(log(n)) is logarithmic algorithm   |
--------------------------------------

In order to calculate complex algorithms we have to make them worse in order arrive at one of the general rules mentioned above.

