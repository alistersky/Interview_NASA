# Java Technical Assessment Using NASA NEO Data

## Requirement

The NasaController REST controller has three endpoints defined, they currently lack an implementation. Your task is to provide the missing implementations.

Two Java packages have been provided: _com.example.NasaInterview.Model.Nasa_ provides the NASA Near Earth Object model 
and _com.example.NasaInterview.Service.Nasa_ defines calls using Retrofit2 that can be made to the NASA NEO API

In the _com.example.NasaInterview_ package in addition to the controller there are further helper classes defined:
1. _Asteroid_ which is the main type returned by the _NasaController_ endpoints
2. _ImpactType_ an enum used to determine asteroid threat
3. _Configuration_ containing a Spring Bean that provides a connection to the NASA API

Please feel free to create any further classes, tests or methods that you deem neccesary to complete the exercise.