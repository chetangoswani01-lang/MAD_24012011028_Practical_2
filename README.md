# Practical-2: Activity Lifecycle & Basic UI

## AIM & Objective

Develop an Android application to demonstrate the **Activity Lifecycle** methods (`onCreate`, `onStart`, `onResume`, etc.) along with **Basic UI** styling. The application observes lifecycle transitions using **Logcat**, **Toast**, and **Snackbar** messages.

---
 
## Output Screenshots
 
### 1. Logcat Output (Lifecycle Sequence)

[Logcat Output](Logcat%20Output.png) ([image](Logcat%20Output.png))

### 2. Toast Message Demonstration

| **onCreate** | **onResume** | **onDestroy** |
|--------------|--------------|---------------|
| (onCreate.png) | (onResume.png) | (onDestroy.png) |

### 3. Snackbar Message Demonstration

| **onStart** | **onResume** | **onRestart** |
|-------------|--------------|---------------|
| (onStart.png) |(onResume%20%282%29.png) | (onRestart.png) |

---

## UI Implementation Details

- **Layout:** `ConstraintLayout` with a Yellow Background (`#FFFF00`).
- **TextView:** Displays "Hello World" at the center of the screen.
- **Text Color:** Holo Blue Bright.
- **Text Size:** 27sp.
- **Text Style:** ***Bold & Italic***.

---

## Lifecycle Logic (`MainActivity.kt`)

```kotlin
private fun display(msg: String) {
    Log.i("MainActivity", msg) // Logcat
    Toast.makeText(this, msg, Toast.LENGTH_SHORT).show() // Toast
    Snackbar.make(
        findViewById(R.id.main),
        msg,
        Snackbar.LENGTH_SHORT
    ).show() // Snackbar
}
