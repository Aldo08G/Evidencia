package evidenciaFinal;

public class hospital_Main {
    
    static adminHospital citas = new adminHospital();

    public static void main(String[] args) {
        citas.load();
        citas.list();
        citas.añadirDoctor();
        citas.list();
        citas.actualizarHospitalFile();
        citas.añadirPaciente();
        citas.list();
        citas.actualizarHospitalFile2();
        citas.añadirCita();
        citas.list();
        citas.actualizarHospitalFile3();
        citas.crearDH();
        citas.list();
        citas.actualizarHospitalFile4();
        citas.crearPH();
        citas.list();
        citas.actualizarHospitalFile5();
        citas.crearCH();
        citas.list();
        citas.actualizarHospitalFile6();
    }
}
