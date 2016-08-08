package main;


public class Patient {
    public int id;
    public String surname;
    public String name;
    public String patronymic;
    public String address;
    public int telephone;
    public int medKart;
    public String diagnos;

    public Patient(int id, String surname, String name, String patronymic, String address, int telephone, int medKart, String diagnos) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.telephone = telephone;
        this.medKart = medKart;
        this.diagnos = diagnos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public int getMedKart() {
        return medKart;
    }

    public void setMedKart(int medKart) {
        this.medKart = medKart;
    }

    public String getDiagnos() {
        return diagnos;
    }

    public void setDiagnos(String diagnos) {
        this.diagnos = diagnos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Patient patient = (Patient) o;

        if (id != patient.id) return false;
        if (telephone != patient.telephone) return false;
        if (medKart != patient.medKart) return false;
        if (surname != null ? !surname.equals(patient.surname) : patient.surname != null) return false;
        if (name != null ? !name.equals(patient.name) : patient.name != null) return false;
        if (patronymic != null ? !patronymic.equals(patient.patronymic) : patient.patronymic != null) return false;
        if (address != null ? !address.equals(patient.address) : patient.address != null) return false;
        return diagnos != null ? diagnos.equals(patient.diagnos) : patient.diagnos == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (patronymic != null ? patronymic.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + telephone;
        result = 31 * result + medKart;
        result = 31 * result + (diagnos != null ? diagnos.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", address='" + address + '\'' +
                ", telephone=" + telephone +
                ", medKart=" + medKart +
                ", diagnos='" + diagnos + '\'' +
                '}';
    }
}
