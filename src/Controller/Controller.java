package Controller;
import Exception.*;
import Model.*;
import Service.Service;
import Utils.NotificationType;

import java.util.ArrayList;
import java.util.List;

/**
 * The Controller class acts as an intermediary between the user interface and the service layer.
 * It processes user inputs and communicates with the service layer to perform actions related to pets,
 * diseases, veterinarians, appointments, tests, vaccines, and notifications.
 *
 * @author Cristiana Bleoca
 * @version 1.0
 * @since 2024-11-24
 */
public class Controller {

    private final Service service;

    /**
     * Constructs a Controller with the given service.
     *
     * @param service the service layer that handles the core business logic
     */
    public Controller(Service service) {
        this.service = service;
    }

    /**
     * Creates a new pet and adds it to the repository.
     *
     * @param pet the pet to be added
     */
    public void createPet(Pet pet) {
        try {service.addPet(pet);
        }catch (ValidationException e)
            {System.out.println(e.getMessage());
        }catch (LogicException ex)
            {System.out.println(ex.getMessage());}
    }

    /**
     * Creates a new disease and adds it to the repository.
     *
     * @param disease the disease to be added
     */
    public void createDisease(Disease disease) {
        try{service.addDisease(disease);}
        catch (ValidationException e){System.out.println(e.getMessage());}
        catch (LogicException ex){System.out.println(ex.getMessage());}
    }

    /**
     * Creates a new veterinarian and adds it to the repository.
     *
     * @param veterinarian the veterinarian to be added
     */
    public void createVet(Veterinarian veterinarian) {
        try{
        service.addVeterinarian(veterinarian);
        }catch (ValidationException e) {
            System.out.println(e.getMessage());
        } catch (LogicException ex)
            {System.out.println(ex.getMessage());}
    }

    /**
     * Creates a new appointment and adds it to the repository.
     *
     * @param appointment the appointment to be added
     */
    public void createAppointment(Appointment appointment) {
        try {
            service.addAppointment(appointment);
        }catch (ValidationException e){System.out.println(e.getMessage());}
        catch (LogicException ex){System.out.println(ex.getMessage());}
        catch (EntityNotFoundException exception){System.out.println(exception.getMessage());}
    }

    /**
     * Sends a notification and adds it to the repository.
     *
     * @param notification the notification to be sent
     */
    public void sendNotification(Notification notification) {
        try {
            service.addNotification(notification);
        }catch (ValidationException e){System.out.println(e.getMessage());}
        catch (LogicException ex){System.out.println(ex.getMessage());}
    }

    /**
     * Creates a new test and adds it to the repository.
     *
     * @param healthTest the test to be added
     */
    public void createTest(HealthTest healthTest) {
        try {
            service.addTest(healthTest);
        }catch (ValidationException e){System.out.println(e.getMessage());}
        catch (LogicException ex){System.out.println(ex.getMessage());}
    }

    /**
     * Creates a new vaccine and adds it to the repository.
     *
     * @param vaccine the vaccine to be added
     */
    public void createVaccine(Vaccine vaccine) {
        try {
            service.addVaccine(vaccine);
        }catch (ValidationException e){System.out.println(e.getMessage());}
        catch (LogicException ex){System.out.println(ex.getMessage());}
    }

    /**
     * Retrieves all veterinarians from the service.
     *
     * @return a list of all veterinarians
     */
    public List<Veterinarian> getAllVeterinarians() {
        try {
            return service.getAllVeterinarians();
        }catch (EntityNotFoundException e){System.out.println(e.getMessage());return new ArrayList<>();
        }
    }

    /**
     * Retrieves all pets from the service.
     *
     * @return a list of all pets
     */
    public List<Pet> getAllPets() {
        try {
            return service.getAllPets();
        }catch (EntityNotFoundException e){System.out.println(e.getMessage());
        return null;}
    }

    /**
     * Retrieves all diseases from the service.
     *
     * @return a list of all diseases
     */
    public List<Disease> getAllDiseases() {
        try {
            return service.getAllDiseases();
        }catch (EntityNotFoundException e){System.out.println(e.getMessage());return new ArrayList<>();}
    }

