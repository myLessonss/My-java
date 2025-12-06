import java.util.InputMismatchException;
import java.util.Scanner;
public class HospitalRecord {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        //Entity object
        Entity entity=new Entity(0, null, null);
        System.out.println("Our Hospital details");
        while (true) {
            try {
                System.out.println("Enter in id");
                int id=scan.nextInt();
                scan.nextLine();
                entity.setid(id);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: "+e.getMessage());
            } catch (InputMismatchException e) {
            System.out.println("Error: Please enter numbers only.");
            scan.nextLine();
        }     
        }
        while (true) {
            try {
                System.out.println("Enter in Created Date:");
                String cdate=scan.nextLine();
                entity.setcreatedDate(cdate);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: "+e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.println("Enter in Updated date");
                String udate=scan.nextLine();                
                entity.setupdatedDate(udate);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: "+e.getMessage());
            }
        }
        //Hospital Detail
        Hospital hospital= new Hospital(0, null, 
            null, null, null, null, null);
        while (true) {
            try {
                System.out.println("Enter in Hospital name");
                String hosName=scan.nextLine();
                hospital.sethospitalName(hosName);
                break;

            } catch (IllegalArgumentException e) {
                System.out.println("Error"+e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.println("Enter in Hospital Address");
                String add=scan.nextLine();
                hospital.setaddress(add);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: "+e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.println("Enter Hospital phone number: ");
                String phone=scan.nextLine();
                hospital.setphoneNumber(phone);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: "+e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.println("Enter in Email");
                String mail=scan.nextLine();
                hospital.setemail(mail);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: "+e.getMessage());
            }
        }
        //Department Detail
        Department department = new Department(0, null, null, 
            null, null, null, null, null, null);
        while (true) {
            try {
                System.out.println("Enter in Department Name");
                String deptName=scan.nextLine();
                department.setdepartmentName(deptName);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: "+e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.println("Enter in Department Code");
                String deptCode=scan.nextLine();
                department.setdepartmentCode(deptCode);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: "+e.getMessage());
            }
        }
        //Doctor Details
        Doctor doctor=new Doctor(0, null, null, null,
             null, null, null, null, null, 
             null, null, null, null);
        while (true) {
            try {
                System.out.println("Enter Doctor Name");
                String docName=scan.nextLine();
                doctor.setdoctorName(docName);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: "+e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.println("Enter in Doctor Specialization");
                String docspec=scan.nextLine();
                doctor.setspecialization(docspec);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: "+e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.println("Enter in Doctor Email");
                String docEmail=scan.nextLine();
                doctor.setemail(docEmail);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: "+e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.println("Enter in Doctor Phone Number");
                String phone=scan.nextLine();
                doctor.setphone(phone);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: "+e.getMessage());
            }
        }
        //Nurse Details
        Nurse nurse=new Nurse(0, null, null, null, 
            null, null, null, null, null, 
            null, null, null, null, null,
             null, 0);
        while (true) {
            try {
                System.out.println("ENter in Nurse name");
                String nurseName=scan.nextLine();
                nurse.setnurseName(nurseName);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: "+e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.println("Enter in Shift");
                String shift=scan.nextLine();
                nurse.setshift(shift);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: "+e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.println("Enter in Years of Experience");
                int yoe=scan.nextInt();
                scan.nextLine();
                nurse.setyearsOfExperience(yoe);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: "+e.getMessage());
            } catch (InputMismatchException e) {
            System.out.println("Error: Please enter numbers only.");
            scan.nextLine();
            }
        }
        //Patient Details
        Patient patient=new Patient(0, null, null, 
            null, null, null, null,
             null, null, null, null,
              null, null, null, null, 0,
               null, null, null, 0);
        while (true) {
            try {
                System.out.println("Enter in Patient Name:");
                String pname=scan.nextLine();
                patient.setPatientName(pname);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: "+e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.println("Enter in Patient Age");
                int age=scan.nextInt();
                scan.nextLine();
                patient.setAge(age);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: "+e.getMessage());
            } catch (InputMismatchException e) {
            System.out.println("Error: Please enter numbers only.");
            scan.nextLine();
            }
        }
        while (true) {
            try {
                System.out.println("Enter in Patient Gender");
                String gen=scan.nextLine();
                patient.setPatientName(gen);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: "+e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.println("Enter in Contact Number");
                String pcontact=scan.nextLine();
                patient.setContactNumber(pcontact);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: "+e.getMessage());
            }
        }
        //Admission Details
        Admission admission= new Admission(0, null, null, 
            null, null, null, null, null, 
            null, null, null, null, null,
             null, null, 0, null, null, 
             null, 0, null, 0, 0);
        while (true) {
            try {
                System.out.println("Enter in Admission Date");
                String sdate=scan.nextLine();
                admission.setAdmissionDate(sdate);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Error "+e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.println("Enter in Room Number");
                int roomN=scan.nextInt();
                scan.nextLine();
                admission.setRoomNumber(roomN);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: "+e.getMessage());
            } catch (InputMismatchException e) {
            System.out.println("Error: Please enter numbers only.");
            scan.nextLine();
            }
        }
        while (true) {
            try {
                System.out.println("Enter in Room Charges");
                float roomC=scan.nextFloat();
                admission.setRoomCharges(roomC);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: "+e.getMessage());
            }
        }
        //Treatment Details
        Treatment treatment=new Treatment(0, null, null, 
            null, null, null, null, null,
             null, null, null, null, null, 
             null, null, 0, null, null, null, 
             0, null, 0, 0, null, null, 0);
        while (true) {
            try {
                System.out.println("Enter in Your Diagnosis");
                String diagnosis=scan.nextLine();
                treatment.setDiagnosis(diagnosis);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: "+e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.println("Enter in Treatment Given");
                String treatGivn=scan.nextLine();
                treatment.setTreatmentGiven(treatGivn);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: "+e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.println("Enter in Treatment Cost");
                float treatCost=scan.nextFloat();
                treatment.setTreatmentCost(treatCost);;
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: "+e.getMessage());
            }
        }
        //Bill Details
        Bill bill=new Bill(0, null, null, null, 
            null, null, null, null, null,
             null, null, null, null, null,
              null, 0, null, null, null, 0,
               null, 0, 0, null, null, 0, 0,
                0, 0);
        while (true) {
            try {
                System.out.println("Enter in Doctor Fee");
                float dfee=scan.nextFloat();
                bill.setDoctorFee(dfee);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: "+e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.println("Enter in Medical Cost");
                float medicalCost=scan.nextFloat();
                bill.setMedecineCost(medicalCost);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: "+e.getMessage());
            }
        }
        //Method to generate Bill 
        float genBill=bill.generateBill();
        //Displays of all patient and hospital details, total charges, and final computed bill.
        //Patient
        System.out.println("-----------Patient Details-------------");
        System.out.println("Patient Name: "+patient.getPatientName());
        System.out.println("Patient Age: "+patient.getAge());
        System.out.println("Patient Gender: "+patient.getGender());
        System.out.println("Patient Contact Number: "+patient.getContactNumber());
        //Hospital
        System.out.println("------------Hospital Details-------------");
        System.out.println("Hospital Name: "+hospital.gethospitalName());
        System.out.println("Hospital Address: "+hospital.getaddress());
        System.out.println("Hospital Phone number: "+hospital.getphoneNumber());
        System.out.println("Hospital Email: "+hospital.getemail());
        //Total charges
        System.out.println("-----------Total Charges-------------");
        System.out.println("Room Charges: "+admission.getRoomCharges());
        System.out.println("Treatment Cost: "+treatment.getTreatmentCost());
        System.out.println("Doctor Fee: "+bill.getDoctorFee());
        System.out.println("Medicine Cost: "+bill.getMedecineCost());
        //Bill
        System.out.println("-----------Final Bill-------------");
        System.out.println("Total bill: "+genBill);
        
    }
}