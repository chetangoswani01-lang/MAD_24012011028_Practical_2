# Practical-2: Activity Life Cycle & Basic UI

## AIM & Objective

Create an Android Application to demonstrate **Activity Life Cycle** functions (`onCreate`, `onStart`, etc.) and **Basic UI** styling. Observe lifecycle transitions using **Logcat**, **Toast**, and **Snackbar**.

---

## Output Screenshots

### 1. LogCat Output (Lifecycle Sequence)

![Logcat Output](Logcat%20Output.png)

### 2. Toast Message Simulation

| **onCreate** | **onResume** | **onDestroy** |
|:---:|:---:|:---:|
| ![onCreate](onCreate.png) | ![onResume](onResume.png) | ![onDestroy](onDestroy.png) |

### 3. Snackbar Message Simulation

| **onStart** | **onResume** | **onRestart** |
|:---:|:---:|:---:|
| ![onStart](onStart.png) | ![onResume](onResume%20%282%29.png) | ![onRestart](onRestart.png) |

---

## UI Implementation Details

- **Layout:** `ConstraintLayout` with Yellow Background (`#FFFF00`).
- **TextView:** "Hello World" centered.
- **Styling:** Holo Blue Bright, 27sp, ***Bold & Italic***.

## Lifecycle Logic (`MainActivity.kt`)

```kotlin
private fun display(msg: String) {
    Log.i("MainActivity", msg) // Logcat
    Toast.makeText(this, msg, Toast.LENGTH_SHORT).show() // Toast
    Snackbar.make(findViewById(R.id.main), msg, Snackbar.LENGTH_SHORT).show() // Snackbar
}
