# URL Shortener with Logging (Java Project)

## 📌 Overview
This is a **basic URL Shortener project** written in Java, ideal for beginners. The application takes a long URL as input, generates a short alias using a hash function, stores the mapping, and logs the shortening operation in a local file.

---

## 🎯 Features
- ✅ Converts long URLs into shortened versions using a hash-based approach.
- 🗂️ Maintains in-memory storage of URL mappings using `HashMap`.
- 📝 Logs all shortening operations into a text file (`shortener_log.txt`).
- 🔄 Allows expanding the short URL back to its original form.
- 💡 Simple CLI-based interaction, beginner-friendly structure.

---

## 🚀 How It Works

### Shortening a URL
1. You input a long URL.
2. The app generates a unique short code using `hashCode()` and `toHexString()`.
3. Stores the mapping in a `HashMap`.
4. Logs the original and shortened URLs to `shortener_log.txt`.

### Expanding a URL
1. Input a shortened URL.
2. The app retrieves the corresponding long URL from the stored map.

---

## 🛠️ Technologies Used
- Java (Basic syntax, HashMap, Scanner, FileWriter)
- No external libraries or frameworks

---

## 📂 Project Structure
```
URLShortener/
├── URLShortener.java         # Main source code
├── shortener_log.txt         # Log file (created on execution)
└── README.md                 # Project documentation
```

---

## 🧪 Sample Run
```
Enter URL to shorten: https://example.com/article
Short URL: http://short.ly/4e23b2f

Enter Short URL to expand: http://short.ly/4e23b2f
Original URL: https://example.com/article
```

---

## 📌 Notes
- The mapping is stored in memory and lost on program exit.
- `shortener_log.txt` keeps a history of all shortened links.
- Great starting project to learn Java file I/O, data structures, and CLI apps.

---

## 📎 Future Improvements (Suggestions)
- Persistent storage with database.
- Web interface or browser extension.
- Custom alias generation.# project_14-20
