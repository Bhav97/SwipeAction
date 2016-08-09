# SwipeAction

[![Release](https://jitpack.io/v/Bhav97/SwipeAction.svg)](https://jitpack.io/#Bhav97/SwipeAction)

SwipeAction is an android library that helps you create custom pull down actions.
It is based on the SwipeRefreshLayout.

![gif of SA]
(https://i.imgur.com/VqaKBnp.gif)

Add it to your build.gradle with:
```gradle
allprojects {
		repositories {
			...
			maven { url "https://jitpack.io" }
		}
	}
```
and:

```gradle
dependencies {
        compile 'com.github.Bhav97:SwipeAction:v0.2.0'
}
```
## Usage

Wrap the content you want pull actions on inside the sipeaction tags.


__JAVA:__

```java
SwipeAction swipe;
swipe = (SwipeAction) findViewById(R.id.swipe);

swipe.setIcon(getDrawable(R.id.wut)); //change icons programmatically
swipe.setBackgroundColor(R.color.green_light); // change the background color
swipe.setBackgroundshape(new RectShape()); // The circle had no point
swipe.setWorking(true); // It's the setRefreshing() method from SWL
swipe.setPadding(4/*left*/, 5/*top*/, 6/*right*/, 7/*bottom*/); // Too much padding may kill the icon

if(swipe.isActing()) Log.d(TAG, "Working!"); // returns true if the layout has been pulled down, and is still visible

```

__XML:__

```xml
<bhav.swipeaction.SwipeAction xmlns:android="http://schemas.android.com/apk/res/android"
	xmlns:app="http://schemas.android.com/apk/res-auto"
	android:id="@+id/swipe"
	android:layout_width="match_parent"
	app:src="@drawable/ic_back"
	app:iconPaddingBottom="0dp"
	app:iconPaddingRight="0dp"
	app:iconPaddingTop="0dp"
	app:iconPaddingLeft="0dp"
	android:layout_height="match_parent">
		...
</bhav.swipeaction.SwipeAction>
```
