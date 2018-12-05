# Lab 06: Inheritance and Interfaces

## Overview
In this lab I made a Restaurant class and Review class. The idea is that one could create a restaurant, and add information like the restaurant name, a price rating, a review rating, and a list of all the reviews.  This could be a blueprint for a restaurant review website or database. 
  

### Restaurant Class
The Restaurant has a name, price rating, average review rating, and a list of Reviews.  It also contains methods: addReview() which adds a review to the list, and updateStars() which is a helper function to update the average star rating when a new review is added.  The toString() method is overriden to a better format.

### Review Class
The Review class has a String body, to contain the body of the review, a String for the author's name, and an int to represent the amount of stars they gave the restaurant.  The toString() in the Review class has also been overriden for format.

### Testing
I used JUnit testing on the Review class, in order to test the overriden toString() method.  The Restaurant class has testing for toString(), addReview(), and updateStars();

# Lab 07: Inheritance and Interfaces

## Overview
In this lab I added Theater and Shop classes which also utilize the Review class.  The Review class now has several constructors which will be overridden depending on what arguments are given.  Also, the Review class was modified so it now accepts what movie someone saw at a certain Theater, so it will be associated with the review. 
  

### Shop Class
The Shop class is similar to Restaurant.  It has fields for name, description, price, and has a list of Reviews.

### Theater Class
The Theater class follows the same blueprint as the others, but has a few things that are unique.  First, it has a list of movies that are playing at each theater.

### Testing
Again I used JUnit tests, and added testing to the constructors. 