<h1 align="center"> List Grid Switch View </h1>

<p align="center"> <a href="https://www.android.com"><img src="https://img.shields.io/badge/platform-Android-yellow.svg" alt="platform"></a>
 <a href="https://android-arsenal.com/api?level=21"><img src="https://img.shields.io/badge/API-24%2B-brightgreen.svg?style=flat" alt="API"></a> <a href="https://jitpack.io/#CuteLibs/ListGridSwitchView/"><img src="https://jitpack.io/v/CuteLibs/ListGridSwitchView.svg" alt="JitPack"></a> <a href="https://github.com/CuteLibs/ListGridSwitchView/blob/master/LICENSE"><img src="https://img.shields.io/github/license/CuteLibs/ListGridSwitchView" alt="GitHub license"></a> </p>

<h3 align="center">A lightweight List-Grid Switch View<b></b></h3>

 <p align="center"> <a href="https://github.com/CuteLibs/ListGridSwitchView/issues"><img src="https://img.shields.io/github/issues/CuteLibs/ListGridSwitchView" alt="GitHub issues"></a> <a href="https://github.com/CuteLibs/ListGridSwitchView/network"><img src="https://img.shields.io/github/forks/CuteLibs/ListGridSwitchView" alt="GitHub forks"></a> <a href="https://github.com/CuteLibs/ListGridSwitchView/stargazers"><img src="https://img.shields.io/github/stars/CuteLibs/ListGridSwitchView" alt="GitHub stars"></a> <a href="https://github.com/CuteLibs/ListGridSwitchView/graphs/contributors"> <img src="https://img.shields.io/github/contributors/CuteLibs/ListGridSwitchView" alt="GitHub contributors"></a>   </p>

