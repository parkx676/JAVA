Part 2 - ArrayList

1) When to expand the size of the internal array and by how much.

I guess I have say we have to expand the size of the internal array everytime we add new element into the array.
Because array has fixed length and you cannot put element without making new space for the element. 
And we have to expand it by one at a time since we are adding one new element.
However, if we expand the size really big at the first time, and we put if statement to check size of internal array with indexes to see if there are no space, then we can expand it by larger than that to minimize inefficient copying array and making new array. 

2) When to decrease the size of the internal array and by how much.

I beleive we probably do not have to decrese the size of the internal array everytime we remove element.
Because ArrayList gets size and its elements by index derived by size variable or size method within the class.
Internal array's actual size actually doesn't matter because everytime we remove element, we are going to decrease size value, and It will not going to return the left over elements in actual internal array because index value directly derived from size variable.


Juhwan Park (3917664)