# List Grid Switch View


## Demo
<img src="https://github.com/CuteLibs/ListGridSwitchView/blob/master/files/listgridswitch.gif?raw=true" width="300px"/>


## Usage

### XML
```xml
<io.github.cutelibs.listgridswitchview.CustomListGridSwitchView
    android:id="@+id/switchView"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    app:setMode="list"
    app:iconColor="@color/colorAccent"
    app:listIcon="@drawable/ic_list_custom_switch_view"
    app:gridIcon="@drawable/ic_grid_custom_switchview" />
```

### Kotlin
```kotlin
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


## Customization
### XML
**setMode**

Defines the initial mode. 

* `list`: Sets the initial mode to List.
* `grid`: Sets the initial mode to Grid.

example: `app:setMode="list"`

**iconColor**

Defines the color filter for the list and grid icons.

example: `app:iconColor="@color/colorAccent"`

**listIcon**

Sets a custom drawable for the grid icon.

example: `app:listIcon="@drawable/ic_list_custom_switch_view"`

**gridIcon**

Sets a custom drawable for the grid icon.

example: `app:gridIcon="@drawable/ic_grid_custom_switchview"`


### Kotlin

**setMode(mode: SwitchMode)**

Sets the initial mode.

example: `switchView.setMode(CustomListGridSwitchView.SwitchMode.GRID)`

**getCurrentMode()**

Returns the current mode.

example: `switchView.getCurrentMode()`

**setListIcon(drawable: Drawable?)**

Sets a custom drawable for the list icon.

example: `switchView.setListIcon(ContextCompat.getDrawable(context, R.drawable.my_custom_list_icon))`

**setGridIcon(drawable: Drawable?)**

Sets a custom drawable for the grid icon.

example: `switchView.setGridIcon(ContextCompat.getDrawable(context, R.drawable.my_custom_grid_icon))`

**setIconColor(color: Int)**

Sets the color filter for the list and grid icons.

example: `switchView.setIconColor(ContextCompat.getColor(context, R.color.colorAccent))`

**setListener(listener: (SwitchMode) -> Unit)**

Sets a listener to observe mode changes.

example: 
```kotlin
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
```

**shouldRememberState(shouldRemember: Boolean)**

Tells the switch view to remember its state across app launches.

example: `switchView.shouldRememberState(true)`

**clearState()**

Clears the saved state (use this when you want to reset the switch view's memory).

example: `switchView.clearState()`