    /**
     * Retrieves all tests from the service.
     *
     * @return a list of all tests
     */
    public List<HealthTest> getAllTests() {
        try {
            return service.getAllTests();
        }catch (EntityNotFoundException e){System.out.println(e.getMessage());return new ArrayList<>();}
    }

    /**
     * Retrieves all appointments from the service.
     *
     * @return a list of all appointments
     */
    public List<Appointment> getAllAppointments() {
        try {
            return service.getAllAppointments();
        }catch (EntityNotFoundException e){System.out.println(e.getMessage());return new ArrayList<>();}
    }

    /**
     * Retrieves all vaccines from the service.
     *
     * @return a list of all vaccines
     */
    public List<Vaccine> getAllVaccines() {
        try {
            return service.getAllVaccines();
        }catch (EntityNotFoundException e){System.out.println(e.getMessage());return new ArrayList<>();}
    }

    /**
     * Retrieves all appointments for a specific date.
     *
     * @param date the date for which to retrieve appointments
     * @return a list of appointments on the specified date
     */
    public List<Appointment> getAppointmentsByDate(String date) {
        try{return service.getAppointmentsByDate(date);}
        catch (EntityNotFoundException e){System.out.println(e.getMessage());return new ArrayList<>();}
    }

    /**
     * Retrieves all appointments for a specific pet.
     *
     * @param petId the ID of the pet whose appointments are to be retrieved
     * @return a list of appointments for the specified pet
     */
    public List<Appointment> getAppointmentsByPet(int petId) {
        try {
            return service.getAppointmentsByPet(petId);
        }catch (EntityNotFoundException e){System.out.println(e.getMessage());return new ArrayList<>();}
    }

    /**
     * Retrieves all appointments for a specific veterinarian.
     *
     * @param vetId the ID of the veterinarian whose appointments are to be retrieved
     * @return a list of appointments for the specified veterinarian
     */
    public List<Appointment> getAppointmentsByVet(int vetId) {
        try {
            return service.getAppointmentsByVet(vetId);
        }catch (EntityNotFoundException e){System.out.println(e.getMessage());return new ArrayList<>();}
    }

    /**
     * Retrieves the health record of a pet by its ID.
     *
     * @param petId the ID of the pet whose health record is to be retrieved
     * @return the health record of the specified pet
     */
    public HealthRecord getHealthRecordByPetId(int petId) {
        try {
            return service.getHealthRecordByPetId(petId);
        } catch (EntityNotFoundException e) {
            System.out.println(e.getMessage());
            return null;}

    }

    /**
     * Adds a disease to a pet's health record.
     *
     * @param petId the ID of the pet
     * @param disease the disease to be added to the pet
     */
    public void addDiseaseToPet(int petId, Disease disease) {
        try {
            service.addDiseaseToPet(petId, disease);
        }catch (EntityNotFoundException e){System.out.println(e.getMessage());}
        catch (ValidationException e){System.out.println(e.getMessage());}
    }

    /**
     * Retrieves notifications for a specific user by their ID.
     *
     * @param userId the ID of the user whose notifications are to be retrieved
     * @return a list of notifications for the specified user
     */
    public List<Notification> getNotificationsByUserId(int userId) {
        try {
            return service.getNotificationsByUserId(userId);
        }catch (EntityNotFoundException e){System.out.println(e.getMessage());return new ArrayList<>();}
    }

    /**
     * Sends a notification to a user with a specified message and notification type.
     *
     * @param userId the ID of the user
     * @param message the message to be sent
     * @param notificationType the type of notification
     */
    public void sendNotificationToUser(Integer userId, String message, NotificationType notificationType) {
        service.sendNotificationToUser(userId, message, notificationType);
    }

    /**
     * Displays upcoming appointments for a pet within the next 3 days.
     *
     * @param petId the ID of the pet whose upcoming appointments are to be displayed
     */
    public void showUpcomingAppointments(Integer petId) {
        try{List<Appointment> upcomingAppointments = service.sendAppointmentReminders(petId);

        if (!upcomingAppointments.isEmpty()) {
            System.out.println("Upcoming appointments for pet ID " + petId + ":");
            upcomingAppointments.forEach(app -> {
                System.out.println("Appointment on " + app.getDate() + " at " + app.getTime());
            });
        } else {
            System.out.println("No upcoming appointments for pet ID " + petId + " in the next 3 days.");
        }}catch (EntityNotFoundException e){System.out.println(e.getMessage());}
    }

