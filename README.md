# SwipeAction

[![Release](https://jitpack.io/v/Bhav97/SwipeAction.svg)](https://jitpack.io/#Bhav97/SwipeAction)

SwipeAction is an android library that helps you create custom pull down actions.
It is based on the SwipeRefreshLayout.

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
        compile 'com.github.Bhav97:SwipeAction:v0.1.1-alpha'
}
```
## Usage

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
