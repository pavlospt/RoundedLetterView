RoundedLetterView
=================

RoundedLetterView like the one in Android 5.0 Contacts app

![RoundedLetterView](/Screenshots/device-2014-11-13-191000.png)

Attributes to choose from:

* `titleText` - The text in the first row.
* `titleSize` - The size of the first row text.
* `titleColor` - The color of the first row text.
* `backgroundColorValue` - the color between the circle and the stroke.
    
Example
=======
```xml
 <gr.vanderbox.roundedletterview.RoundedLetterView
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:id="@+id/rlv_name_view"
        android:layout_width="56dp"
        android:layout_height="56dp"
        android:layout_marginStart="15dp"
        app:backgroundColorValue="@color/green"
        app:titleColor="@android:color/white"
        app:titleSize="35dp"
        app:titleText="A" />
```

How To Use
==========

Will upload to Maven soon!


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
