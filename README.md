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

### Without device farm

#### Run

> 
>./gradlew cucumber -Penv=quickstart
>

#### Overview

Main files to look at:
 - capabilities.json
 - quickstart.properties

----------

### With device farm

#### Clone device farm with gradle task

On Mac OS X

    ./gradlew cloneDeviceFarm
   
On Windows

    gradlew cloneDeviceFarm

#### Install farm dependencies

OS X on terminal execute following commands (you have to be on the root folder of the CPTA project)

Before running install command make sure that you have **XCode** installed!

    $ cd devicefarm
    $ ./device-farm.sh install
   
On Windows machines users have to install following dependencies manually

- [DOCKER TOOLBOX](https://www.docker.com/products/docker-toolbox)
- [VIRTUAL BOX EXTENSION BACK](http://download.virtualbox.org/virtualbox/5.1.8/Oracle_VM_VirtualBox_Extension_Pack-5.1.8-111374.vbox-extpack)

### Start device farm

OS X on terminal execute following commands (you need to be on the devicefarm folder)

NB! Unplug connected devices before executing start command and plug devices in when prompted so.

     ./device-farm.sh start
   
On Windows

    device-farm.sh start

### Verify that farm is started

At the end of starting process device farm prints to console couple of URL's.

    Example:
    http://192.168.99.100:4444/grid/console

Copy and paste the console URL into browser and make sure that all the needed Nodes are visible. (Nodes can take couple of seconds to become visible)

### Add remote capability to properties and/or configuration

- configuration.json

Add the device farm URL (from terminal windows after start command) into **remote** capability to **configuration.json** file like following:

```
{
  "videoRecord": true,
  "videoDir": "build/cify/videos/",
  "capabilities": {
    "android": {
      "capability": "android",
      "UIType": "MobileAndroidApp",
      "deviceName": "Android Device",
      "fullReset": "true",
      "remote": "http://192.168.99.100:4444/wd/hub"
    },
    "browser": {
      "UIType": "DesktopWeb",
      "capability": "chrome",
      "remote": "http://192.168.99.100:4444/wd/hub"
    },
    "ios": {
      "capability": "iphone",
      "UIType": "MobileIOSApp",
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