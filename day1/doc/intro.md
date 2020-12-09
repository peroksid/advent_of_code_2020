# Introduction to day1

## description

Return the production of 2 numbers which sum up to 2020 together (input - separate numbers on lines).

## idea

I want to create a set to hold difference between 2020 and a number. I want to iterate once through numbers and fill that set.

Then I iterate through the input second time and I check if the number in hand is present in the set.

When found, it means there was a number which sums up with the current one to 2020.

Then just return the production of the current and the difference between 2020 and the current.

I spend space on the set but overall complexity will be O(n) because conj on set is O(1) and contains on set is O(1).

## testing

I want to:
 - just 2 numbers which are answer
 - 5 numbers with answers on boundaries
 - 5 numbers with one answer on a boundary (2 tests)
 - 5 numbers with answers not on boundaries
 - empty list
 - non-empty list without an answer
 - really long list with answers
