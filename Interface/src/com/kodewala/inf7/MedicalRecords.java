package com.kodewala.inf7;

public class MedicalRecords implements Confidential{
	String patientName;
	String disease;
	int roomNumber;
	public MedicalRecords(String patientName, String disease, int roomNumber) {
		super();
		this.patientName = patientName;
		this.disease = disease;
		this.roomNumber = roomNumber;
	}
}

class BillingRecord implements Confidential {
	String patientName;
	double totalBill;
	public BillingRecord(String patientName, double totalBill) {
		super();
		this.patientName = patientName;
		this.totalBill = totalBill;
	}
	
}

class VisitorRecord 
{
	String visitorName;
	String patientName;
	public VisitorRecord(String visitorName, String patientName) {
		super();
		this.visitorName = visitorName;
		this.patientName = patientName;
	}
	
}

class DataProcessor
{
	public void displayConfidentialData(Object obj)
	{
		//step1:  check whether the object implements confidential
		if(obj instanceof Confidential)
		{
			//step2: check whether the object is MedicalRecords
			if(obj instanceof MedicalRecords)
			{
				//Downcasting object into MedicalRecords
				MedicalRecords m = (MedicalRecords)obj;
				
				System.out.println("Medical Record:");
				System.out.println("Patient Name: "+m.patientName);
				System.out.println("Disease: "+m.disease);
				System.out.println("Room Number: "+m.roomNumber);
				
			}
		
			else if(obj instanceof BillingRecord)
			{
				//DownCasting Object into BillingRecord
				BillingRecord br = (BillingRecord) obj;
				System.out.println("Billing Record: ");
				System.out.println("Patient Name: "+ br.patientName);
				System.out.println("Total Bill: "+ br.totalBill);
			}
		}
			else if(obj instanceof VisitorRecord){
				
				//DownCasting Object into VisitorRecord
				VisitorRecord vr =(VisitorRecord)obj;
				System.out.println("Visitor Record: ");
				System.out.println("Visitor Name: "+vr.visitorName);
				System.out.println("Patient Name: "+vr.patientName);
				
				System.out.println("Acess Denied: This Record is not Confidential.");
			}
			else {
				System.out.println("Unkonwn record Type");
			}
	}
}
	
class Driver
{
	public static void main(String[] args) {
		
		MedicalRecords m = new MedicalRecords("Aman", "Fever",205);
		
		BillingRecord br = new BillingRecord("Sonu", 45000.0);
		
		VisitorRecord v = new VisitorRecord("God","Aman");
		
		DataProcessor  processor = new DataProcessor();
		
		processor.displayConfidentialData(m);
		System.out.println("----------------");
		processor.displayConfidentialData(br);
		System.out.println("-----------------");
		processor.displayConfidentialData(v);
	}
}