## Table of Contents
- [Purpose](#purpose)
- [Features](#features)
- [Demo](#demo)
- [Prerequisites](#prerequisites)
- [Dependency](#dependency)
- [Usage](#usage)
  - [XML](#xml)
  - [Kotlin](#kotlin)
  - [Java](#java)
- [Customization](#customization)
  - [XML](#xml-1)
  - [Kotlin](#kotlin-1)
  - [Java](#java-1)
- [Attributes and Methods](#attributes-and-methods)
- [Notes](#notes)
- [Contribute](#contribute)
- [License](#license)

## Purpose
This library provides a lightweight List-Grid Switch View that can be used to switch between list and grid modes. In Android projects, we often need to display a list of items in both list and grid modes. It's easy to create a custom view for this purpose but it's even easier to use this library. The switch view is highly customizable and can be used in both Kotlin and Java projects.

## Features
- Lightweight
- Highly customizable
- Supports both Kotlin and Java
- Can be used in other cases as well (not just for switching between list and grid modes). Any two icons can be used to switch between two modes.

## Demo
<img src="https://github.com/CuteLibs/ListGridSwitchView/blob/master/files/listgridswitch.gif?raw=true" width="300px"/>



## Prerequisites

If you're using old gradle versions, add this in your root `build.gradle` file (**not** your module `build.gradle` file):
``` groovy
allprojects {
    repositories {
        ...
        maven { url "https://jitpack.io" }
    }
}
```

If you're using new gradle versions, add this in your root `settings.gradle` file (**not** your module `build.gradle` file):
``` groovy
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        ...
        maven { url "https://jitpack.io" }
    }
}
```

## Dependency
Add this to your module's `build.gradle` file (latest version <a href="https://jitpack.io/#CuteLibs/ListGridSwitchView"><img src="https://jitpack.io/v/CuteLibs/ListGridSwitchView.svg" alt="JitPack"></a>):
``` groovy
dependencies {
    ...
    implementation 'com.github.CuteLibs:ListGridSwitchView:0.1.0'
}
```

or `build.gradle.kts` if you're using Kotlin DSL:
``` kotlin
dependencies {
    ...
    implementation("com.github.CuteLibs:ListGridSwitchView:0.1.0")
}
```


## Usage

### XML
```xml
<io.github.cutelibs.listgridswitchview.CustomListGridSwitchView
    android:id="@+id/customListGridSwitchView"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content" />
```

### Kotlin
```kotlin
val switchView = binding.customListGridSwitchView
switchView.setListener { mode ->
    when (mode) {
        CustomListGridSwitchView.SwitchMode.LIST -> {
            // Handle list mode
        }

        CustomListGridSwitchView.SwitchMode.GRID -> {
            // Handle grid mode
        }
    }
}
switchView.shouldRememberState(true)
```

### Java
``` java
CustomListGridSwitchView switchView = binding.customListGridSwitchView;
switchView.setListener(new Function1<CustomListGridSwitchView.SwitchMode, Unit>() {
    @Override
    public Unit invoke(CustomListGridSwitchView.SwitchMode mode) {
        switch (mode) {
            case LIST:
                // Handle list mode
                break;
            case GRID:
                // Handle grid mode
                break;
        }
        return null;
    }
});
switchView.shouldRememberState(true);
```


## Customization
### XML
``` xml
<io.github.cutelibs.listgridswitchview.CustomListGridSwitchView
    android:id="@+id/customListGridSwitchView"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    app:setMode="list" <!-- Sets the initial mode -->
    app:iconColor="@color/colorAccent" <!-- Color filter for the list and grid icons -->
    app:listIcon="@drawable/ic_list_custom_switch_view" <!-- Custom drawable for the list icon -->
    app:gridIcon="@drawable/ic_grid_custom_switchview" <!-- Custom drawable for the grid icon -->
    />
```

### Kotlin
``` kotlin
val switchView = binding.customListGridSwitchView

// returns the current mode
val currentMode = switchView.getCurrentMode()


// set custom list icon
switchView.setListIcon(ContextCompat.getDrawable(context, R.drawable.my_custom_list_icon))

// Set custom grid icon
switchView.setGridIcon(ContextCompat.getDrawable(context, R.drawable.my_custom_grid_icon))

// Set mode programmatically
switchView.setMode(CustomListGridSwitchView.SwitchMode.GRID)


// Set listener to observe mode changes
switchView.setListener { mode ->
    when (mode) {
        CustomListGridSwitchView.SwitchMode.LIST -> {
            // Handle list mode
        }

        CustomListGridSwitchView.SwitchMode.GRID -> {
            // Handle grid mode
        }
    }
}


// Tell the switch view to remember its state across app launches
switchView.shouldRememberState(true)

// Clear the saved state (use this when you want to reset the switch view's memory)
// switchView.clearState()
```

### Java
``` java
CustomListGridSwitchView switchView = binding.customListGridSwitchView;

// Returns the current mode
CustomListGridSwitchView.SwitchMode currentMode = switchView.getCurrentMode();

// Set custom list icon
switchView.setListIcon(ContextCompat.getDrawable(this, R.drawable.my_custom_list_icon));

// Set custom grid icon
switchView.setGridIcon(ContextCompat.getDrawable(this, R.drawable.my_custom_grid_icon));

// Set mode programmatically
switchView.setMode(CustomListGridSwitchView.SwitchMode.GRID);

// Set listener to observe mode changes
switchView.setListener(new Function1<CustomListGridSwitchView.SwitchMode, Unit>() {
    @Override
    public Unit invoke(CustomListGridSwitchView.SwitchMode mode) {
        switch (mode) {
            case LIST:
                // Handle list mode
                break;
            case GRID:
                // Handle grid mode
                break;
        }
        return null;
    }
});

// Tell the switch view to remember its state across app launches
switchView.shouldRememberState(true);

// Clear the saved state (use this when you want to reset the switch view's memory)
// switchView.clearState();
```

## Attributes and Methods


### XML
| Attribute | Description |
| --- | --- |
| `app:setMode` | Sets the initial mode. |
| `app:iconColor` | Color filter for the list and grid icons. |
| `app:listIcon` | Custom drawable for the list icon. |
| `app:gridIcon` | Custom drawable for the grid icon. |

### Enums
``` kotlin
enum class SwitchMode {
    LIST, GRID
}
```
| Enum | Description |
| --- | --- |
| `LIST` | List mode. |
| `GRID` | Grid mode. |


### Kotlin
| Method | Description |
| --- | --- |
| `setMode(mode: SwitchMode)` | Sets the initial mode. |
| `getCurrentMode()` | Returns the current mode. |
| `setListIcon(drawable: Drawable?)` | Sets a custom drawable for the list icon. |
| `setGridIcon(drawable: Drawable?)` | Sets a custom drawable for the grid icon. |
| `setIconColor(color: Int)` | Sets the color filter for the list and grid icons. |
| `setListener(listener: (SwitchMode) -> Unit)` | Sets a listener to observe mode changes. |
| `shouldRememberState(shouldRemember: Boolean)` | Tells the switch view to remember its state across app launches. |
| `clearState()` | Clears the saved state (use this when you want to reset the switch view's memory). |

### Java
| Method | Description |
| --- | --- |
| `setMode(SwitchMode mode)` | Sets the initial mode. |
| `getCurrentMode()` | Returns the current mode. |
| `setListIcon(Drawable drawable)` | Sets a custom drawable for the list icon. |
| `setGridIcon(Drawable drawable)` | Sets a custom drawable for the grid icon. |
| `setIconColor(int color)` | Sets the color filter for the list and grid icons. |
| `setListener(Function1<SwitchMode, Unit> listener)` | Sets a listener to observe mode changes. |
| `shouldRememberState(boolean shouldRemember)` | Tells the switch view to remember its state across app launches. |
| `clearState()` | Clears the saved state (use this when you want to reset the switch view's memory). |


## Notes
- The switch view's default mode is `LIST`.
- The switch view's default icon color is `#000000` (black).
- The switch view's default list icon is `R.drawable.ic_list_custom_switch_view`.
- The switch view's default grid icon is `R.drawable.ic_grid_custom_switchview`.
- The switch view's default state is not remembered across app launches.
- The saved state will override the initial mode set in XML (`app:setMode`) or programmatically (`setMode()`).
- If you are using it in Java make sure you've enabled Kotlin support in your project by adding the following to your app's `build.gradle` file:
``` groovy
implementation"org.jetbrains.kotlin:kotlin-stdlib-jdk8:$kotlin_version"
```

## Contribute
Please fork this repository and contribute back using [pull requests](https://github.com/CuteLibs/ListGridSwitchView/pulls).

Any contributions, large or small, major features, bug fixes, are welcomed and appreciated.

Let me know which features you want in the future in `Request Feature` tab.

If this project helps you a little bit, then give a to Star ⭐ the Repo.

## License
* [Apache Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html)

```
Copyright 2022 CuteLibs

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

```





