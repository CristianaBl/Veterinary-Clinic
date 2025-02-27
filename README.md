# Veterinary-Clinic :woman_health_worker: :dog:
## :star: UML Diagram:
---
![image](https://github.com/user-attachments/assets/8aca734a-a69e-43d8-a8c8-8cd5c393c002)

---
Managing pet health can often be complex and time-consuming for both pet owners and veterinarians. This application provides a solution by integrating all essential functions into a user-friendly interface. Whether it's scheduling appointments, tracking vaccinations, or accessing medical records, this application is designed to offer pet owners and veterinarians a convenient platform to efficiently manage pet health. It provides various features that facilitate both appointment organization and the recording and viewing of medical information. The goal of the application is to improve the daily lives of pet owners and veterinarians by consolidating all important information in one place.

---

## 📌 Overview  
Managing pet health can often be complex and time-consuming for both pet owners and veterinarians. This application provides a solution by integrating all essential functions into a **user-friendly interface**.  

✅ **Schedule appointments**  
✅ **Track vaccinations**  
✅ **Access medical records**  

The goal of the application is to **streamline the daily workflow** of pet owners and veterinarians by consolidating all important information in one place.  

---

# ⚙️ Features in Detail  
This application supports **full CRUD operations** (Create, Read, Update, Delete) for:  

- 🐾 Pets  
- 🦠 Diseases  
- 🏥 Veterinarians  
- 📅 Appointments  
- 📂 Health Records  
- 🔔 Notifications  
- 👤 Users  

Each entity supports:  
✅ Add  
✅ Delete  
✅ Update  
✅ Find by ID  
✅ Get all records  

---

## 🐾 PET MANAGEMENT  
- CreatePet – Adds a new pet to the database.  
- DeletePet – Removes a pet from the database by ID.  
- UpdatePet – Modifies pet details.  
- FindPetById – Retrieves a specific pet by its ID.  
- GetAllPets – Returns a list of all registered pets.  

---

## 🦠 DISEASE MANAGEMENT  
- CreateDisease – Adds a new disease to the database.  
- DeleteDisease – Removes a disease by ID.  
- UpdateDisease – Updates disease details.  
- FindDiseaseById – Retrieves a disease by its ID.  
- GetAllDiseases – Lists all registered diseases.  
- AddDiseaseToPet – Links a disease to a pet’s health record.  

---

## 🏥 VETERINARIAN MANAGEMENT  
- CreateVet – Adds a new veterinarian to the system.  
- DeleteVet – Removes a veterinarian by ID.  
- UpdateVet – Updates veterinarian details.  
- FindVetById – Retrieves a veterinarian by their ID.  
- GetAllVets – Lists all veterinarians.  
- SortVeterinariansBySpecialization – Sorts veterinarians by their specialization.  

---

## 📅 APPOINTMENT MANAGEMENT  
- CreateAppointment – Schedules a new appointment.  
- DeleteAppointment – Cancels an appointment by ID.  
- UpdateAppointment – Updates appointment details.  
- FindAppointmentById – Retrieves an appointment by ID.  
- GetAllAppointments – Lists all appointments.  
- GetAppointmentsByDate – Retrieves appointments for a specific date.  
- GetAppointmentsByPet – Finds appointments for a specific pet.  
- GetAppointmentsByVet – Retrieves appointments for a particular veterinarian.  
- GetAppointmentsInDateRange – Filters appointments within a given period.  
- SortAppointmentsByDate – Organizes appointments chronologically.  

---

## 📂 HEALTH RECORDS MANAGEMENT  
- CreateHealthRecord – Adds a new health record.  
- DeleteHealthRecord – Removes a health record by ID.  
- UpdateHealthRecord – Updates health record information.  
- FindHealthRecordById – Retrieves a health record by ID.  
- GetAllHealthRecords – Lists all health records.  
- CreateTest – Adds a new medical test.  
- CreateVaccine – Registers a new vaccination.  

---

## 🔔 NOTIFICATIONS MANAGEMENT  
- SendNotification – Dispatches a notification and logs it.  
- SendNotificationToUser – Sends a specific message to a user.  
- SendCancellationNotification – Notifies a user of an appointment cancellation.  
- SendConfirmationNotification – Sends a confirmation message to a user.  
- FindNotificationById – Retrieves a notification by ID.  
- GetAllNotifications – Lists all notifications.  
- GetNotificationsByUserId – Filters notifications by user ID.  
- GetNotificationsByType – Retrieves notifications based on type.  

---

## 🔐 USER AUTHENTICATION  
- Login – Authenticates users with a username and password.  
- Register – Creates a new user account.  
- UpdateUser – Updates user profile information.  
- DeleteUser – Removes a user from the system.  
- FindUserById – Retrieves a user by their ID.  
- GetAllUsers – Lists all registered users.  

---

## 📌 SPECIAL APPOINTMENT HANDLING  
- ShowUpcomingAppointments – Displays upcoming appointments for a pet within the next three days.  
- CancelAppointmentsForVetInPeriod – Cancels all appointments for a veterinarian within a specified timeframe.  

---
