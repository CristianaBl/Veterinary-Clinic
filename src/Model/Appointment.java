package Model;

import Utils.AppointmentType;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The Appointment class represents an appointment between a pet and a veterinarian.
 * It contains details such as the IDs of the pet and veterinarian, the type of appointment,
 * the date and time, and any associated tests or vaccines.
 */
public class Appointment implements HasId {

    private Integer AppId;
    private int PetId;
    private int VetId;
    private AppointmentType AppointmentType;
    private String date;
    private String time;
    private List<HealthTest> healthTests;
    private List<Vaccine> vaccines;

    /**
     * Constructor for creating an Appointment with an appointment ID.
     *
     * @param appId          The ID of the appointment.
     * @param petId          The ID of the pet.
     * @param vetId          The ID of the veterinarian.
     * @param date           The date of the appointment in the format "dd-MM-yyyy".
     * @param time           The time of the appointment in the format "HH:mm".
     * @param AppointmentType The type of appointment (e.g., ROUTINE, EMERGENCY).
     * @param healthTests          A list of tests associated with the appointment.
     * @param vaccines       A list of vaccines associated with the appointment.
     */
    public Appointment(int appId, int petId, int vetId, String date, String time, AppointmentType AppointmentType, List<HealthTest> healthTests, List<Vaccine> vaccines) {
        this.AppId = appId;
        this.PetId = petId;
        this.VetId = vetId;
        this.date = date;
        this.time = time;
        this.AppointmentType = AppointmentType;
        this.healthTests = healthTests == null ? new ArrayList<>() : healthTests;
        this.vaccines = vaccines == null ? new ArrayList<>() : vaccines;
    }

    /**
     * Constructor for creating an Appointment without an appointment ID.
     *
     * @param petId          The ID of the pet.
     * @param vetId          The ID of the veterinarian.
     * @param date           The date of the appointment in the format "dd-MM-yyyy".
     * @param time           The time of the appointment in the format "HH:mm".
     * @param AppointmentType The type of appointment (e.g., ROUTINE, EMERGENCY).
     * @param healthTests          A list of tests associated with the appointment.
     * @param vaccines       A list of vaccines associated with the appointment.
     */
    public Appointment(int petId, int vetId, String date, String time, AppointmentType AppointmentType, List<HealthTest> healthTests, List<Vaccine> vaccines) {
        this.PetId = petId;
        this.VetId = vetId;
        this.date = date;
        this.time = time;
        this.AppointmentType = AppointmentType;
        this.healthTests = healthTests == null ? new ArrayList<>() : healthTests;
        this.vaccines = vaccines == null ? new ArrayList<>() : vaccines;
    }

    public String getTestsAsString() {
        return healthTests.stream()
                .map(test -> test.getTestType().name())
                .collect(Collectors.joining(","));
    }

    public String getVaccinesAsString() {
        return vaccines.stream()
                .map(vaccine -> vaccine.getVaccineType().name())
                .collect(Collectors.joining(","));
    }


    /**
     * Gets the list of tests associated with the appointment.
     *
     * @return A list of tests.
     */
    public List<HealthTest> getTests() {
        return healthTests;
    }

    /**
     * Sets the list of tests associated with the appointment.
     *
     * @param healthTests A list of tests.
     */
    public void setTests(List<HealthTest> healthTests) {
        this.healthTests = healthTests;
    }

    /**
     * Gets the list of vaccines associated with the appointment.
     *
     * @return A list of vaccines.
     */
    public List<Vaccine> getVaccines() {
        return vaccines;
    }

    /**
     * Sets the list of vaccines associated with the appointment.
     *
     * @param vaccines A list of vaccines.
     */
    public void setVaccines(List<Vaccine> vaccines) {
        this.vaccines = vaccines;
    }

    /**
     * Gets the appointment ID.
     *
     * @return The appointment ID.
     */
    public Integer getAppId() {
        return AppId;
    }

    /**
     * Sets the appointment ID.
     *
     * @param appId The appointment ID.
     */
    public void setAppId(Integer appId) {
        this.AppId = appId;
    }

    /**
     * Gets the pet ID associated with the appointment.
     *
     * @return The pet ID.
     */
    public int getPetId() {
        return PetId;
    }

    /**
     * Sets the pet ID associated with the appointment.
     *
     * @param petId The pet ID.
     */
    public void setPetId(int petId) {
        this.PetId = petId;
    }

    /**
     * Gets the veterinarian ID associated with the appointment.
     *
     * @return The veterinarian ID.
     */
    public int getVetId() {
        return VetId;
    }

    /**
     * Sets the veterinarian ID associated with the appointment.
     *
     * @param vetId The veterinarian ID.
     */
    public void setVetId(int vetId) {
        this.VetId = vetId;
    }

    /**
     * Gets the type of the appointment.
     *
     * @return The appointment type.
     */
    public AppointmentType getAppointmentType() {
        return AppointmentType;
    }

    /**
     * Sets the type of the appointment.
     *
     * @param appointmentType The appointment type.
     */
    public void setAppointmentType(AppointmentType appointmentType) {
        this.AppointmentType = appointmentType;
    }

    /**
     * Gets the date of the appointment.
     *
     * @return The appointment date in the format "dd-MM-yyyy".
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the date of the appointment.
     *
     * @param date The appointment date in the format "dd-MM-yyyy".
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * Gets the time of the appointment.
     *
     * @return The appointment time in the format "HH:mm".
     */
    public String getTime() {
        return time;
    }

    /**
     * Sets the time of the appointment.
     *
     * @param time The appointment time in the format "HH:mm".
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * Gets the ID of the appointment.
     *
     * @return The appointment ID.
     */
    @Override
    public Integer getId() {
        return AppId;
    }

    /**
     * Returns a string representation of the appointment.
     *
     * @return A string containing all details of the appointment.
     */
    @Override
    public String toString() {
        return "{Appointment Id: " + AppId +
                ", PetId: " + PetId +
                ", VetId: " + VetId +
                ", AppointmentType: " + AppointmentType +
                ", Date: '" + date + '\'' +
                ", Time: '" + time + '\'' +
                ", \nTests.txt: " + healthTests +
                ", \nVaccines.txt: " + vaccines + '}';
    }
}
