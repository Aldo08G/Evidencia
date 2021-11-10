package evidenciaFinal;
import java.util.HashMap;
import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

public class adminHospital {
    HashMap<String, String> myHospital = new HashMap<>();
    String[] arrayHospital;
    String inputFilename = "C:\\Users\\aldo0_823vmre\\OneDrive\\Documentos\\NetBeansProjects\\EvidenciaFinal\\src\\main\\java\\evidenciaFinal\\input.csv";
    String outputFilename = "C:\\Users\\aldo0_823vmre\\OneDrive\\Documentos\\NetBeansProjects\\EvidenciaFinal\\src\\main\\java\\evidenciaFinal\\output.csv";

public adminHospital(){
}

public void load(){
    BufferedReader bufferedReader = null;
    BufferedWriter bufferedWriter = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(inputFilename));
            bufferedWriter = new BufferedWriter(new FileWriter(outputFilename));       
            String line;
                while((line = bufferedReader.readLine()) != null){
                    System.out.println(line);             
                    arrayHospital = line.split(",");
                    myHospital.put(arrayHospital[0], arrayHospital[1]);                
    }
}
        
        catch(IOException e){
            System.out.println("IOException catched while reading: " + e.getMessage());
}
        
        finally {    
            try {
                if (bufferedReader != null){
                    bufferedWriter.close();
    }
}
            
        catch(IOException e) {
            System.out.println("IOException catched while closing: " + e.getMessage());
        }
    }
}

public void list(){
    for (HashMap.Entry<String,String> entry : myHospital.entrySet()){
        String key = entry.getKey();
        String value = entry.getValue();
        System.out.println(key + "," + value);    
    }
}
    
public void añadirDoctor(){
    System.out.println("\n¡Dar de Alta Doctor!");
    myHospital.put("Doctora", "76543/Cristina/Medina/Dermatologa");
}

public void actualizarHospitalFile(){
    BufferedWriter bufferedWriter = null;
        
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(outputFilename));  
            String line;
            for (HashMap.Entry<String, String> entry : myHospital.entrySet()){
                String key = entry.getKey();
                String value = entry.getValue();
                line = key + "," + value;
                bufferedWriter.write(line + "\n");
    }
}
        
        catch (IOException e){
            System.out.println("Exception catched while reading: " + e.getMessage());
}
        
        finally {
            try {
                if (bufferedWriter != null){
                    bufferedWriter.close();
    }
}
            
        catch (IOException e){
            System.out.println("Exception catched while closing: " + e.getMessage());
        }
    }
}
public void añadirPaciente(){
    System.out.println("\n¡Dar de Alta Paciente!");
    myHospital.put("Paciente", "86345/Maria/Gallegos");
}

public void actualizarHospitalFile2(){
    BufferedWriter bufferedWriter = null;
        
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(outputFilename));  
            String line;
            for (HashMap.Entry<String, String> entry : myHospital.entrySet()){
                String key = entry.getKey();
                String value = entry.getValue();
                line = key + "," + value;
                bufferedWriter.write(line + "\n");
    }
}
        
        catch (IOException e){
            System.out.println("Exception catched while reading: " + e.getMessage());
}
        
        finally {
            try {
                if (bufferedWriter != null){
                    bufferedWriter.close();
    }
}
            
        catch (IOException e){
            System.out.println("Exception catched while closing: " + e.getMessage());
        }
    }
}
public void añadirCita(){
    System.out.println("\n¡Crear Cita!");
    myHospital.put("Cita", "789/25-11-2021/13:00pm/Espinillas/76543/86345");
}

public void actualizarHospitalFile3(){
    BufferedWriter bufferedWriter = null;
        
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(outputFilename));  
            String line;
            for (HashMap.Entry<String, String> entry : myHospital.entrySet()){
                String key = entry.getKey();
                String value = entry.getValue();
                line = key + "," + value;
                bufferedWriter.write(line + "\n");
    }
}
        
        catch (IOException e){
            System.out.println("Exception catched while reading: " + e.getMessage());
}
        
        finally {
            try {
                if (bufferedWriter != null){
                    bufferedWriter.close();
    }
}
            
        catch (IOException e){
            System.out.println("Exception catched while closing: " + e.getMessage());
        }
    }
}

