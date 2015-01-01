RoundedLetterView
=================

[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-RoundedLetterView-brightgreen.svg?style=flat)](https://android-arsenal.com/details/1/1135)

RoundedLetterView like the one in Android 5.0 Contacts app

![RoundedLetterView](/Screenshots/device-2014-11-13-191000.png)

Attributes to choose from:

* `rlv_titleText` - The text in the first row.
* `rlv_titleSize` - The size of the first row text.
* `rlv_titleColor` - The color of the first row text.
* `rlv_backgroundColorValue` - the color between the circle and the stroke.
    
Example
=======
```xml
 <gr.vanderbox.roundedletterview.RoundedLetterView
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:id="@+id/rlv_name_view"
        android:layout_width="56dp"
        android:layout_height="56dp"
        android:layout_marginStart="15dp"
        app:backgroundColorValue="@color/green" (rlv_backgroundColor in v1.1)
        app:titleColor="@android:color/white" (rlv_titleColor in v1.1)
        app:titleSize="35dp" (rlv_titleSize in v1.1)
        app:titleText="A" /> (rlv_titleText in v1.1)
```

What's new
==========

v1.0: Initial Commit

v1.1: Ability to set custom Font on the Text using a Typeface object. **setTypeface(font: Typeface)**

Migrating from 1.0 to 1.1
=========================

If you are using version **1.1** you have to add the prefix `rlv_` before each attribute. 

How To Use
==========

``compile 'com.github.pavlospt:roundedletterview:1.1'``

Credits
=======
Author : Pavlos-Petros Tournaris (p.tournaris@gmail.com)

Google+ : [+Pavlos-Petros Tournaris](https://plus.google.com/u/0/+PavlosPetrosTournaris/)

Facebook : [Pavlos-Petros Tournaris](https://www.facebook.com/pavlospt)

LinkedIn : [Pavlos-Petros Tournaris](https://www.linkedin.com/pub/pavlos-petros-tournaris/44/abb/218)

(In case you use this in your app let me know to make a list of apps that use it! )


License
=======

    Copyright 2014 Pavlos-Petros Tournaris

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
    
       http://www.apache.org/licenses/LICENSE-2.0
    
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
