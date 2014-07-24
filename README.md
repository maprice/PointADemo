<a href="http://maprice.github.io/PointA/">
![logo](https://raw.github.com/maprice/PointA/gh-pages/images/pointA_logo.png)
</a>


##Overview

The PointA demo app is a simple android application that utilizes the basic functionalities of the services through the PointA library. The goal is to allow developers to test the functionalities of the services through PointA to ensure that the services have been setup and operate properly through PointA. This isolates issues with the app and the PointA Library and therefore improves the testability of the PointA Library  


##Features

* Listview of all services and service providers
* Basic functionalities of each service such as showAd, post tweets, logEvent for Analytic, Users can tap a button on the phone to invoke these services


##Architecture and Design of the PointA Project

====INSERT component architecture image here ======

From a high level perspective, the PointA project consists of three main components: the PointA library, the PointA Eclipse Plugin and the PointA Android App. As shown in the component diagram, the most crucial component of the project is the PointA library, and its main purpose is to abstract away all the details of these service providers and provide one simple and user-friendly interface for users use these service providers.

The PointA Android app is a simple android application that utilizes the services that the PointA library provides (e.g. ads, crash reporting, analytics, etc.). It consists of a listview of all the services and the basic functionalities of each service such as “showAd” for ads or logEvent for analytics. In order for our PointA library to know what services need to be supported and what providers are needed. We need a way for the users to inform the PointA library of the data specific to each application’s configuration. We accomplish this through the Eclipse plugin and a config.xml file, which minimizes the dependencies between the PointA Library and the Eclipse Plugin.

The Eclipse plugin is an Eclipse extensible application that allows users to input configuration data through a GUI, which the plugin will then write it to an xml file. It also takes care of other dependencies such as downloading jars, setting up build path and modify/generate the appropriate xml files. Therefore the plugin updates the PointA library as shown in the component diagram through user inputs.