public void crearDH(){
    System.out.println("\n¡Dar de alta Doctor desde la consola!");
    Scanner s = new Scanner (System.in);
    System.out.println("\nIngrese el ID del Doctor(a) por favor:");
    String nuevoDHid = s.next();
    System.out.println("\nIngrese el Nombre, Apellido y Especialidad del Doctor(a) separados con un slash(/) por favor:");
    String nuevoDH = s.next();
    myHospital.get(nuevoDHid);
    myHospital.get(nuevoDH);
    myHospital.put("Doctor,"+nuevoDHid, nuevoDH);
}

public void actualizarHospitalFile4(){
    BufferedWriter bufferedWriter = null;
        
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(outputFilename));  
            String line;
            for (HashMap.Entry<String, String> entry : myHospital.entrySet()){
                String key = entry.getKey();
                String value = entry.getValue();
                line = key + "," + value;
                bufferedWriter.write(line + "\n");
    }
}
        
        catch (IOException e){
            System.out.println("Exception catched while reading: " + e.getMessage());
}
        
        finally {
            try {
                if (bufferedWriter != null){
                    bufferedWriter.close();
    }
}
            
        catch (IOException e){
            System.out.println("Exception catched while closing: " + e.getMessage());
        }
    }
}

public void crearPH(){
    System.out.println("\n¡Dar de Alta Paciente desde la consola!");
    Scanner sc = new Scanner (System.in);
    System.out.println("\nIngrese el ID del Paciente por favor:");
    String nuevoPHid = sc.next();
    System.out.println("\nIngrese el Nombre y Apellido del Paciente separados con un slash(/) por favor:");
    String nuevoPH = sc.next();
    myHospital.get(nuevoPHid);
    myHospital.get(nuevoPH);
    myHospital.put("Paciente,"+nuevoPHid, nuevoPH);
}

public void actualizarHospitalFile5(){
    BufferedWriter bufferedWriter = null;
        
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(outputFilename));  
            String line;
            for (HashMap.Entry<String, String> entry : myHospital.entrySet()){
                String key = entry.getKey();
                String value = entry.getValue();
                line = key + "," + value;
                bufferedWriter.write(line + "\n");
    }
}
        
        catch (IOException e){
            System.out.println("Exception catched while reading: " + e.getMessage());
}
        
        finally {
            try {
                if (bufferedWriter != null){
                    bufferedWriter.close();
    }
}
            
        catch (IOException e){
            System.out.println("Exception catched while closing: " + e.getMessage());
        }
    }
}

public void crearCH(){
    System.out.println("\n¡Crear una cita desde la consola!");
    Scanner scc = new Scanner (System.in);
    System.out.println("\nIngrese el ID de la Cita por favor:");
    String nuevoCHid = scc.next();
    System.out.println("\nIngrese la Fecha, Hora, Motivo de la cita y el ID del Doctor y Paciente separados con un slash(/) por favor:");
    String nuevoCH = scc.next();
    myHospital.get(nuevoCHid);
    myHospital.get(nuevoCH);
    myHospital.put("Cita,"+nuevoCHid, nuevoCH);
}

public void actualizarHospitalFile6(){
    BufferedWriter bufferedWriter = null;
        
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(outputFilename));  
            String line;
            for (HashMap.Entry<String, String> entry : myHospital.entrySet()){
                String key = entry.getKey();
                String value = entry.getValue();
                line = key + "," + value;
                bufferedWriter.write(line + "\n");
    }
}
        
        catch (IOException e){
            System.out.println("Exception catched while reading: " + e.getMessage());
}
        
        finally {
            try {
                if (bufferedWriter != null){
                    bufferedWriter.close();
    }
}
            
        catch (IOException e){
            System.out.println("Exception catched while closing: " + e.getMessage());
        }
    }
}
}