    /**
     * Sends a cancellation notification to a user.
     *
     * @param userId the ID of the user to be notified
     */
    public void sendCancellationNotification(Integer userId) {
        String message = "Cancellation: Your appointment for your pet has been cancelled.";
        service.sendNotificationToUser(userId, message, NotificationType.CANCELLATION);
    }

    /**
     * Sends a confirmation notification to a user.
     *
     * @param userId the ID of the user to be notified
     */
    public void sendConfirmationNotification(Integer userId) {
        String message = "Confirmation: Your appointment for your pet has been confirmed.";
        service.sendNotificationToUser(userId, message, NotificationType.CONFIRMATION);
    }

    /**
     * Cancels all appointments for a veterinarian within a specified date range.
     *
     * @param vetId the ID of the veterinarian
     * @param startDateStr the start date of the period
     * @param endDateStr the end date of the period
     */
    public void cancelAppointmentsForVetInPeriod(Integer vetId, String startDateStr, String endDateStr) {
        try {
            service.cancelAppointmentsForVetInPeriod(vetId, startDateStr, endDateStr);
        }catch (EntityNotFoundException e){System.out.println(e.getMessage());}catch (ValidationException ex){System.out.println(ex.getMessage());}
    }

    /**
     * Retrieves notifications by their type.
     *
     * @param type the type of notifications to retrieve
     * @return a list of notifications of the specified type
     */
    public List<Notification> getNotificationsByType(NotificationType type) {
        try {
            return service.getNotificationsByType(type);
        }catch (EntityNotFoundException e){System.out.println(e.getMessage());return new ArrayList<>();}
    }


    /**
     * Logs in a user with the provided username and password.
     *
     * @param username the username of the user
     * @param password the password of the user
     * @return an object representing the logged-in user
     * @throws Exception if login fails
     */
    public Object login(String username, String password) throws Exception {
        return service.login(username, password);
    }

    /**
     * Deletes a pet from the repository by its ID.
     *
     * @param id the ID of the pet to be deleted
     */
    public void deletePet(Integer id) {
        try{
        service.deletePet(id);
        }
        catch (EntityNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    /**
     * Deletes a veterinarian from the repository by its ID.
     *
     * @param id the ID of the veterinarian to be deleted
     */
    public void deleteVet(Integer id) {
        try {
            service.deleteVet(id);
        } catch (ValidationException e) {
            System.out.println("Validation Error: " + e.getMessage());
        } catch (EntityNotFoundException e) {
            System.out.println("Entity Not Found Error: " + e.getMessage());
        }

    }

    /**
     * Deletes an appointment from the repository by its ID.
     *
     * @param id the ID of the appointment to be deleted
     */
    public void deleteApp(Integer id) {
        try {
            service.deleteApp(id);
        } catch (ValidationException e) {
            System.out.println("Validation Error: " + e.getMessage());
        } catch (EntityNotFoundException e) {
            System.out.println("Entity Not Found Error: " + e.getMessage());
        }
    }

    public List<Veterinarian> sortVeterinariansBySpecialization() {
        try {
            return service.sortVeterinariansBySpecialization();
        } catch (EntityNotFoundException e) {
            System.out.println(e.getMessage());
            return new ArrayList<>();
        }
    }

    public List<Appointment> sortAppointmentsByDate(){
            try{
                return service.sortAppointmentsByDate();
            }
            catch (EntityNotFoundException e){System.out.println(e.getMessage());return new ArrayList<>();}
        }

    public List<Appointment> getAppointmentsInDateRange(String startDateStr, String endDateStr) {
        try {
            return service.getAppointmentsInDateRange(startDateStr, endDateStr);
        } catch (ValidationException e) {
            System.out.println(e.getMessage());
            return new ArrayList<>();
        } catch (EntityNotFoundException e) {
            System.out.println(e.getMessage());
            return new ArrayList<>();
        }
    }
}
