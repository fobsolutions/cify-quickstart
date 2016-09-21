Cify Quickstart
===============

This is a quickstart project of a Cify Framework.

Cify Framework is a open source test automation framework for acceptance testing and behaviour driven development (BDD). It has easy parallel execution for different devices, device management and integration with cucumber. With this framework it is really easy to integrate your test set with test farms or even your own selenium grid.

The core framework is implemented using Groovy and Gradle. The framework has dependencies to Appium and Selenium. This gives opportunity to use everything what those dependencies already have.

Cify Framework project is hosted on GitHub where you can find source code, an issue tracker, and some further documentation. If you want to contribute then let us know!

Cify Framework is developed by [FOB Solutions](http://www.fob-solutions.com/) 

----------


Precondition
------------

 - Google Chrome

Installation
-------------
Clone quickstart project

> 
>git clone https://github.com/fobsolutions/cify-quickstart/
>

----------

Usage
-------------

#### Run

> 
>./gradlew cucumber -Penv=quickstart
>

#### Overview

Main files to look at:
 - capabilities.json
 - quickstart.properties

----------


Learn more from [cify-runner](https://github.com/fobsolutions/cify-runner)  and [cify-framework](https://github.com/fobsolutions/cify-framework)  projects

Cify is developed under Apache 2.0 licence by FOB Solutions