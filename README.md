# 🔢 Bigger Number Game App

A simple and interactive Android game built with **Kotlin** and **Jetpack Compose**, where players challenge themselves to identify the bigger number from two randomly generated numbers.

## 📱 About the Project

**Bigger Number Game** is a lightweight Android game designed to test players' observation skills and quick decision-making. Two different numbers are displayed on the screen, and the player must select the larger one to earn points.

The game provides instant feedback after every selection and generates a new pair of numbers for the next round.

## ✨ Features

- 🔢 **Random Number Generation** — Displays two different random numbers between 1 and 99.
- 🎯 **Simple Gameplay** — Select the button containing the larger number.
- 🏆 **Score Tracking** — Earn 1 point for every correct answer.
- ❌ **Score Deduction** — Lose 1 point for every incorrect answer.
- 💬 **Instant Feedback** — Displays success or error messages after each guess.
- 🎨 **Modern UI** — Built with Jetpack Compose and Material 3 components.
- ✨ **Smooth Animations** — Uses animated visibility and fade transitions for feedback messages.
- 📱 **Responsive Layout** — Uses Compose layouts to arrange the game interface.

## 🛠️ Technologies Used

- **Language:** Kotlin
- **UI Framework:** Jetpack Compose
- **Design System:** Material 3
- **Build System:** Gradle with Kotlin DSL
- **IDE:** Android Studio
- **Testing:** JUnit and AndroidX testing libraries

## 🎮 How to Play

1. Launch the Bigger Number Game app.
2. Two different numbers will appear on the screen.
3. Compare the numbers and tap the button containing the larger number.
4. A correct answer increases your score by 1.
5. An incorrect answer decreases your score by 1.
6. A new pair of numbers appears after each selection.
7. Continue playing and try to achieve a higher score!

## ⚙️ Requirements

- Android Studio
- Android SDK
- JDK compatible with the project's Gradle configuration
- Android device or emulator running **Android 7.0 (API 24) or later**

## 🚀 Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/mdhimelsarker/Bigger_Number_Game_App.git
```

### 2. Open the Project

Open Android Studio and select **Open**. Choose the cloned `Bigger_Number_Game_App` project folder.

### 3. Sync Gradle

Allow Android Studio to download the required dependencies and complete the Gradle sync.

### 4. Run the App

Connect an Android device or start an emulator, then click the **Run ▶** button in Android Studio.

## 📂 Project Structure

```text
Bigger_Number_Game_App/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   └── com/example/myapplication/
│   │   │   │       ├── MainActivity.kt
│   │   │   │       └── ui/theme/
│   │   │   ├── res/
│   │   │   └── AndroidManifest.xml
│   │   ├── test/
│   │   └── androidTest/
│   └── build.gradle.kts
├── gradle/
├── build.gradle.kts
├── settings.gradle.kts
└── README.md
```

## 🧪 Testing

The project includes unit testing and Android UI testing dependencies.

Run the unit tests using:

```bash
./gradlew test
```

On Windows Command Prompt or PowerShell:

```powershell
.\gradlew.bat test
```

## 🎯 Learning Objectives

This project demonstrates practical use of:

- Kotlin programming fundamentals
- Random number generation
- State management in Jetpack Compose
- Handling button click events
- Conditional logic and score calculation
- Material 3 UI components
- Basic Android application testing

## 🔮 Future Improvements

Possible enhancements for future versions include:

- Difficulty levels
- Timer-based challenges
- High-score tracking
- Sound effects and haptic feedback
- Game statistics and progress tracking
- Improved animations and themes

## 👨‍💻 Developer

**GitHub:** [mdhimelsarker](https://github.com/mdhimelsarker)

## 📄 License

No license has been specified yet. Unless a license is added to this repository, reuse and redistribution are subject to the applicable copyright rules.

---

⭐ If you find this project interesting, consider giving the repository a star on GitHub!
