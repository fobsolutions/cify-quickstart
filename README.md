Cify Quickstart
===============

This is a quickstart project of a Cify Framework.

Cify Framework is a open source test automation framework for acceptance testing and behaviour driven development (BDD). It has easy parallel execution for different devices, device management and integration with cucumber. With this framework it is really easy to integrate your test set with test farms or even your own selenium grid.

The core framework is implemented using Groovy and Gradle. The framework has dependencies to Appium and Selenium. This gives opportunity to use everything what those dependencies already have.

Cify Framework project is hosted on GitHub where you can find source code, an issue tracker, and some further documentation. If you want to contribute then let us know!

Cify Framework is developed by [FOB Solutions](http://www.fob-solutions.com/) 

[YouTube video tutorial for Cify Quickstart with browsers only](https://youtu.be/YN0_b6bki3Y)

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

### Add remote capability to properties and/or configuration

- configuration.json

Add the device farm URL into **remote** capability to **configuration.json** file like following:

```
{
  "videoRecord": true,
  "videoDir": "build/cify/videos/",
  "capabilities": {
    "android": {
      "capability": "android",
      "UIType": "Android",
      "deviceName": "Android Device",
      "fullReset": "true",
      "remote": "http://192.168.99.100:4444/wd/hub"
    },
    "browser": {
      "UIType": "Web",
      "capability": "chrome",
      "remote": "http://192.168.99.100:4444/wd/hub"
    },
    "ios": {
      "capability": "iphone",
      "UIType": "IOS",
      "deviceName": "iOS Device",
      "fullReset": "true",
      "autoAcceptAlerts": "true",
      "remote": "http://192.168.99.100:4444/wd/hub"
    }
  }
}

```

- properties

Also when using runner to trigger tests user can add device farm URL into properties file as following:

**quickstart.properties** file as an example

```
gluePackages=io.cify.quickstart.steps
capabilitiesFilePath=capabilities.json
farmUrl=http://192.168.99.100:4444/wd/hub
```


Learn more from [cify-runner](https://github.com/fobsolutions/cify-runner)  and [cify-framework](https://github.com/fobsolutions/cify-framework)  projects

Cify is developed under Apache 2.0 licence by FOB Solutions


[![Analytics](https://ga-beacon.appspot.com/UA-109814182-1/cify-pages)](https://github.com/fobsolutions/cify-pages)
