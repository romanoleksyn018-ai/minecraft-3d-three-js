# Minecraft 3D — Three.js

> Згенеровано HTML→APK конвертером

## 🚀 Як отримати APK автоматично

### Крок 1 — GitHub
1. Відкрий [github.com](https://github.com) → **Sign Up** (безкоштовно)
2. Натисни **"New repository"**
3. Назви репозиторій, вибери **Public**
4. Натисни **"Create repository"**

### Крок 2 — Завантаж файли
1. Натисни **"uploading an existing file"**
2. Перетягни **ВСІ файли** з цього ZIP (включаючи папки `android/` і `.github/`)
3. Натисни **"Commit changes"**

### Крок 3 — Чекай APK
1. Відкрий вкладку **Actions** у репозиторії
2. Побачиш workflow **"Build APK"** — він запуститься автоматично
3. Чекай 3-7 хвилин поки збереться
4. Натисни на workflow → **Artifacts** → скачай APK!

### Або скачай з Releases (найпростіше, без логіну на GitHub)
Після першого успішного build workflow сам публікує **GitHub Release** з прикріпленим APK.
Відкрий **Releases** (праворуч на головній сторінці репозиторію, або `/releases`) і натисни на файл `.apk` — пряме посилання, не вимагає входу й не має терміну дії.

## 📱 Дозволи
- 🌐 Інтернет
- ⛶ Повноекранний режим

## 📦 Файли проекту
- `android/` — повний Android Gradle проект
- `.github/workflows/build-apk.yml` — автоматичне збирання
- `index.html` — PWA версія
- `manifest.json` + `sw.js` — PWA підтримка

---
*Package: `com.minecraft3dt.app` | Version: `1.0.0`*