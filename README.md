**What is Spring ORM**
ORM is Object relational mapping. We have different ORM frameworks like hibernate,ibatis etc which we can integrate in our spring framework. We will be using hibernate
in this project.

**Advantages of using ORM in Spring**
1) Less coding
2) Better Exception Handling
3)Easy to test
4) Integrated Transaction Management.

Initially JDBC used to act as a mediator between our java application and Database. Everytime when we use to fetch the data we had to convert the data into object
manually. But now with the help of ORM we can make the objects of the data which is coming from the database automatically.

We will making use of the hibernate template class to implement all our methods.It contains the following methods.
1)Save
2) Update
3) Insert
4) Get
5) loadAll

**How to work with Spring ORM**
![ORM framework architecture](https://user-images.githubusercontent.com/74822210/194925908-56ecde63-98f0-46c6-9653-00b5fc4c1e25.jpg)

Above image shows you which class will be needing object of which class and below is the explaination.

If you want to work with a particular entity and do crud operations on it the standard method is to make Dao class. For example if there is an entity known as Product
we make it's dao class which is known as data access objects. We need to use hibernateTemplate class to use hibernate. The hibernateTemplate class must need an object of 
SessionFactory interface but since it is an interface we create its object. Hence we will be using its implementation class known as LocalSessionFactoryBean which require three values.

1) Datasource (all the database related info to connect with it)
2) Hibernate properties
3) Annoted Class/Entity (Here it is the product class)



