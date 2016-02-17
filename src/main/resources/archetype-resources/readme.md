# Dolphin Platform Spring Boot Sample

![Dolphin Platform Logo](http://www.guigarage.com/wordpress/wp-content/uploads/2015/10/logo.png)

This automatically created project can be used as a basic skeleton for a Spring Boot based Dolphin Platform application.
The Maven projects contains 3 modules: 

* The __common__ module that contains the model taht is shared between client and server
* The __server__ module that contains the [KumuluzEE](https://ee.kumuluz.com) based Application that provides a first Dolphin Platform controller 
* The __client__ module a JavaFX application that creates a view that is bound to the Dolphin Platform controller in the server module


## How to use it
The project is created as a Maven project. You can directly import it in any IDE that supports Maven (like Eclipse, Netbeans or IntelliJ).
If you want to start the application you need to start the __ServerApplication__ class in the server module and than the __ClientApplication__ class in the client module. The client can be started several times.

If you want to start the application from commandline without IDE support you need to call a Maven install first in the main project folder:

```
mvn install
```

Once this is done you can simply install the server from the server folder
```
cd server
mvn exec:java
```

A JavaFX client instance can be started by Maven, too:
```
cd client
mvn exec:java
```

In addition the Jumpstart contains a web client that is based on Polymer. To run the web client you need to start a local web server in the __polymer-client__ folder.
On Mac OS you can simply start a local Phyton server by calling the following command:
```
cd polymer-client
python -m SimpleHTTPServer
```
Once this is done you can open __localhost:8000__ in your browser.
The Polymer client is build by using [Bower](http://bower.io) but you don't need to have Bower installed or call any build script. All dependencies are allready part of the jumpstart. 