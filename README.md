# Practical-2: Activity Lifecycle & Basic UI

## Aim

Develop an Android application to understand and demonstrate the **Activity Lifecycle** along with basic user interface design. The lifecycle methods are observed using **Logcat**, **Toast messages**, and **Snackbar messages**.

---

## Objective

The application demonstrates the following Activity Lifecycle methods:

* `onCreate()`
* `onStart()`
* `onResume()`
* `onPause()`
* `onStop()`
* `onRestart()`
* `onDestroy()`

The application also demonstrates how messages can be displayed using Logcat, Toast, and Snackbar.

---

## Output Screenshots

### 1. Logcat Output

The Logcat screenshot shows the sequence of Activity Lifecycle methods executed during different stages of the application's execution.

![Logcat Output](screenshots/logcat.png)

---

### 2. Toast Messages 

The application displays Toast messages whenever specific lifecycle methods are called.

| onCreate                                   | onResume                                   | onDestroy                                   |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------- |
| ![onCreate Toast](screenshots/toast_1.png) | ![onResume Toast](screenshots/toast_2.png) | ![onDestroy Toast](screenshots/toast_3.png) |

---

### 3. Snackbar Messages

Snackbar messages are displayed at the bottom of the screen for selected lifecycle events.

| onStart                                         | onResume                                         | onRestart                                         |
| ----------------------------------------------- | ------------------------------------------------ | ------------------------------------------------- |
| ![onStart Snackbar](screenshots/snackbar_2.png) | ![onResume Snackbar](screenshots/snackbar_1.png) | ![onRestart Snackbar](screenshots/snackbar_3.png) |

---

## User Interface

The application's user interface is designed using **ConstraintLayout**.

### UI Features

* **Layout:** ConstraintLayout
* **Background Color:** Yellow (`#FFFF00`)
* **Text:** `Hello World`
* **Text Position:** Center of the screen
* **Text Size:** `27sp`
* **Text Color:** Holo Blue Bright
* **Text Style:** Bold and Italic

---

## Activity Lifecycle Implementation

The lifecycle methods are implemented in `MainActivity.kt`. A common function is used to display the lifecycle event through Logcat, Toast, and Snackbar.

```kotlin
private fun display(msg: String) {
    Log.i("MainActivity", msg)

    Toast.makeText(
        this,
        msg,
        Toast.LENGTH_SHORT
    ).show()

    Snackbar.make(
        findViewById(R.id.main),
        msg,
        Snackbar.LENGTH_SHORT
    ).show()
}
```

---

## Technologies Used

* **Language:** Kotlin
* **Platform:** Android
* **UI:** XML
* **Layout:** ConstraintLayout
* **Logging:** Logcat
* **Notifications:** Toast & Snackbar

---

## Conclusion

This practical demonstrates the working of the **Android Activity Lifecycle** and provides an understanding of how different lifecycle methods are triggered during the application's execution. It also demonstrates basic UI styling and the use of **Logcat, Toast, and Snackbar** to observe lifecycle events.
