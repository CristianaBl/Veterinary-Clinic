# Veterinary-Clinic :woman_health_worker: :dog:
:star:UML Diagram:
![image](https://github.com/user-attachments/assets/8aca734a-a69e-43d8-a8c8-8cd5c393c002)

Managing pet health can often be complex and time-consuming for both pet owners and veterinarians. This application provides a solution by integrating all essential functions into a user-friendly interface. Whether it's scheduling appointments, tracking vaccinations, or accessing medical records, this application is designed to offer pet owners and veterinarians a convenient platform to efficiently manage pet health. It provides various features that facilitate both appointment organization and the recording and viewing of medical information. The goal of the application is to improve the daily lives of pet owners and veterinarians by consolidating all important information in one place.

###Features in Detail:
This application includes full CRUD operations (Create, Read, Update, Delete) for managing pets, diseases, veterinarians, appointments, health records, notifications, and users. It supports functionalities such as adding, deleting, updating, finding by ID, and retrieving all entries for each entity.

##:star:Pet Management
-CreatePet – Adds a new pet to the database.
-DeletePet – Removes a pet from the database by ID.
-UpdatePet – Modifies pet details.
-FindPetById – Retrieves a specific pet by its ID.
-GetAllPets – Returns a list of all registered pets.
##:star:Disease Management
-CreateDisease – Adds a new disease to the database.
-DeleteDisease – Removes a disease by ID.
-UpdateDisease – Updates disease details.
-FindDiseaseById – Retrieves a disease by its ID.
-GetAllDiseases – Lists all registered diseases.
-AddDiseaseToPet – Links a disease to a pet’s health record.
##:star:Veterinarian Management
-CreateVet – Adds a new veterinarian to the system.
-DeleteVet – Removes a veterinarian by ID.
-UpdateVet – Updates veterinarian details.
-FindVetById – Retrieves a veterinarian by their ID.
-GetAllVets – Lists all veterinarians.
-SortVeterinariansBySpecialization – Sorts veterinarians by their specialization.
##:star:Appointment Management
-CreateAppointment – Schedules a new appointment.
-DeleteAppointment – Cancels an appointment by ID.
-UpdateAppointment – Updates appointment details.
-FindAppointmentById – Retrieves an appointment by ID.
-GetAllAppointments – Lists all appointments.
-GetAppointmentsByDate – Retrieves appointments for a specific date.
-GetAppointmentsByPet – Finds appointments for a specific pet.
-GetAppointmentsByVet – Retrieves appointments for a particular veterinarian.
-GetAppointmentsInDateRange – Filters appointments within a given period.
-SortAppointmentsByDate – Organizes appointments chronologically.
##:star:Health Records Management
-CreateHealthRecord – Adds a new health record.
-DeleteHealthRecord – Removes a health record by ID.
-UpdateHealthRecord – Updates health record information.
-FindHealthRecordById – Retrieves a health record by ID.
-GetAllHealthRecords – Lists all health records.
-CreateTest – Adds a new medical test.
-CreateVaccine – Registers a new vaccination.
##:star:Notifications Management
-SendNotification – Dispatches a notification and logs it.
-SendNotificationToUser – Sends a specific message to a user.
-SendCancellationNotification – Notifies a user of an appointment cancellation.
-SendConfirmationNotification – Sends a confirmation message to a user.
-FindNotificationById – Retrieves a notification by ID.
-GetAllNotifications – Lists all notifications.
-GetNotificationsByUserId – Filters notifications by user ID.
-GetNotificationsByType – Retrieves notifications based on type.
##:star:User Authentication
-Login – Authenticates users with a username and password.
-Register – Creates a new user account.
-UpdateUser – Updates user profile information.
-DeleteUser – Removes a user from the system.
-FindUserById – Retrieves a user by their ID.
-GetAllUsers – Lists all registered users.
##:star:Special Appointment Handling
-ShowUpcomingAppointments – Displays upcoming appointments for a pet within the next three days.
-CancelAppointmentsForVetInPeriod – Cancels all appointments for a veterinarian within a specified timeframe.


Die Verwaltung der Tiergesundheit kann für Tierbesitzer und Tierärzte oft komplex und zeitaufwendig sein. Diese Anwendung bietet eine Lösung, indem sie alle wichtigen Funktionen in einer benutzerfreundlichen Oberfläche zusammenfasst. Ob es um die Terminplanung, die Verfolgung von Impfungen oder den Zugriff auf medizinische Aufzeichnungen geht – diese Anwendung wurde entwickelt, um Tierbesitzern und Tierärzten eine benutzerfreundliche Plattform bereitzustellen, die ihnen hilft, die Gesundheit von Haustieren effizient zu verwalten. Sie bietet verschiedene Funktionen, die sowohl die Organisation von Terminen als auch die Erfassung und Einsicht in medizinische Informationen erleichtern. Ziel der Anwendung ist es, den Alltag von Tierbesitzern und Tierärzten zu verbessern, indem alle wichtigen Informationen an einem Ort vereint werden.

###Funktionen im Detail
Diese Anwendung umfasst alle CRUD-Operationen (Erstellen, Lesen, Aktualisieren, Löschen) für die Verwaltung von Haustieren, Krankheiten, Tierärzten, Terminen, Gesundheitsdaten, Benachrichtigungen und Benutzern. Sie unterstützt Funktionen wie Hinzufügen, Löschen, Aktualisieren, Finden nach ID und Abrufen aller Einträge für jede Entität.

##:star:Verwaltung von Haustieren
-CreatePet – Erstellt ein neues Haustier und fügt es der Datenbank hinzu.
-DeletePet – Löscht ein Haustier aus der Datenbank anhand seiner ID.
-UpdatePet – Aktualisiert die Informationen eines Haustiers.
-FindPetById – Ruft ein bestimmtes Haustier anhand seiner ID ab.
-GetAllPets – Gibt eine Liste aller registrierten Haustiere zurück.
##:star:Verwaltung von Krankheiten
-CreateDisease – Erstellt eine neue Krankheit und fügt sie der Datenbank hinzu.
-DeleteDisease – Löscht eine Krankheit anhand ihrer ID.
-UpdateDisease – Aktualisiert die Details einer Krankheit.
-FindDiseaseById – Ruft eine Krankheit anhand ihrer ID ab.
-GetAllDiseases – Listet alle registrierten Krankheiten auf.
-AddDiseaseToPet – Verknüpft eine Krankheit mit der Gesundheitsakte eines Haustieres.
##:star:Verwaltung von Tierärzten
-CreateVet – Erstellt einen neuen Tierarzt und fügt ihn der Datenbank hinzu.
-DeleteVet – Löscht einen Tierarzt anhand seiner ID.
-UpdateVet – Aktualisiert die Informationen eines Tierarztes.
-FindVetById – Ruft einen Tierarzt anhand seiner ID ab.
-GetAllVets – Listet alle registrierten Tierärzte auf.
-SortVeterinariansBySpecialization – Sortiert Tierärzte nach ihrem Fachgebiet.
##:star:Verwaltung von Terminen
-CreateAppointment – Erstellt einen neuen Termin.
-DeleteAppointment – Löscht einen Termin anhand seiner ID.
-UpdateAppointment – Aktualisiert die Details eines Termins.
-FindAppointmentById – Ruft einen Termin anhand seiner ID ab.
-GetAllAppointments – Listet alle Termine auf.
-GetAppointmentsByDate – Ruft alle Termine für ein bestimmtes Datum ab.
-GetAppointmentsByPet – Ruft alle Termine für ein bestimmtes Haustier ab.
-GetAppointmentsByVet – Ruft alle Termine für einen bestimmten Tierarzt ab.
-GetAppointmentsInDateRange – Ruft alle Termine innerhalb eines bestimmten Zeitraums ab.
-SortAppointmentsByDate – Sortiert Termine nach Datum.
##:star:Verwaltung von Gesundheitsdaten
-CreateHealthRecord – Erstellt eine neue Gesundheitsakte.
-DeleteHealthRecord – Löscht eine Gesundheitsakte anhand ihrer ID.
-UpdateHealthRecord – Aktualisiert die Informationen einer Gesundheitsakte.
-FindHealthRecordById – Ruft eine Gesundheitsakte anhand ihrer ID ab.
-GetAllHealthRecords – Listet alle Gesundheitsakten auf.
-CreateTest – Erstellt einen neuen medizinischen Test.
-CreateVaccine – Erstellt eine neue Impfung und fügt sie der Datenbank hinzu.
##:star:Verwaltung von Benachrichtigungen
-SendNotification – Sendet eine Benachrichtigung und fügt sie der Datenbank hinzu.
-SendNotificationToUser – Sendet eine Benachrichtigung an einen bestimmten Benutzer.
-SendCancellationNotification – Sendet eine Stornierungsbenachrichtigung.
-SendConfirmationNotification – Sendet eine Bestätigungsbenachrichtigung.
-FindNotificationById – Ruft eine Benachrichtigung anhand ihrer ID ab.
-GetAllNotifications – Listet alle Benachrichtigungen auf.
-GetNotificationsByUserId – Ruft alle Benachrichtigungen für einen bestimmten Benutzer ab.
-GetNotificationsByType – Ruft alle Benachrichtigungen eines bestimmten Typs ab.
##:star:Benutzerauthentifizierung
-Login – Authentifiziert Benutzer anhand ihres Benutzernamens und Passworts.
-Register – Erstellt ein neues Benutzerkonto.
-UpdateUser – Aktualisiert die Benutzerinformationen.
-DeleteUser – Löscht einen Benutzer aus dem System.
-FindUserById – Ruft einen Benutzer anhand seiner ID ab.
-GetAllUsers – Listet alle registrierten Benutzer auf.
##:star:Spezielle Terminverwaltung
-ShowUpcomingAppointments – Zeigt bevorstehende Termine für ein Haustier innerhalb der nächsten drei Tage an.
-CancelAppointmentsForVetInPeriod – Storniert alle Termine eines Tierarztes in einem bestimmten Zeitraum.
