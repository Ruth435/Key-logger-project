# 🤿 Key-Logger (The SCUBA Dive Log Application)

> **⚠️ DISCLAIMER TO IT EXAMINERS & RECRUITERS:**  
> Before you flag this repository to security: **this is NOT a malicious keystroke logger!**  
> It's an ironically named desktop application built to log, track, and manage **SCUBA dive telemetry and underwater adventures** in a database format. No passwords were harmed in the making of this project. 🌊🤿

---

## 🌊 What is this?

Built as a High School Information Technology Practical Assessment Task (PAT), this application replaces paper logbooks with a Java Swing desktop interface backed by a Microsoft Access database. 

Instead of tracking keys, it tracks:
* 🤿 Dive depths, bottom times, and site conditions
* 🐟 Marine life sightings & site telemetry
* 📝 Log synchronization with an MS Access database via JDBC
* 🔒 Multi-user login system

---

## 🛠️ Tech Stack & Tools

* **Language:** Java ☕
* **GUI Framework:** Java Swing (`frm1.java`)
* **IDE:** NetBeans
* **Database:** Microsoft Access (`Key-Logger.accdb`) via JDBC
* **Build System:** Apache Ant

---

## 🗂️ Project Structure

```text
├── docs/                     # 📄 The paperwork (Design specs & User guide)
│   ├── Key-Logger_Design_and_Planning.pdf
│   └── Key-Logger_User_Manual.pdf
├── Pics/                     # 🖼️ Underwater graphics, divers, & marine life
├── src/                      # ☕ Java source code
│   ├── Application/          # GUI forms & main launcher
│   ├── Managers/             # Business logic & log management
│   ├── Objects/              # Data models & DB mappings
│   └── SQLException.java     # Custom error handling
├── Key-Logger.accdb          # 🗄️ MS Access database file
└── UsernamesAndPasswords.txt # 🗝️ User auth dataset
```

---

## 📖 Documentation
If you want to check out the planning or see how the app works without running NetBeans, take a peek inside the docs/ folder:
- 📐 Design & Planning Document — System requirements, flowcharts, database schemas, and early planning.
- 📕 User Manual — A complete post-development guide on how to navigate the app and log dives.
