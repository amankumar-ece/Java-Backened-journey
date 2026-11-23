package com.kodewala.oops.polymorphism.real.exp7;

public class Driver {

	public static void main(String[] args) {
     
		ExportProcessor processor = new ExportProcessor();
		
		
		DocumentExporter exporter = new DocumentExporter();
		processor.processExport(exporter, "PDF");
		
		PdfExporter exporter1 = new PdfExporter();
		processor.processExport(exporter1, "PDF");
		
		WordExporter exporter2 = new WordExporter();
		processor.processExport(exporter2, "Word");
		
		TextExporter exporter3 = new TextExporter();
		processor.processExport(exporter3, "TEXT");
	}

}
