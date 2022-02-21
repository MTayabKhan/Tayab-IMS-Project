Coverage: 77.7%
# Project Title

One Paragraph of project description goes here

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

What things you need to install the software and how to install them

 Java (1.8 or Higher)
 Maven (3.8.4 or Higher)

### Installing

A step by step series of examples that tell you how to get a development env running

JAVA

Watch this video to install Java JDK on your lovely PC
https://www.youtube.com/watch?v=DTZAz9rj0kU

MAVEN

This video is helpful to install Maven
https://www.youtube.com/watch?v=RfCWg5ay5B0

ECLIPSE
To work with all of this you must install eclipse
https://www.youtube.com/watch?v=N-wXTRpR03U


After installing this go follow these steps.
(Window -> Preferences -> Java -> Installed JRE) Make sure your local JDK is selected not the one that comes with eclipse
End with an example of getting some data out of the system or using it for a little demo
(Project -> Properties -> Java Compiler) Make sure the Java Compliance box is ticked otherwise all your tests fail.

## Running the tests

### Unit Tests 

Unit tests make sure your normal classes function when you use getID etc.

public class OrdersTest {
	@Test
	public void testEquals() {
		EqualsVerifier.simple().forClass(Orders.class).verify();
	}

}


### Integration Tests 
Integration tests make sure that your data is used effectively in your Java system. We also use @test and test every method individually

	@Test
	public void testCreate() {
		final Orders created = new Orders(2L, 7L, 3L);
		assertEquals(created, DAO.create(created));
	}

### And coding style tests

This finally makes sure that the code shows the right stuff when you push it in.
	@Test
	public void testCreate() {
		final Long CustomerID = 2L, Order_ItemsID = 4L;
		final Orders created = new Orders(CustomerID, Order_ItemsID);

		Mockito.when(utils.getLong()).thenReturn(CustomerID, Order_ItemsID);
		Mockito.when(dao.create(created)).thenReturn(created);

		assertEquals(created, controller.create());

		Mockito.verify(utils, Mockito.times(2)).getLong();
		Mockito.verify(dao, Mockito.times(1)).create(created);
	}


## Deployment

Add additional notes about how to deploy this on a live system

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management

## Versioning

We use [SemVer](http://semver.org/) for versioning.

## Authors
* **Tayab Khan** = *Rest of the project* - [TayabKhan](https://github.com/TayabKhan420)
* **Chris Perrins** - *Initial work* - [christophperrins](https://github.com/christophperrins)

## License

This project is licensed under the MIT license - see the [LICENSE.md](LICENSE.md) file for details 

*For help in [Choosing a license](https://choosealicense.com/)*

## Acknowledgments
* Euan Black
* Adil
* Jamie Orr
* Hassan Mahmood
* Farzan Chowdhury
* Hat tip to anyone whose code was used
* Inspiration
* etc
