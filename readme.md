# Java Technical Assessment Using NASA NEO Data

## Requirement

The NasaController REST controller class has three endpoints defined, they currently lack an implementation. Your task is to provide the missing implementations marked with TODO.

All data needed to create an Asteroid is available from the NASA NEO API NearEarthObject.

Two Java packages and a Spring Bean have been provided that should make getting data from the NASA API easy: 
1. _com.example.NasaInterview.Model.Nasa_ providing the NASA Near Earth Object model 

2. _com.example.NasaInterview.Service.Nasa_ defines calls using Retrofit2 that can be made to the NASA NEO API
3. The _com.example.NasaInterview.Configuration_ class contains a Spring Bean that provides a connection to the NASA API

In the _com.example.NasaInterview_ package in addition to the controller there are further classes defined:
1. _Asteroid_ which is the main type returned by the _NasaController_ endpoints
2. _AsteroidMapper_ which turns a NASA NEO into our apps _Asteroid_ model class
3. _ImpactType_ an enum used to determine asteroid threat
4. _NasaNearEarthObject_ a type that encapsulates the logic our controller requires from the NASA API
5. _NearEarthObject_ an interface that abstracts the NEO type so we could implement with data from another organization 

There are a few JUnit tests that fail, they should pass by the end of the exercise. 

Please replace the TODO placeholders with method implementations that you deem necessary to complete the exercise.

#### NOTE

For the sake of simplicity on the NearEarthObject class treat the CloseApproachDatum
List "closeApproachData" as if it only ever contains 1 element.

Where a NASA api_key is required please use the value "DEMO_KEY", this is throttled but fine for our purposes

#### LINKS

https://api.nasa.gov/index.html
